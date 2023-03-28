// Generated from JailBreakLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JailBreakLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, COMMENT=34, ID=35, RAND=36, INT=37, WS=38;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_objects = 2, RULE_commands = 3, RULE_function_declaration = 4, 
		RULE_wyrazenia = 5, RULE_guard_extra_code = 6, RULE_guard_control = 7, 
		RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "commands", "function_declaration", "wyrazenia", 
			"guard_extra_code", "guard_control", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'='", "','", "'PLAYER'", "'EXIT'", "'WALL'", "'TRAP'", 
			"'KEY'", "'GATE'", "'GUARD'", "'{'", "'}'", "'IF'", "'('", "')'", "'WHILE'", 
			"'FOR'", "'IN'", "'FUN'", "'DIRECTION'", "'TURNLEFT'", "'TURNRIGHT'", 
			"'STEP'", "'IFWALL'", "'IFDIRECTION'", "'IFGUARD'", "'IFTRAP'", "'IFGATE'", 
			"'NO'", "'TRUE'", "'FALSE'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "COMMENT", 
			"ID", "RAND", "INT", "WS"
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
	public String getGrammarFileName() { return "JailBreakLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JailBreakLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(JailBreakLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JailBreakLangParser.INT, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
			setState(20);
			match(INT);
			setState(21);
			match(T__2);
			setState(22);
			match(INT);
			setState(23);
			match(T__3);
			setState(24);
			match(T__1);
			setState(25);
			match(INT);
			setState(26);
			match(T__2);
			setState(27);
			match(INT);
			setState(28);
			match(T__4);
			setState(29);
			match(T__1);
			setState(30);
			match(INT);
			setState(31);
			match(T__2);
			setState(32);
			match(INT);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360469440L) != 0)) {
				{
				{
				setState(33);
				code();
				}
				}
				setState(38);
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
	public static class CodeContext extends ParserRuleContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				objects();
				}
				break;
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				commands();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				function_declaration();
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
	public static class ObjectsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(JailBreakLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JailBreakLangParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public List<TerminalNode> RAND() { return getTokens(JailBreakLangParser.RAND); }
		public TerminalNode RAND(int i) {
			return getToken(JailBreakLangParser.RAND, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<Guard_extra_codeContext> guard_extra_code() {
			return getRuleContexts(Guard_extra_codeContext.class);
		}
		public Guard_extra_codeContext guard_extra_code(int i) {
			return getRuleContext(Guard_extra_codeContext.class,i);
		}
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitObjects(this);
		}
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objects);
		int _la;
		try {
			int _alt;
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__5);
				setState(45);
				match(T__1);
				setState(46);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				match(T__2);
				setState(48);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(T__1);
				setState(51);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				match(T__2);
				setState(53);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(T__1);
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				match(T__2);
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(T__8);
				setState(60);
				match(T__1);
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				match(T__2);
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(T__9);
				setState(65);
				match(T__1);
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				match(T__2);
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				match(T__2);
				setState(70);
				match(INT);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						code();
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(77);
				match(T__9);
				setState(78);
				match(INT);
				setState(79);
				match(T__10);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34375671808L) != 0)) {
					{
					{
					setState(80);
					guard_extra_code();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__11);
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
	public static class CommandsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<WyrazeniaContext> wyrazenia() {
			return getRuleContexts(WyrazeniaContext.class);
		}
		public WyrazeniaContext wyrazenia(int i) {
			return getRuleContext(WyrazeniaContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public TerminalNode INT() { return getToken(JailBreakLangParser.INT, 0); }
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commands);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__12);
				setState(90);
				match(T__13);
				setState(91);
				condition(0);
				setState(92);
				match(T__14);
				setState(93);
				match(T__10);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359945152L) != 0)) {
					{
					{
					setState(94);
					wyrazenia();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(T__11);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__15);
				setState(103);
				match(T__13);
				setState(104);
				condition(0);
				setState(105);
				match(T__14);
				setState(106);
				match(T__10);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359945152L) != 0)) {
					{
					{
					setState(107);
					wyrazenia();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__11);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__16);
				setState(116);
				match(T__13);
				setState(117);
				match(ID);
				setState(118);
				match(T__17);
				setState(119);
				match(INT);
				setState(120);
				match(T__14);
				setState(121);
				match(T__10);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359945152L) != 0)) {
					{
					{
					setState(122);
					wyrazenia();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__11);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(ID);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(130);
					match(T__13);
					setState(131);
					match(ID);
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(132);
						match(T__2);
						setState(133);
						match(ID);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(139);
					match(T__14);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public List<WyrazeniaContext> wyrazenia() {
			return getRuleContexts(WyrazeniaContext.class);
		}
		public WyrazeniaContext wyrazenia(int i) {
			return getRuleContext(WyrazeniaContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__18);
			setState(148);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(149);
				match(T__13);
				setState(150);
				match(ID);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(151);
					match(T__2);
					setState(152);
					match(ID);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__14);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__10);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359945152L) != 0)) {
				{
				{
				setState(165);
				wyrazenia();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__11);
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
	public static class WyrazeniaContext extends ParserRuleContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public WyrazeniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterWyrazenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitWyrazenia(this);
		}
	}

	public final WyrazeniaContext wyrazenia() throws RecognitionException {
		WyrazeniaContext _localctx = new WyrazeniaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wyrazenia);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				objects();
				}
				break;
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				commands();
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
	public static class Guard_extra_codeContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Guard_controlContext guard_control() {
			return getRuleContext(Guard_controlContext.class,0);
		}
		public Guard_extra_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_extra_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterGuard_extra_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitGuard_extra_code(this);
		}
	}

	public final Guard_extra_codeContext guard_extra_code() throws RecognitionException {
		Guard_extra_codeContext _localctx = new Guard_extra_codeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_guard_extra_code);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				commands();
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				guard_control();
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
	public static class Guard_controlContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JailBreakLangParser.INT, 0); }
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public Guard_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterGuard_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitGuard_control(this);
		}
	}

	public final Guard_controlContext guard_control() throws RecognitionException {
		Guard_controlContext _localctx = new Guard_controlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_guard_control);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__19);
				setState(182);
				match(T__1);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(T__22);
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JailBreakLangParser.INT, 0); }
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JailBreakLangListener ) ((JailBreakLangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(190);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(191);
				match(T__24);
				setState(192);
				match(T__1);
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__25:
				{
				setState(194);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(195);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(196);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(197);
				match(T__28);
				setState(198);
				condition(6);
				}
				break;
			case T__29:
				{
				setState(199);
				match(T__29);
				}
				break;
			case T__30:
				{
				setState(200);
				match(T__30);
				}
				break;
			case T__13:
				{
				setState(201);
				match(T__13);
				setState(202);
				condition(0);
				setState(203);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(T__31);
						setState(209);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(T__32);
						setState(212);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"#\b\u0000\n\u0000\f\u0000&\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001+\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002"+
		"\u0001\u0002\u0003\u0002X\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003`\b\u0003\n\u0003\f\u0003"+
		"c\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003m\b\u0003\n\u0003\f\u0003"+
		"p\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"|\b\u0003\n\u0003\f\u0003\u007f\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0087\b\u0003\n"+
		"\u0003\f\u0003\u008a\t\u0003\u0001\u0003\u0005\u0003\u008d\b\u0003\n\u0003"+
		"\f\u0003\u0090\t\u0003\u0003\u0003\u0092\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009a\b\u0004"+
		"\n\u0004\f\u0004\u009d\t\u0004\u0001\u0004\u0005\u0004\u00a0\b\u0004\n"+
		"\u0004\f\u0004\u00a3\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a7"+
		"\b\u0004\n\u0004\f\u0004\u00aa\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b4\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00bc\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ce\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00d6\b\b\n\b\f\b\u00d9\t\b\u0001\b\u0000\u0001"+
		"\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000"+
		"#%\u0002\u0000##%%\u00f4\u0000\u0012\u0001\u0000\u0000\u0000\u0002*\u0001"+
		"\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006\u0091\u0001\u0000"+
		"\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000"+
		"\u0000\f\u00b3\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000"+
		"\u0010\u00cd\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000"+
		"\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0015\u0005%\u0000\u0000\u0015"+
		"\u0016\u0005\u0003\u0000\u0000\u0016\u0017\u0005%\u0000\u0000\u0017\u0018"+
		"\u0005\u0004\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a"+
		"\u0005%\u0000\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0005"+
		"%\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u001e\u0005\u0002"+
		"\u0000\u0000\u001e\u001f\u0005%\u0000\u0000\u001f \u0005\u0003\u0000\u0000"+
		" $\u0005%\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001\u0000\u0000\u0000"+
		"#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'+\u0003"+
		"\u0004\u0002\u0000(+\u0003\u0006\u0003\u0000)+\u0003\b\u0004\u0000*\'"+
		"\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000-.\u0005"+
		"\u0002\u0000\u0000./\u0007\u0000\u0000\u0000/0\u0005\u0003\u0000\u0000"+
		"0X\u0007\u0000\u0000\u000012\u0005\u0007\u0000\u000023\u0005\u0002\u0000"+
		"\u000034\u0007\u0000\u0000\u000045\u0005\u0003\u0000\u00005X\u0007\u0000"+
		"\u0000\u000067\u0005\b\u0000\u000078\u0005\u0002\u0000\u000089\u0007\u0001"+
		"\u0000\u00009:\u0005\u0003\u0000\u0000:X\u0007\u0001\u0000\u0000;<\u0005"+
		"\t\u0000\u0000<=\u0005\u0002\u0000\u0000=>\u0007\u0001\u0000\u0000>?\u0005"+
		"\u0003\u0000\u0000?X\u0007\u0001\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005"+
		"\u0002\u0000\u0000BC\u0007\u0001\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DE\u0007\u0001\u0000\u0000EF\u0005\u0003\u0000\u0000FJ\u0005%\u0000\u0000"+
		"GI\u0003\u0002\u0001\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO\u0005%"+
		"\u0000\u0000OS\u0005\u000b\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VX\u0005\f\u0000\u0000W,\u0001\u0000\u0000\u0000W1\u0001\u0000\u0000\u0000"+
		"W6\u0001\u0000\u0000\u0000W;\u0001\u0000\u0000\u0000W@\u0001\u0000\u0000"+
		"\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0005\r\u0000\u0000Z[\u0005\u000e"+
		"\u0000\u0000[\\\u0003\u0010\b\u0000\\]\u0005\u000f\u0000\u0000]a\u0005"+
		"\u000b\u0000\u0000^`\u0003\n\u0005\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\f\u0000\u0000"+
		"e\u0092\u0001\u0000\u0000\u0000fg\u0005\u0010\u0000\u0000gh\u0005\u000e"+
		"\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u000f\u0000\u0000jn\u0005\u000b"+
		"\u0000\u0000km\u0003\n\u0005\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\f\u0000\u0000r\u0092"+
		"\u0001\u0000\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005\u000e\u0000"+
		"\u0000uv\u0005#\u0000\u0000vw\u0005\u0012\u0000\u0000wx\u0005%\u0000\u0000"+
		"xy\u0005\u000f\u0000\u0000y}\u0005\u000b\u0000\u0000z|\u0003\n\u0005\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0092\u0005\f\u0000\u0000\u0081"+
		"\u008e\u0005#\u0000\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0088"+
		"\u0005#\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0087\u0005"+
		"#\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0005\u000f\u0000\u0000\u008c\u0082\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091Y\u0001\u0000\u0000"+
		"\u0000\u0091f\u0001\u0000\u0000\u0000\u0091s\u0001\u0000\u0000\u0000\u0091"+
		"\u0081\u0001\u0000\u0000\u0000\u0092\u0007\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u0013\u0000\u0000\u0094\u00a1\u0005#\u0000\u0000\u0095\u0096"+
		"\u0005\u000e\u0000\u0000\u0096\u009b\u0005#\u0000\u0000\u0097\u0098\u0005"+
		"\u0003\u0000\u0000\u0098\u009a\u0005#\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u000f"+
		"\u0000\u0000\u009f\u0095\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a8\u0005\u000b\u0000\u0000\u00a5\u00a7\u0003\n\u0005"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0003\u0004\u0002\u0000\u00ae\u00b0\u0003\u0006\u0003\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00b4\u0003\u0006\u0003\u0000"+
		"\u00b2\u00b4\u0003\u000e\u0007\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\r\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0014\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7"+
		"\u00bc\u0007\u0001\u0000\u0000\u00b8\u00bc\u0005\u0015\u0000\u0000\u00b9"+
		"\u00bc\u0005\u0016\u0000\u0000\u00ba\u00bc\u0005\u0017\u0000\u0000\u00bb"+
		"\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u000f\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\b\uffff\uffff\u0000\u00be"+
		"\u00ce\u0005\u0018\u0000\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0002\u0000\u0000\u00c1\u00ce\u0007\u0001\u0000\u0000\u00c2"+
		"\u00ce\u0005\u001a\u0000\u0000\u00c3\u00ce\u0005\u001b\u0000\u0000\u00c4"+
		"\u00ce\u0005\u001c\u0000\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000\u00c6"+
		"\u00ce\u0003\u0010\b\u0006\u00c7\u00ce\u0005\u001e\u0000\u0000\u00c8\u00ce"+
		"\u0005\u001f\u0000\u0000\u00c9\u00ca\u0005\u000e\u0000\u0000\u00ca\u00cb"+
		"\u0003\u0010\b\u0000\u00cb\u00cc\u0005\u000f\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00bd\u0001\u0000\u0000\u0000\u00cd\u00bf\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000\u00cd\u00c3\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00ce\u00d7\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\n\u0003\u0000\u0000\u00d0\u00d1\u0005 "+
		"\u0000\u0000\u00d1\u00d6\u0003\u0010\b\u0004\u00d2\u00d3\n\u0002\u0000"+
		"\u0000\u00d3\u00d4\u0005!\u0000\u0000\u00d4\u00d6\u0003\u0010\b\u0003"+
		"\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0011\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u0014$*JSWan}\u0088\u008e\u0091\u009b"+
		"\u00a1\u00a8\u00af\u00b3\u00bb\u00cd\u00d5\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}