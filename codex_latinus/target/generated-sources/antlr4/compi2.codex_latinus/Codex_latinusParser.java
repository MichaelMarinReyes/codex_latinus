// Generated from compi2.codex_latinus/Codex_latinus.g4 by ANTLR 4.13.2
package compi2.codex_latinus;
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
		RULE_init = 0, RULE_codex_latinus = 1, RULE_variables = 2, RULE_declaracion = 3, 
		RULE_munera = 4, RULE_funcion = 5, RULE_tipo_dato = 6, RULE_parametros = 7, 
		RULE_parametro = 8, RULE_variables_locales = 9, RULE_declaracion_local = 10, 
		RULE_expresion = 11, RULE_termino = 12, RULE_operacion_aritmetica = 13, 
		RULE_reddere_sentencia = 14, RULE_maior = 15, RULE_sentencia = 16, RULE_imprimir_sentencia = 17, 
		RULE_leer_sentencia = 18, RULE_asignacion_sentencia = 19, RULE_si_sentencia = 20, 
		RULE_condicion = 21, RULE_operador_relacional = 22, RULE_llamada_funcion = 23, 
		RULE_argumentos = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "codex_latinus", "variables", "declaracion", "munera", "funcion", 
			"tipo_dato", "parametros", "parametro", "variables_locales", "declaracion_local", 
			"expresion", "termino", "operacion_aritmetica", "reddere_sentencia", 
			"maior", "sentencia", "imprimir_sentencia", "leer_sentencia", "asignacion_sentencia", 
			"si_sentencia", "condicion", "operador_relacional", "llamada_funcion", 
			"argumentos"
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
			setState(50);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABILES) {
				{
				{
				setState(52);
				variables();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUNERA) {
				{
				{
				setState(58);
				munera();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VARIABILES);
			setState(67);
			match(MAYOR_QUE);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				declaracion();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO );
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
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public TerminalNode NUMERUS() { return getToken(Codex_latinusParser.NUMERUS, 0); }
		public TerminalNode NUMERO_ENTERO() { return getToken(Codex_latinusParser.NUMERO_ENTERO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode TEXTUM() { return getToken(Codex_latinusParser.TEXTUM, 0); }
		public TerminalNode CADENA_TEXTO() { return getToken(Codex_latinusParser.CADENA_TEXTO, 0); }
		public TerminalNode DECIMALIS() { return getToken(Codex_latinusParser.DECIMALIS, 0); }
		public TerminalNode NUMERO_DECIMAL() { return getToken(Codex_latinusParser.NUMERO_DECIMAL, 0); }
		public TerminalNode LITTERA() { return getToken(Codex_latinusParser.LITTERA, 0); }
		public TerminalNode CARACTER() { return getToken(Codex_latinusParser.CARACTER, 0); }
		public TerminalNode VERUM() { return getToken(Codex_latinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(Codex_latinusParser.FALSUS, 0); }
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
		enterRule(_localctx, 6, RULE_declaracion);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ESTO);
				setState(74);
				match(VARIABLE);
				setState(75);
				match(DOS_PUNTOS);
				setState(76);
				match(NUMERUS);
				setState(77);
				match(NUMERO_ENTERO);
				setState(78);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(ESTO);
				setState(80);
				match(VARIABLE);
				setState(81);
				match(DOS_PUNTOS);
				setState(82);
				match(TEXTUM);
				setState(83);
				match(CADENA_TEXTO);
				setState(84);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(ESTO);
				setState(86);
				match(VARIABLE);
				setState(87);
				match(DOS_PUNTOS);
				setState(88);
				match(DECIMALIS);
				setState(89);
				match(NUMERO_DECIMAL);
				setState(90);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(ESTO);
				setState(92);
				match(VARIABLE);
				setState(93);
				match(DOS_PUNTOS);
				setState(94);
				match(LITTERA);
				setState(95);
				match(CARACTER);
				setState(96);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(ESTO);
				setState(98);
				match(VARIABLE);
				setState(99);
				match(DOS_PUNTOS);
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
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
		enterRule(_localctx, 8, RULE_munera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(MUNERA);
			setState(105);
			match(MAYOR_QUE);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				funcion();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO );
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
		enterRule(_localctx, 10, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RATIO);
			setState(112);
			tipo_dato();
			setState(113);
			match(VARIABLE);
			setState(114);
			match(PARENTESIS_IZQ);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(115);
				parametros();
				}
			}

			setState(118);
			match(PARENTESIS_DER);
			setState(119);
			match(LLAVE_IZQ);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(120);
				variables_locales();
				}
			}

			setState(123);
			reddere_sentencia();
			setState(124);
			match(LLAVE_DER);
			setState(125);
			match(FINIS);
			setState(126);
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
		enterRule(_localctx, 12, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 14, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			parametro();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(131);
				match(COMA);
				setState(132);
				parametro();
				}
				}
				setState(137);
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
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
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
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ESTO);
			setState(139);
			match(VARIABLE);
			setState(140);
			match(DOS_PUNTOS);
			setState(141);
			tipo_dato();
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
		enterRule(_localctx, 18, RULE_variables_locales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(VARIABILES);
			setState(144);
			match(CORCHETE_IZQ);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				declaracion_local();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO );
			setState(150);
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
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(Codex_latinusParser.DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
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
		enterRule(_localctx, 20, RULE_declaracion_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ESTO);
			setState(153);
			match(VARIABLE);
			setState(154);
			match(DOS_PUNTOS);
			setState(155);
			tipo_dato();
			setState(156);
			expresion();
			setState(157);
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
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			termino();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) {
				{
				{
				setState(160);
				operacion_aritmetica();
				setState(161);
				termino();
				}
				}
				setState(167);
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
	public static class TerminoContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode NUMERO_ENTERO() { return getToken(Codex_latinusParser.NUMERO_ENTERO, 0); }
		public TerminalNode NUMERO_DECIMAL() { return getToken(Codex_latinusParser.NUMERO_DECIMAL, 0); }
		public TerminalNode VERUM() { return getToken(Codex_latinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(Codex_latinusParser.FALSUS, 0); }
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
		enterRule(_localctx, 24, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_operacion_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 28, RULE_reddere_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(REDDERE);
			setState(173);
			match(VARIABLE);
			setState(174);
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
		enterRule(_localctx, 30, RULE_maior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(MAIOR);
			setState(177);
			match(MAYOR_QUE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237983264L) != 0)) {
				{
				{
				setState(178);
				sentencia();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(FINIS);
			setState(185);
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
		enterRule(_localctx, 32, RULE_sentencia);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				imprimir_sentencia();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				leer_sentencia();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				asignacion_sentencia();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				si_sentencia();
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
	public static class Imprimir_sentenciaContext extends ParserRuleContext {
		public List<TerminalNode> IMPRIMIR() { return getTokens(Codex_latinusParser.IMPRIMIR); }
		public TerminalNode IMPRIMIR(int i) {
			return getToken(Codex_latinusParser.IMPRIMIR, i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public List<TerminalNode> CADENA_TEXTO() { return getTokens(Codex_latinusParser.CADENA_TEXTO); }
		public TerminalNode CADENA_TEXTO(int i) {
			return getToken(Codex_latinusParser.CADENA_TEXTO, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Codex_latinusParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Codex_latinusParser.VARIABLE, i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
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
		enterRule(_localctx, 34, RULE_imprimir_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IMPRIMIR);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(194);
				match(CADENA_TEXTO);
				}
				break;
			case 2:
				{
				setState(195);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(196);
				llamada_funcion();
				}
				break;
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPRIMIR) {
				{
				{
				setState(199);
				match(IMPRIMIR);
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(200);
					match(CADENA_TEXTO);
					}
					break;
				case 2:
					{
					setState(201);
					match(VARIABLE);
					}
					break;
				case 3:
					{
					setState(202);
					llamada_funcion();
					}
					break;
				}
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
	public static class Leer_sentenciaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(Codex_latinusParser.LEER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Codex_latinusParser.PUNTO_COMA, 0); }
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
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
		enterRule(_localctx, 36, RULE_leer_sentencia);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(LEER);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(213);
					match(PUNTO_COMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LEER);
				setState(217);
				match(VARIABLE);
				setState(218);
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
	public static class Asignacion_sentenciaContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Codex_latinusParser.VARIABLE, 0); }
		public TerminalNode ASIGNACION() { return getToken(Codex_latinusParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 38, RULE_asignacion_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(VARIABLE);
			setState(222);
			match(ASIGNACION);
			setState(223);
			expresion();
			setState(224);
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
	public static class Si_sentenciaContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Codex_latinusParser.SI, 0); }
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
		enterRule(_localctx, 40, RULE_si_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SI);
			setState(227);
			match(PARENTESIS_IZQ);
			setState(228);
			condicion();
			setState(229);
			match(PARENTESIS_DER);
			setState(230);
			match(LLAVE_IZQ);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503601237983264L) != 0)) {
				{
				{
				setState(231);
				sentencia();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(LLAVE_DER);
			setState(238);
			match(FINIS);
			setState(239);
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
	public static class CondicionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
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
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expresion();
			setState(242);
			operador_relacional();
			setState(243);
			expresion();
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
		enterRule(_localctx, 44, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 46, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(VARIABLE);
			setState(248);
			match(PARENTESIS_IZQ);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
				{
				setState(249);
				argumentos();
				}
			}

			setState(252);
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
		enterRule(_localctx, 48, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expresion();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(255);
				match(COMA);
				setState(256);
				expresion();
				}
				}
				setState(261);
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

	public static final String _serializedATN =
		"\u0004\u0001;\u0107\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002F\b"+
		"\u0002\u000b\u0002\f\u0002G\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003g\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004l\b\u0004\u000b\u0004\f\u0004m\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005z\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0086\b\u0007\n\u0007\f\u0007\u0089"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u0093\b\t\u000b\t\f\t\u0094\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00a4\b\u000b\n\u000b\f\u000b\u00a7\t\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b4\b\u000f\n"+
		"\u000f\f\u000f\u00b7\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c0\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c6\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cc\b\u0011\u0005"+
		"\u0011\u00ce\b\u0011\n\u0011\f\u0011\u00d1\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00d7\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00dc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00e9\b\u0014\n\u0014\f\u0014\u00ec"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00fb\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0102\b\u0018\n\u0018\f\u0018"+
		"\u0105\t\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0005\u0001\u0000\u0016\u0017\u0001\u0000\u0012\u0015\u0002\u0000\u0016"+
		"\u001746\u0001\u0000%(\u0001\u0000).\u0108\u00002\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006f"+
		"\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000"+
		"\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000"+
		"\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000"+
		"\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000"+
		"\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000"+
		"\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000"+
		" \u00bf\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000$\u00db"+
		"\u0001\u0000\u0000\u0000&\u00dd\u0001\u0000\u0000\u0000(\u00e2\u0001\u0000"+
		"\u0000\u0000*\u00f1\u0001\u0000\u0000\u0000,\u00f5\u0001\u0000\u0000\u0000"+
		".\u00f7\u0001\u0000\u0000\u00000\u00fe\u0001\u0000\u0000\u000023\u0003"+
		"\u0002\u0001\u00003\u0001\u0001\u0000\u0000\u000046\u0003\u0004\u0002"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008=\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0003\b\u0004\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0003\u001e\u000f"+
		"\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0005\u000f\u0000\u0000CE\u0005"+
		".\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u00054\u0000"+
		"\u0000KL\u0005\u0018\u0000\u0000LM\u0005\u0012\u0000\u0000MN\u00055\u0000"+
		"\u0000Ng\u0005\u0019\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u00054\u0000"+
		"\u0000QR\u0005\u0018\u0000\u0000RS\u0005\u0013\u0000\u0000ST\u00057\u0000"+
		"\u0000Tg\u0005\u0019\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u00054\u0000"+
		"\u0000WX\u0005\u0018\u0000\u0000XY\u0005\u0014\u0000\u0000YZ\u00056\u0000"+
		"\u0000Zg\u0005\u0019\u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u00054"+
		"\u0000\u0000]^\u0005\u0018\u0000\u0000^_\u0005\u0015\u0000\u0000_`\u0005"+
		"8\u0000\u0000`g\u0005\u0019\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u0005"+
		"4\u0000\u0000cd\u0005\u0018\u0000\u0000de\u0007\u0000\u0000\u0000eg\u0005"+
		"\u0019\u0000\u0000fI\u0001\u0000\u0000\u0000fO\u0001\u0000\u0000\u0000"+
		"fU\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000"+
		"\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005\u0010\u0000\u0000ik\u0005"+
		".\u0000\u0000jl\u0003\n\u0005\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\t\u0001\u0000\u0000\u0000op\u0005\r\u0000\u0000pq\u0003\f\u0006\u0000"+
		"qr\u00054\u0000\u0000rt\u0005\u001f\u0000\u0000su\u0003\u000e\u0007\u0000"+
		"ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vw\u0005 \u0000\u0000wy\u0005#\u0000\u0000xz\u0003\u0012\t\u0000"+
		"yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0003\u001c\u000e\u0000|}\u0005$\u0000\u0000}~\u0005\u0004\u0000"+
		"\u0000~\u007f\u0005\u0019\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0007\u0001\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0087\u0003\u0010\b\u0000\u0083\u0084\u0005\u001a\u0000\u0000\u0084\u0086"+
		"\u0003\u0010\b\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c\u0005"+
		"4\u0000\u0000\u008c\u008d\u0005\u0018\u0000\u0000\u008d\u008e\u0003\f"+
		"\u0006\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000f"+
		"\u0000\u0000\u0090\u0092\u0005!\u0000\u0000\u0091\u0093\u0003\u0014\n"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\"\u0000\u0000"+
		"\u0097\u0013\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0001\u0000\u0000"+
		"\u0099\u009a\u00054\u0000\u0000\u009a\u009b\u0005\u0018\u0000\u0000\u009b"+
		"\u009c\u0003\f\u0006\u0000\u009c\u009d\u0003\u0016\u000b\u0000\u009d\u009e"+
		"\u0005\u0019\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a5"+
		"\u0003\u0018\f\u0000\u00a0\u00a1\u0003\u001a\r\u0000\u00a1\u00a2\u0003"+
		"\u0018\f\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0017\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0002"+
		"\u0000\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0003"+
		"\u0000\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u000e"+
		"\u0000\u0000\u00ad\u00ae\u00054\u0000\u0000\u00ae\u00af\u0005\u0019\u0000"+
		"\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0011\u0000"+
		"\u0000\u00b1\u00b5\u0005.\u0000\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0004\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba"+
		"\u001f\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003\"\u0011\u0000\u00bc\u00c0"+
		"\u0003$\u0012\u0000\u00bd\u00c0\u0003&\u0013\u0000\u00be\u00c0\u0003("+
		"\u0014\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0!\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005\u001e\u0000"+
		"\u0000\u00c2\u00c6\u00057\u0000\u0000\u00c3\u00c6\u00054\u0000\u0000\u00c4"+
		"\u00c6\u0003.\u0017\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00cf"+
		"\u0001\u0000\u0000\u0000\u00c7\u00cb\u0005\u001e\u0000\u0000\u00c8\u00cc"+
		"\u00057\u0000\u0000\u00c9\u00cc\u00054\u0000\u0000\u00ca\u00cc\u0003."+
		"\u0017\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0019\u0000\u0000\u00d3#\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0005\u001d\u0000\u0000\u00d5\u00d7\u0005\u0019\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001d\u0000"+
		"\u0000\u00d9\u00da\u00054\u0000\u0000\u00da\u00dc\u0005\u0019\u0000\u0000"+
		"\u00db\u00d4\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00de\u00054\u0000\u0000\u00de\u00df"+
		"\u0005\u001b\u0000\u0000\u00df\u00e0\u0003\u0016\u000b\u0000\u00e0\u00e1"+
		"\u0005\u0019\u0000\u0000\u00e1\'\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0005\u0000\u0000\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e4\u00e5\u0003"+
		"*\u0015\u0000\u00e5\u00e6\u0005 \u0000\u0000\u00e6\u00ea\u0005#\u0000"+
		"\u0000\u00e7\u00e9\u0003 \u0010\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005$\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0004\u0000\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0"+
		")\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u0016\u000b\u0000\u00f2\u00f3"+
		"\u0003,\u0016\u0000\u00f3\u00f4\u0003\u0016\u000b\u0000\u00f4+\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0007\u0004\u0000\u0000\u00f6-\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u00054\u0000\u0000\u00f8\u00fa\u0005\u001f\u0000\u0000"+
		"\u00f9\u00fb\u00030\u0018\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005 \u0000\u0000\u00fd/\u0001\u0000\u0000\u0000\u00fe\u0103\u0003"+
		"\u0016\u000b\u0000\u00ff\u0100\u0005\u001a\u0000\u0000\u0100\u0102\u0003"+
		"\u0016\u000b\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u01041\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u00147=Gfmty\u0087\u0094\u00a5\u00b5\u00bf\u00c5\u00cb\u00cf"+
		"\u00d6\u00db\u00ea\u00fa\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}