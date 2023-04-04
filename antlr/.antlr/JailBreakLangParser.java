// Generated from /home/lenovo/Projects/Int/Interpreter-Project/antlr/JailBreakLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JailBreakLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_expressions = 5, RULE_guard_extra_code = 6, RULE_guard_control = 7, 
		RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "commands", "function_declaration", "expressions", 
			"guard_extra_code", "guard_control", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WALL'", "'='", "','", "'TRAP'", "'KEY'", "'GATE'", "'GUARD'", 
			"'{'", "'}'", "'MAP'", "'PLAYER'", "'EXIT'", "'IF'", "'('", "')'", "'WHILE'", 
			"'FOR'", "'IN'", "'FUN'", "'LEFT'", "'RIGHT'", "'UP'", "'DOWN'", "'IFWALL'", 
			"'IFDIRECTION'", "'IFGUARD'", "'IFTRAP'", "'IFGATE'", "'NO'", "'TRUE'", 
			"'FALSE'", "'AND'", "'OR'"
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JailBreakLangParser.EOF, 0); }
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				code();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0) );
			setState(23);
			match(EOF);
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
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				objects();
				}
				break;
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				commands();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
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
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objects);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				setState(31);
				match(T__1);
				setState(32);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << RAND) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				match(T__2);
				setState(34);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << RAND) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__3);
				setState(36);
				match(T__1);
				setState(37);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << RAND) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				match(T__2);
				setState(39);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << RAND) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__4);
				setState(41);
				match(T__1);
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				match(T__2);
				setState(44);
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
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(T__5);
				setState(46);
				match(T__1);
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				match(T__2);
				setState(49);
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
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__6);
				setState(51);
				match(T__1);
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				match(T__2);
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				match(T__2);
				setState(56);
				match(INT);
				setState(57);
				match(T__7);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << ID))) != 0)) {
					{
					{
					setState(58);
					guard_extra_code();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(T__9);
				setState(66);
				match(T__1);
				setState(67);
				match(INT);
				setState(68);
				match(T__2);
				setState(69);
				match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				match(T__10);
				setState(71);
				match(T__1);
				setState(72);
				match(INT);
				setState(73);
				match(T__2);
				setState(74);
				match(INT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(T__11);
				setState(76);
				match(T__1);
				setState(77);
				match(INT);
				setState(78);
				match(T__2);
				setState(79);
				match(INT);
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

	public static class CommandsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
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
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commands);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__12);
				setState(83);
				match(T__13);
				setState(84);
				condition(0);
				setState(85);
				match(T__14);
				setState(86);
				match(T__7);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(87);
					expressions();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__8);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__15);
				setState(96);
				match(T__13);
				setState(97);
				condition(0);
				setState(98);
				match(T__14);
				setState(99);
				match(T__7);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					expressions();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__8);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__16);
				setState(109);
				match(T__13);
				setState(110);
				match(ID);
				setState(111);
				match(T__17);
				setState(112);
				match(INT);
				setState(113);
				match(T__14);
				setState(114);
				match(T__7);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(115);
					expressions();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(123);
					match(T__13);
					setState(124);
					match(ID);
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(125);
						match(T__2);
						setState(126);
						match(ID);
						}
						}
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(132);
					match(T__14);
					}
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

	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__18);
			setState(138);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(139);
				match(T__13);
				setState(140);
				match(ID);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(141);
					match(T__2);
					setState(142);
					match(ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__14);
				}
			}

			setState(151);
			match(T__7);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				expressions();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__8);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressions);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				objects();
				}
				break;
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
	}

	public final Guard_extra_codeContext guard_extra_code() throws RecognitionException {
		Guard_extra_codeContext _localctx = new Guard_extra_codeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_guard_extra_code);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				commands();
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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

	public static class Guard_controlContext extends ParserRuleContext {
		public Guard_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_control; }
	}

	public final Guard_controlContext guard_control() throws RecognitionException {
		Guard_controlContext _localctx = new Guard_controlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_guard_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(171);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(172);
				match(T__24);
				setState(173);
				match(T__1);
				setState(174);
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
				setState(175);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(176);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(177);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(178);
				match(T__28);
				setState(179);
				condition(6);
				}
				break;
			case T__29:
				{
				setState(180);
				match(T__29);
				}
				break;
			case T__30:
				{
				setState(181);
				match(T__30);
				}
				break;
			case T__13:
				{
				setState(182);
				match(T__13);
				setState(183);
				condition(0);
				setState(184);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						match(T__31);
						setState(190);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(192);
						match(T__32);
						setState(193);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\26\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5h"+
		"\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5w\n\5\f"+
		"\5\16\5z\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13"+
		"\5\3\5\5\5\u0088\n\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0092\n"+
		"\6\f\6\16\6\u0095\13\6\3\6\5\6\u0098\n\6\3\6\3\6\7\6\u009c\n\6\f\6\16"+
		"\6\u009f\13\6\3\6\3\6\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\5\b\u00a9\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n"+
		"\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\5\3\2%\'\4\2%%\'\'\3\2\26\31\2\u00e2"+
		"\2\25\3\2\2\2\4\36\3\2\2\2\6R\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2"+
		"\f\u00a4\3\2\2\2\16\u00a8\3\2\2\2\20\u00aa\3\2\2\2\22\u00bc\3\2\2\2\24"+
		"\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\37\5\6\4\2\34\37\5\b\5\2\35"+
		"\37\5\n\6\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7"+
		"\3\2\2!\"\7\4\2\2\"#\t\2\2\2#$\7\5\2\2$S\t\2\2\2%&\7\6\2\2&\'\7\4\2\2"+
		"\'(\t\2\2\2()\7\5\2\2)S\t\2\2\2*+\7\7\2\2+,\7\4\2\2,-\t\3\2\2-.\7\5\2"+
		"\2.S\t\3\2\2/\60\7\b\2\2\60\61\7\4\2\2\61\62\t\3\2\2\62\63\7\5\2\2\63"+
		"S\t\3\2\2\64\65\7\t\2\2\65\66\7\4\2\2\66\67\t\3\2\2\678\7\5\2\289\t\3"+
		"\2\29:\7\5\2\2:;\7\'\2\2;?\7\n\2\2<>\5\16\b\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BS\7\13\2\2CD\7\f\2\2DE\7\4\2\2EF"+
		"\7\'\2\2FG\7\5\2\2GS\7\'\2\2HI\7\r\2\2IJ\7\4\2\2JK\7\'\2\2KL\7\5\2\2L"+
		"S\7\'\2\2MN\7\16\2\2NO\7\4\2\2OP\7\'\2\2PQ\7\5\2\2QS\7\'\2\2R \3\2\2\2"+
		"R%\3\2\2\2R*\3\2\2\2R/\3\2\2\2R\64\3\2\2\2RC\3\2\2\2RH\3\2\2\2RM\3\2\2"+
		"\2S\7\3\2\2\2TU\7\17\2\2UV\7\20\2\2VW\5\22\n\2WX\7\21\2\2X\\\7\n\2\2Y"+
		"[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2"+
		"\2_`\7\13\2\2`\u008a\3\2\2\2ab\7\22\2\2bc\7\20\2\2cd\5\22\n\2de\7\21\2"+
		"\2ei\7\n\2\2fh\5\f\7\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2"+
		"\2ki\3\2\2\2lm\7\13\2\2m\u008a\3\2\2\2no\7\23\2\2op\7\20\2\2pq\7%\2\2"+
		"qr\7\24\2\2rs\7\'\2\2st\7\21\2\2tx\7\n\2\2uw\5\f\7\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\u008a\7\13\2\2|\u0087\7%\2"+
		"\2}~\7\20\2\2~\u0083\7%\2\2\177\u0080\7\5\2\2\u0080\u0082\7%\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\21\2\2\u0087"+
		"}\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089T\3\2\2\2\u0089"+
		"a\3\2\2\2\u0089n\3\2\2\2\u0089|\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c\7"+
		"\25\2\2\u008c\u0097\7%\2\2\u008d\u008e\7\20\2\2\u008e\u0093\7%\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\u0092\7%\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\7\21\2\2\u0097\u008d\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\7\n\2\2\u009a\u009c\5\f\7\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1"+
		"\13\3\2\2\2\u00a2\u00a5\5\6\4\2\u00a3\u00a5\5\b\5\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a9\5\b\5\2\u00a7\u00a9"+
		"\5\20\t\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\17\3\2\2\2\u00aa"+
		"\u00ab\t\4\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00bd\7\32\2"+
		"\2\u00ae\u00af\7\33\2\2\u00af\u00b0\7\4\2\2\u00b0\u00bd\t\3\2\2\u00b1"+
		"\u00bd\7\34\2\2\u00b2\u00bd\7\35\2\2\u00b3\u00bd\7\36\2\2\u00b4\u00b5"+
		"\7\37\2\2\u00b5\u00bd\5\22\n\b\u00b6\u00bd\7 \2\2\u00b7\u00bd\7!\2\2\u00b8"+
		"\u00b9\7\20\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\21\2\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc"+
		"\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2"+
		"\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c6\3\2\2\2\u00be"+
		"\u00bf\f\5\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c5\5\22\n\6\u00c1\u00c2\f"+
		"\4\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c5\5\22\n\5\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\23\3\2\2\2\u00c8\u00c6\3\2\2\2\24\27\36?R\\ix\u0083\u0087\u0089"+
		"\u0093\u0097\u009d\u00a4\u00a8\u00bc\u00c4\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}