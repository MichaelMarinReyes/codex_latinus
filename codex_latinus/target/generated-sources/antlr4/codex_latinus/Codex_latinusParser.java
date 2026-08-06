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
		RULE_funcion = 13, RULE_tipo_dato = 14, RULE_parametros = 15, RULE_parametro = 16, 
		RULE_variables_locales = 17, RULE_declaracion_local = 18, RULE_expresion = 19, 
		RULE_termino = 20, RULE_acceso_miembro = 21, RULE_arreglo_acceso = 22, 
		RULE_operacion_aritmetica = 23, RULE_reddere_sentencia = 24, RULE_maior = 25, 
		RULE_sentencia = 26, RULE_leer_sentencia = 27, RULE_asignacion_sentencia = 28, 
		RULE_imprimir_sentencia = 29, RULE_si_sentencia = 30, RULE_ciclo_dum = 31, 
		RULE_ciclo_facere = 32, RULE_ciclo_per = 33, RULE_inicializacion_per = 34, 
		RULE_condiciones_per = 35, RULE_incremento_per = 36, RULE_salto_sentencia = 37, 
		RULE_condicion = 38, RULE_operador_relacional = 39, RULE_llamada_funcion = 40, 
		RULE_argumentos = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "codex_latinus", "structura_def", "miembro_structura", "variables", 
			"declaracion", "arreglo_declaracion", "elemento_arreglo", "elemento_arreglo_struct", 
			"structura_instanciacion", "atributo_asignacion", "arreglo_literal", 
			"munera", "funcion", "tipo_dato", "parametros", "parametro", "variables_locales", 
			"declaracion_local", "expresion", "termino", "acceso_miembro", "arreglo_acceso", 
			"operacion_aritmetica", "reddere_sentencia", "maior", "sentencia", "leer_sentencia", 
			"asignacion_sentencia", "imprimir_sentencia", "si_sentencia", "ciclo_dum", 
			"ciclo_facere", "ciclo_per", "inicializacion_per", "condiciones_per", 
			"incremento_per", "salto_sentencia", "condicion", "operador_relacional", 
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
			setState(84);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCTURA) {
				{
				{
				setState(86);
				structura_def();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABILES) {
				{
				{
				setState(92);
				variables();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUNERA) {
				{
				{
				setState(98);
				munera();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(106);
			match(STRUCTURA);
			setState(107);
			match(VARIABLE);
			setState(108);
			match(LLAVE_IZQ);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SERIES) {
				{
				{
				setState(109);
				miembro_structura();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(LLAVE_DER);
			setState(116);
			match(FINIS);
			setState(117);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ESTO);
				setState(120);
				match(VARIABLE);
				setState(121);
				match(DOS_PUNTOS);
				setState(122);
				tipo_dato();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(123);
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
				setState(126);
				match(SERIES);
				setState(127);
				match(VARIABLE);
				setState(128);
				match(DOS_PUNTOS);
				setState(129);
				tipo_dato();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(130);
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
				setState(133);
				match(ESTO);
				setState(134);
				match(VARIABLE);
				setState(135);
				match(DOS_PUNTOS);
				setState(136);
				match(VARIABLE);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(137);
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
				setState(140);
				match(SERIES);
				setState(141);
				match(VARIABLE);
				setState(142);
				match(DOS_PUNTOS);
				setState(143);
				match(VARIABLE);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA || _la==COMA) {
					{
					setState(144);
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
			setState(149);
			match(VARIABILES);
			setState(150);
			match(MAYOR_QUE);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				declaracion();
				}
				}
				setState(154); 
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ESTO);
				setState(157);
				match(VARIABLE);
				setState(158);
				match(DOS_PUNTOS);
				setState(159);
				match(NUMERUS);
				setState(160);
				match(NUMERO_ENTERO);
				setState(161);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ESTO);
				setState(163);
				match(VARIABLE);
				setState(164);
				match(DOS_PUNTOS);
				setState(165);
				match(TEXTUM);
				setState(166);
				match(CADENA_TEXTO);
				setState(167);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(ESTO);
				setState(169);
				match(VARIABLE);
				setState(170);
				match(DOS_PUNTOS);
				setState(171);
				match(DECIMALIS);
				setState(172);
				match(NUMERO_DECIMAL);
				setState(173);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(ESTO);
				setState(175);
				match(VARIABLE);
				setState(176);
				match(DOS_PUNTOS);
				setState(177);
				match(LITTERA);
				setState(178);
				match(CARACTER);
				setState(179);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(ESTO);
				setState(181);
				match(VARIABLE);
				setState(182);
				match(DOS_PUNTOS);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(ESTO);
				setState(186);
				match(VARIABLE);
				setState(187);
				match(DOS_PUNTOS);
				setState(188);
				match(VARIABLE);
				setState(189);
				structura_instanciacion();
				setState(190);
				match(PUNTO_COMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(SERIES);
				setState(196);
				match(VARIABLE);
				setState(197);
				match(CORCHETE_IZQ);
				setState(198);
				match(NUMERO_ENTERO);
				setState(199);
				match(CORCHETE_DER);
				setState(200);
				match(DOS_PUNTOS);
				setState(201);
				tipo_dato();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAVE_IZQ) {
					{
					setState(202);
					match(LLAVE_IZQ);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
						{
						setState(203);
						elemento_arreglo();
						}
					}

					setState(206);
					match(LLAVE_DER);
					}
				}

				setState(209);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(SERIES);
				setState(212);
				match(VARIABLE);
				setState(213);
				match(CORCHETE_IZQ);
				setState(214);
				match(NUMERO_ENTERO);
				setState(215);
				match(CORCHETE_DER);
				setState(216);
				match(DOS_PUNTOS);
				setState(217);
				match(VARIABLE);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAVE_IZQ) {
					{
					setState(218);
					match(LLAVE_IZQ);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VARIABLE) {
						{
						setState(219);
						elemento_arreglo_struct();
						}
					}

					setState(222);
					match(LLAVE_DER);
					}
				}

				setState(225);
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
			setState(228);
			expresion();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(229);
				match(COMA);
				setState(230);
				expresion();
				}
				}
				setState(235);
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
			setState(236);
			structura_instanciacion();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(237);
				match(COMA);
				setState(238);
				structura_instanciacion();
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(VARIABLE);
				setState(245);
				match(LLAVE_IZQ);
				setState(246);
				atributo_asignacion();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(247);
					match(COMA);
					setState(248);
					atributo_asignacion();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(LLAVE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(VARIABLE);
				setState(257);
				match(CORCHETE_IZQ);
				setState(258);
				match(NUMERO_ENTERO);
				setState(259);
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
			setState(262);
			match(VARIABLE);
			setState(263);
			match(DOS_PUNTOS);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(264);
				expresion();
				}
				break;
			case 2:
				{
				setState(265);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(266);
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
			setState(269);
			match(LLAVE_IZQ);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
				{
				setState(270);
				elemento_arreglo();
				}
			}

			setState(273);
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
			setState(275);
			match(MUNERA);
			setState(276);
			match(MAYOR_QUE);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				funcion();
				}
				}
				setState(280); 
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
		enterRule(_localctx, 26, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(RATIO);
			setState(283);
			tipo_dato();
			setState(284);
			match(VARIABLE);
			setState(285);
			match(PARENTESIS_IZQ);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(286);
				parametros();
				}
			}

			setState(289);
			match(PARENTESIS_DER);
			setState(290);
			match(LLAVE_IZQ);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(291);
				variables_locales();
				}
			}

			setState(294);
			reddere_sentencia();
			setState(295);
			match(LLAVE_DER);
			setState(296);
			match(FINIS);
			setState(297);
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
		public TerminalNode VERUM() { return getToken(Codex_latinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(Codex_latinusParser.FALSUS, 0); }
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
		enterRule(_localctx, 28, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			parametro();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(302);
				match(COMA);
				setState(303);
				parametro();
				}
				}
				setState(308);
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
		enterRule(_localctx, 32, RULE_parametro);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(ESTO);
				setState(310);
				match(VARIABLE);
				setState(311);
				match(DOS_PUNTOS);
				setState(312);
				tipo_dato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(ESTO);
				setState(314);
				match(VARIABLE);
				setState(315);
				match(DOS_PUNTOS);
				setState(316);
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
		enterRule(_localctx, 34, RULE_variables_locales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(VARIABILES);
			setState(320);
			match(CORCHETE_IZQ);
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(321);
				declaracion_local();
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO );
			setState(326);
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
		enterRule(_localctx, 36, RULE_declaracion_local);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(ESTO);
				setState(329);
				match(VARIABLE);
				setState(330);
				match(DOS_PUNTOS);
				setState(331);
				tipo_dato();
				setState(332);
				expresion();
				setState(333);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(ESTO);
				setState(336);
				match(VARIABLE);
				setState(337);
				match(DOS_PUNTOS);
				setState(338);
				match(VARIABLE);
				setState(339);
				structura_instanciacion();
				setState(340);
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
		enterRule(_localctx, 38, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			termino();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) {
				{
				{
				setState(345);
				operacion_aritmetica();
				setState(346);
				termino();
				}
				}
				setState(352);
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
		enterRule(_localctx, 40, RULE_termino);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				acceso_miembro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(NUMERO_ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(NUMERO_DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(VERUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(FALSUS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
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
		enterRule(_localctx, 42, RULE_acceso_miembro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(VARIABLE);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUNTO:
					{
					setState(363);
					match(PUNTO);
					setState(364);
					match(VARIABLE);
					}
					break;
				case CORCHETE_IZQ:
					{
					setState(365);
					match(CORCHETE_IZQ);
					setState(366);
					expresion();
					setState(367);
					match(CORCHETE_DER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PUNTO || _la==CORCHETE_IZQ );
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
		enterRule(_localctx, 44, RULE_arreglo_acceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(VARIABLE);
			setState(374);
			match(CORCHETE_IZQ);
			setState(375);
			expresion();
			setState(376);
			match(CORCHETE_DER);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO) {
				{
				{
				setState(377);
				match(PUNTO);
				setState(378);
				match(VARIABLE);
				}
				}
				setState(383);
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
		enterRule(_localctx, 46, RULE_operacion_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		enterRule(_localctx, 48, RULE_reddere_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(REDDERE);
			setState(387);
			match(VARIABLE);
			setState(388);
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
		enterRule(_localctx, 50, RULE_maior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(MAIOR);
			setState(391);
			match(MAYOR_QUE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(392);
				sentencia();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(FINIS);
			setState(399);
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
		enterRule(_localctx, 52, RULE_sentencia);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				imprimir_sentencia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				leer_sentencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				asignacion_sentencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				si_sentencia();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				ciclo_dum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406);
				ciclo_facere();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				ciclo_per();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(408);
				salto_sentencia();
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
		enterRule(_localctx, 54, RULE_leer_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(411);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(412);
				acceso_miembro();
				}
				break;
			}
			setState(415);
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
		enterRule(_localctx, 56, RULE_asignacion_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(417);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(418);
				acceso_miembro();
				}
				break;
			}
			setState(421);
			match(ASIGNACION);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(422);
				expresion();
				}
				break;
			case 2:
				{
				setState(423);
				structura_instanciacion();
				}
				break;
			case 3:
				{
				setState(424);
				arreglo_literal();
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(427);
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
		enterRule(_localctx, 58, RULE_imprimir_sentencia);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(IMPRIMIR);
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(431);
				match(CADENA_TEXTO);
				}
				break;
			case 2:
				{
				setState(432);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(433);
				acceso_miembro();
				}
				break;
			case 4:
				{
				setState(434);
				llamada_funcion();
				}
				break;
			}
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					match(IMPRIMIR);
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(438);
						match(CADENA_TEXTO);
						}
						break;
					case 2:
						{
						setState(439);
						match(VARIABLE);
						}
						break;
					case 3:
						{
						setState(440);
						acceso_miembro();
						}
						break;
					case 4:
						{
						setState(441);
						llamada_funcion();
						}
						break;
					}
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(449);
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
		enterRule(_localctx, 60, RULE_si_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(SI);
			setState(453);
			match(PARENTESIS_IZQ);
			setState(454);
			condicion();
			setState(455);
			match(PARENTESIS_DER);
			setState(456);
			match(LLAVE_IZQ);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
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
			match(LLAVE_DER);
			setState(464);
			match(FINIS);
			setState(465);
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
		enterRule(_localctx, 62, RULE_ciclo_dum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(DUM);
			setState(468);
			match(PARENTESIS_IZQ);
			setState(469);
			condicion();
			setState(470);
			match(PARENTESIS_DER);
			setState(471);
			match(LLAVE_IZQ);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(472);
				sentencia();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(LLAVE_DER);
			setState(479);
			match(FINIS);
			setState(480);
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
		enterRule(_localctx, 64, RULE_ciclo_facere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(FACERE);
			setState(483);
			match(LLAVE_IZQ);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(484);
				sentencia();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(LLAVE_DER);
			setState(491);
			match(DUM);
			setState(492);
			match(PARENTESIS_IZQ);
			setState(493);
			condicion();
			setState(494);
			match(PARENTESIS_DER);
			setState(495);
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
		enterRule(_localctx, 66, RULE_ciclo_per);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(PER);
			setState(498);
			match(PARENTESIS_IZQ);
			setState(499);
			inicializacion_per();
			setState(500);
			condiciones_per();
			setState(501);
			match(PUNTO_COMA);
			setState(502);
			incremento_per();
			setState(503);
			match(PARENTESIS_DER);
			setState(504);
			match(LLAVE_IZQ);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503600701116320L) != 0)) {
				{
				{
				setState(505);
				sentencia();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
		enterRule(_localctx, 68, RULE_inicializacion_per);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(ESTO);
				setState(514);
				match(VARIABLE);
				setState(515);
				match(DOS_PUNTOS);
				setState(516);
				tipo_dato();
				setState(517);
				expresion();
				setState(518);
				match(PUNTO_COMA);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(VARIABLE);
				setState(521);
				match(ASIGNACION);
				setState(522);
				expresion();
				setState(523);
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
		enterRule(_localctx, 70, RULE_condiciones_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			condicion();
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
		enterRule(_localctx, 72, RULE_incremento_per);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(VARIABLE);
				setState(530);
				match(SUMA_ABREVIADA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(VARIABLE);
				setState(532);
				match(RESTA_ABREVIADA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(VARIABLE);
				setState(534);
				match(ASIGNACION);
				setState(535);
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
		enterRule(_localctx, 74, RULE_salto_sentencia);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(PERGE);
				setState(539);
				match(PUNTO_COMA);
				}
				break;
			case INTERRUMPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(INTERRUMPE);
				setState(541);
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
		enterRule(_localctx, 76, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			expresion();
			setState(545);
			operador_relacional();
			setState(546);
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
		enterRule(_localctx, 78, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		enterRule(_localctx, 80, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(VARIABLE);
			setState(551);
			match(PARENTESIS_IZQ);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197404176384L) != 0)) {
				{
				setState(552);
				argumentos();
				}
			}

			setState(555);
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
		enterRule(_localctx, 82, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			expresion();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(558);
				match(COMA);
				setState(559);
				expresion();
				}
				}
				setState(564);
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
		"\u0004\u0001;\u0236\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"X\b\u0001\n\u0001\f\u0001[\t\u0001\u0001\u0001\u0005\u0001^\b\u0001\n"+
		"\u0001\f\u0001a\t\u0001\u0001\u0001\u0005\u0001d\b\u0001\n\u0001\f\u0001"+
		"g\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002o\b\u0002\n\u0002\f\u0002r\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008b\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0092\b\u0003\u0003\u0003\u0094\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u0099\b\u0004\u000b\u0004\f\u0004\u009a\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00c2\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00cd\b\u0006\u0001\u0006\u0003\u0006\u00d0\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00e0\b\u0006\u0001\u0006\u0003\u0006\u00e3\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e8\b\u0007\n\u0007"+
		"\f\u0007\u00eb\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00f0\b\b\n\b\f"+
		"\b\u00f3\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00fa\b\t"+
		"\n\t\f\t\u00fd\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0105\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u010c\b\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0110\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0004\f\u0117\b\f\u000b\f\f\f\u0118\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0120\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0125\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0131\b\u000f\n"+
		"\u000f\f\u000f\u0134\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u013e"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0143\b\u0011"+
		"\u000b\u0011\f\u0011\u0144\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0157\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u015d\b\u0013\n\u0013\f\u0013\u0160\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0169\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0172\b\u0015\u000b\u0015\f"+
		"\u0015\u0173\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u017c\b\u0016\n\u0016\f\u0016\u017f\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u018a\b\u0019\n\u0019\f\u0019"+
		"\u018d\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u019a\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u019e\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01a4"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01aa"+
		"\b\u001c\u0001\u001c\u0003\u001c\u01ad\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b4\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01bb\b\u001d"+
		"\u0005\u001d\u01bd\b\u001d\n\u001d\f\u001d\u01c0\t\u001d\u0001\u001d\u0003"+
		"\u001d\u01c3\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01cb\b\u001e\n\u001e\f\u001e\u01ce\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01da\b\u001f"+
		"\n\u001f\f\u001f\u01dd\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0005 \u01e6\b \n \f \u01e9\t \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u01fb\b!\n!\f!\u01fe\t!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u020e\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0219\b$\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u021f\b%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0003(\u022a\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0005"+
		")\u0231\b)\n)\f)\u0234\t)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPR\u0000\u0005\u0001\u0000\u0019\u001a\u0001\u0000\u0016"+
		"\u0017\u0001\u0000\u0012\u0017\u0001\u0000%(\u0001\u0000).\u0259\u0000"+
		"T\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004j\u0001"+
		"\u0000\u0000\u0000\u0006\u0093\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000"+
		"\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00e2\u0001\u0000\u0000"+
		"\u0000\u000e\u00e4\u0001\u0000\u0000\u0000\u0010\u00ec\u0001\u0000\u0000"+
		"\u0000\u0012\u0104\u0001\u0000\u0000\u0000\u0014\u0106\u0001\u0000\u0000"+
		"\u0000\u0016\u010d\u0001\u0000\u0000\u0000\u0018\u0113\u0001\u0000\u0000"+
		"\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c\u012b\u0001\u0000\u0000"+
		"\u0000\u001e\u012d\u0001\u0000\u0000\u0000 \u013d\u0001\u0000\u0000\u0000"+
		"\"\u013f\u0001\u0000\u0000\u0000$\u0156\u0001\u0000\u0000\u0000&\u0158"+
		"\u0001\u0000\u0000\u0000(\u0168\u0001\u0000\u0000\u0000*\u016a\u0001\u0000"+
		"\u0000\u0000,\u0175\u0001\u0000\u0000\u0000.\u0180\u0001\u0000\u0000\u0000"+
		"0\u0182\u0001\u0000\u0000\u00002\u0186\u0001\u0000\u0000\u00004\u0199"+
		"\u0001\u0000\u0000\u00006\u019d\u0001\u0000\u0000\u00008\u01a3\u0001\u0000"+
		"\u0000\u0000:\u01ae\u0001\u0000\u0000\u0000<\u01c4\u0001\u0000\u0000\u0000"+
		">\u01d3\u0001\u0000\u0000\u0000@\u01e2\u0001\u0000\u0000\u0000B\u01f1"+
		"\u0001\u0000\u0000\u0000D\u020d\u0001\u0000\u0000\u0000F\u020f\u0001\u0000"+
		"\u0000\u0000H\u0218\u0001\u0000\u0000\u0000J\u021e\u0001\u0000\u0000\u0000"+
		"L\u0220\u0001\u0000\u0000\u0000N\u0224\u0001\u0000\u0000\u0000P\u0226"+
		"\u0001\u0000\u0000\u0000R\u022d\u0001\u0000\u0000\u0000TU\u0003\u0002"+
		"\u0001\u0000U\u0001\u0001\u0000\u0000\u0000VX\u0003\u0004\u0002\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z_\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\^\u0003\b\u0004\u0000]\\\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`e\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0003\u0018\f\u0000"+
		"cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u00032\u0019\u0000i\u0003\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0003\u0000\u0000kl\u00054\u0000\u0000lp\u0005#\u0000\u0000mo\u0003\u0006"+
		"\u0003\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000st\u0005$\u0000\u0000tu\u0005\u0004\u0000\u0000"+
		"uv\u0005\u0019\u0000\u0000v\u0005\u0001\u0000\u0000\u0000wx\u0005\u0001"+
		"\u0000\u0000xy\u00054\u0000\u0000yz\u0005\u0018\u0000\u0000z|\u0003\u001c"+
		"\u000e\u0000{}\u0007\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0094\u0001\u0000\u0000\u0000~\u007f\u0005\u0002\u0000"+
		"\u0000\u007f\u0080\u00054\u0000\u0000\u0080\u0081\u0005\u0018\u0000\u0000"+
		"\u0081\u0083\u0003\u001c\u000e\u0000\u0082\u0084\u0007\u0000\u0000\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0094\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000"+
		"\u0086\u0087\u00054\u0000\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088"+
		"\u008a\u00054\u0000\u0000\u0089\u008b\u0007\u0000\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0094"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e"+
		"\u00054\u0000\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f\u0091\u0005"+
		"4\u0000\u0000\u0090\u0092\u0007\u0000\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093w\u0001\u0000\u0000\u0000\u0093~\u0001\u0000\u0000\u0000"+
		"\u0093\u0085\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000"+
		"\u0094\u0007\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000"+
		"\u0096\u0098\u0005.\u0000\u0000\u0097\u0099\u0003\n\u0005\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\t\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u009e"+
		"\u00054\u0000\u0000\u009e\u009f\u0005\u0018\u0000\u0000\u009f\u00a0\u0005"+
		"\u0012\u0000\u0000\u00a0\u00a1\u00055\u0000\u0000\u00a1\u00c2\u0005\u0019"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a4\u00054\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0018\u0000\u0000\u00a5\u00a6\u0005\u0013\u0000"+
		"\u0000\u00a6\u00a7\u00057\u0000\u0000\u00a7\u00c2\u0005\u0019\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0001\u0000\u0000\u00a9\u00aa\u00054\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0018\u0000\u0000\u00ab\u00ac\u0005\u0014\u0000\u0000\u00ac"+
		"\u00ad\u00056\u0000\u0000\u00ad\u00c2\u0005\u0019\u0000\u0000\u00ae\u00af"+
		"\u0005\u0001\u0000\u0000\u00af\u00b0\u00054\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0018\u0000\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2\u00b3\u0005"+
		"8\u0000\u0000\u00b3\u00c2\u0005\u0019\u0000\u0000\u00b4\u00b5\u0005\u0001"+
		"\u0000\u0000\u00b5\u00b6\u00054\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000"+
		"\u0000\u00b7\u00b8\u0007\u0001\u0000\u0000\u00b8\u00c2\u0005\u0019\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000\u00ba\u00bb\u00054\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd\u00054\u0000\u0000\u00bd"+
		"\u00be\u0003\u0012\t\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\f\u0006\u0000\u00c1\u009c\u0001"+
		"\u0000\u0000\u0000\u00c1\u00a2\u0001\u0000\u0000\u0000\u00c1\u00a8\u0001"+
		"\u0000\u0000\u0000\u00c1\u00ae\u0001\u0000\u0000\u0000\u00c1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u000b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0002\u0000\u0000\u00c4\u00c5\u00054\u0000\u0000\u00c5\u00c6\u0005!\u0000"+
		"\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00c8\u0005\"\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0018\u0000\u0000\u00c9\u00cf\u0003\u001c\u000e\u0000"+
		"\u00ca\u00cc\u0005#\u0000\u0000\u00cb\u00cd\u0003\u000e\u0007\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005$\u0000\u0000\u00cf\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4\u00d5"+
		"\u00054\u0000\u0000\u00d5\u00d6\u0005!\u0000\u0000\u00d6\u00d7\u00055"+
		"\u0000\u0000\u00d7\u00d8\u0005\"\u0000\u0000\u00d8\u00d9\u0005\u0018\u0000"+
		"\u0000\u00d9\u00df\u00054\u0000\u0000\u00da\u00dc\u0005#\u0000\u0000\u00db"+
		"\u00dd\u0003\u0010\b\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0005$\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005"+
		"\u0019\u0000\u0000\u00e2\u00c3\u0001\u0000\u0000\u0000\u00e2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00e9\u0003&"+
		"\u0013\u0000\u00e5\u00e6\u0005\u001a\u0000\u0000\u00e6\u00e8\u0003&\u0013"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u000f\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f1\u0003\u0012\t\u0000\u00ed\u00ee\u0005\u001a\u0000\u0000"+
		"\u00ee\u00f0\u0003\u0012\t\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u0011\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u00054\u0000\u0000\u00f5\u00f6"+
		"\u0005#\u0000\u0000\u00f6\u00fb\u0003\u0014\n\u0000\u00f7\u00f8\u0005"+
		"\u001a\u0000\u0000\u00f8\u00fa\u0003\u0014\n\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005$\u0000"+
		"\u0000\u00ff\u0105\u0001\u0000\u0000\u0000\u0100\u0101\u00054\u0000\u0000"+
		"\u0101\u0102\u0005!\u0000\u0000\u0102\u0103\u00055\u0000\u0000\u0103\u0105"+
		"\u0005\"\u0000\u0000\u0104\u00f4\u0001\u0000\u0000\u0000\u0104\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0013\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"4\u0000\u0000\u0107\u010b\u0005\u0018\u0000\u0000\u0108\u010c\u0003&\u0013"+
		"\u0000\u0109\u010c\u0003\u0012\t\u0000\u010a\u010c\u0003\u0016\u000b\u0000"+
		"\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u0015\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0005#\u0000\u0000\u010e\u0110\u0003\u000e\u0007\u0000\u010f"+
		"\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005$\u0000\u0000\u0112\u0017"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0010\u0000\u0000\u0114\u0116"+
		"\u0005.\u0000\u0000\u0115\u0117\u0003\u001a\r\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0019\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\r\u0000\u0000\u011b\u011c\u0003\u001c"+
		"\u000e\u0000\u011c\u011d\u00054\u0000\u0000\u011d\u011f\u0005\u001f\u0000"+
		"\u0000\u011e\u0120\u0003\u001e\u000f\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005 \u0000\u0000\u0122\u0124\u0005#\u0000\u0000\u0123"+
		"\u0125\u0003\"\u0011\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u00030\u0018\u0000\u0127\u0128\u0005$\u0000\u0000\u0128\u0129\u0005\u0004"+
		"\u0000\u0000\u0129\u012a\u0005\u0019\u0000\u0000\u012a\u001b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0007\u0002\u0000\u0000\u012c\u001d\u0001\u0000"+
		"\u0000\u0000\u012d\u0132\u0003 \u0010\u0000\u012e\u012f\u0005\u001a\u0000"+
		"\u0000\u012f\u0131\u0003 \u0010\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u001f\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0001\u0000\u0000"+
		"\u0136\u0137\u00054\u0000\u0000\u0137\u0138\u0005\u0018\u0000\u0000\u0138"+
		"\u013e\u0003\u001c\u000e\u0000\u0139\u013a\u0005\u0001\u0000\u0000\u013a"+
		"\u013b\u00054\u0000\u0000\u013b\u013c\u0005\u0018\u0000\u0000\u013c\u013e"+
		"\u00054\u0000\u0000\u013d\u0135\u0001\u0000\u0000\u0000\u013d\u0139\u0001"+
		"\u0000\u0000\u0000\u013e!\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u000f"+
		"\u0000\u0000\u0140\u0142\u0005!\u0000\u0000\u0141\u0143\u0003$\u0012\u0000"+
		"\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005\"\u0000\u0000\u0147"+
		"#\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u0001\u0000\u0000\u0149\u014a"+
		"\u00054\u0000\u0000\u014a\u014b\u0005\u0018\u0000\u0000\u014b\u014c\u0003"+
		"\u001c\u000e\u0000\u014c\u014d\u0003&\u0013\u0000\u014d\u014e\u0005\u0019"+
		"\u0000\u0000\u014e\u0157\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0001"+
		"\u0000\u0000\u0150\u0151\u00054\u0000\u0000\u0151\u0152\u0005\u0018\u0000"+
		"\u0000\u0152\u0153\u00054\u0000\u0000\u0153\u0154\u0003\u0012\t\u0000"+
		"\u0154\u0155\u0005\u0019\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000"+
		"\u0156\u0148\u0001\u0000\u0000\u0000\u0156\u014f\u0001\u0000\u0000\u0000"+
		"\u0157%\u0001\u0000\u0000\u0000\u0158\u015e\u0003(\u0014\u0000\u0159\u015a"+
		"\u0003.\u0017\u0000\u015a\u015b\u0003(\u0014\u0000\u015b\u015d\u0001\u0000"+
		"\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\'\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0161\u0169\u00054\u0000\u0000\u0162\u0169\u0003*\u0015\u0000\u0163"+
		"\u0169\u00055\u0000\u0000\u0164\u0169\u00056\u0000\u0000\u0165\u0169\u0005"+
		"\u0016\u0000\u0000\u0166\u0169\u0005\u0017\u0000\u0000\u0167\u0169\u0003"+
		"P(\u0000\u0168\u0161\u0001\u0000\u0000\u0000\u0168\u0162\u0001\u0000\u0000"+
		"\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000"+
		"\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169)\u0001\u0000\u0000\u0000"+
		"\u016a\u0171\u00054\u0000\u0000\u016b\u016c\u0005\u001c\u0000\u0000\u016c"+
		"\u0172\u00054\u0000\u0000\u016d\u016e\u0005!\u0000\u0000\u016e\u016f\u0003"+
		"&\u0013\u0000\u016f\u0170\u0005\"\u0000\u0000\u0170\u0172\u0001\u0000"+
		"\u0000\u0000\u0171\u016b\u0001\u0000\u0000\u0000\u0171\u016d\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174+\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u00054\u0000\u0000\u0176\u0177\u0005!\u0000\u0000\u0177"+
		"\u0178\u0003&\u0013\u0000\u0178\u017d\u0005\"\u0000\u0000\u0179\u017a"+
		"\u0005\u001c\u0000\u0000\u017a\u017c\u00054\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e-\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0007\u0003"+
		"\u0000\u0000\u0181/\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u000e\u0000"+
		"\u0000\u0183\u0184\u00054\u0000\u0000\u0184\u0185\u0005\u0019\u0000\u0000"+
		"\u01851\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0011\u0000\u0000\u0187"+
		"\u018b\u0005.\u0000\u0000\u0188\u018a\u00034\u001a\u0000\u0189\u0188\u0001"+
		"\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0001"+
		"\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"\u0004\u0000\u0000\u018f\u0190\u0005\u0019\u0000\u0000\u01903\u0001\u0000"+
		"\u0000\u0000\u0191\u019a\u0003:\u001d\u0000\u0192\u019a\u00036\u001b\u0000"+
		"\u0193\u019a\u00038\u001c\u0000\u0194\u019a\u0003<\u001e\u0000\u0195\u019a"+
		"\u0003>\u001f\u0000\u0196\u019a\u0003@ \u0000\u0197\u019a\u0003B!\u0000"+
		"\u0198\u019a\u0003J%\u0000\u0199\u0191\u0001\u0000\u0000\u0000\u0199\u0192"+
		"\u0001\u0000\u0000\u0000\u0199\u0193\u0001\u0000\u0000\u0000\u0199\u0194"+
		"\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000\u0199\u0196"+
		"\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u019a5\u0001\u0000\u0000\u0000\u019b\u019e\u0005"+
		"4\u0000\u0000\u019c\u019e\u0003*\u0015\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0005\u001d\u0000\u0000\u01a07\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a4\u00054\u0000\u0000\u01a2\u01a4\u0003*\u0015\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a9\u0005\u001b\u0000\u0000\u01a6\u01aa"+
		"\u0003&\u0013\u0000\u01a7\u01aa\u0003\u0012\t\u0000\u01a8\u01aa\u0003"+
		"\u0016\u000b\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0005\u0019\u0000\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad9\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b3\u0005\u001e\u0000\u0000\u01af\u01b4\u00057\u0000"+
		"\u0000\u01b0\u01b4\u00054\u0000\u0000\u01b1\u01b4\u0003*\u0015\u0000\u01b2"+
		"\u01b4\u0003P(\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4\u01be\u0001\u0000\u0000\u0000\u01b5\u01ba\u0005"+
		"\u001e\u0000\u0000\u01b6\u01bb\u00057\u0000\u0000\u01b7\u01bb\u00054\u0000"+
		"\u0000\u01b8\u01bb\u0003*\u0015\u0000\u01b9\u01bb\u0003P(\u0000\u01ba"+
		"\u01b6\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b5\u0001\u0000\u0000\u0000\u01bd"+
		"\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\u0019\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		";\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0005\u0000\u0000\u01c5\u01c6"+
		"\u0005\u001f\u0000\u0000\u01c6\u01c7\u0003L&\u0000\u01c7\u01c8\u0005 "+
		"\u0000\u0000\u01c8\u01cc\u0005#\u0000\u0000\u01c9\u01cb\u00034\u001a\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0005$\u0000\u0000\u01d0\u01d1\u0005\u0004\u0000\u0000\u01d1"+
		"\u01d2\u0005\u0019\u0000\u0000\u01d2=\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0007\u0000\u0000\u01d4\u01d5\u0005\u001f\u0000\u0000\u01d5\u01d6"+
		"\u0003L&\u0000\u01d6\u01d7\u0005 \u0000\u0000\u01d7\u01db\u0005#\u0000"+
		"\u0000\u01d8\u01da\u00034\u001a\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000"+
		"\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01df\u0005$\u0000\u0000\u01df"+
		"\u01e0\u0005\u0004\u0000\u0000\u01e0\u01e1\u0005\u0019\u0000\u0000\u01e1"+
		"?\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\b\u0000\u0000\u01e3\u01e7"+
		"\u0005#\u0000\u0000\u01e4\u01e6\u00034\u001a\u0000\u01e5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005$\u0000"+
		"\u0000\u01eb\u01ec\u0005\u0007\u0000\u0000\u01ec\u01ed\u0005\u001f\u0000"+
		"\u0000\u01ed\u01ee\u0003L&\u0000\u01ee\u01ef\u0005 \u0000\u0000\u01ef"+
		"\u01f0\u0005\u0019\u0000\u0000\u01f0A\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005\t\u0000\u0000\u01f2\u01f3\u0005\u001f\u0000\u0000\u01f3\u01f4\u0003"+
		"D\"\u0000\u01f4\u01f5\u0003F#\u0000\u01f5\u01f6\u0005\u0019\u0000\u0000"+
		"\u01f6\u01f7\u0003H$\u0000\u01f7\u01f8\u0005 \u0000\u0000\u01f8\u01fc"+
		"\u0005#\u0000\u0000\u01f9\u01fb\u00034\u001a\u0000\u01fa\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005$\u0000"+
		"\u0000\u0200C\u0001\u0000\u0000\u0000\u0201\u0202\u0005\u0001\u0000\u0000"+
		"\u0202\u0203\u00054\u0000\u0000\u0203\u0204\u0005\u0018\u0000\u0000\u0204"+
		"\u0205\u0003\u001c\u000e\u0000\u0205\u0206\u0003&\u0013\u0000\u0206\u0207"+
		"\u0005\u0019\u0000\u0000\u0207\u020e\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u00054\u0000\u0000\u0209\u020a\u0005\u001b\u0000\u0000\u020a\u020b\u0003"+
		"&\u0013\u0000\u020b\u020c\u0005\u0019\u0000\u0000\u020c\u020e\u0001\u0000"+
		"\u0000\u0000\u020d\u0201\u0001\u0000\u0000\u0000\u020d\u0208\u0001\u0000"+
		"\u0000\u0000\u020eE\u0001\u0000\u0000\u0000\u020f\u0210\u0003L&\u0000"+
		"\u0210G\u0001\u0000\u0000\u0000\u0211\u0212\u00054\u0000\u0000\u0212\u0219"+
		"\u00052\u0000\u0000\u0213\u0214\u00054\u0000\u0000\u0214\u0219\u00053"+
		"\u0000\u0000\u0215\u0216\u00054\u0000\u0000\u0216\u0217\u0005\u001b\u0000"+
		"\u0000\u0217\u0219\u0003&\u0013\u0000\u0218\u0211\u0001\u0000\u0000\u0000"+
		"\u0218\u0213\u0001\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000"+
		"\u0219I\u0001\u0000\u0000\u0000\u021a\u021b\u0005\n\u0000\u0000\u021b"+
		"\u021f\u0005\u0019\u0000\u0000\u021c\u021d\u0005\u000b\u0000\u0000\u021d"+
		"\u021f\u0005\u0019\u0000\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e"+
		"\u021c\u0001\u0000\u0000\u0000\u021fK\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0003&\u0013\u0000\u0221\u0222\u0003N\'\u0000\u0222\u0223\u0003&\u0013"+
		"\u0000\u0223M\u0001\u0000\u0000\u0000\u0224\u0225\u0007\u0004\u0000\u0000"+
		"\u0225O\u0001\u0000\u0000\u0000\u0226\u0227\u00054\u0000\u0000\u0227\u0229"+
		"\u0005\u001f\u0000\u0000\u0228\u022a\u0003R)\u0000\u0229\u0228\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005 \u0000\u0000\u022cQ\u0001\u0000\u0000\u0000"+
		"\u022d\u0232\u0003&\u0013\u0000\u022e\u022f\u0005\u001a\u0000\u0000\u022f"+
		"\u0231\u0003&\u0013\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0234"+
		"\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0001\u0000\u0000\u0000\u0233S\u0001\u0000\u0000\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u00005Y_ep|\u0083\u008a\u0091\u0093\u009a\u00c1\u00cc\u00cf"+
		"\u00dc\u00df\u00e2\u00e9\u00f1\u00fb\u0104\u010b\u010f\u0118\u011f\u0124"+
		"\u0132\u013d\u0144\u0156\u015e\u0168\u0171\u0173\u017d\u018b\u0199\u019d"+
		"\u01a3\u01a9\u01ac\u01b3\u01ba\u01be\u01c2\u01cc\u01db\u01e7\u01fc\u020d"+
		"\u0218\u021e\u0229\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}