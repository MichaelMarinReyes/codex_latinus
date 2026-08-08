// Generated from codex_latinus/Codex_latinus.g4 by ANTLR 4.13.2
package codex_latinus;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Codex_latinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESTO=1, SERIES=2, STRUCTURA=3, FINIS=4, SI=5, ALITER=6, DUM=7, FACERE=8, 
		PER=9, PERGE=10, INTERRUMPE=11, ACTIO=12, RATIO=13, REDDERE=14, VARIABILES=15, 
		MUNERA=16, MAIOR=17, NUMERUS=18, TEXTUM=19, DECIMALIS=20, LITTERA=21, 
		VERUM=22, FALSUS=23, DOS_PUNTOS=24, PUNTO_COMA=25, COMA=26, ASIGNACION=27, 
		PUNTO=28, LEER=29, IMPRIMIR=30, PARENTESIS_IZQ=31, PARENTESIS_DER=32, 
		CORCHETE_IZQ=33, CORCHETE_DER=34, LLAVE_IZQ=35, LLAVE_DER=36, MAS=37, 
		MENOS=38, MULTIPLICACION=39, DIVISION=40, MAYOR_IGUAL=41, MENOR_IGUAL=42, 
		IGUAL=43, NO_IGUAL=44, MENOR_QUE=45, MAYOR_QUE=46, AND=47, OR=48, NEGACION=49, 
		SUMA_ABREVIADA=50, RESTA_ABREVIADA=51, VARIABLE=52, NUMERO_ENTERO=53, 
		NUMERO_DECIMAL=54, CADENA_TEXTO=55, CARACTER=56, WS=57, COMENTARIO_LINEA=58, 
		COMENTARIO_BLOQUE=59;
	public static final int
		RULE_init = 0, RULE_codex_latinus = 1, RULE_structura_def = 2, RULE_miembro_structura = 3, 
		RULE_variables = 4, RULE_declaracion = 5, RULE_arreglo_declaracion = 6, 
		RULE_elemento_arreglo = 7, RULE_elemento_arreglo_struct = 8, RULE_structura_instanciacion = 9, 
		RULE_atributo_asignacion = 10, RULE_arreglo_literal = 11, RULE_munera = 12, 
		RULE_funcion = 13, RULE_ratio_funcion = 14, RULE_actio_funcion = 15, RULE_tipo_dato = 16, 
		RULE_parametros = 17, RULE_parametro = 18, RULE_variables_locales = 19, 
		RULE_declaracion_local = 20, RULE_expresion = 21, RULE_termino = 22, RULE_acceso_miembro = 23, 
		RULE_arreglo_acceso = 24, RULE_operacion_aritmetica = 25, RULE_reddere_sentencia = 26, 
		RULE_maior = 27, RULE_sentencia = 28, RULE_leer_sentencia = 29, RULE_asignacion_sentencia = 30, 
		RULE_imprimir_sentencia = 31, RULE_si_sentencia = 32, RULE_aliter_bloque = 33, 
		RULE_ciclo_dum = 34, RULE_ciclo_facere = 35, RULE_ciclo_per = 36, RULE_inicializacion_per = 37, 
		RULE_condiciones_per = 38, RULE_incremento_per = 39, RULE_salto_sentencia = 40, 
		RULE_condicion = 41, RULE_conjuncion = 42, RULE_negacion_logica = 43, 
		RULE_primaria_logica = 44, RULE_operador_relacional = 45, RULE_llamada_funcion = 46, 
		RULE_argumentos = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "codex_latinus", "structura_def", "miembro_structura", "variables", 
			"declaracion", "arreglo_declaracion", "elemento_arreglo", "elemento_arreglo_struct", 
			"structura_instanciacion", "atributo_asignacion", "arreglo_literal", 
			"munera", "funcion", "ratio_funcion", "actio_funcion", "tipo_dato", "parametros", 
			"parametro", "variables_locales", "declaracion_local", "expresion", "termino", 
			"acceso_miembro", "arreglo_acceso", "operacion_aritmetica", "reddere_sentencia", 
			"maior", "sentencia", "leer_sentencia", "asignacion_sentencia", "imprimir_sentencia", 
			"si_sentencia", "aliter_bloque", "ciclo_dum", "ciclo_facere", "ciclo_per", 
			"inicializacion_per", "condiciones_per", "incremento_per", "salto_sentencia", 
			"condicion", "conjuncion", "negacion_logica", "primaria_logica", "operador_relacional", 
			"llamada_funcion", "argumentos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'esto'", "'series'", "'structura'", null, "'si'", "'aliter'", 
			"'dum'", "'facere'", "'per'", "'perge'", "'interrumpe'", "'actio'", "'ratio'", 
			"'reddere'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", "'numerus'", "'textum'", 
			"'decimalis'", "'littera'", "'verum'", "'falsus'", "':'", "';'", "','", 
			"'='", "'.'", "'<<'", "'>>'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'+'", "'-'", "'*'", "'/'", "'>='", "'<='", "'=='", "'!='", "'<'", "'>'", 
			"'&&'", "'||'", "'non'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESTO", "SERIES", "STRUCTURA", "FINIS", "SI", "ALITER", "DUM", 
			"FACERE", "PER", "PERGE", "INTERRUMPE", "ACTIO", "RATIO", "REDDERE", 
			"VARIABILES", "MUNERA", "MAIOR", "NUMERUS", "TEXTUM", "DECIMALIS", "LITTERA", 
			"VERUM", "FALSUS", "DOS_PUNTOS", "PUNTO_COMA", "COMA", "ASIGNACION", 
			"PUNTO", "LEER", "IMPRIMIR", "PARENTESIS_IZQ", "PARENTESIS_DER", "CORCHETE_IZQ", 
			"CORCHETE_DER", "LLAVE_IZQ", "LLAVE_DER", "MAS", "MENOS", "MULTIPLICACION", 
			"DIVISION", "MAYOR_IGUAL", "MENOR_IGUAL", "IGUAL", "NO_IGUAL", "MENOR_QUE", 
			"MAYOR_QUE", "AND", "OR", "NEGACION", "SUMA_ABREVIADA", "RESTA_ABREVIADA", 
			"VARIABLE", "NUMERO_ENTERO", "NUMERO_DECIMAL", "CADENA_TEXTO", "CARACTER", 
			"WS", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Codex_latinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Codex_latinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public Codex_latinusContext codex_latinus() {
			return getRuleContext(Codex_latinusContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			codex_latinus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Codex_latinusContext extends ParserRuleContext {
		public MaiorContext maior() {
			return getRuleContext(MaiorContext.class,0);
		}
		public List<Structura_defContext> structura_def() {
			return getRuleContexts(Structura_defContext.class);
		}
		public Structura_defContext structura_def(int i) {
			return getRuleContext(Structura_defContext.class,i);
		}
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<MuneraContext> munera() {
			return getRuleContexts(MuneraContext.class);
		}
		public MuneraContext munera(int i) {
			return getRuleContext(MuneraContext.class,i);
		}
		public Codex_latinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codex_latinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCodex_latinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCodex_latinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCodex_latinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Codex_latinusContext codex_latinus() throws RecognitionException {
		Codex_latinusContext _localctx = new Codex_latinusContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codex_latinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCTURA) {
				{
				{
				setState(98);
				structura_def();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABILES) {
				{
				{
				setState(104);
				variables();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUNERA) {
				{
				{
				setState(110);
				munera();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			maior();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Structura_defContext extends ParserRuleContext {
		public TerminalNode STRUCTURA() { return getToken(Codex_latinusParser.STRUCTURA, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<Miembro_structuraContext> miembro_structura() {
			return getRuleContexts(Miembro_structuraContext.class);
		}
		public Miembro_structuraContext miembro_structura(int i) {
			return getRuleContext(Miembro_structuraContext.class,i);
		}
		public Structura_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structura_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterStructura_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitStructura_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitStructura_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structura_defContext structura_def() throws RecognitionException {
		Structura_defContext _localctx = new Structura_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structura_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(STRUCTURA);
			setState(119);
			match(VARIABLE);
			setState(120);
			match(LLAVE_IZQ);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SERIES) {
				{
				{
				setState(121);
				miembro_structura();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(LLAVE_DER);
			setState(128);
			match(FINIS);
			setState(129);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Miembro_structuraContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(Codex_latinusParser.ESTO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Codex_latinusParser.COMA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode SERIES() { return getToken(Codex_latinusParser.SERIES, 0); }
		public Miembro_structuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miembro_structura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterMiembro_structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitMiembro_structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitMiembro_structura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Miembro_structuraContext miembro_structura() throws RecognitionException {
		Miembro_structuraContext _localctx = new Miembro_structuraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_miembro_structura);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ESTO);
				setState(132);
				match(VARIABLE);
				setState(133);
				match(DOS_PUNTOS);
				setState(134);
				tipo_dato();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(135);
					_la = _input.LA(1);
					if ( !(_la==PUNTO_COMA || _la==COMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(SERIES);
				setState(139);
				match(VARIABLE);
				setState(140);
				match(DOS_PUNTOS);
				setState(141);
				tipo_dato();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(142);
					_la = _input.LA(1);
					if ( !(_la==PUNTO_COMA || _la==COMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(ESTO);
				setState(146);
				match(VARIABLE);
				setState(147);
				match(DOS_PUNTOS);
				setState(148);
				match(VARIABLE);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(149);
					_la = _input.LA(1);
					if ( !(_la==PUNTO_COMA || _la==COMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(SERIES);
				setState(153);
				match(VARIABLE);
				setState(154);
				match(DOS_PUNTOS);
				setState(155);
				match(VARIABLE);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==PUNTO_COMA || _la==COMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(Codex_latinusParser.VARIABILES, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(Codex_latinusParser.MAYOR_QUE, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(VARIABILES);
			setState(162);
			match(MAYOR_QUE);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				declaracion();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO || _la==SERIES );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(Codex_latinusParser.ESTO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode TEXTUM() { return getToken(Codex_latinusParser.TEXTUM, 0); }
		public TerminalNode CADENA_TEXTO() { return getToken(Codex_latinusParser.CADENA_TEXTO, 0); }
		public TerminalNode LITTERA() { return getToken(Codex_latinusParser.LITTERA, 0); }
		public TerminalNode CARACTER() { return getToken(Codex_latinusParser.CARACTER, 0); }
		public Structura_instanciacionContext structura_instanciacion() {
			return getRuleContext(Structura_instanciacionContext.class,0);
		}
		public Arreglo_declaracionContext arreglo_declaracion() {
			return getRuleContext(Arreglo_declaracionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(ESTO);
				setState(169);
				match(VARIABLE);
				setState(170);
				match(DOS_PUNTOS);
				setState(171);
				tipo_dato();
				setState(172);
				expresion();
				setState(173);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ESTO);
				setState(176);
				match(VARIABLE);
				setState(177);
				match(DOS_PUNTOS);
				setState(178);
				match(TEXTUM);
				setState(179);
				match(CADENA_TEXTO);
				setState(180);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(ESTO);
				setState(182);
				match(VARIABLE);
				setState(183);
				match(DOS_PUNTOS);
				setState(184);
				match(LITTERA);
				setState(185);
				match(CARACTER);
				setState(186);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(ESTO);
				setState(188);
				match(VARIABLE);
				setState(189);
				match(DOS_PUNTOS);
				setState(190);
				match(VARIABLE);
				setState(191);
				structura_instanciacion();
				setState(192);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(ESTO);
				setState(195);
				match(VARIABLE);
				setState(196);
				match(DOS_PUNTOS);
				setState(197);
				expresion();
				setState(198);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				arreglo_declaracion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arreglo_declaracionContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(Codex_latinusParser.SERIES, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode CORCHETE_IZQ() { return getToken(Codex_latinusParser.CORCHETE_IZQ, 0); }
		public TerminalNode NUMERO_ENTERO() { return getToken(Codex_latinusParser.NUMERO_ENTERO, 0); }
		public TerminalNode CORCHETE_DER() { return getToken(Codex_latinusParser.CORCHETE_DER, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public Elemento_arregloContext elemento_arreglo() {
			return getRuleContext(Elemento_arregloContext.class,0);
		}
		public Elemento_arreglo_structContext elemento_arreglo_struct() {
			return getRuleContext(Elemento_arreglo_structContext.class,0);
		}
		public Arreglo_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterArreglo_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitArreglo_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitArreglo_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arreglo_declaracionContext arreglo_declaracion() throws RecognitionException {
		Arreglo_declaracionContext _localctx = new Arreglo_declaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arreglo_declaracion);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(SERIES);
				setState(204);
				match(VARIABLE);
				setState(205);
				match(CORCHETE_IZQ);
				setState(206);
				match(NUMERO_ENTERO);
				setState(207);
				match(CORCHETE_DER);
				setState(208);
				match(DOS_PUNTOS);
				setState(209);
				tipo_dato();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAVE_IZQ) {
					{
					setState(210);
					match(LLAVE_IZQ);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
						{
						setState(211);
						elemento_arreglo();
						}
					}

					setState(214);
					match(LLAVE_DER);
					}
				}

				setState(217);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(SERIES);
				setState(220);
				match(VARIABLE);
				setState(221);
				match(CORCHETE_IZQ);
				setState(222);
				match(NUMERO_ENTERO);
				setState(223);
				match(CORCHETE_DER);
				setState(224);
				match(DOS_PUNTOS);
				setState(225);
				match(VARIABLE);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAVE_IZQ) {
					{
					setState(226);
					match(LLAVE_IZQ);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VARIABLE) {
						{
						setState(227);
						elemento_arreglo_struct();
						}
					}

					setState(230);
					match(LLAVE_DER);
					}
				}

				setState(233);
				match(PUNTO_COMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elemento_arregloContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Codex_latinusParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Codex_latinusParser.COMA, i);
		}
		public Elemento_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterElemento_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitElemento_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitElemento_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elemento_arregloContext elemento_arreglo() throws RecognitionException {
		Elemento_arregloContext _localctx = new Elemento_arregloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elemento_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expresion();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(237);
				match(COMA);
				setState(238);
				expresion();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elemento_arreglo_structContext extends ParserRuleContext {
		public List<Structura_instanciacionContext> structura_instanciacion() {
			return getRuleContexts(Structura_instanciacionContext.class);
		}
		public Structura_instanciacionContext structura_instanciacion(int i) {
			return getRuleContext(Structura_instanciacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Codex_latinusParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Codex_latinusParser.COMA, i);
		}
		public Elemento_arreglo_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_arreglo_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterElemento_arreglo_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitElemento_arreglo_struct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitElemento_arreglo_struct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elemento_arreglo_structContext elemento_arreglo_struct() throws RecognitionException {
		Elemento_arreglo_structContext _localctx = new Elemento_arreglo_structContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elemento_arreglo_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			structura_instanciacion();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(245);
				match(COMA);
				setState(246);
				structura_instanciacion();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Structura_instanciacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public List<Atributo_asignacionContext> atributo_asignacion() {
			return getRuleContexts(Atributo_asignacionContext.class);
		}
		public Atributo_asignacionContext atributo_asignacion(int i) {
			return getRuleContext(Atributo_asignacionContext.class,i);
		}
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(Codex_latinusParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Codex_latinusParser.COMA, i);
		}
		public TerminalNode CORCHETE_IZQ() { return getToken(Codex_latinusParser.CORCHETE_IZQ, 0); }
		public TerminalNode NUMERO_ENTERO() { return getToken(Codex_latinusParser.NUMERO_ENTERO, 0); }
		public TerminalNode CORCHETE_DER() { return getToken(Codex_latinusParser.CORCHETE_DER, 0); }
		public Structura_instanciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structura_instanciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterStructura_instanciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitStructura_instanciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitStructura_instanciacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structura_instanciacionContext structura_instanciacion() throws RecognitionException {
		Structura_instanciacionContext _localctx = new Structura_instanciacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_structura_instanciacion);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(VARIABLE);
				setState(253);
				match(LLAVE_IZQ);
				setState(254);
				atributo_asignacion();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(255);
					match(COMA);
					setState(256);
					atributo_asignacion();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(LLAVE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(VARIABLE);
				setState(265);
				match(CORCHETE_IZQ);
				setState(266);
				match(NUMERO_ENTERO);
				setState(267);
				match(CORCHETE_DER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atributo_asignacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Structura_instanciacionContext structura_instanciacion() {
			return getRuleContext(Structura_instanciacionContext.class,0);
		}
		public Arreglo_literalContext arreglo_literal() {
			return getRuleContext(Arreglo_literalContext.class,0);
		}
		public Atributo_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterAtributo_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitAtributo_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitAtributo_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atributo_asignacionContext atributo_asignacion() throws RecognitionException {
		Atributo_asignacionContext _localctx = new Atributo_asignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atributo_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(VARIABLE);
			setState(271);
			match(DOS_PUNTOS);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(272);
				expresion();
				}
				break;
			case 2:
				{
				setState(273);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(274);
				arreglo_literal();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arreglo_literalContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public Elemento_arregloContext elemento_arreglo() {
			return getRuleContext(Elemento_arregloContext.class,0);
		}
		public Arreglo_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterArreglo_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitArreglo_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitArreglo_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arreglo_literalContext arreglo_literal() throws RecognitionException {
		Arreglo_literalContext _localctx = new Arreglo_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arreglo_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LLAVE_IZQ);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
				{
				setState(278);
				elemento_arreglo();
				}
			}

			setState(281);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MuneraContext extends ParserRuleContext {
		public TerminalNode MUNERA() { return getToken(Codex_latinusParser.MUNERA, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(Codex_latinusParser.MAYOR_QUE, 0); }
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public MuneraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_munera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterMunera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitMunera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitMunera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuneraContext munera() throws RecognitionException {
		MuneraContext _localctx = new MuneraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_munera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(MUNERA);
			setState(284);
			match(MAYOR_QUE);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				funcion();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTIO || _la==RATIO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public Ratio_funcionContext ratio_funcion() {
			return getRuleContext(Ratio_funcionContext.class,0);
		}
		public Actio_funcionContext actio_funcion() {
			return getRuleContext(Actio_funcionContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcion);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				ratio_funcion();
				}
				break;
			case ACTIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				actio_funcion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ratio_funcionContext extends ParserRuleContext {
		public TerminalNode RATIO() { return getToken(Codex_latinusParser.RATIO, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public Reddere_sentenciaContext reddere_sentencia() {
			return getRuleContext(Reddere_sentenciaContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Variables_localesContext variables_locales() {
			return getRuleContext(Variables_localesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Ratio_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterRatio_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitRatio_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitRatio_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ratio_funcionContext ratio_funcion() throws RecognitionException {
		Ratio_funcionContext _localctx = new Ratio_funcionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ratio_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RATIO);
			setState(295);
			tipo_dato();
			setState(296);
			match(VARIABLE);
			setState(297);
			match(PARENTESIS_IZQ);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(298);
				parametros();
				}
			}

			setState(301);
			match(PARENTESIS_DER);
			setState(302);
			match(LLAVE_IZQ);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(303);
				variables_locales();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(306);
				sentencia();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			reddere_sentencia();
			setState(313);
			match(LLAVE_DER);
			setState(314);
			match(FINIS);
			setState(315);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actio_funcionContext extends ParserRuleContext {
		public TerminalNode ACTIO() { return getToken(Codex_latinusParser.ACTIO, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Variables_localesContext variables_locales() {
			return getRuleContext(Variables_localesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Actio_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actio_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterActio_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitActio_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitActio_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actio_funcionContext actio_funcion() throws RecognitionException {
		Actio_funcionContext _localctx = new Actio_funcionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actio_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(ACTIO);
			setState(318);
			match(VARIABLE);
			setState(319);
			match(PARENTESIS_IZQ);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(320);
				parametros();
				}
			}

			setState(323);
			match(PARENTESIS_DER);
			setState(324);
			match(LLAVE_IZQ);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(325);
				variables_locales();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(328);
				sentencia();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(LLAVE_DER);
			setState(335);
			match(FINIS);
			setState(336);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(Codex_latinusParser.NUMERUS, 0); }
		public TerminalNode TEXTUM() { return getToken(Codex_latinusParser.TEXTUM, 0); }
		public TerminalNode DECIMALIS() { return getToken(Codex_latinusParser.DECIMALIS, 0); }
		public TerminalNode LITTERA() { return getToken(Codex_latinusParser.LITTERA, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitTipo_dato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Codex_latinusParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Codex_latinusParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			parametro();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(341);
				match(COMA);
				setState(342);
				parametro();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(Codex_latinusParser.ESTO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametro);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(ESTO);
				setState(349);
				match(VARIABLE);
				setState(350);
				match(DOS_PUNTOS);
				setState(351);
				tipo_dato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(ESTO);
				setState(353);
				match(VARIABLE);
				setState(354);
				match(DOS_PUNTOS);
				setState(355);
				match(VARIABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variables_localesContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(Codex_latinusParser.VARIABILES, 0); }
		public TerminalNode CORCHETE_IZQ() { return getToken(Codex_latinusParser.CORCHETE_IZQ, 0); }
		public TerminalNode CORCHETE_DER() { return getToken(Codex_latinusParser.CORCHETE_DER, 0); }
		public List<Declaracion_localContext> declaracion_local() {
			return getRuleContexts(Declaracion_localContext.class);
		}
		public Declaracion_localContext declaracion_local(int i) {
			return getRuleContext(Declaracion_localContext.class,i);
		}
		public Variables_localesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_locales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterVariables_locales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitVariables_locales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitVariables_locales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_localesContext variables_locales() throws RecognitionException {
		Variables_localesContext _localctx = new Variables_localesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variables_locales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(VARIABILES);
			setState(359);
			match(CORCHETE_IZQ);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				declaracion_local();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO );
			setState(365);
			match(CORCHETE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_localContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(Codex_latinusParser.ESTO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode TEXTUM() { return getToken(Codex_latinusParser.TEXTUM, 0); }
		public TerminalNode CADENA_TEXTO() { return getToken(Codex_latinusParser.CADENA_TEXTO, 0); }
		public TerminalNode LITTERA() { return getToken(Codex_latinusParser.LITTERA, 0); }
		public TerminalNode CARACTER() { return getToken(Codex_latinusParser.CARACTER, 0); }
		public Structura_instanciacionContext structura_instanciacion() {
			return getRuleContext(Structura_instanciacionContext.class,0);
		}
		public Declaracion_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterDeclaracion_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitDeclaracion_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitDeclaracion_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_localContext declaracion_local() throws RecognitionException {
		Declaracion_localContext _localctx = new Declaracion_localContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracion_local);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(ESTO);
				setState(368);
				match(VARIABLE);
				setState(369);
				match(DOS_PUNTOS);
				setState(370);
				tipo_dato();
				setState(371);
				expresion();
				setState(372);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ESTO);
				setState(375);
				match(VARIABLE);
				setState(376);
				match(DOS_PUNTOS);
				setState(377);
				match(TEXTUM);
				setState(378);
				match(CADENA_TEXTO);
				setState(379);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(ESTO);
				setState(381);
				match(VARIABLE);
				setState(382);
				match(DOS_PUNTOS);
				setState(383);
				match(LITTERA);
				setState(384);
				match(CARACTER);
				setState(385);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(ESTO);
				setState(387);
				match(VARIABLE);
				setState(388);
				match(DOS_PUNTOS);
				setState(389);
				match(VARIABLE);
				setState(390);
				structura_instanciacion();
				setState(391);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(ESTO);
				setState(394);
				match(VARIABLE);
				setState(395);
				match(DOS_PUNTOS);
				setState(396);
				expresion();
				setState(397);
				match(PUNTO_COMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<Operacion_aritmeticaContext> operacion_aritmetica() {
			return getRuleContexts(Operacion_aritmeticaContext.class);
		}
		public Operacion_aritmeticaContext operacion_aritmetica(int i) {
			return getRuleContext(Operacion_aritmeticaContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			termino();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					operacion_aritmetica();
					setState(403);
					termino();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public Acceso_miembroContext acceso_miembro() {
			return getRuleContext(Acceso_miembroContext.class,0);
		}
		public TerminalNode NUMERO_ENTERO() { return getToken(Codex_latinusParser.NUMERO_ENTERO, 0); }
		public TerminalNode NUMERO_DECIMAL() { return getToken(Codex_latinusParser.NUMERO_DECIMAL, 0); }
		public TerminalNode VERUM() { return getToken(Codex_latinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(Codex_latinusParser.FALSUS, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termino);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				acceso_miembro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(NUMERO_ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(NUMERO_DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(VERUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(415);
				match(FALSUS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(416);
				llamada_funcion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Acceso_miembroContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(Codex_latinusParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(Codex_latinusParser.PUNTO, i);
		}
		public List<TerminalNode> CORCHETE_IZQ() { return getTokens(Codex_latinusParser.CORCHETE_IZQ); }
		public TerminalNode CORCHETE_IZQ(int i) {
			return getToken(Codex_latinusParser.CORCHETE_IZQ, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> CORCHETE_DER() { return getTokens(Codex_latinusParser.CORCHETE_DER); }
		public TerminalNode CORCHETE_DER(int i) {
			return getToken(Codex_latinusParser.CORCHETE_DER, i);
		}
		public Acceso_miembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_miembro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterAcceso_miembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitAcceso_miembro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitAcceso_miembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceso_miembroContext acceso_miembro() throws RecognitionException {
		Acceso_miembroContext _localctx = new Acceso_miembroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_acceso_miembro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(VARIABLE);
			setState(426); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(426);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PUNTO:
						{
						setState(420);
						match(PUNTO);
						setState(421);
						match(VARIABLE);
						}
						break;
					case CORCHETE_IZQ:
						{
						setState(422);
						match(CORCHETE_IZQ);
						setState(423);
						expresion();
						setState(424);
						match(CORCHETE_DER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(428); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arreglo_accesoContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public TerminalNode CORCHETE_IZQ() { return getToken(Codex_latinusParser.CORCHETE_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CORCHETE_DER() { return getToken(Codex_latinusParser.CORCHETE_DER, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(Codex_latinusParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(Codex_latinusParser.PUNTO, i);
		}
		public Arreglo_accesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo_acceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterArreglo_acceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitArreglo_acceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitArreglo_acceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arreglo_accesoContext arreglo_acceso() throws RecognitionException {
		Arreglo_accesoContext _localctx = new Arreglo_accesoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arreglo_acceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(VARIABLE);
			setState(431);
			match(CORCHETE_IZQ);
			setState(432);
			expresion();
			setState(433);
			match(CORCHETE_DER);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO) {
				{
				{
				setState(434);
				match(PUNTO);
				setState(435);
				match(VARIABLE);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operacion_aritmeticaContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(Codex_latinusParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Codex_latinusParser.MENOS, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(Codex_latinusParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(Codex_latinusParser.DIVISION, 0); }
		public Operacion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterOperacion_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitOperacion_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitOperacion_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operacion_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reddere_sentenciaContext extends ParserRuleContext {
		public TerminalNode REDDERE() { return getToken(Codex_latinusParser.REDDERE, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public Reddere_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reddere_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterReddere_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitReddere_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitReddere_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reddere_sentenciaContext reddere_sentencia() throws RecognitionException {
		Reddere_sentenciaContext _localctx = new Reddere_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reddere_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(REDDERE);
			setState(444);
			match(VARIABLE);
			setState(445);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaiorContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(Codex_latinusParser.MAIOR, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(Codex_latinusParser.MAYOR_QUE, 0); }
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MaiorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitMaior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitMaior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaiorContext maior() throws RecognitionException {
		MaiorContext _localctx = new MaiorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_maior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(MAIOR);
			setState(448);
			match(MAYOR_QUE);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(449);
				sentencia();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(FINIS);
			setState(456);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Imprimir_sentenciaContext imprimir_sentencia() {
			return getRuleContext(Imprimir_sentenciaContext.class,0);
		}
		public Leer_sentenciaContext leer_sentencia() {
			return getRuleContext(Leer_sentenciaContext.class,0);
		}
		public Asignacion_sentenciaContext asignacion_sentencia() {
			return getRuleContext(Asignacion_sentenciaContext.class,0);
		}
		public Si_sentenciaContext si_sentencia() {
			return getRuleContext(Si_sentenciaContext.class,0);
		}
		public Ciclo_dumContext ciclo_dum() {
			return getRuleContext(Ciclo_dumContext.class,0);
		}
		public Ciclo_facereContext ciclo_facere() {
			return getRuleContext(Ciclo_facereContext.class,0);
		}
		public Ciclo_perContext ciclo_per() {
			return getRuleContext(Ciclo_perContext.class,0);
		}
		public Salto_sentenciaContext salto_sentencia() {
			return getRuleContext(Salto_sentenciaContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sentencia);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				imprimir_sentencia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				leer_sentencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				asignacion_sentencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				si_sentencia();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				ciclo_dum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				ciclo_facere();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				ciclo_per();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				salto_sentencia();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(466);
				llamada_funcion();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(467);
					match(PUNTO_COMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Leer_sentenciaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(Codex_latinusParser.LEER, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public Acceso_miembroContext acceso_miembro() {
			return getRuleContext(Acceso_miembroContext.class,0);
		}
		public Leer_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterLeer_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitLeer_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitLeer_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer_sentenciaContext leer_sentencia() throws RecognitionException {
		Leer_sentenciaContext _localctx = new Leer_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_leer_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(472);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(473);
				acceso_miembro();
				}
				break;
			}
			setState(476);
			match(LEER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_sentenciaContext extends ParserRuleContext {
		public TerminalNode ASIGNACION() { return getToken(Codex_latinusParser.ASIGNACION, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public Acceso_miembroContext acceso_miembro() {
			return getRuleContext(Acceso_miembroContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Structura_instanciacionContext structura_instanciacion() {
			return getRuleContext(Structura_instanciacionContext.class,0);
		}
		public Arreglo_literalContext arreglo_literal() {
			return getRuleContext(Arreglo_literalContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public Asignacion_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterAsignacion_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitAsignacion_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitAsignacion_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_sentenciaContext asignacion_sentencia() throws RecognitionException {
		Asignacion_sentenciaContext _localctx = new Asignacion_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_asignacion_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(478);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(479);
				acceso_miembro();
				}
				break;
			}
			setState(482);
			match(ASIGNACION);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(483);
				expresion();
				}
				break;
			case 2:
				{
				setState(484);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(485);
				arreglo_literal();
				}
				break;
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(488);
				match(PUNTO_COMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Imprimir_sentenciaContext extends ParserRuleContext {
		public List<TerminalNode> IMPRIMIR() { return getTokens(Codex_latinusParser.IMPRIMIR); }
		public TerminalNode IMPRIMIR(int i) {
			return getToken(Codex_latinusParser.IMPRIMIR, i);
		}
		public List<TerminalNode> CADENA_TEXTO() { return getTokens(Codex_latinusParser.CADENA_TEXTO); }
		public TerminalNode CADENA_TEXTO(int i) {
			return getToken(Codex_latinusParser.CADENA_TEXTO, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public List<Acceso_miembroContext> acceso_miembro() {
			return getRuleContexts(Acceso_miembroContext.class);
		}
		public Acceso_miembroContext acceso_miembro(int i) {
			return getRuleContext(Acceso_miembroContext.class,i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public Imprimir_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterImprimir_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitImprimir_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitImprimir_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imprimir_sentenciaContext imprimir_sentencia() throws RecognitionException {
		Imprimir_sentenciaContext _localctx = new Imprimir_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_imprimir_sentencia);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(IMPRIMIR);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(492);
				match(CADENA_TEXTO);
				}
				break;
			case 2:
				{
				setState(493);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(494);
				acceso_miembro();
				}
				break;
			case 4:
				{
				setState(495);
				llamada_funcion();
				}
				break;
			}
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(IMPRIMIR);
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(499);
						match(CADENA_TEXTO);
						}
						break;
					case 2:
						{
						setState(500);
						match(VARIABLE);
						}
						break;
					case 3:
						{
						setState(501);
						acceso_miembro();
						}
						break;
					case 4:
						{
						setState(502);
						llamada_funcion();
						}
						break;
					}
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(510);
				match(PUNTO_COMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Si_sentenciaContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Codex_latinusParser.SI, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(Codex_latinusParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(Codex_latinusParser.LLAVE_IZQ, i);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(Codex_latinusParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(Codex_latinusParser.LLAVE_DER, i);
		}
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<Aliter_bloqueContext> aliter_bloque() {
			return getRuleContexts(Aliter_bloqueContext.class);
		}
		public Aliter_bloqueContext aliter_bloque(int i) {
			return getRuleContext(Aliter_bloqueContext.class,i);
		}
		public TerminalNode ALITER() { return getToken(Codex_latinusParser.ALITER, 0); }
		public Si_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterSi_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitSi_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitSi_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_sentenciaContext si_sentencia() throws RecognitionException {
		Si_sentenciaContext _localctx = new Si_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_si_sentencia);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(SI);
			setState(514);
			match(PARENTESIS_IZQ);
			setState(515);
			condicion(0);
			setState(516);
			match(PARENTESIS_DER);
			setState(517);
			match(LLAVE_IZQ);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(518);
				sentencia();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			match(LLAVE_DER);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					aliter_bloque();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(531);
				match(ALITER);
				setState(532);
				match(LLAVE_IZQ);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
					{
					{
					setState(533);
					sentencia();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				match(LLAVE_DER);
				}
			}

			setState(542);
			match(FINIS);
			setState(543);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliter_bloqueContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(Codex_latinusParser.ALITER, 0); }
		public TerminalNode SI() { return getToken(Codex_latinusParser.SI, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Aliter_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliter_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterAliter_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitAliter_bloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitAliter_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aliter_bloqueContext aliter_bloque() throws RecognitionException {
		Aliter_bloqueContext _localctx = new Aliter_bloqueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_aliter_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(ALITER);
			setState(546);
			match(SI);
			setState(547);
			match(PARENTESIS_IZQ);
			setState(548);
			condicion(0);
			setState(549);
			match(PARENTESIS_DER);
			setState(550);
			match(LLAVE_IZQ);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(551);
				sentencia();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ciclo_dumContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(Codex_latinusParser.DUM, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode FINIS() { return getToken(Codex_latinusParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Ciclo_dumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_dum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCiclo_dum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCiclo_dum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCiclo_dum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_dumContext ciclo_dum() throws RecognitionException {
		Ciclo_dumContext _localctx = new Ciclo_dumContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ciclo_dum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(DUM);
			setState(560);
			match(PARENTESIS_IZQ);
			setState(561);
			condicion(0);
			setState(562);
			match(PARENTESIS_DER);
			setState(563);
			match(LLAVE_IZQ);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(564);
				sentencia();
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(LLAVE_DER);
			setState(571);
			match(FINIS);
			setState(572);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ciclo_facereContext extends ParserRuleContext {
		public TerminalNode FACERE() { return getToken(Codex_latinusParser.FACERE, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode DUM() { return getToken(Codex_latinusParser.DUM, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Ciclo_facereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_facere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCiclo_facere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCiclo_facere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCiclo_facere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_facereContext ciclo_facere() throws RecognitionException {
		Ciclo_facereContext _localctx = new Ciclo_facereContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ciclo_facere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(FACERE);
			setState(575);
			match(LLAVE_IZQ);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(576);
				sentencia();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			match(LLAVE_DER);
			setState(583);
			match(DUM);
			setState(584);
			match(PARENTESIS_IZQ);
			setState(585);
			condicion(0);
			setState(586);
			match(PARENTESIS_DER);
			setState(587);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ciclo_perContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(Codex_latinusParser.PER, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public Inicializacion_perContext inicializacion_per() {
			return getRuleContext(Inicializacion_perContext.class,0);
		}
		public Condiciones_perContext condiciones_per() {
			return getRuleContext(Condiciones_perContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public Incremento_perContext incremento_per() {
			return getRuleContext(Incremento_perContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Ciclo_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCiclo_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCiclo_per(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCiclo_per(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_perContext ciclo_per() throws RecognitionException {
		Ciclo_perContext _localctx = new Ciclo_perContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ciclo_per);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(PER);
			setState(590);
			match(PARENTESIS_IZQ);
			setState(591);
			inicializacion_per();
			setState(592);
			condiciones_per();
			setState(593);
			match(PUNTO_COMA);
			setState(594);
			incremento_per();
			setState(595);
			match(PARENTESIS_DER);
			setState(596);
			match(LLAVE_IZQ);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(597);
				sentencia();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inicializacion_perContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(Codex_latinusParser.ESTO, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode ASIGNACION() { return getToken(Codex_latinusParser.ASIGNACION, 0); }
		public Inicializacion_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterInicializacion_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitInicializacion_per(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitInicializacion_per(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicializacion_perContext inicializacion_per() throws RecognitionException {
		Inicializacion_perContext _localctx = new Inicializacion_perContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inicializacion_per);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(ESTO);
				setState(606);
				match(VARIABLE);
				setState(607);
				match(DOS_PUNTOS);
				setState(608);
				tipo_dato();
				setState(609);
				expresion();
				setState(610);
				match(PUNTO_COMA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(VARIABLE);
				setState(613);
				match(ASIGNACION);
				setState(614);
				expresion();
				setState(615);
				match(PUNTO_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condiciones_perContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Condiciones_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCondiciones_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCondiciones_per(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCondiciones_per(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condiciones_perContext condiciones_per() throws RecognitionException {
		Condiciones_perContext _localctx = new Condiciones_perContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_condiciones_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			condicion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Incremento_perContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode SUMA_ABREVIADA() { return getToken(Codex_latinusParser.SUMA_ABREVIADA, 0); }
		public TerminalNode RESTA_ABREVIADA() { return getToken(Codex_latinusParser.RESTA_ABREVIADA, 0); }
		public TerminalNode ASIGNACION() { return getToken(Codex_latinusParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Incremento_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterIncremento_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitIncremento_per(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitIncremento_per(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incremento_perContext incremento_per() throws RecognitionException {
		Incremento_perContext _localctx = new Incremento_perContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_incremento_per);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(VARIABLE);
				setState(622);
				match(SUMA_ABREVIADA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(VARIABLE);
				setState(624);
				match(RESTA_ABREVIADA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(VARIABLE);
				setState(626);
				match(ASIGNACION);
				setState(627);
				expresion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Salto_sentenciaContext extends ParserRuleContext {
		public TerminalNode PERGE() { return getToken(Codex_latinusParser.PERGE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode INTERRUMPE() { return getToken(Codex_latinusParser.INTERRUMPE, 0); }
		public Salto_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salto_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterSalto_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitSalto_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitSalto_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Salto_sentenciaContext salto_sentencia() throws RecognitionException {
		Salto_sentenciaContext _localctx = new Salto_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_salto_sentencia);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(PERGE);
				setState(631);
				match(PUNTO_COMA);
				}
				break;
			case INTERRUMPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(INTERRUMPE);
				setState(633);
				match(PUNTO_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode OR() { return getToken(Codex_latinusParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(637);
			conjuncion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(639);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(640);
					match(OR);
					setState(641);
					conjuncion(0);
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConjuncionContext extends ParserRuleContext {
		public Negacion_logicaContext negacion_logica() {
			return getRuleContext(Negacion_logicaContext.class,0);
		}
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Codex_latinusParser.AND, 0); }
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitConjuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitConjuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		return conjuncion(0);
	}

	private ConjuncionContext conjuncion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, _parentState);
		ConjuncionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_conjuncion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(648);
			negacion_logica();
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjuncion);
					setState(650);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(651);
					match(AND);
					setState(652);
					negacion_logica();
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Negacion_logicaContext extends ParserRuleContext {
		public TerminalNode NEGACION() { return getToken(Codex_latinusParser.NEGACION, 0); }
		public Negacion_logicaContext negacion_logica() {
			return getRuleContext(Negacion_logicaContext.class,0);
		}
		public Primaria_logicaContext primaria_logica() {
			return getRuleContext(Primaria_logicaContext.class,0);
		}
		public Negacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterNegacion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitNegacion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitNegacion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negacion_logicaContext negacion_logica() throws RecognitionException {
		Negacion_logicaContext _localctx = new Negacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_negacion_logica);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(NEGACION);
				setState(659);
				negacion_logica();
				}
				break;
			case VERUM:
			case FALSUS:
			case PARENTESIS_IZQ:
			case VARIABLE:
			case NUMERO_ENTERO:
			case NUMERO_DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				primaria_logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primaria_logicaContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public TerminalNode VERUM() { return getToken(Codex_latinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(Codex_latinusParser.FALSUS, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Primaria_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterPrimaria_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitPrimaria_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitPrimaria_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primaria_logicaContext primaria_logica() throws RecognitionException {
		Primaria_logicaContext _localctx = new Primaria_logicaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primaria_logica);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(PARENTESIS_IZQ);
				setState(664);
				condicion(0);
				setState(665);
				match(PARENTESIS_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				expresion();
				setState(668);
				operador_relacional();
				setState(669);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				match(VERUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				match(FALSUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(673);
				match(VARIABLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(674);
				llamada_funcion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode MAYOR_IGUAL() { return getToken(Codex_latinusParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(Codex_latinusParser.MENOR_IGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(Codex_latinusParser.IGUAL, 0); }
		public TerminalNode NO_IGUAL() { return getToken(Codex_latinusParser.NO_IGUAL, 0); }
		public TerminalNode MENOR_QUE() { return getToken(Codex_latinusParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(Codex_latinusParser.MAYOR_QUE, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Codex_latinusParser.PARENTESIS_IZQ, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Codex_latinusParser.PARENTESIS_DER, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(VARIABLE);
			setState(680);
			match(PARENTESIS_IZQ);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
				{
				setState(681);
				argumentos();
				}
			}

			setState(684);
			match(PARENTESIS_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Codex_latinusParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Codex_latinusParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Codex_latinusListener ) ((Codex_latinusListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Codex_latinusVisitor ) return ((Codex_latinusVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			expresion();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(687);
				match(COMA);
				setState(688);
				expresion();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 42:
			return conjuncion_sempred((ConjuncionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conjuncion_sempred(ConjuncionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u02b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001d\b\u0001\n\u0001\f\u0001g\t\u0001\u0001\u0001\u0005\u0001"+
		"j\b\u0001\n\u0001\f\u0001m\t\u0001\u0001\u0001\u0005\u0001p\b\u0001\n"+
		"\u0001\f\u0001s\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002{\b\u0002\n\u0002\f\u0002~\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0089\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0090\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0097\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u009e\b\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00a5\b\u0004\u000b\u0004\f\u0004\u00a6"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ca\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00d5\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00d8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0003\u0006\u00e8\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00eb\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00f0\b\u0007\n\u0007\f\u0007\u00f3\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u0102\b\t\n\t\f\t\u0105\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u010d\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0114\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0118\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u011f\b\f\u000b"+
		"\f\f\f\u0120\u0001\r\u0001\r\u0003\r\u0125\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012c\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e\u0001\u000e\u0005\u000e"+
		"\u0134\b\u000e\n\u000e\f\u000e\u0137\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0142\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0147\b\u000f\u0001\u000f\u0005\u000f\u014a\b\u000f\n\u000f\f\u000f"+
		"\u014d\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0158\b\u0011"+
		"\n\u0011\f\u0011\u015b\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0165"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u016a\b\u0013"+
		"\u000b\u0013\f\u0013\u016b\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0190\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0196\b\u0015\n\u0015\f\u0015\u0199\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01a2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u01ab\b\u0017\u000b\u0017\f"+
		"\u0017\u01ac\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01b5\b\u0018\n\u0018\f\u0018\u01b8\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01c3\b\u001b\n\u001b\f\u001b"+
		"\u01c6\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01d5\b\u001c\u0003\u001c\u01d7\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01db\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01e1\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e7\b\u001e\u0001\u001e\u0003"+
		"\u001e\u01ea\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01f1\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01f8\b\u001f\u0005\u001f\u01fa\b\u001f"+
		"\n\u001f\f\u001f\u01fd\t\u001f\u0001\u001f\u0003\u001f\u0200\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0208\b \n \f \u020b\t \u0001"+
		" \u0001 \u0005 \u020f\b \n \f \u0212\t \u0001 \u0001 \u0001 \u0005 \u0217"+
		"\b \n \f \u021a\t \u0001 \u0003 \u021d\b \u0001 \u0001 \u0001 \u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0229\b!\n!\f!\u022c"+
		"\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0236\b\"\n\"\f\"\u0239\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u0242\b#\n#\f#\u0245\t#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u0257\b$\n$\f$\u025a\t$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u026a\b%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u0275\b\'\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u027b\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0283\b)\n"+
		")\f)\u0286\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u028e\b"+
		"*\n*\f*\u0291\t*\u0001+\u0001+\u0001+\u0003+\u0296\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u02a4\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u02ab\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0005/\u02b2\b/\n/\f/\u02b5\t/\u0001/\u0000\u0002"+
		"RT0\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0004\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u0012\u0015\u0001\u0000%(\u0001\u0000)"+
		".\u02e9\u0000`\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000"+
		"\u0004v\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000\u0000\u0000\b"+
		"\u00a1\u0001\u0000\u0000\u0000\n\u00c9\u0001\u0000\u0000\u0000\f\u00ea"+
		"\u0001\u0000\u0000\u0000\u000e\u00ec\u0001\u0000\u0000\u0000\u0010\u00f4"+
		"\u0001\u0000\u0000\u0000\u0012\u010c\u0001\u0000\u0000\u0000\u0014\u010e"+
		"\u0001\u0000\u0000\u0000\u0016\u0115\u0001\u0000\u0000\u0000\u0018\u011b"+
		"\u0001\u0000\u0000\u0000\u001a\u0124\u0001\u0000\u0000\u0000\u001c\u0126"+
		"\u0001\u0000\u0000\u0000\u001e\u013d\u0001\u0000\u0000\u0000 \u0152\u0001"+
		"\u0000\u0000\u0000\"\u0154\u0001\u0000\u0000\u0000$\u0164\u0001\u0000"+
		"\u0000\u0000&\u0166\u0001\u0000\u0000\u0000(\u018f\u0001\u0000\u0000\u0000"+
		"*\u0191\u0001\u0000\u0000\u0000,\u01a1\u0001\u0000\u0000\u0000.\u01a3"+
		"\u0001\u0000\u0000\u00000\u01ae\u0001\u0000\u0000\u00002\u01b9\u0001\u0000"+
		"\u0000\u00004\u01bb\u0001\u0000\u0000\u00006\u01bf\u0001\u0000\u0000\u0000"+
		"8\u01d6\u0001\u0000\u0000\u0000:\u01da\u0001\u0000\u0000\u0000<\u01e0"+
		"\u0001\u0000\u0000\u0000>\u01eb\u0001\u0000\u0000\u0000@\u0201\u0001\u0000"+
		"\u0000\u0000B\u0221\u0001\u0000\u0000\u0000D\u022f\u0001\u0000\u0000\u0000"+
		"F\u023e\u0001\u0000\u0000\u0000H\u024d\u0001\u0000\u0000\u0000J\u0269"+
		"\u0001\u0000\u0000\u0000L\u026b\u0001\u0000\u0000\u0000N\u0274\u0001\u0000"+
		"\u0000\u0000P\u027a\u0001\u0000\u0000\u0000R\u027c\u0001\u0000\u0000\u0000"+
		"T\u0287\u0001\u0000\u0000\u0000V\u0295\u0001\u0000\u0000\u0000X\u02a3"+
		"\u0001\u0000\u0000\u0000Z\u02a5\u0001\u0000\u0000\u0000\\\u02a7\u0001"+
		"\u0000\u0000\u0000^\u02ae\u0001\u0000\u0000\u0000`a\u0003\u0002\u0001"+
		"\u0000a\u0001\u0001\u0000\u0000\u0000bd\u0003\u0004\u0002\u0000cb\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fk\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lq\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0003\u0018\f\u0000on\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u00036\u001b\u0000u\u0003\u0001\u0000\u0000\u0000vw\u0005\u0003\u0000"+
		"\u0000wx\u00054\u0000\u0000x|\u0005#\u0000\u0000y{\u0003\u0006\u0003\u0000"+
		"zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0081\u0005\u0004"+
		"\u0000\u0000\u0081\u0082\u0005\u0019\u0000\u0000\u0082\u0005\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u00054\u0000"+
		"\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0088\u0003 \u0010\u0000"+
		"\u0087\u0089\u0007\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u00a0\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u0002\u0000\u0000\u008b\u008c\u00054\u0000\u0000\u008c"+
		"\u008d\u0005\u0018\u0000\u0000\u008d\u008f\u0003 \u0010\u0000\u008e\u0090"+
		"\u0007\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u00a0\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0001\u0000\u0000\u0092\u0093\u00054\u0000\u0000\u0093\u0094\u0005"+
		"\u0018\u0000\u0000\u0094\u0096\u00054\u0000\u0000\u0095\u0097\u0007\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u00a0\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0002"+
		"\u0000\u0000\u0099\u009a\u00054\u0000\u0000\u009a\u009b\u0005\u0018\u0000"+
		"\u0000\u009b\u009d\u00054\u0000\u0000\u009c\u009e\u0007\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0083\u0001\u0000\u0000\u0000"+
		"\u009f\u008a\u0001\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000"+
		"\u009f\u0098\u0001\u0000\u0000\u0000\u00a0\u0007\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a4\u0005.\u0000\u0000\u00a3"+
		"\u00a5\u0003\n\u0005\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0001\u0000\u0000\u00a9\u00aa\u00054\u0000\u0000\u00aa\u00ab\u0005\u0018"+
		"\u0000\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00ad\u0003*\u0015\u0000"+
		"\u00ad\u00ae\u0005\u0019\u0000\u0000\u00ae\u00ca\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b1\u00054\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0018\u0000\u0000\u00b2\u00b3\u0005\u0013\u0000\u0000\u00b3"+
		"\u00b4\u00057\u0000\u0000\u00b4\u00ca\u0005\u0019\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0001\u0000\u0000\u00b6\u00b7\u00054\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0018\u0000\u0000\u00b8\u00b9\u0005\u0015\u0000\u0000\u00b9\u00ba\u0005"+
		"8\u0000\u0000\u00ba\u00ca\u0005\u0019\u0000\u0000\u00bb\u00bc\u0005\u0001"+
		"\u0000\u0000\u00bc\u00bd\u00054\u0000\u0000\u00bd\u00be\u0005\u0018\u0000"+
		"\u0000\u00be\u00bf\u00054\u0000\u0000\u00bf\u00c0\u0003\u0012\t\u0000"+
		"\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c4\u00054\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0018\u0000\u0000\u00c5\u00c6\u0003*\u0015\u0000\u00c6\u00c7"+
		"\u0005\u0019\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0003\f\u0006\u0000\u00c9\u00a8\u0001\u0000\u0000\u0000\u00c9\u00af\u0001"+
		"\u0000\u0000\u0000\u00c9\u00b5\u0001\u0000\u0000\u0000\u00c9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u000b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0002\u0000\u0000\u00cc\u00cd\u00054\u0000\u0000\u00cd\u00ce\u0005!\u0000"+
		"\u0000\u00ce\u00cf\u00055\u0000\u0000\u00cf\u00d0\u0005\"\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d7\u0003 \u0010\u0000\u00d2"+
		"\u00d4\u0005#\u0000\u0000\u00d3\u00d5\u0003\u000e\u0007\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005$\u0000\u0000\u00d7\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\u0019\u0000\u0000\u00da\u00eb\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\u0002\u0000\u0000\u00dc\u00dd\u0005"+
		"4\u0000\u0000\u00dd\u00de\u0005!\u0000\u0000\u00de\u00df\u00055\u0000"+
		"\u0000\u00df\u00e0\u0005\"\u0000\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000"+
		"\u00e1\u00e7\u00054\u0000\u0000\u00e2\u00e4\u0005#\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0010\b\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005"+
		"$\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005\u0019"+
		"\u0000\u0000\u00ea\u00cb\u0001\u0000\u0000\u0000\u00ea\u00db\u0001\u0000"+
		"\u0000\u0000\u00eb\r\u0001\u0000\u0000\u0000\u00ec\u00f1\u0003*\u0015"+
		"\u0000\u00ed\u00ee\u0005\u001a\u0000\u0000\u00ee\u00f0\u0003*\u0015\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u000f\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f9\u0003\u0012\t\u0000\u00f5\u00f6\u0005\u001a\u0000\u0000\u00f6"+
		"\u00f8\u0003\u0012\t\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u0011\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u00054\u0000\u0000\u00fd\u00fe\u0005"+
		"#\u0000\u0000\u00fe\u0103\u0003\u0014\n\u0000\u00ff\u0100\u0005\u001a"+
		"\u0000\u0000\u0100\u0102\u0003\u0014\n\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005$\u0000\u0000"+
		"\u0107\u010d\u0001\u0000\u0000\u0000\u0108\u0109\u00054\u0000\u0000\u0109"+
		"\u010a\u0005!\u0000\u0000\u010a\u010b\u00055\u0000\u0000\u010b\u010d\u0005"+
		"\"\u0000\u0000\u010c\u00fc\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000"+
		"\u0000\u0000\u010d\u0013\u0001\u0000\u0000\u0000\u010e\u010f\u00054\u0000"+
		"\u0000\u010f\u0113\u0005\u0018\u0000\u0000\u0110\u0114\u0003*\u0015\u0000"+
		"\u0111\u0114\u0003\u0012\t\u0000\u0112\u0114\u0003\u0016\u000b\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0005#\u0000\u0000\u0116\u0118\u0003\u000e\u0007\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005$\u0000\u0000\u011a\u0017\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\u0010\u0000\u0000\u011c\u011e\u0005"+
		".\u0000\u0000\u011d\u011f\u0003\u001a\r\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0019\u0001\u0000"+
		"\u0000\u0000\u0122\u0125\u0003\u001c\u000e\u0000\u0123\u0125\u0003\u001e"+
		"\u000f\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u001b\u0001\u0000\u0000\u0000\u0126\u0127\u0005\r\u0000"+
		"\u0000\u0127\u0128\u0003 \u0010\u0000\u0128\u0129\u00054\u0000\u0000\u0129"+
		"\u012b\u0005\u001f\u0000\u0000\u012a\u012c\u0003\"\u0011\u0000\u012b\u012a"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005 \u0000\u0000\u012e\u0130\u0005"+
		"#\u0000\u0000\u012f\u0131\u0003&\u0013\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0135\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u00038\u001c\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u00034\u001a\u0000\u0139"+
		"\u013a\u0005$\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b\u013c"+
		"\u0005\u0019\u0000\u0000\u013c\u001d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\f\u0000\u0000\u013e\u013f\u00054\u0000\u0000\u013f\u0141\u0005"+
		"\u001f\u0000\u0000\u0140\u0142\u0003\"\u0011\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0005 \u0000\u0000\u0144\u0146\u0005#\u0000\u0000"+
		"\u0145\u0147\u0003&\u0013\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147\u014b\u0001\u0000\u0000\u0000\u0148"+
		"\u014a\u00038\u001c\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005$\u0000\u0000\u014f\u0150\u0005"+
		"\u0004\u0000\u0000\u0150\u0151\u0005\u0019\u0000\u0000\u0151\u001f\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0007\u0001\u0000\u0000\u0153!\u0001\u0000"+
		"\u0000\u0000\u0154\u0159\u0003$\u0012\u0000\u0155\u0156\u0005\u001a\u0000"+
		"\u0000\u0156\u0158\u0003$\u0012\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a#\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0001\u0000\u0000\u015d"+
		"\u015e\u00054\u0000\u0000\u015e\u015f\u0005\u0018\u0000\u0000\u015f\u0165"+
		"\u0003 \u0010\u0000\u0160\u0161\u0005\u0001\u0000\u0000\u0161\u0162\u0005"+
		"4\u0000\u0000\u0162\u0163\u0005\u0018\u0000\u0000\u0163\u0165\u00054\u0000"+
		"\u0000\u0164\u015c\u0001\u0000\u0000\u0000\u0164\u0160\u0001\u0000\u0000"+
		"\u0000\u0165%\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u000f\u0000\u0000"+
		"\u0167\u0169\u0005!\u0000\u0000\u0168\u016a\u0003(\u0014\u0000\u0169\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0005\"\u0000\u0000\u016e\'\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005\u0001\u0000\u0000\u0170\u0171\u0005"+
		"4\u0000\u0000\u0171\u0172\u0005\u0018\u0000\u0000\u0172\u0173\u0003 \u0010"+
		"\u0000\u0173\u0174\u0003*\u0015\u0000\u0174\u0175\u0005\u0019\u0000\u0000"+
		"\u0175\u0190\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0001\u0000\u0000"+
		"\u0177\u0178\u00054\u0000\u0000\u0178\u0179\u0005\u0018\u0000\u0000\u0179"+
		"\u017a\u0005\u0013\u0000\u0000\u017a\u017b\u00057\u0000\u0000\u017b\u0190"+
		"\u0005\u0019\u0000\u0000\u017c\u017d\u0005\u0001\u0000\u0000\u017d\u017e"+
		"\u00054\u0000\u0000\u017e\u017f\u0005\u0018\u0000\u0000\u017f\u0180\u0005"+
		"\u0015\u0000\u0000\u0180\u0181\u00058\u0000\u0000\u0181\u0190\u0005\u0019"+
		"\u0000\u0000\u0182\u0183\u0005\u0001\u0000\u0000\u0183\u0184\u00054\u0000"+
		"\u0000\u0184\u0185\u0005\u0018\u0000\u0000\u0185\u0186\u00054\u0000\u0000"+
		"\u0186\u0187\u0003\u0012\t\u0000\u0187\u0188\u0005\u0019\u0000\u0000\u0188"+
		"\u0190\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0001\u0000\u0000\u018a"+
		"\u018b\u00054\u0000\u0000\u018b\u018c\u0005\u0018\u0000\u0000\u018c\u018d"+
		"\u0003*\u0015\u0000\u018d\u018e\u0005\u0019\u0000\u0000\u018e\u0190\u0001"+
		"\u0000\u0000\u0000\u018f\u016f\u0001\u0000\u0000\u0000\u018f\u0176\u0001"+
		"\u0000\u0000\u0000\u018f\u017c\u0001\u0000\u0000\u0000\u018f\u0182\u0001"+
		"\u0000\u0000\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u0190)\u0001\u0000"+
		"\u0000\u0000\u0191\u0197\u0003,\u0016\u0000\u0192\u0193\u00032\u0019\u0000"+
		"\u0193\u0194\u0003,\u0016\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195"+
		"\u0192\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"+\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u01a2"+
		"\u00054\u0000\u0000\u019b\u01a2\u0003.\u0017\u0000\u019c\u01a2\u00055"+
		"\u0000\u0000\u019d\u01a2\u00056\u0000\u0000\u019e\u01a2\u0005\u0016\u0000"+
		"\u0000\u019f\u01a2\u0005\u0017\u0000\u0000\u01a0\u01a2\u0003\\.\u0000"+
		"\u01a1\u019a\u0001\u0000\u0000\u0000\u01a1\u019b\u0001\u0000\u0000\u0000"+
		"\u01a1\u019c\u0001\u0000\u0000\u0000\u01a1\u019d\u0001\u0000\u0000\u0000"+
		"\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2-\u0001\u0000\u0000\u0000\u01a3"+
		"\u01aa\u00054\u0000\u0000\u01a4\u01a5\u0005\u001c\u0000\u0000\u01a5\u01ab"+
		"\u00054\u0000\u0000\u01a6\u01a7\u0005!\u0000\u0000\u01a7\u01a8\u0003*"+
		"\u0015\u0000\u01a8\u01a9\u0005\"\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a4\u0001\u0000\u0000\u0000\u01aa\u01a6\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad/\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u00054\u0000\u0000\u01af\u01b0\u0005!\u0000\u0000\u01b0\u01b1"+
		"\u0003*\u0015\u0000\u01b1\u01b6\u0005\"\u0000\u0000\u01b2\u01b3\u0005"+
		"\u001c\u0000\u0000\u01b3\u01b5\u00054\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b71\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0007\u0002\u0000"+
		"\u0000\u01ba3\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u000e\u0000\u0000"+
		"\u01bc\u01bd\u00054\u0000\u0000\u01bd\u01be\u0005\u0019\u0000\u0000\u01be"+
		"5\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0011\u0000\u0000\u01c0\u01c4"+
		"\u0005.\u0000\u0000\u01c1\u01c3\u00038\u001c\u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u0004"+
		"\u0000\u0000\u01c8\u01c9\u0005\u0019\u0000\u0000\u01c97\u0001\u0000\u0000"+
		"\u0000\u01ca\u01d7\u0003>\u001f\u0000\u01cb\u01d7\u0003:\u001d\u0000\u01cc"+
		"\u01d7\u0003<\u001e\u0000\u01cd\u01d7\u0003@ \u0000\u01ce\u01d7\u0003"+
		"D\"\u0000\u01cf\u01d7\u0003F#\u0000\u01d0\u01d7\u0003H$\u0000\u01d1\u01d7"+
		"\u0003P(\u0000\u01d2\u01d4\u0003\\.\u0000\u01d3\u01d5\u0005\u0019\u0000"+
		"\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d6\u01cb\u0001\u0000\u0000\u0000\u01d6\u01cc\u0001\u0000\u0000"+
		"\u0000\u01d6\u01cd\u0001\u0000\u0000\u0000\u01d6\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d6\u01cf\u0001\u0000\u0000\u0000\u01d6\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d79\u0001\u0000\u0000\u0000\u01d8\u01db\u00054\u0000\u0000\u01d9"+
		"\u01db\u0003.\u0017\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0005\u001d\u0000\u0000\u01dd;\u0001\u0000\u0000\u0000\u01de\u01e1\u0005"+
		"4\u0000\u0000\u01df\u01e1\u0003.\u0017\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e6\u0005\u001b\u0000\u0000\u01e3\u01e7\u0003*\u0015\u0000"+
		"\u01e4\u01e7\u0003\u0012\t\u0000\u01e5\u01e7\u0003\u0016\u000b\u0000\u01e6"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8"+
		"\u01ea\u0005\u0019\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ea=\u0001\u0000\u0000\u0000\u01eb\u01f0"+
		"\u0005\u001e\u0000\u0000\u01ec\u01f1\u00057\u0000\u0000\u01ed\u01f1\u0005"+
		"4\u0000\u0000\u01ee\u01f1\u0003.\u0017\u0000\u01ef\u01f1\u0003\\.\u0000"+
		"\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f0\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01fb\u0001\u0000\u0000\u0000\u01f2\u01f7\u0005\u001e\u0000\u0000"+
		"\u01f3\u01f8\u00057\u0000\u0000\u01f4\u01f8\u00054\u0000\u0000\u01f5\u01f8"+
		"\u0003.\u0017\u0000\u01f6\u01f8\u0003\\.\u0000\u01f7\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f2\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fe\u0200\u0005\u0019\u0000\u0000\u01ff\u01fe\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200?\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0005\u0005\u0000\u0000\u0202\u0203\u0005\u001f\u0000"+
		"\u0000\u0203\u0204\u0003R)\u0000\u0204\u0205\u0005 \u0000\u0000\u0205"+
		"\u0209\u0005#\u0000\u0000\u0206\u0208\u00038\u001c\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001"+
		"\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u0210\u0005"+
		"$\u0000\u0000\u020d\u020f\u0003B!\u0000\u020e\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u021c\u0001\u0000\u0000"+
		"\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0006\u0000"+
		"\u0000\u0214\u0218\u0005#\u0000\u0000\u0215\u0217\u00038\u001c\u0000\u0216"+
		"\u0215\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218"+
		"\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219"+
		"\u021b\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b"+
		"\u021d\u0005$\u0000\u0000\u021c\u0213\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u0004\u0000\u0000\u021f\u0220\u0005\u0019\u0000\u0000\u0220A\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005\u0006\u0000\u0000\u0222\u0223\u0005"+
		"\u0005\u0000\u0000\u0223\u0224\u0005\u001f\u0000\u0000\u0224\u0225\u0003"+
		"R)\u0000\u0225\u0226\u0005 \u0000\u0000\u0226\u022a\u0005#\u0000\u0000"+
		"\u0227\u0229\u00038\u001c\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c"+
		"\u022a\u0001\u0000\u0000\u0000\u022d\u022e\u0005$\u0000\u0000\u022eC\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005\u0007\u0000\u0000\u0230\u0231\u0005"+
		"\u001f\u0000\u0000\u0231\u0232\u0003R)\u0000\u0232\u0233\u0005 \u0000"+
		"\u0000\u0233\u0237\u0005#\u0000\u0000\u0234\u0236\u00038\u001c\u0000\u0235"+
		"\u0234\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237"+
		"\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238"+
		"\u023a\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0005$\u0000\u0000\u023b\u023c\u0005\u0004\u0000\u0000\u023c\u023d"+
		"\u0005\u0019\u0000\u0000\u023dE\u0001\u0000\u0000\u0000\u023e\u023f\u0005"+
		"\b\u0000\u0000\u023f\u0243\u0005#\u0000\u0000\u0240\u0242\u00038\u001c"+
		"\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000"+
		"\u0000\u0244\u0246\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0005$\u0000\u0000\u0247\u0248\u0005\u0007\u0000\u0000"+
		"\u0248\u0249\u0005\u001f\u0000\u0000\u0249\u024a\u0003R)\u0000\u024a\u024b"+
		"\u0005 \u0000\u0000\u024b\u024c\u0005\u0019\u0000\u0000\u024cG\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0005\t\u0000\u0000\u024e\u024f\u0005\u001f\u0000"+
		"\u0000\u024f\u0250\u0003J%\u0000\u0250\u0251\u0003L&\u0000\u0251\u0252"+
		"\u0005\u0019\u0000\u0000\u0252\u0253\u0003N\'\u0000\u0253\u0254\u0005"+
		" \u0000\u0000\u0254\u0258\u0005#\u0000\u0000\u0255\u0257\u00038\u001c"+
		"\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000"+
		"\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000"+
		"\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0005$\u0000\u0000\u025cI\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0005\u0001\u0000\u0000\u025e\u025f\u00054\u0000\u0000\u025f\u0260"+
		"\u0005\u0018\u0000\u0000\u0260\u0261\u0003 \u0010\u0000\u0261\u0262\u0003"+
		"*\u0015\u0000\u0262\u0263\u0005\u0019\u0000\u0000\u0263\u026a\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u00054\u0000\u0000\u0265\u0266\u0005\u001b\u0000"+
		"\u0000\u0266\u0267\u0003*\u0015\u0000\u0267\u0268\u0005\u0019\u0000\u0000"+
		"\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u025d\u0001\u0000\u0000\u0000"+
		"\u0269\u0264\u0001\u0000\u0000\u0000\u026aK\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0003R)\u0000\u026cM\u0001\u0000\u0000\u0000\u026d\u026e\u0005"+
		"4\u0000\u0000\u026e\u0275\u00052\u0000\u0000\u026f\u0270\u00054\u0000"+
		"\u0000\u0270\u0275\u00053\u0000\u0000\u0271\u0272\u00054\u0000\u0000\u0272"+
		"\u0273\u0005\u001b\u0000\u0000\u0273\u0275\u0003*\u0015\u0000\u0274\u026d"+
		"\u0001\u0000\u0000\u0000\u0274\u026f\u0001\u0000\u0000\u0000\u0274\u0271"+
		"\u0001\u0000\u0000\u0000\u0275O\u0001\u0000\u0000\u0000\u0276\u0277\u0005"+
		"\n\u0000\u0000\u0277\u027b\u0005\u0019\u0000\u0000\u0278\u0279\u0005\u000b"+
		"\u0000\u0000\u0279\u027b\u0005\u0019\u0000\u0000\u027a\u0276\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027bQ\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0006)\uffff\uffff\u0000\u027d\u027e\u0003T*\u0000"+
		"\u027e\u0284\u0001\u0000\u0000\u0000\u027f\u0280\n\u0002\u0000\u0000\u0280"+
		"\u0281\u00050\u0000\u0000\u0281\u0283\u0003T*\u0000\u0282\u027f\u0001"+
		"\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285S\u0001\u0000"+
		"\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u0288\u0006*\uffff"+
		"\uffff\u0000\u0288\u0289\u0003V+\u0000\u0289\u028f\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\n\u0002\u0000\u0000\u028b\u028c\u0005/\u0000\u0000\u028c"+
		"\u028e\u0003V+\u0000\u028d\u028a\u0001\u0000\u0000\u0000\u028e\u0291\u0001"+
		"\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001"+
		"\u0000\u0000\u0000\u0290U\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u00051\u0000\u0000\u0293\u0296\u0003V+\u0000"+
		"\u0294\u0296\u0003X,\u0000\u0295\u0292\u0001\u0000\u0000\u0000\u0295\u0294"+
		"\u0001\u0000\u0000\u0000\u0296W\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		"\u001f\u0000\u0000\u0298\u0299\u0003R)\u0000\u0299\u029a\u0005 \u0000"+
		"\u0000\u029a\u02a4\u0001\u0000\u0000\u0000\u029b\u029c\u0003*\u0015\u0000"+
		"\u029c\u029d\u0003Z-\u0000\u029d\u029e\u0003*\u0015\u0000\u029e\u02a4"+
		"\u0001\u0000\u0000\u0000\u029f\u02a4\u0005\u0016\u0000\u0000\u02a0\u02a4"+
		"\u0005\u0017\u0000\u0000\u02a1\u02a4\u00054\u0000\u0000\u02a2\u02a4\u0003"+
		"\\.\u0000\u02a3\u0297\u0001\u0000\u0000\u0000\u02a3\u029b\u0001\u0000"+
		"\u0000\u0000\u02a3\u029f\u0001\u0000\u0000\u0000\u02a3\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a4Y\u0001\u0000\u0000\u0000\u02a5\u02a6\u0007\u0003\u0000"+
		"\u0000\u02a6[\u0001\u0000\u0000\u0000\u02a7\u02a8\u00054\u0000\u0000\u02a8"+
		"\u02aa\u0005\u001f\u0000\u0000\u02a9\u02ab\u0003^/\u0000\u02aa\u02a9\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0005 \u0000\u0000\u02ad]\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b3\u0003*\u0015\u0000\u02af\u02b0\u0005\u001a\u0000\u0000"+
		"\u02b0\u02b2\u0003*\u0015\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b4_\u0001\u0000\u0000\u0000\u02b5\u02b3"+
		"\u0001\u0000\u0000\u0000Cekq|\u0088\u008f\u0096\u009d\u009f\u00a6\u00c9"+
		"\u00d4\u00d7\u00e4\u00e7\u00ea\u00f1\u00f9\u0103\u010c\u0113\u0117\u0120"+
		"\u0124\u012b\u0130\u0135\u0141\u0146\u014b\u0159\u0164\u016b\u018f\u0197"+
		"\u01a1\u01aa\u01ac\u01b6\u01c4\u01d4\u01d6\u01da\u01e0\u01e6\u01e9\u01f0"+
		"\u01f7\u01fb\u01ff\u0209\u0210\u0218\u021c\u022a\u0237\u0243\u0258\u0269"+
		"\u0274\u027a\u0284\u028f\u0295\u02a3\u02aa\u02b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}