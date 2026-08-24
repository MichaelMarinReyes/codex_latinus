package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;

import java.util.ArrayList;
import java.util.List;

public class AssignmentHandler {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final TypeChecker typeChecker;

    public AssignmentHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors, TypeChecker typeChecker) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.typeChecker = typeChecker != null ? typeChecker : new TypeChecker(this.symbolTable, this.semanticErrors);
    }

    /**
     * Procesa, valida y verifica el tipado de una sentencia de asignación o acceso a arreglo.
     */
    public void handleAsignacion(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = "";
        Codex_latinusParser.ExpresionContext indexExpr = null;
        Codex_latinusParser.ExpresionContext exprAsignacion = null;

        // 1. Extraer nombre de la variable y detectar si es un acceso a arreglo con corchetes
        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null) {
            var acceso = ctx.acceso_miembro();
            if (acceso.VARIABLE() != null && !acceso.VARIABLE().isEmpty()) {
                varName = acceso.VARIABLE().get(0).getText();
            }
            if (acceso.expresion() != null && !acceso.expresion().isEmpty()) {
                indexExpr = acceso.expresion(0);
            }
        }

        // 2. Extraer el valor a asignar (el lado derecho de la asignación)
        exprAsignacion = ctx.expresion();

        boolean esArregloAsignacion = (indexExpr != null);
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        // 3. Resolver la variable en la tabla de símbolos
        Symbol sym = symbolTable.resolve(varName);
        if (sym == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable o series '" + varName + "' no ha sido declarada.", line, column));
            return;
        }

        // 4. Verificación estática de límites de arreglos (Bounds Checking)
        if ("series".equals(sym.getCategory()) && esArregloAsignacion) {
            Integer staticIndex = evaluarIndiceConstante(indexExpr);
            if (staticIndex != null) {
                int declaredSize = sym.getSize();
                if (staticIndex < 0 || (declaredSize > 0 && staticIndex >= declaredSize)) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "Desbordamiento de índice: El índice '" + staticIndex + "' está fuera del rango del series '" + varName + "' (tamaño declarado: " + declaredSize + ").",
                            line, column));
                }
            }
        }

        // 5. Type Checking estricto e Inferencia
        if (exprAsignacion != null) {
            String tipoVariable = sym.getType() != null ? sym.getType().toLowerCase() : "desconocido";
            String tipoValor = typeChecker.getTipoExpresion(exprAsignacion);

            if (!areTypesCompatible(tipoVariable, tipoValor)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de tipo: No se puede asignar un valor de tipo '" + tipoValor + "' a una variable de tipo '" + tipoVariable + "'.",
                        line, column));
            } else {
                sym.setValue(exprAsignacion.getText());
            }
        }
    }

    private Integer evaluarIndiceConstante(Codex_latinusParser.ExpresionContext exprCtx) {
        if (exprCtx == null) return null;
        if (exprCtx.termino() != null && exprCtx.termino().size() == 1) {
            var termino = exprCtx.termino(0);
            if (termino.NUMERO_ENTERO() != null) {
                try {
                    return Integer.parseInt(termino.NUMERO_ENTERO().getText());
                } catch (NumberFormatException ignored) {}
            }
        }
        return null;
    }

    private boolean areTypesCompatible(String targetType, String valType) {
        targetType = targetType.toLowerCase();
        valType = valType.toLowerCase();

        if (targetType.equals(valType) || targetType.equals("desconocido") || valType.equals("desconocido")) {
            return true;
        }

        // Textum solo es compatible con textum
        if (targetType.equals("textum") || valType.equals("textum")) {
            return targetType.equals(valType);
        }

        // Validación de Booleanos
        boolean isTargetBool = targetType.equals("boolean") || targetType.equals("verum") || targetType.equals("falsus");
        boolean isValBool = valType.equals("boolean") || valType.equals("verum") || valType.equals("falsus");
        if (isTargetBool || isValBool) {
            return isTargetBool && isValBool;
        }

        // Jerarquía numérica: 'decimalis' puede aceptar un 'numerus'
        if (targetType.equals("decimalis") && valType.equals("numerus")) {
            return true;
        }

        int hTarget = typeChecker.getJerarquia(targetType);
        int hVal = typeChecker.getJerarquia(valType);

        return hTarget >= hVal && hTarget != -1 && hVal != -1;
    }
}