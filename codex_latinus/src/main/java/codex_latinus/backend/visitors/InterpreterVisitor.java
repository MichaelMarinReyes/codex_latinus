package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.handlers.FunctionHandler;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.handlers.ControlFlowHandler;
import codex_latinus.backend.handlers.LoopHandler;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Visitante principal para la interpretación y ejecución del lenguaje Codex Latinus.
 * Extiende de {@link Codex_latinusBaseVisitor} para recorrer el árbol de análisis sintáctico (AST)
 * y evaluar expresiones, declaraciones, sentencias de control y llamadas a funciones.
 */
public class InterpreterVisitor extends Codex_latinusBaseVisitor<Object> {

    private static final Queue<String> inputQueue = new LinkedList<>();
    private final Map<String, Codex_latinusParser.FuncionContext> funciones = new HashMap<>();
    private final List<CompilationError> semanticErrors;
    private SymbolTable symbolTable;
    private final LoopHandler loopHandler;
    private final ControlFlowHandler controlFlowHandler;
    private final FunctionHandler functionHandler;

    /**
     * Constructor para inicializar el intérprete con una tabla de símbolos y un registro de errores.
     *
     * @param symbolTable Tabla de símbolos inicial. Si es nula, se crea una nueva por defecto.
     * @param semanticErrors Lista de errores semánticos. Si es nula, se inicializa una lista vacía.
     */
    public InterpreterVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.loopHandler = new LoopHandler(this.semanticErrors);
        this.controlFlowHandler = new ControlFlowHandler(this, this.symbolTable);
        this.functionHandler = new FunctionHandler(this.symbolTable, this.semanticErrors);
    }

    /**
     * Configura la cola de entradas de texto simuladas o ingresadas por el usuario.
     *
     * @param inputs Lista de cadenas de entrada.
     */
    public static void setInputs(List<String> inputs) {
        inputQueue.clear();
        if (inputs != null) {
            inputQueue.addAll(inputs);
        }
    }

    /**
     * Actualiza la tabla de símbolos y la sincroniza con los manejadores internos.
     *
     * @param symbolTable Nueva tabla de símbolos.
     */
    public void setSymbolTable(SymbolTable symbolTable) {
        if (symbolTable != null) {
            this.symbolTable = symbolTable;
            this.controlFlowHandler.setSymbolTable(symbolTable);
        }
    }

    /**
     * Obtiene la tabla de símbolos actual del intérprete.
     *
     * @return La instancia de {@link SymbolTable}.
     */
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    /**
     * Obtiene la lista de errores semánticos recopilados durante la ejecución.
     *
     * @return Lista de {@link CompilationError}.
     */
    public List<CompilationError> getSemanticErrors() {
        return semanticErrors;
    }

    /**
     * Visita el nodo inicial del programa.
     *
     * @param ctx Contexto de inicio del analizador.
     * @return El resultado de evaluar el nodo principal del lenguaje.
     */
    @Override
    public Object visitInit(Codex_latinusParser.InitContext ctx) {
        return visit(ctx.codex_latinus());
    }

    /**
     * Recorre todos los nodos hijos contenidos en el bloque principal del programa.
     *
     * @param ctx Contexto del bloque general.
     * @return null al finalizar la ejecución secuencial.
     */
    @Override
    public Object visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    /**
     * Visita el bloque de declaración de variables globales o locales.
     *
     * @param ctx Contexto de variables.
     * @return null al finalizar.
     */
    @Override
    public Object visitVariables(Codex_latinusParser.VariablesContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    /**
     * Procesa la declaración de una variable individual, evaluando su expresión asignada o valor por defecto.
     *
     * @param dec Contexto de la declaración de variable.
     * @return El valor asignado a la variable, o null si no aplica.
     */
    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext dec) {
        if (dec.VARIABLE() == null || dec.VARIABLE().isEmpty()) return null;
        String varName = dec.VARIABLE(0).getText();
        String tipoDato = dec.tipo_dato() != null ? dec.tipo_dato().getText() : "desconocido";
        Object valor = null;

        if (dec.expresion() != null) {
            valor = visit(dec.expresion());
        } else if (dec.TEXTUM() != null || dec.CADENA_TEXTO() != null) {
            valor = dec.CADENA_TEXTO() != null ? limpiarCadena(dec.CADENA_TEXTO().getText()) : "";
        } else {
            for (int i = 0; i < dec.getChildCount(); i++) {
                if (dec.getChild(i) instanceof Codex_latinusParser.Structura_instanciacionContext) {
                    valor = visit(dec.getChild(i));
                    break;
                }
            }
        }

        if (symbolTable != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(valor);
            } else {
                Symbol newSym = new Symbol(varName, tipoDato, "variable", symbolTable.getCurrentScope(),
                        dec.getStart().getLine(), dec.getStart().getCharPositionInLine());
                newSym.setValue(valor);
                symbolTable.define(newSym);
            }
        }
        return valor;
    }

    /**
     * Procesa la declaración y asignación de arreglos unidimensionales o multidimensionales.
     *
     * @param ctx Contexto de declaración del arreglo.
     * @return Una lista de objetos que representa los elementos del arreglo.
     */
    @Override
    public Object visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        if (ctx.VARIABLE() == null || ctx.VARIABLE().isEmpty()) return null;
        String varName = ctx.VARIABLE(0).getText();

        List<Object> valores = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof Codex_latinusParser.ExpresionContext) {
                valores.add(visit(child));
            }
        }

        if (symbolTable != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(valores);
            }
        }
        return valores;
    }

    /**
     * Registra las funciones declaradas en el módulo dentro del mapa de funciones ejecutables.
     *
     * @param ctx Contexto del bloque de funciones (munera).
     * @return null al completar el registro.
     */
    @Override
    public Object visitMunera(Codex_latinusParser.MuneraContext ctx) {
        for (Codex_latinusParser.FuncionContext func : ctx.funcion()) {
            String nombreFunc = "";
            if (func.ratio_funcion() != null) {
                nombreFunc = func.ratio_funcion().VARIABLE().getText();
            } else if (func.actio_funcion() != null) {
                nombreFunc = func.actio_funcion().VARIABLE().getText();
            }
            funciones.put(nombreFunc, func);
        }
        return null;
    }

    /**
     * Ejecuta el bloque principal de código del programa, capturando interrupciones de bucle si ocurren.
     *
     * @param ctx Contexto del bloque principal (maior).
     * @return null al finalizar.
     */
    @Override
    public Object visitMaior(Codex_latinusParser.MaiorContext ctx) {
        for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
            try {
                visit(sent);
            } catch (LoopHandler.BreakException e) {
                break;
            }
        }
        return null;
    }

    /**
     * Procesa sentencias genéricas y operadores de incremento/decremento abreviados (++ / --).
     *
     * @param ctx Contexto de la sentencia.
     * @return El resultado de visitar los nodos hijos o null si procesó una abreviación.
     */
    @Override
    public Object visitSentencia(Codex_latinusParser.SentenciaContext ctx) {
        if (ctx.SUMA_ABREVIADA() != null || ctx.RESTA_ABREVIADA() != null) {
            String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : ctx.acceso_miembro().VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getValue() instanceof Number) {
                double val = ((Number) sym.getValue()).doubleValue();
                if (ctx.SUMA_ABREVIADA() != null) val++;
                else val--;

                if (sym.getValue() instanceof Integer) {
                    sym.setValue((int) val);
                } else {
                    sym.setValue(val);
                }
            }
            return null;
        }
        return visitChildren(ctx);
    }

    /**
     * Ejecuta la instrucción de impresión por consola evaluando las expresiones contenidas.
     *
     * @param ctx Contexto de la sentencia de impresión.
     * @return null al terminar de imprimir.
     */
    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (!text.equals(">>") && !text.equals(";")) {
                Object val = visit(child);
                if (val != null) {
                    if (val instanceof Boolean) {
                        sb.append(((Boolean) val) ? "verum" : "falsus");
                    } else {
                        sb.append(val);
                    }
                } else {
                    sb.append(text.replace("\"", ""));
                }
            }
        }
        return null;
    }

    /**
     * Lee un valor de la cola de entradas y lo almacena tipado adecuadamente en la variable objetivo.
     *
     * @param ctx Contexto de la sentencia de lectura.
     * @return null al completar la asignación de lectura.
     */
    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";
        String input = inputQueue.isEmpty() ? "18" : inputQueue.poll();

        Object val = input;
        try {
            if (input.contains(".")) {
                val = Double.parseDouble(input);
            } else {
                val = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            if (input.equalsIgnoreCase("verum")) val = true;
            else if (input.equalsIgnoreCase("falsus")) val = false;
        }

        if (symbolTable != null && !varName.isEmpty()) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(val);
            }
        }
        return null;
    }

    /**
     * Maneja la asignación de valores a variables existentes o propiedades de estructuras y arreglos.
     *
     * @param ctx Contexto de asignación.
     * @return El valor asignado.
     */
    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        Object value = null;
        if (ctx.expresion() != null) {
            value = visit(ctx.expresion());
        } else if (ctx.condicion() != null) {
            value = visit(ctx.condicion());
        } else if (ctx.arreglo_literal() != null) {
            List<Object> vals = new ArrayList<>();
            var arrayList = ctx.arreglo_literal();
            for (int i = 0; i < arrayList.getChildCount(); i++) {
                ParseTree child = arrayList.getChild(i);
                if (child instanceof Codex_latinusParser.ExpresionContext) {
                    vals.add(visit(child));
                }
            }
            value = vals;
        } else if (ctx.structura_instanciacion() != null) {
            value = visit(ctx.structura_instanciacion());
        }

        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            if (symbolTable != null) {
                Symbol sym = symbolTable.resolve(varName);
                if (sym != null) {
                    sym.setValue(value);
                } else {
                    semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no ha sido declarada.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                }
            }
        } else if (ctx.acceso_miembro() != null) {
            var am = ctx.acceso_miembro();
            String varName = am.VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getValue() != null) {
                Object container = sym.getValue();
                int exprIndex = 0;
                int varVarIndex = 1;

                for (int i = 1; i < am.getChildCount(); i++) {
                    ParseTree child = am.getChild(i);
                    String text = child.getText();

                    if (text.equals(".")) {
                        if (varVarIndex < am.VARIABLE().size()) {
                            String attrName = am.VARIABLE(varVarIndex++).getText();
                            if (i >= am.getChildCount() - 2) {
                                if (container instanceof Map) {
                                    @SuppressWarnings("unchecked")
                                    Map<String, Object> map = (Map<String, Object>) container;
                                    map.put(attrName, value);
                                }
                            } else {
                                if (container instanceof Map) {
                                    @SuppressWarnings("unchecked")
                                    Map<String, Object> map = (Map<String, Object>) container;
                                    container = map.get(attrName);
                                }
                            }
                        }
                    } else if (text.equals("[")) {
                        if (container instanceof List && exprIndex < am.expresion().size()) {
                            Object indexObj = visit(am.expresion(exprIndex++));
                            if (indexObj instanceof Number) {
                                int index = ((Number) indexObj).intValue();
                                @SuppressWarnings("unchecked")
                                List<Object> lista = (List<Object>) container;

                                if (i >= am.getChildCount() - 3) {
                                    if (index >= 0 && index < lista.size()) {
                                        lista.set(index, value);
                                    } else {
                                        semanticErrors.add(new CompilationError("SEMÁNTICO", "Error semántico: Índice " + index + " fuera de rango para el arreglo '" + varName + "'.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                                    }
                                } else {
                                    if (index >= 0 && index < lista.size()) {
                                        container = lista.get(index);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El miembro o variable '" + varName + "' no ha sido declarado.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }
        return value;
    }

    /**
     * Resuelve el acceso a miembros de objetos (mapas) o elementos de arreglos (listas).
     *
     * @param ctx Contexto de acceso a miembro.
     * @return El objeto o valor contenido en la posición o atributo consultado.
     */
    @Override
    public Object visitAcceso_miembro(Codex_latinusParser.Acceso_miembroContext ctx) {
        if (ctx.VARIABLE() == null || ctx.VARIABLE().isEmpty()) return null;

        String varName = ctx.VARIABLE(0).getText();
        Symbol sym = symbolTable.resolve(varName);
        if (sym == null || sym.getValue() == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable o estructura '" + varName + "' no ha sido declarada.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            return null;
        }

        Object actual = sym.getValue();
        int exprIndex = 0;
        int varVarIndex = 1;

        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals(".")) {
                if (varVarIndex < ctx.VARIABLE().size()) {
                    String attrName = ctx.VARIABLE(varVarIndex++).getText();
                    if (actual instanceof Map) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> map = (Map<String, Object>) actual;
                        actual = map.get(attrName);
                    } else {
                        return null;
                    }
                }
            } else if (text.equals("[")) {
                if (actual instanceof List && exprIndex < ctx.expresion().size()) {
                    Object indexObj = visit(ctx.expresion(exprIndex++));
                    if (indexObj instanceof Number) {
                        int index = ((Number) indexObj).intValue();
                        @SuppressWarnings("unchecked")
                        List<Object> lista = (List<Object>) actual;
                        if (index >= 0 && index < lista.size()) {
                            actual = lista.get(index);
                        } else {
                            semanticErrors.add(new CompilationError("SEMÁNTICO", "Error semántico: Índice " + index + " fuera de rango para '" + varName + "'.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                            return null;
                        }
                    }
                }
            }
        }

        return actual;
    }

    /**
     * Evalúa la sentencia condicional if/else (si / aliter).
     *
     * @param ctx Contexto de la sentencia condicional.
     * @return null al finalizar la ejecución del bloque correspondiente.
     */
    @Override
    public Object visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        Object condicion = visit(ctx.condicion());
        if (condicion instanceof Boolean && (Boolean) condicion) {
            for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                visit(sent);
            }
        } else {
            for (int i = 0; i < ctx.aliter_bloque().size(); i++) {
                var aliter = ctx.aliter_bloque(i);
                Object condAliter = visit(aliter.condicion());
                if (condAliter instanceof Boolean && (Boolean) condAliter) {
                    for (Codex_latinusParser.SentenciaContext sent : aliter.sentencia()) {
                        visit(sent);
                    }
                    break;
                }
            }
        }
        return null;
    }

    /**
     * Delegado para la ejecución del ciclo mientras (dum) usando LoopHandler.
     *
     * @param ctx Contexto del ciclo dum.
     * @return El resultado de la ejecución del ciclo.
     */
    @Override
    public Object visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        return loopHandler.handleCicloDum(ctx, c -> visit(c));
    }

    /**
     * Delegado para la ejecución del ciclo hacer-mientras (facere) usando LoopHandler.
     *
     * @param ctx Contexto del ciclo facere.
     * @return El resultado de la ejecución del ciclo.
     */
    @Override
    public Object visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        return loopHandler.handleCicloFacere(ctx, c -> visit(c));
    }

    /**
     * Delegado para la ejecución del ciclo for (per) usando LoopHandler.
     *
     * @param ctx Contexto del ciclo per.
     * @return El resultado de la ejecución del ciclo.
     */
    @Override
    public Object visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        return loopHandler.handleCicloPer(ctx, c -> visit(c));
    }

    /**
     * Delegado para el manejo de saltos de control como interrupciones y retornos.
     *
     * @param ctx Contexto de salto.
     * @return El resultado o excepción generada por el salto.
     */
    @Override
    public Object visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        return controlFlowHandler.handleSaltoSentencia(ctx);
    }

    /**
     * Evalúa condiciones lógicas compuestas con operadores OR.
     *
     * @param ctx Contexto de la condición.
     * @return Un booleano con el resultado de la evaluación lógica.
     */
    @Override
    public Object visitCondicion(Codex_latinusParser.CondicionContext ctx) {
        if (ctx.OR() != null) {
            Object izq = visit(ctx.condicion());
            Object der = visit(ctx.conjuncion());
            if (izq instanceof Boolean && der instanceof Boolean) {
                return (Boolean) izq || (Boolean) der;
            }
        }
        return visit(ctx.conjuncion());
    }

    /**
     * Evalúa conjunciones lógicas compuestas con operadores AND.
     *
     * @param ctx Contexto de la conjunción.
     * @return Booleano con el resultado de la operación.
     */
    @Override
    public Object visitConjuncion(Codex_latinusParser.ConjuncionContext ctx) {
        if (ctx.AND() != null) {
            Object izq = visit(ctx.conjuncion());
            Object der = visit(ctx.negacion_logica());
            if (izq instanceof Boolean && der instanceof Boolean) {
                return (Boolean) izq && (Boolean) der;
            }
        }
        return visit(ctx.negacion_logica());
    }

    /**
     * Aplica la negación lógica sobre una expresión booleana.
     *
     * @param ctx Contexto de negación.
     * @return El valor booleano invertido.
     */
    @Override
    public Object visitNegacion_logica(Codex_latinusParser.Negacion_logicaContext ctx) {
        if (ctx.NEGACION() != null) {
            Object val = visit(ctx.negacion_logica());
            if (val instanceof Boolean) {
                return !(Boolean) val;
            }
        }
        return visit(ctx.primaria_logica());
    }

    /**
     * Resuelve elementos lógicos primarios, literales booleanos, llamadas o comparaciones relacionales.
     *
     * @param ctx Contexto lógico primario.
     * @return El valor resultante de la evaluación (generalmente boolean o numérico).
     */
    @Override
    public Object visitPrimaria_logica(Codex_latinusParser.Primaria_logicaContext ctx) {
        if (ctx.VERUM() != null) return true;
        if (ctx.FALSUS() != null) return false;
        if (ctx.VARIABLE() != null) {
            Symbol s = symbolTable.resolve(ctx.VARIABLE().getText());
            return s != null ? s.getValue() : false;
        }
        if (ctx.llamada_funcion() != null) {
            return visit(ctx.llamada_funcion());
        }
        if (ctx.operador_relacional() != null) {
            Object izq = visit(ctx.expresion(0));
            Object der = visit(ctx.expresion(1));
            String op = ctx.operador_relacional().getText();

            if (izq instanceof Number && der instanceof Number) {
                double v1 = ((Number) izq).doubleValue();
                double v2 = ((Number) der).doubleValue();
                return switch (op) {
                    case ">" -> v1 > v2;
                    case ">=" -> v1 >= v2;
                    case "<" -> v1 < v2;
                    case "<=" -> v1 <= v2;
                    case "==" -> v1 == v2;
                    case "!=" -> v1 != v2;
                    default -> false;
                };
            }
            if (op.equals("==")) {
                return Objects.equals(izq, der);
            }
            if (op.equals("!=")) {
                return !Objects.equals(izq, der);
            }
        }
        return visitChildren(ctx);
    }

    /**
     * Evalúa expresiones aritméticas u operaciones de concatenación de cadenas.
     *
     * @param ctx Contexto de la expresión.
     * @return El resultado numérico o de texto de la operación.
     */
    @Override
    public Object visitExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino().size() == 1) {
            return visit(ctx.termino(0));
        }
        try {
            Object resultado = visit(ctx.termino(0));
            for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
                String op = ctx.operacion_aritmetica(i).getText();
                Object sig = visit(ctx.termino(i + 1));

                if (op.equals("+") && (resultado instanceof String || sig instanceof String)) {
                    resultado = String.valueOf(resultado) + sig;
                    continue;
                }

                if (resultado instanceof Number && sig instanceof Number) {
                    double v1 = ((Number) resultado).doubleValue();
                    double v2 = ((Number) sig).doubleValue();
                    resultado = switch (op) {
                        case "*" -> v1 * v2;
                        case "+" -> v1 + v2;
                        case "-" -> v1 - v2;
                        case "/" -> v2 != 0 ? v1 / v2 : 0;
                        default -> resultado;
                    };
                }
            }
            return resultado;
        } catch (Exception ignored) {
        }
        return visitChildren(ctx);
    }

    /**
     * Resuelve los términos individuales dentro de una expresión (variables, números, cadenas, llamadas).
     *
     * @param ctx Contexto del término.
     * @return El valor nativo asociado al término analizado.
     */
    @Override
    public Object visitTermino(Codex_latinusParser.TerminoContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            if (symbolTable != null) {
                Symbol sym = symbolTable.resolve(varName);
                if (sym != null && sym.getValue() != null) {
                    return sym.getValue();
                }
            }
            return 0;
        }
        if (ctx.acceso_miembro() != null) {
            return visit(ctx.acceso_miembro());
        }
        if (ctx.NUMERO_ENTERO() != null) {
            return Integer.parseInt(ctx.NUMERO_ENTERO().getText());
        }
        if (ctx.NUMERO_DECIMAL() != null) {
            return Double.parseDouble(ctx.NUMERO_DECIMAL().getText());
        }
        if (ctx.CADENA_TEXTO() != null) {
            return limpiarCadena(ctx.CADENA_TEXTO().getText());
        }
        if (ctx.VERUM() != null) return true;
        if (ctx.FALSUS() != null) return false;
        if (ctx.llamada_funcion() != null) {
            return visit(ctx.llamada_funcion());
        }
        return visitChildren(ctx);
    }

    /**
     * Ejecuta una llamada a función, creando un nuevo ámbito (scope), asignando parámetros y capturando su retorno.
     *
     * @param ctx Contexto de la llamada de función.
     * @return El valor de retorno devuelto por la función ejecutada, o null si no retorna nada.
     */
    @Override
    public Object visitLlamada_funcion(Codex_latinusParser.Llamada_funcionContext ctx) {
        String funcName = ctx.VARIABLE().getText();
        Codex_latinusParser.FuncionContext funcCtx = funciones.get(funcName);
        if (funcCtx == null) return null;

        List<Object> argValues = new ArrayList<>();
        if (ctx.argumentos() != null && ctx.argumentos().expresion() != null) {
            for (Codex_latinusParser.ExpresionContext expr : ctx.argumentos().expresion()) {
                argValues.add(visit(expr));
            }
        }

        Object resultadoFuncion = null;
        try {
            if (funcCtx.ratio_funcion() != null) {
                resultadoFuncion = functionHandler.handleRatioFuncion(funcCtx.ratio_funcion(), argValues, c -> visit(c));
            } else if (funcCtx.actio_funcion() != null) {
                resultadoFuncion = functionHandler.handleActioFuncion(funcCtx.actio_funcion(), argValues, c -> visit(c));
            }
        } catch (ControlFlowHandler.ReturnException e) {
            resultadoFuncion = e.getValue();
        }

        return resultadoFuncion;
    }

    @Override
    public Object visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitReddere(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        Object valorRetorno = null;
        if (ctx.expresion() != null) {
            valorRetorno = visit(ctx.expresion());
        }
        throw new ControlFlowHandler.ReturnException(valorRetorno);
    }

    /**
     * Limpia los delimitadores de comillas en las literales de cadenas de texto.
     *
     * @param cad Cadena literal con comillas.
     * @return Cadena procesada sin comillas iniciales ni finales.
     */
    private String limpiarCadena(String cad) {
        if (cad.startsWith("\"") && cad.endsWith("\"")) {
            return cad.substring(1, cad.length() - 1);
        }
        return cad;
    }

    /**
     * Instancia una estructura de datos personalizada convirtiéndola en un mapa de atributos y valores.
     *
     * @param ctx Contexto de instanciación de estructura.
     * @return Un mapa que representa el objeto instanciado.
     */
    @Override
    public Object visitStructura_instanciacion(Codex_latinusParser.Structura_instanciacionContext ctx) {
        Map<String, Object> instancia = new HashMap<>();

        if (ctx.atributo_asignacion() != null) {
            for (Codex_latinusParser.Atributo_asignacionContext atribCtx : ctx.atributo_asignacion()) {
                String nombreAtributo = atribCtx.VARIABLE().getText();
                Object valorAtributo = null;

                if (atribCtx.expresion() != null) {
                    valorAtributo = visit(atribCtx.expresion());
                } else if (atribCtx.structura_instanciacion() != null) {
                    valorAtributo = visit(atribCtx.structura_instanciacion());
                } else if (atribCtx.arreglo_literal() != null) {
                    valorAtributo = visit(atribCtx.arreglo_literal());
                }

                instancia.put(nombreAtributo, valorAtributo);
            }
        }
        return instancia;
    }
}