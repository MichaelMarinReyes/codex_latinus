// Generated from codex_latinus/Codex_latinus.g4 by ANTLR 4.13.2
package codex_latinus;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Codex_latinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Codex_latinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(Codex_latinusParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#codex_latinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#structura_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructura_def(Codex_latinusParser.Structura_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#miembro_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiembro_structura(Codex_latinusParser.Miembro_structuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Codex_latinusParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#arreglo_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#elemento_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_arreglo(Codex_latinusParser.Elemento_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#elemento_arreglo_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_arreglo_struct(Codex_latinusParser.Elemento_arreglo_structContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#structura_instanciacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructura_instanciacion(Codex_latinusParser.Structura_instanciacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#atributo_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo_asignacion(Codex_latinusParser.Atributo_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#arreglo_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo_literal(Codex_latinusParser.Arreglo_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#munera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMunera(Codex_latinusParser.MuneraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Codex_latinusParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(Codex_latinusParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(Codex_latinusParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(Codex_latinusParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#variables_locales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_locales(Codex_latinusParser.Variables_localesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#declaracion_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_local(Codex_latinusParser.Declaracion_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Codex_latinusParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(Codex_latinusParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#acceso_miembro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_miembro(Codex_latinusParser.Acceso_miembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#arreglo_acceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo_acceso(Codex_latinusParser.Arreglo_accesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(Codex_latinusParser.Operacion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#reddere_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReddere_sentencia(Codex_latinusParser.Reddere_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#maior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior(Codex_latinusParser.MaiorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(Codex_latinusParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#imprimir_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#leer_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#asignacion_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#si_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#ciclo_dum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#ciclo_facere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#ciclo_per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#inicializacion_per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion_per(Codex_latinusParser.Inicializacion_perContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#condiciones_per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones_per(Codex_latinusParser.Condiciones_perContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#incremento_per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento_per(Codex_latinusParser.Incremento_perContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#salto_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Codex_latinusParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(Codex_latinusParser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(Codex_latinusParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Codex_latinusParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(Codex_latinusParser.ArgumentosContext ctx);
}