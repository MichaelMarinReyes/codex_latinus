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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 98312L) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCTURA:
					{
					setState(98);
					structura_def();
					}
					break;
				case VARIABILES:
					{
					setState(99);
					variables();
					}
					break;
				case MUNERA:
					{
					setState(100);
					munera();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
			setState(108);
			match(STRUCTURA);
			setState(109);
			match(VARIABLE);
			setState(110);
			match(LLAVE_IZQ);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SERIES) {
				{
				{
				setState(111);
				miembro_structura();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(LLAVE_DER);
			setState(118);
			match(FINIS);
			setState(119);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ESTO);
				setState(122);
				match(VARIABLE);
				setState(123);
				match(DOS_PUNTOS);
				setState(124);
				tipo_dato();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(125);
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
				setState(128);
				match(SERIES);
				setState(129);
				match(VARIABLE);
				setState(130);
				match(DOS_PUNTOS);
				setState(131);
				tipo_dato();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(132);
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
				setState(135);
				match(ESTO);
				setState(136);
				match(VARIABLE);
				setState(137);
				match(DOS_PUNTOS);
				setState(138);
				match(VARIABLE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(139);
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
				setState(142);
				match(SERIES);
				setState(143);
				match(VARIABLE);
				setState(144);
				match(DOS_PUNTOS);
				setState(145);
				match(VARIABLE);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(146);
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
			setState(151);
			match(VARIABILES);
			setState(152);
			match(MAYOR_QUE);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				declaracion();
				}
				}
				setState(156); 
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
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
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
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ESTO);
				setState(159);
				match(VARIABLE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(160);
					match(DOS_PUNTOS);
					}
				}

				setState(163);
				tipo_dato();
				setState(164);
				expresion();
				setState(165);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(ESTO);
				setState(168);
				match(VARIABLE);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(169);
					match(DOS_PUNTOS);
					}
				}

				setState(172);
				match(TEXTUM);
				setState(173);
				match(CADENA_TEXTO);
				setState(174);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(ESTO);
				setState(176);
				match(VARIABLE);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(177);
					match(DOS_PUNTOS);
					}
				}

				setState(180);
				match(LITTERA);
				setState(181);
				match(CARACTER);
				setState(182);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(ESTO);
				setState(184);
				match(VARIABLE);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(185);
					match(DOS_PUNTOS);
					}
				}

				setState(188);
				match(VARIABLE);
				setState(189);
				structura_instanciacion();
				setState(190);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(ESTO);
				setState(193);
				match(VARIABLE);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(194);
					match(DOS_PUNTOS);
					}
				}

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
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588461068288L) != 0)) {
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
					if (_la==LLAVE_IZQ || _la==VARIABLE) {
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
		public TerminalNode LLAVE_IZQ() { return getToken(Codex_latinusParser.LLAVE_IZQ, 0); }
		public List<Atributo_asignacionContext> atributo_asignacion() {
			return getRuleContexts(Atributo_asignacionContext.class);
		}
		public Atributo_asignacionContext atributo_asignacion(int i) {
			return getRuleContext(Atributo_asignacionContext.class,i);
		}
		public TerminalNode LLAVE_DER() { return getToken(Codex_latinusParser.LLAVE_DER, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE) {
					{
					setState(252);
					match(VARIABLE);
					}
				}

				setState(255);
				match(LLAVE_IZQ);
				setState(256);
				atributo_asignacion();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(257);
					match(COMA);
					setState(258);
					atributo_asignacion();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(LLAVE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(VARIABLE);
				setState(267);
				match(CORCHETE_IZQ);
				setState(268);
				match(NUMERO_ENTERO);
				setState(269);
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
			setState(272);
			match(VARIABLE);
			setState(273);
			match(DOS_PUNTOS);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(274);
				expresion();
				}
				break;
			case 2:
				{
				setState(275);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(276);
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
			setState(279);
			match(LLAVE_IZQ);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588461068288L) != 0)) {
				{
				setState(280);
				elemento_arreglo();
				}
			}

			setState(283);
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
			setState(285);
			match(MUNERA);
			setState(286);
			match(MAYOR_QUE);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				funcion();
				}
				}
				setState(290); 
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
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				ratio_funcion();
				}
				break;
			case ACTIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
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
			setState(296);
			match(RATIO);
			setState(297);
			tipo_dato();
			setState(298);
			match(VARIABLE);
			setState(299);
			match(PARENTESIS_IZQ);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(300);
				parametros();
				}
			}

			setState(303);
			match(PARENTESIS_DER);
			setState(304);
			match(LLAVE_IZQ);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(305);
				variables_locales();
				}
			}

			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(308);
				sentencia();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			reddere_sentencia();
			setState(315);
			match(LLAVE_DER);
			setState(316);
			match(FINIS);
			setState(317);
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
			setState(319);
			match(ACTIO);
			setState(320);
			match(VARIABLE);
			setState(321);
			match(PARENTESIS_IZQ);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(322);
				parametros();
				}
			}

			setState(325);
			match(PARENTESIS_DER);
			setState(326);
			match(LLAVE_IZQ);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(327);
				variables_locales();
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(330);
				sentencia();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(LLAVE_DER);
			setState(337);
			match(FINIS);
			setState(338);
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
			setState(340);
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
			setState(342);
			parametro();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(343);
				match(COMA);
				setState(344);
				parametro();
				}
				}
				setState(349);
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
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
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
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(ESTO);
				setState(351);
				match(VARIABLE);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(352);
					match(DOS_PUNTOS);
					}
				}

				setState(355);
				tipo_dato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(ESTO);
				setState(357);
				match(VARIABLE);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(358);
					match(DOS_PUNTOS);
					}
				}

				setState(361);
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
			setState(364);
			match(VARIABILES);
			setState(365);
			match(CORCHETE_IZQ);
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				declaracion_local();
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO );
			setState(371);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(ESTO);
				setState(374);
				match(VARIABLE);
				setState(375);
				match(DOS_PUNTOS);
				setState(376);
				tipo_dato();
				setState(377);
				expresion();
				setState(378);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(ESTO);
				setState(381);
				match(VARIABLE);
				setState(382);
				match(DOS_PUNTOS);
				setState(383);
				match(TEXTUM);
				setState(384);
				match(CADENA_TEXTO);
				setState(385);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(ESTO);
				setState(387);
				match(VARIABLE);
				setState(388);
				match(DOS_PUNTOS);
				setState(389);
				match(LITTERA);
				setState(390);
				match(CARACTER);
				setState(391);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(ESTO);
				setState(393);
				match(VARIABLE);
				setState(394);
				match(DOS_PUNTOS);
				setState(395);
				match(VARIABLE);
				setState(396);
				structura_instanciacion();
				setState(397);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(ESTO);
				setState(400);
				match(VARIABLE);
				setState(401);
				match(DOS_PUNTOS);
				setState(402);
				expresion();
				setState(403);
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
			setState(407);
			termino();
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					operacion_aritmetica();
					setState(409);
					termino();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public TerminalNode CADENA_TEXTO() { return getToken(Codex_latinusParser.CADENA_TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(Codex_latinusParser.CARACTER, 0); }
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				acceso_miembro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(NUMERO_ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(NUMERO_DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				match(CADENA_TEXTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				match(CARACTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
				match(VERUM);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(423);
				match(FALSUS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(424);
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
			setState(427);
			match(VARIABLE);
			setState(434); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(434);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PUNTO:
						{
						setState(428);
						match(PUNTO);
						setState(429);
						match(VARIABLE);
						}
						break;
					case CORCHETE_IZQ:
						{
						setState(430);
						match(CORCHETE_IZQ);
						setState(431);
						expresion();
						setState(432);
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
				setState(436); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
			setState(438);
			match(VARIABLE);
			setState(439);
			match(CORCHETE_IZQ);
			setState(440);
			expresion();
			setState(441);
			match(CORCHETE_DER);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO) {
				{
				{
				setState(442);
				match(PUNTO);
				setState(443);
				match(VARIABLE);
				}
				}
				setState(448);
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
			setState(449);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
			setState(451);
			match(REDDERE);
			setState(452);
			expresion();
			setState(453);
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
			setState(455);
			match(MAIOR);
			setState(456);
			match(MAYOR_QUE);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(457);
				sentencia();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(FINIS);
			setState(464);
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
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode SUMA_ABREVIADA() { return getToken(Codex_latinusParser.SUMA_ABREVIADA, 0); }
		public TerminalNode RESTA_ABREVIADA() { return getToken(Codex_latinusParser.RESTA_ABREVIADA, 0); }
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
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				imprimir_sentencia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				leer_sentencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				asignacion_sentencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				si_sentencia();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				ciclo_dum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				ciclo_facere();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472);
				ciclo_per();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(473);
				salto_sentencia();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(474);
				llamada_funcion();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(475);
					match(PUNTO_COMA);
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(478);
				match(VARIABLE);
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==SUMA_ABREVIADA || _la==RESTA_ABREVIADA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
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
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(483);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(484);
				acceso_miembro();
				}
				break;
			}
			setState(487);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(489);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(490);
				acceso_miembro();
				}
				break;
			}
			setState(493);
			match(ASIGNACION);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(494);
				expresion();
				}
				break;
			case 2:
				{
				setState(495);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(496);
				arreglo_literal();
				}
				break;
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(499);
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
			setState(502);
			match(IMPRIMIR);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(503);
				match(CADENA_TEXTO);
				}
				break;
			case 2:
				{
				setState(504);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(505);
				acceso_miembro();
				}
				break;
			case 4:
				{
				setState(506);
				llamada_funcion();
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(509);
					match(IMPRIMIR);
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(510);
						match(CADENA_TEXTO);
						}
						break;
					case 2:
						{
						setState(511);
						match(VARIABLE);
						}
						break;
					case 3:
						{
						setState(512);
						acceso_miembro();
						}
						break;
					case 4:
						{
						setState(513);
						llamada_funcion();
						}
						break;
					}
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(521);
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
			setState(524);
			match(SI);
			setState(525);
			match(PARENTESIS_IZQ);
			setState(526);
			condicion(0);
			setState(527);
			match(PARENTESIS_DER);
			setState(528);
			match(LLAVE_IZQ);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(529);
				sentencia();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(LLAVE_DER);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					aliter_bloque();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(542);
				match(ALITER);
				setState(543);
				match(LLAVE_IZQ);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
					{
					{
					setState(544);
					sentencia();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				match(LLAVE_DER);
				}
			}

			setState(553);
			match(FINIS);
			setState(554);
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
			setState(556);
			match(ALITER);
			setState(557);
			match(SI);
			setState(558);
			match(PARENTESIS_IZQ);
			setState(559);
			condicion(0);
			setState(560);
			match(PARENTESIS_DER);
			setState(561);
			match(LLAVE_IZQ);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(562);
				sentencia();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
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
			setState(570);
			match(DUM);
			setState(571);
			match(PARENTESIS_IZQ);
			setState(572);
			condicion(0);
			setState(573);
			match(PARENTESIS_DER);
			setState(574);
			match(LLAVE_IZQ);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(575);
				sentencia();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			match(LLAVE_DER);
			setState(582);
			match(FINIS);
			setState(583);
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
			setState(585);
			match(FACERE);
			setState(586);
			match(LLAVE_IZQ);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(587);
				sentencia();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(LLAVE_DER);
			setState(594);
			match(DUM);
			setState(595);
			match(PARENTESIS_IZQ);
			setState(596);
			condicion(0);
			setState(597);
			match(PARENTESIS_DER);
			setState(598);
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
			setState(600);
			match(PER);
			setState(601);
			match(PARENTESIS_IZQ);
			setState(602);
			inicializacion_per();
			setState(603);
			condiciones_per();
			setState(604);
			match(PUNTO_COMA);
			setState(605);
			incremento_per();
			setState(606);
			match(PARENTESIS_DER);
			setState(607);
			match(LLAVE_IZQ);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237987232L) != 0)) {
				{
				{
				setState(608);
				sentencia();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
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
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				match(ESTO);
				setState(617);
				match(VARIABLE);
				setState(618);
				match(DOS_PUNTOS);
				setState(619);
				tipo_dato();
				setState(620);
				expresion();
				setState(621);
				match(PUNTO_COMA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(VARIABLE);
				setState(624);
				match(ASIGNACION);
				setState(625);
				expresion();
				setState(626);
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
			setState(630);
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
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(VARIABLE);
				setState(633);
				match(SUMA_ABREVIADA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(VARIABLE);
				setState(635);
				match(RESTA_ABREVIADA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				match(VARIABLE);
				setState(637);
				match(ASIGNACION);
				setState(638);
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
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(PERGE);
				setState(642);
				match(PUNTO_COMA);
				}
				break;
			case INTERRUMPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(INTERRUMPE);
				setState(644);
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
			setState(648);
			conjuncion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(650);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(651);
					match(OR);
					setState(652);
					conjuncion(0);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
			setState(659);
			negacion_logica();
			}
			_ctx.stop = _input.LT(-1);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjuncion);
					setState(661);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(662);
					match(AND);
					setState(663);
					negacion_logica();
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				match(NEGACION);
				setState(670);
				negacion_logica();
				}
				break;
			case VERUM:
			case FALSUS:
			case PARENTESIS_IZQ:
			case VARIABLE:
			case NUMERO_ENTERO:
			case NUMERO_DECIMAL:
			case CADENA_TEXTO:
			case CARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
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
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(PARENTESIS_IZQ);
				setState(675);
				condicion(0);
				setState(676);
				match(PARENTESIS_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				expresion();
				setState(679);
				operador_relacional();
				setState(680);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(VERUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				match(FALSUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				match(VARIABLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
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
			setState(688);
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
			setState(690);
			match(VARIABLE);
			setState(691);
			match(PARENTESIS_IZQ);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588461068288L) != 0)) {
				{
				setState(692);
				argumentos();
				}
			}

			setState(695);
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
			setState(697);
			expresion();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(698);
				match(COMA);
				setState(699);
				expresion();
				}
				}
				setState(704);
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
		"\u0004\u0001;\u02c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002q\b\u0002\n\u0002\f\u0002t\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008d\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003"+
		"\u0003\u0003\u0096\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u009b\b\u0004\u000b\u0004\f\u0004\u009c\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ab\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00b3\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00bb\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ca"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d5\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00d8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0003\u0006\u00e8"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00eb\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00f0\b\u0007\n\u0007\f\u0007\u00f3\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\t\u0003\t"+
		"\u00fe\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0104\b\t\n\t\f\t\u0107"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010f\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0116\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u011a\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0004\f\u0121\b\f\u000b\f\f\f\u0122\u0001\r\u0001\r\u0003"+
		"\r\u0127\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u012e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0133\b\u000e\u0001\u000e\u0005\u000e\u0136\b\u000e\n\u000e\f\u000e\u0139"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0144\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0149\b\u000f\u0001\u000f\u0005"+
		"\u000f\u014c\b\u000f\n\u000f\f\u000f\u014f\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u015a\b\u0011\n\u0011\f\u0011\u015d\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0162\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0168\b\u0012\u0001\u0012\u0003"+
		"\u0012\u016b\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0170"+
		"\b\u0013\u000b\u0013\f\u0013\u0171\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0196\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u019c\b\u0015\n\u0015\f\u0015\u019f\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01aa\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u01b3\b\u0017\u000b\u0017\f\u0017\u01b4\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01bd\b\u0018"+
		"\n\u0018\f\u0018\u01c0\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01cb\b\u001b\n\u001b\f\u001b\u01ce\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01dd\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01e2\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01e6\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01ec\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01f2\b\u001e\u0001\u001e\u0003"+
		"\u001e\u01f5\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01fc\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0203\b\u001f\u0005\u001f\u0205\b\u001f"+
		"\n\u001f\f\u001f\u0208\t\u001f\u0001\u001f\u0003\u001f\u020b\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0213\b \n \f \u0216\t \u0001"+
		" \u0001 \u0005 \u021a\b \n \f \u021d\t \u0001 \u0001 \u0001 \u0005 \u0222"+
		"\b \n \f \u0225\t \u0001 \u0003 \u0228\b \u0001 \u0001 \u0001 \u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0234\b!\n!\f!\u0237"+
		"\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0241\b\"\n\"\f\"\u0244\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u024d\b#\n#\f#\u0250\t#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u0262\b$\n$\f$\u0265\t$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0275\b%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u0280\b\'\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0286\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u028e\b)\n"+
		")\f)\u0291\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u0299\b"+
		"*\n*\f*\u029c\t*\u0001+\u0001+\u0001+\u0003+\u02a1\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u02af\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u02b6\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0005/\u02bd\b/\n/\f/\u02c0\t/\u0001/\u0000\u0002"+
		"RT0\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0005\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u0012\u0015\u0001\u0000%(\u0001\u00002"+
		"3\u0001\u0000).\u0300\u0000`\u0001\u0000\u0000\u0000\u0002g\u0001\u0000"+
		"\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000"+
		"\u0000\b\u0097\u0001\u0000\u0000\u0000\n\u00c9\u0001\u0000\u0000\u0000"+
		"\f\u00ea\u0001\u0000\u0000\u0000\u000e\u00ec\u0001\u0000\u0000\u0000\u0010"+
		"\u00f4\u0001\u0000\u0000\u0000\u0012\u010e\u0001\u0000\u0000\u0000\u0014"+
		"\u0110\u0001\u0000\u0000\u0000\u0016\u0117\u0001\u0000\u0000\u0000\u0018"+
		"\u011d\u0001\u0000\u0000\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c"+
		"\u0128\u0001\u0000\u0000\u0000\u001e\u013f\u0001\u0000\u0000\u0000 \u0154"+
		"\u0001\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u016a\u0001"+
		"\u0000\u0000\u0000&\u016c\u0001\u0000\u0000\u0000(\u0195\u0001\u0000\u0000"+
		"\u0000*\u0197\u0001\u0000\u0000\u0000,\u01a9\u0001\u0000\u0000\u0000."+
		"\u01ab\u0001\u0000\u0000\u00000\u01b6\u0001\u0000\u0000\u00002\u01c1\u0001"+
		"\u0000\u0000\u00004\u01c3\u0001\u0000\u0000\u00006\u01c7\u0001\u0000\u0000"+
		"\u00008\u01e1\u0001\u0000\u0000\u0000:\u01e5\u0001\u0000\u0000\u0000<"+
		"\u01eb\u0001\u0000\u0000\u0000>\u01f6\u0001\u0000\u0000\u0000@\u020c\u0001"+
		"\u0000\u0000\u0000B\u022c\u0001\u0000\u0000\u0000D\u023a\u0001\u0000\u0000"+
		"\u0000F\u0249\u0001\u0000\u0000\u0000H\u0258\u0001\u0000\u0000\u0000J"+
		"\u0274\u0001\u0000\u0000\u0000L\u0276\u0001\u0000\u0000\u0000N\u027f\u0001"+
		"\u0000\u0000\u0000P\u0285\u0001\u0000\u0000\u0000R\u0287\u0001\u0000\u0000"+
		"\u0000T\u0292\u0001\u0000\u0000\u0000V\u02a0\u0001\u0000\u0000\u0000X"+
		"\u02ae\u0001\u0000\u0000\u0000Z\u02b0\u0001\u0000\u0000\u0000\\\u02b2"+
		"\u0001\u0000\u0000\u0000^\u02b9\u0001\u0000\u0000\u0000`a\u0003\u0002"+
		"\u0001\u0000a\u0001\u0001\u0000\u0000\u0000bf\u0003\u0004\u0002\u0000"+
		"cf\u0003\b\u0004\u0000df\u0003\u0018\f\u0000eb\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u00036\u001b\u0000k\u0003\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u00054\u0000\u0000nr\u0005"+
		"#\u0000\u0000oq\u0003\u0006\u0003\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005$\u0000\u0000"+
		"vw\u0005\u0004\u0000\u0000wx\u0005\u0019\u0000\u0000x\u0005\u0001\u0000"+
		"\u0000\u0000yz\u0005\u0001\u0000\u0000z{\u00054\u0000\u0000{|\u0005\u0018"+
		"\u0000\u0000|~\u0003 \u0010\u0000}\u007f\u0007\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0096\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u00054\u0000"+
		"\u0000\u0082\u0083\u0005\u0018\u0000\u0000\u0083\u0085\u0003 \u0010\u0000"+
		"\u0084\u0086\u0007\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0096\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u00054\u0000\u0000\u0089"+
		"\u008a\u0005\u0018\u0000\u0000\u008a\u008c\u00054\u0000\u0000\u008b\u008d"+
		"\u0007\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u0096\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\u0002\u0000\u0000\u008f\u0090\u00054\u0000\u0000\u0090\u0091\u0005"+
		"\u0018\u0000\u0000\u0091\u0093\u00054\u0000\u0000\u0092\u0094\u0007\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095y\u0001\u0000\u0000"+
		"\u0000\u0095\u0080\u0001\u0000\u0000\u0000\u0095\u0087\u0001\u0000\u0000"+
		"\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0096\u0007\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u000f\u0000\u0000\u0098\u009a\u0005.\u0000\u0000"+
		"\u0099\u009b\u0003\n\u0005\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\t\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0001\u0000\u0000\u009f\u00a1\u00054\u0000\u0000\u00a0\u00a2\u0005"+
		"\u0018\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003"+
		" \u0010\u0000\u00a4\u00a5\u0003*\u0015\u0000\u00a5\u00a6\u0005\u0019\u0000"+
		"\u0000\u00a6\u00ca\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000"+
		"\u0000\u00a8\u00aa\u00054\u0000\u0000\u00a9\u00ab\u0005\u0018\u0000\u0000"+
		"\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000"+
		"\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00ca\u0005\u0019\u0000\u0000\u00af"+
		"\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b2\u00054\u0000\u0000\u00b1\u00b3"+
		"\u0005\u0018\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0015\u0000\u0000\u00b5\u00b6\u00058\u0000\u0000\u00b6\u00ca\u0005"+
		"\u0019\u0000\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000\u00b8\u00ba\u0005"+
		"4\u0000\u0000\u00b9\u00bb\u0005\u0018\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u00054\u0000\u0000\u00bd\u00be\u0003\u0012\t"+
		"\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0001\u0000\u0000\u00c1\u00c3\u00054\u0000\u0000"+
		"\u00c2\u00c4\u0005\u0018\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0003*\u0015\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\f\u0006\u0000\u00c9\u009e"+
		"\u0001\u0000\u0000\u0000\u00c9\u00a7\u0001\u0000\u0000\u0000\u00c9\u00af"+
		"\u0001\u0000\u0000\u0000\u00c9\u00b7\u0001\u0000\u0000\u0000\u00c9\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u000b"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd"+
		"\u00054\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u00055"+
		"\u0000\u0000\u00cf\u00d0\u0005\"\u0000\u0000\u00d0\u00d1\u0005\u0018\u0000"+
		"\u0000\u00d1\u00d7\u0003 \u0010\u0000\u00d2\u00d4\u0005#\u0000\u0000\u00d3"+
		"\u00d5\u0003\u000e\u0007\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0005$\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0019\u0000\u0000\u00da\u00eb\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\u0002\u0000\u0000\u00dc\u00dd\u00054\u0000\u0000\u00dd\u00de\u0005"+
		"!\u0000\u0000\u00de\u00df\u00055\u0000\u0000\u00df\u00e0\u0005\"\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e7\u00054\u0000\u0000"+
		"\u00e2\u00e4\u0005#\u0000\u0000\u00e3\u00e5\u0003\u0010\b\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005$\u0000\u0000\u00e7\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005\u0019\u0000\u0000\u00ea\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ea\u00db\u0001\u0000\u0000\u0000\u00eb\r\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f1\u0003*\u0015\u0000\u00ed\u00ee\u0005\u001a"+
		"\u0000\u0000\u00ee\u00f0\u0003*\u0015\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u000f\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f9\u0003\u0012\t\u0000"+
		"\u00f5\u00f6\u0005\u001a\u0000\u0000\u00f6\u00f8\u0003\u0012\t\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u0011\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u00054\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005#\u0000\u0000\u0100\u0105\u0003\u0014\n\u0000\u0101\u0102\u0005"+
		"\u001a\u0000\u0000\u0102\u0104\u0003\u0014\n\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005$\u0000"+
		"\u0000\u0109\u010f\u0001\u0000\u0000\u0000\u010a\u010b\u00054\u0000\u0000"+
		"\u010b\u010c\u0005!\u0000\u0000\u010c\u010d\u00055\u0000\u0000\u010d\u010f"+
		"\u0005\"\u0000\u0000\u010e\u00fd\u0001\u0000\u0000\u0000\u010e\u010a\u0001"+
		"\u0000\u0000\u0000\u010f\u0013\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"4\u0000\u0000\u0111\u0115\u0005\u0018\u0000\u0000\u0112\u0116\u0003*\u0015"+
		"\u0000\u0113\u0116\u0003\u0012\t\u0000\u0114\u0116\u0003\u0016\u000b\u0000"+
		"\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0015\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0005#\u0000\u0000\u0118\u011a\u0003\u000e\u0007\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005$\u0000\u0000\u011c\u0017"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0010\u0000\u0000\u011e\u0120"+
		"\u0005.\u0000\u0000\u011f\u0121\u0003\u001a\r\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0019\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0003\u001c\u000e\u0000\u0125\u0127\u0003"+
		"\u001e\u000f\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u001b\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\r\u0000\u0000\u0129\u012a\u0003 \u0010\u0000\u012a\u012b\u00054\u0000"+
		"\u0000\u012b\u012d\u0005\u001f\u0000\u0000\u012c\u012e\u0003\"\u0011\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005 \u0000\u0000\u0130"+
		"\u0132\u0005#\u0000\u0000\u0131\u0133\u0003&\u0013\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0137\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u00038\u001c\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u00034\u001a"+
		"\u0000\u013b\u013c\u0005$\u0000\u0000\u013c\u013d\u0005\u0004\u0000\u0000"+
		"\u013d\u013e\u0005\u0019\u0000\u0000\u013e\u001d\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005\f\u0000\u0000\u0140\u0141\u00054\u0000\u0000\u0141"+
		"\u0143\u0005\u001f\u0000\u0000\u0142\u0144\u0003\"\u0011\u0000\u0143\u0142"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005 \u0000\u0000\u0146\u0148\u0005"+
		"#\u0000\u0000\u0147\u0149\u0003&\u0013\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014d\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u00038\u001c\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005$\u0000\u0000\u0151"+
		"\u0152\u0005\u0004\u0000\u0000\u0152\u0153\u0005\u0019\u0000\u0000\u0153"+
		"\u001f\u0001\u0000\u0000\u0000\u0154\u0155\u0007\u0001\u0000\u0000\u0155"+
		"!\u0001\u0000\u0000\u0000\u0156\u015b\u0003$\u0012\u0000\u0157\u0158\u0005"+
		"\u001a\u0000\u0000\u0158\u015a\u0003$\u0012\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c#\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0001\u0000"+
		"\u0000\u015f\u0161\u00054\u0000\u0000\u0160\u0162\u0005\u0018\u0000\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u016b\u0003 \u0010\u0000\u0164"+
		"\u0165\u0005\u0001\u0000\u0000\u0165\u0167\u00054\u0000\u0000\u0166\u0168"+
		"\u0005\u0018\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\u00054\u0000\u0000\u016a\u015e\u0001\u0000\u0000\u0000\u016a\u0164\u0001"+
		"\u0000\u0000\u0000\u016b%\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u000f"+
		"\u0000\u0000\u016d\u016f\u0005!\u0000\u0000\u016e\u0170\u0003(\u0014\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0005\"\u0000\u0000\u0174"+
		"\'\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0001\u0000\u0000\u0176\u0177"+
		"\u00054\u0000\u0000\u0177\u0178\u0005\u0018\u0000\u0000\u0178\u0179\u0003"+
		" \u0010\u0000\u0179\u017a\u0003*\u0015\u0000\u017a\u017b\u0005\u0019\u0000"+
		"\u0000\u017b\u0196\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0001\u0000"+
		"\u0000\u017d\u017e\u00054\u0000\u0000\u017e\u017f\u0005\u0018\u0000\u0000"+
		"\u017f\u0180\u0005\u0013\u0000\u0000\u0180\u0181\u00057\u0000\u0000\u0181"+
		"\u0196\u0005\u0019\u0000\u0000\u0182\u0183\u0005\u0001\u0000\u0000\u0183"+
		"\u0184\u00054\u0000\u0000\u0184\u0185\u0005\u0018\u0000\u0000\u0185\u0186"+
		"\u0005\u0015\u0000\u0000\u0186\u0187\u00058\u0000\u0000\u0187\u0196\u0005"+
		"\u0019\u0000\u0000\u0188\u0189\u0005\u0001\u0000\u0000\u0189\u018a\u0005"+
		"4\u0000\u0000\u018a\u018b\u0005\u0018\u0000\u0000\u018b\u018c\u00054\u0000"+
		"\u0000\u018c\u018d\u0003\u0012\t\u0000\u018d\u018e\u0005\u0019\u0000\u0000"+
		"\u018e\u0196\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0001\u0000\u0000"+
		"\u0190\u0191\u00054\u0000\u0000\u0191\u0192\u0005\u0018\u0000\u0000\u0192"+
		"\u0193\u0003*\u0015\u0000\u0193\u0194\u0005\u0019\u0000\u0000\u0194\u0196"+
		"\u0001\u0000\u0000\u0000\u0195\u0175\u0001\u0000\u0000\u0000\u0195\u017c"+
		"\u0001\u0000\u0000\u0000\u0195\u0182\u0001\u0000\u0000\u0000\u0195\u0188"+
		"\u0001\u0000\u0000\u0000\u0195\u018f\u0001\u0000\u0000\u0000\u0196)\u0001"+
		"\u0000\u0000\u0000\u0197\u019d\u0003,\u0016\u0000\u0198\u0199\u00032\u0019"+
		"\u0000\u0199\u019a\u0003,\u0016\u0000\u019a\u019c\u0001\u0000\u0000\u0000"+
		"\u019b\u0198\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e+\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01aa\u00054\u0000\u0000\u01a1\u01aa\u0003.\u0017\u0000\u01a2\u01aa\u0005"+
		"5\u0000\u0000\u01a3\u01aa\u00056\u0000\u0000\u01a4\u01aa\u00057\u0000"+
		"\u0000\u01a5\u01aa\u00058\u0000\u0000\u01a6\u01aa\u0005\u0016\u0000\u0000"+
		"\u01a7\u01aa\u0005\u0017\u0000\u0000\u01a8\u01aa\u0003\\.\u0000\u01a9"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a9\u01a1\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a9\u01a3\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a9\u01a5\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa-\u0001\u0000\u0000\u0000\u01ab\u01b2"+
		"\u00054\u0000\u0000\u01ac\u01ad\u0005\u001c\u0000\u0000\u01ad\u01b3\u0005"+
		"4\u0000\u0000\u01ae\u01af\u0005!\u0000\u0000\u01af\u01b0\u0003*\u0015"+
		"\u0000\u01b0\u01b1\u0005\"\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b2\u01ac\u0001\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5/\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u00054\u0000\u0000\u01b7\u01b8\u0005!\u0000\u0000\u01b8\u01b9\u0003"+
		"*\u0015\u0000\u01b9\u01be\u0005\"\u0000\u0000\u01ba\u01bb\u0005\u001c"+
		"\u0000\u0000\u01bb\u01bd\u00054\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf1\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007\u0002\u0000\u0000"+
		"\u01c23\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u000e\u0000\u0000\u01c4"+
		"\u01c5\u0003*\u0015\u0000\u01c5\u01c6\u0005\u0019\u0000\u0000\u01c65\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0005\u0011\u0000\u0000\u01c8\u01cc\u0005"+
		".\u0000\u0000\u01c9\u01cb\u00038\u001c\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0004\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0019\u0000\u0000\u01d17\u0001\u0000\u0000\u0000"+
		"\u01d2\u01e2\u0003>\u001f\u0000\u01d3\u01e2\u0003:\u001d\u0000\u01d4\u01e2"+
		"\u0003<\u001e\u0000\u01d5\u01e2\u0003@ \u0000\u01d6\u01e2\u0003D\"\u0000"+
		"\u01d7\u01e2\u0003F#\u0000\u01d8\u01e2\u0003H$\u0000\u01d9\u01e2\u0003"+
		"P(\u0000\u01da\u01dc\u0003\\.\u0000\u01db\u01dd\u0005\u0019\u0000\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e2\u0001\u0000\u0000\u0000\u01de\u01df\u00054\u0000\u0000\u01df"+
		"\u01e0\u0007\u0003\u0000\u0000\u01e0\u01e2\u0005\u0019\u0000\u0000\u01e1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01e1\u01d3\u0001\u0000\u0000\u0000\u01e1"+
		"\u01d4\u0001\u0000\u0000\u0000\u01e1\u01d5\u0001\u0000\u0000\u0000\u01e1"+
		"\u01d6\u0001\u0000\u0000\u0000\u01e1\u01d7\u0001\u0000\u0000\u0000\u01e1"+
		"\u01d8\u0001\u0000\u0000\u0000\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e1"+
		"\u01da\u0001\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e2"+
		"9\u0001\u0000\u0000\u0000\u01e3\u01e6\u00054\u0000\u0000\u01e4\u01e6\u0003"+
		".\u0017\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0005\u001d\u0000\u0000\u01e8;\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ec\u00054\u0000\u0000\u01ea\u01ec\u0003.\u0017\u0000\u01eb"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f1\u0005\u001b\u0000\u0000\u01ee"+
		"\u01f2\u0003*\u0015\u0000\u01ef\u01f2\u0003\u0012\t\u0000\u01f0\u01f2"+
		"\u0003\u0016\u000b\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005\u0019\u0000\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5=\u0001"+
		"\u0000\u0000\u0000\u01f6\u01fb\u0005\u001e\u0000\u0000\u01f7\u01fc\u0005"+
		"7\u0000\u0000\u01f8\u01fc\u00054\u0000\u0000\u01f9\u01fc\u0003.\u0017"+
		"\u0000\u01fa\u01fc\u0003\\.\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u0206\u0001\u0000\u0000\u0000"+
		"\u01fd\u0202\u0005\u001e\u0000\u0000\u01fe\u0203\u00057\u0000\u0000\u01ff"+
		"\u0203\u00054\u0000\u0000\u0200\u0203\u0003.\u0017\u0000\u0201\u0203\u0003"+
		"\\.\u0000\u0202\u01fe\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000"+
		"\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01fd\u0001\u0000"+
		"\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000"+
		"\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020b\u0005\u0019"+
		"\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b?\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u0005\u0000"+
		"\u0000\u020d\u020e\u0005\u001f\u0000\u0000\u020e\u020f\u0003R)\u0000\u020f"+
		"\u0210\u0005 \u0000\u0000\u0210\u0214\u0005#\u0000\u0000\u0211\u0213\u0003"+
		"8\u001c\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0217\u021b\u0005$\u0000\u0000\u0218\u021a\u0003B!\u0000"+
		"\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u0227\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0005\u0006\u0000\u0000\u021f\u0223\u0005#\u0000\u0000\u0220"+
		"\u0222\u00038\u001c\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u0225"+
		"\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224"+
		"\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0223"+
		"\u0001\u0000\u0000\u0000\u0226\u0228\u0005$\u0000\u0000\u0227\u021e\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022a\u0005\u0004\u0000\u0000\u022a\u022b\u0005"+
		"\u0019\u0000\u0000\u022bA\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u0006"+
		"\u0000\u0000\u022d\u022e\u0005\u0005\u0000\u0000\u022e\u022f\u0005\u001f"+
		"\u0000\u0000\u022f\u0230\u0003R)\u0000\u0230\u0231\u0005 \u0000\u0000"+
		"\u0231\u0235\u0005#\u0000\u0000\u0232\u0234\u00038\u001c\u0000\u0233\u0232"+
		"\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0238"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0005$\u0000\u0000\u0239C\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0007"+
		"\u0000\u0000\u023b\u023c\u0005\u001f\u0000\u0000\u023c\u023d\u0003R)\u0000"+
		"\u023d\u023e\u0005 \u0000\u0000\u023e\u0242\u0005#\u0000\u0000\u023f\u0241"+
		"\u00038\u001c\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001"+
		"\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001"+
		"\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244\u0242\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0005$\u0000\u0000\u0246\u0247\u0005\u0004"+
		"\u0000\u0000\u0247\u0248\u0005\u0019\u0000\u0000\u0248E\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0005\b\u0000\u0000\u024a\u024e\u0005#\u0000\u0000"+
		"\u024b\u024d\u00038\u001c\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024d"+
		"\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250"+
		"\u024e\u0001\u0000\u0000\u0000\u0251\u0252\u0005$\u0000\u0000\u0252\u0253"+
		"\u0005\u0007\u0000\u0000\u0253\u0254\u0005\u001f\u0000\u0000\u0254\u0255"+
		"\u0003R)\u0000\u0255\u0256\u0005 \u0000\u0000\u0256\u0257\u0005\u0019"+
		"\u0000\u0000\u0257G\u0001\u0000\u0000\u0000\u0258\u0259\u0005\t\u0000"+
		"\u0000\u0259\u025a\u0005\u001f\u0000\u0000\u025a\u025b\u0003J%\u0000\u025b"+
		"\u025c\u0003L&\u0000\u025c\u025d\u0005\u0019\u0000\u0000\u025d\u025e\u0003"+
		"N\'\u0000\u025e\u025f\u0005 \u0000\u0000\u025f\u0263\u0005#\u0000\u0000"+
		"\u0260\u0262\u00038\u001c\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0266\u0267\u0005$\u0000\u0000\u0267I\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0005\u0001\u0000\u0000\u0269\u026a\u0005"+
		"4\u0000\u0000\u026a\u026b\u0005\u0018\u0000\u0000\u026b\u026c\u0003 \u0010"+
		"\u0000\u026c\u026d\u0003*\u0015\u0000\u026d\u026e\u0005\u0019\u0000\u0000"+
		"\u026e\u0275\u0001\u0000\u0000\u0000\u026f\u0270\u00054\u0000\u0000\u0270"+
		"\u0271\u0005\u001b\u0000\u0000\u0271\u0272\u0003*\u0015\u0000\u0272\u0273"+
		"\u0005\u0019\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0268"+
		"\u0001\u0000\u0000\u0000\u0274\u026f\u0001\u0000\u0000\u0000\u0275K\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0003R)\u0000\u0277M\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u00054\u0000\u0000\u0279\u0280\u00052\u0000\u0000\u027a"+
		"\u027b\u00054\u0000\u0000\u027b\u0280\u00053\u0000\u0000\u027c\u027d\u0005"+
		"4\u0000\u0000\u027d\u027e\u0005\u001b\u0000\u0000\u027e\u0280\u0003*\u0015"+
		"\u0000\u027f\u0278\u0001\u0000\u0000\u0000\u027f\u027a\u0001\u0000\u0000"+
		"\u0000\u027f\u027c\u0001\u0000\u0000\u0000\u0280O\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0005\n\u0000\u0000\u0282\u0286\u0005\u0019\u0000\u0000\u0283"+
		"\u0284\u0005\u000b\u0000\u0000\u0284\u0286\u0005\u0019\u0000\u0000\u0285"+
		"\u0281\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286"+
		"Q\u0001\u0000\u0000\u0000\u0287\u0288\u0006)\uffff\uffff\u0000\u0288\u0289"+
		"\u0003T*\u0000\u0289\u028f\u0001\u0000\u0000\u0000\u028a\u028b\n\u0002"+
		"\u0000\u0000\u028b\u028c\u00050\u0000\u0000\u028c\u028e\u0003T*\u0000"+
		"\u028d\u028a\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000"+
		"\u0290S\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0006*\uffff\uffff\u0000\u0293\u0294\u0003V+\u0000\u0294\u029a"+
		"\u0001\u0000\u0000\u0000\u0295\u0296\n\u0002\u0000\u0000\u0296\u0297\u0005"+
		"/\u0000\u0000\u0297\u0299\u0003V+\u0000\u0298\u0295\u0001\u0000\u0000"+
		"\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029bU\u0001\u0000\u0000\u0000"+
		"\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u029e\u00051\u0000\u0000\u029e"+
		"\u02a1\u0003V+\u0000\u029f\u02a1\u0003X,\u0000\u02a0\u029d\u0001\u0000"+
		"\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1W\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a3\u0005\u001f\u0000\u0000\u02a3\u02a4\u0003R)\u0000\u02a4"+
		"\u02a5\u0005 \u0000\u0000\u02a5\u02af\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0003*\u0015\u0000\u02a7\u02a8\u0003Z-\u0000\u02a8\u02a9\u0003*\u0015"+
		"\u0000\u02a9\u02af\u0001\u0000\u0000\u0000\u02aa\u02af\u0005\u0016\u0000"+
		"\u0000\u02ab\u02af\u0005\u0017\u0000\u0000\u02ac\u02af\u00054\u0000\u0000"+
		"\u02ad\u02af\u0003\\.\u0000\u02ae\u02a2\u0001\u0000\u0000\u0000\u02ae"+
		"\u02a6\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ad\u0001\u0000\u0000\u0000\u02afY\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0007\u0004\u0000\u0000\u02b1[\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005"+
		"4\u0000\u0000\u02b3\u02b5\u0005\u001f\u0000\u0000\u02b4\u02b6\u0003^/"+
		"\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005 \u0000\u0000"+
		"\u02b8]\u0001\u0000\u0000\u0000\u02b9\u02be\u0003*\u0015\u0000\u02ba\u02bb"+
		"\u0005\u001a\u0000\u0000\u02bb\u02bd\u0003*\u0015\u0000\u02bc\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf_\u0001\u0000"+
		"\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000Jegr~\u0085\u008c\u0093"+
		"\u0095\u009c\u00a1\u00aa\u00b2\u00ba\u00c3\u00c9\u00d4\u00d7\u00e4\u00e7"+
		"\u00ea\u00f1\u00f9\u00fd\u0105\u010e\u0115\u0119\u0122\u0126\u012d\u0132"+
		"\u0137\u0143\u0148\u014d\u015b\u0161\u0167\u016a\u0171\u0195\u019d\u01a9"+
		"\u01b2\u01b4\u01be\u01cc\u01dc\u01e1\u01e5\u01eb\u01f1\u01f4\u01fb\u0202"+
		"\u0206\u020a\u0214\u021b\u0223\u0227\u0235\u0242\u024e\u0263\u0274\u027f"+
		"\u0285\u028f\u029a\u02a0\u02ae\u02b5\u02be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}