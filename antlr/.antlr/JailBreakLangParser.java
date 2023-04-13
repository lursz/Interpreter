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
		LPAREN=32, RPAREN=33, MUL=34, DIV=35, ADD=36, SUB=37, COMMENT=38, ID=39, 
		RAND=40, INT=41, WS=42;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_objects = 2, RULE_variables = 3, RULE_expr = 4, 
		RULE_term = 5, RULE_factor = 6, RULE_commands = 7, RULE_function_declaration = 8, 
		RULE_expressions = 9, RULE_guard_extra_code = 10, RULE_guard_control = 11, 
		RULE_condition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "variables", "expr", "term", "factor", "commands", 
			"function_declaration", "expressions", "guard_extra_code", "guard_control", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WALL'", "'='", "','", "'TRAP'", "'KEY'", "'GATE'", "'GUARD'", 
			"'{'", "'}'", "'MAP'", "'PLAYER'", "'EXIT'", "'INT'", "'IF'", "'WHILE'", 
			"'FOR'", "'IN'", "'FUN'", "'LEFT'", "'RIGHT'", "'UP'", "'DOWN'", "'IFWALL'", 
			"'IFGUARD'", "'IFTRAP'", "'IFGATE'", "'NO'", "'TRUE'", "'FALSE'", "'AND'", 
			"'OR'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", "MUL", 
			"DIV", "ADD", "SUB", "COMMENT", "ID", "RAND", "INT", "WS"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				code();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << ID))) != 0) );
			setState(31);
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				objects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				commands();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				variables();
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

	public static class ObjectsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__0);
				setState(40);
				match(T__1);
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					expr();
					}
					break;
				case 2:
					{
					setState(42);
					match(ID);
					}
					break;
				case 3:
					{
					setState(43);
					match(RAND);
					}
					break;
				}
				setState(46);
				match(T__2);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(47);
					expr();
					}
					break;
				case 2:
					{
					setState(48);
					match(ID);
					}
					break;
				case 3:
					{
					setState(49);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				setState(53);
				match(T__1);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(54);
					expr();
					}
					break;
				case 2:
					{
					setState(55);
					match(ID);
					}
					break;
				case 3:
					{
					setState(56);
					match(RAND);
					}
					break;
				}
				setState(59);
				match(T__2);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(60);
					expr();
					}
					break;
				case 2:
					{
					setState(61);
					match(ID);
					}
					break;
				case 3:
					{
					setState(62);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(T__4);
				setState(66);
				match(T__1);
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(67);
					expr();
					}
					break;
				case 2:
					{
					setState(68);
					match(ID);
					}
					break;
				}
				setState(71);
				match(T__2);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(72);
					expr();
					}
					break;
				case 2:
					{
					setState(73);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__5);
				setState(77);
				match(T__1);
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					expr();
					}
					break;
				case 2:
					{
					setState(79);
					match(ID);
					}
					break;
				}
				setState(82);
				match(T__2);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(83);
					expr();
					}
					break;
				case 2:
					{
					setState(84);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__6);
				setState(88);
				match(T__1);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(89);
					expr();
					}
					break;
				case 2:
					{
					setState(90);
					match(ID);
					}
					break;
				}
				setState(93);
				match(T__2);
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(94);
					expr();
					}
					break;
				case 2:
					{
					setState(95);
					match(ID);
					}
					break;
				}
				setState(98);
				match(T__2);
				setState(99);
				expr();
				setState(100);
				match(T__7);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					{
					setState(101);
					guard_extra_code();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(T__9);
				setState(110);
				match(T__1);
				setState(111);
				expr();
				setState(112);
				match(T__2);
				setState(113);
				expr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(T__10);
				setState(116);
				match(T__1);
				setState(117);
				expr();
				setState(118);
				match(T__2);
				setState(119);
				expr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__11);
				setState(122);
				match(T__1);
				setState(123);
				expr();
				setState(124);
				match(T__2);
				setState(125);
				expr();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__12);
				setState(130);
				match(ID);
				setState(131);
				match(T__1);
				setState(132);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				setState(134);
				match(T__1);
				setState(135);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JailBreakLangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JailBreakLangParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JailBreakLangParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JailBreakLangParser.SUB, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			term();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				term();
				}
				}
				setState(145);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JailBreakLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JailBreakLangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JailBreakLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JailBreakLangParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			factor();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				factor();
				}
				}
				setState(153);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(JailBreakLangParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(LPAREN);
				setState(157);
				expr();
				setState(158);
				match(RPAREN);
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
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commands);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__13);
				setState(163);
				match(LPAREN);
				setState(164);
				condition(0);
				setState(165);
				match(RPAREN);
				setState(166);
				match(T__7);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(167);
					expressions();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__8);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__14);
				setState(176);
				match(LPAREN);
				setState(177);
				condition(0);
				setState(178);
				match(RPAREN);
				setState(179);
				match(T__7);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(180);
					expressions();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(T__8);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__15);
				setState(189);
				match(LPAREN);
				setState(190);
				match(ID);
				setState(191);
				match(T__16);
				setState(192);
				expr();
				setState(193);
				match(RPAREN);
				setState(194);
				match(T__7);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(195);
					expressions();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(ID);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(204);
					match(LPAREN);
					setState(205);
					match(ID);
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(206);
						match(T__2);
						setState(207);
						match(ID);
						}
						}
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(213);
					match(RPAREN);
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
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
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
		enterRule(_localctx, 16, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__17);
			setState(219);
			match(ID);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(220);
				match(LPAREN);
				setState(221);
				match(ID);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(222);
					match(T__2);
					setState(223);
					match(ID);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RPAREN);
				}
			}

			setState(232);
			match(T__7);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(233);
				expressions();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
		enterRule(_localctx, 18, RULE_expressions);
		try {
			setState(243);
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
				setState(241);
				objects();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 20, RULE_guard_extra_code);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				commands();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 22, RULE_guard_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(252);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(253);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(254);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(255);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(256);
				match(T__26);
				setState(257);
				condition(6);
				}
				break;
			case T__27:
				{
				setState(258);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(259);
				match(T__28);
				}
				break;
			case LPAREN:
				{
				setState(260);
				match(LPAREN);
				setState(261);
				condition(0);
				setState(262);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						match(T__29);
						setState(268);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						match(T__30);
						setState(271);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0118\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\5\4\65"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3\4"+
		"\3\4\5\4H\n\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\4\3\4\3"+
		"\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\5\4c\n\4\3\4\3\4\3\4"+
		"\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6"+
		"\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n\t\f\t\16\t\u00ca\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d3\n\t\f\t\16\t\u00d6\13\t\3\t\5"+
		"\t\u00d9\n\t\5\t\u00db\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e3\n\n\f\n\16"+
		"\n\u00e6\13\n\3\n\5\n\u00e9\n\n\3\n\3\n\7\n\u00ed\n\n\f\n\16\n\u00f0\13"+
		"\n\3\n\3\n\3\13\3\13\5\13\u00f6\n\13\3\f\3\f\5\f\u00fa\n\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0113\n\16\f\16\16\16\u0116\13"+
		"\16\3\16\2\3\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2&\'\3\2$%\3"+
		"\2\25\30\2\u013f\2\35\3\2\2\2\4\'\3\2\2\2\6\u0081\3\2\2\2\b\u008a\3\2"+
		"\2\2\n\u008c\3\2\2\2\f\u0094\3\2\2\2\16\u00a2\3\2\2\2\20\u00da\3\2\2\2"+
		"\22\u00dc\3\2\2\2\24\u00f5\3\2\2\2\26\u00f9\3\2\2\2\30\u00fb\3\2\2\2\32"+
		"\u010a\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#(\5\6\4\2$(\5\20\t\2%(\5"+
		"\22\n\2&(\5\b\5\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2"+
		"\2)*\7\3\2\2*.\7\4\2\2+/\5\n\6\2,/\7)\2\2-/\7*\2\2.+\3\2\2\2.,\3\2\2\2"+
		".-\3\2\2\2/\60\3\2\2\2\60\64\7\5\2\2\61\65\5\n\6\2\62\65\7)\2\2\63\65"+
		"\7*\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\u0082\3\2\2\2\66"+
		"\67\7\6\2\2\67;\7\4\2\28<\5\n\6\29<\7)\2\2:<\7*\2\2;8\3\2\2\2;9\3\2\2"+
		"\2;:\3\2\2\2<=\3\2\2\2=A\7\5\2\2>B\5\n\6\2?B\7)\2\2@B\7*\2\2A>\3\2\2\2"+
		"A?\3\2\2\2A@\3\2\2\2B\u0082\3\2\2\2CD\7\7\2\2DG\7\4\2\2EH\5\n\6\2FH\7"+
		")\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IL\7\5\2\2JM\5\n\6\2KM\7)\2\2LJ\3\2"+
		"\2\2LK\3\2\2\2M\u0082\3\2\2\2NO\7\b\2\2OR\7\4\2\2PS\5\n\6\2QS\7)\2\2R"+
		"P\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TW\7\5\2\2UX\5\n\6\2VX\7)\2\2WU\3\2\2\2W"+
		"V\3\2\2\2X\u0082\3\2\2\2YZ\7\t\2\2Z]\7\4\2\2[^\5\n\6\2\\^\7)\2\2][\3\2"+
		"\2\2]\\\3\2\2\2^_\3\2\2\2_b\7\5\2\2`c\5\n\6\2ac\7)\2\2b`\3\2\2\2ba\3\2"+
		"\2\2cd\3\2\2\2de\7\5\2\2ef\5\n\6\2fj\7\n\2\2gi\5\26\f\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\13\2\2n\u0082\3\2\2"+
		"\2op\7\f\2\2pq\7\4\2\2qr\5\n\6\2rs\7\5\2\2st\5\n\6\2t\u0082\3\2\2\2uv"+
		"\7\r\2\2vw\7\4\2\2wx\5\n\6\2xy\7\5\2\2yz\5\n\6\2z\u0082\3\2\2\2{|\7\16"+
		"\2\2|}\7\4\2\2}~\5\n\6\2~\177\7\5\2\2\177\u0080\5\n\6\2\u0080\u0082\3"+
		"\2\2\2\u0081)\3\2\2\2\u0081\66\3\2\2\2\u0081C\3\2\2\2\u0081N\3\2\2\2\u0081"+
		"Y\3\2\2\2\u0081o\3\2\2\2\u0081u\3\2\2\2\u0081{\3\2\2\2\u0082\7\3\2\2\2"+
		"\u0083\u0084\7\17\2\2\u0084\u0085\7)\2\2\u0085\u0086\7\4\2\2\u0086\u008b"+
		"\5\n\6\2\u0087\u0088\7)\2\2\u0088\u0089\7\4\2\2\u0089\u008b\5\n\6\2\u008a"+
		"\u0083\3\2\2\2\u008a\u0087\3\2\2\2\u008b\t\3\2\2\2\u008c\u0091\5\f\7\2"+
		"\u008d\u008e\t\2\2\2\u008e\u0090\5\f\7\2\u008f\u008d\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\13\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0099\5\16\b\2\u0095\u0096\t\3\2\2\u0096\u0098\5"+
		"\16\b\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a3\7)\2\2"+
		"\u009d\u00a3\7+\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a1"+
		"\7#\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5\u00a6\7\"\2"+
		"\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7#\2\2\u00a8\u00ac\7\n\2\2\u00a9"+
		"\u00ab\5\24\13\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00db\3\2\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\7"+
		"\"\2\2\u00b3\u00b4\5\32\16\2\u00b4\u00b5\7#\2\2\u00b5\u00b9\7\n\2\2\u00b6"+
		"\u00b8\5\24\13\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\13\2\2\u00bd\u00db\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c0\7"+
		"\"\2\2\u00c0\u00c1\7)\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\5\n\6\2\u00c3"+
		"\u00c4\7#\2\2\u00c4\u00c8\7\n\2\2\u00c5\u00c7\5\24\13\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00db\3"+
		"\2\2\2\u00cd\u00d8\7)\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d4\7)\2\2\u00d0"+
		"\u00d1\7\5\2\2\u00d1\u00d3\7)\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\7#\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00a4\3\2\2\2\u00da\u00b1\3\2\2\2\u00da"+
		"\u00be\3\2\2\2\u00da\u00cd\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd\7\24\2"+
		"\2\u00dd\u00e8\7)\2\2\u00de\u00df\7\"\2\2\u00df\u00e4\7)\2\2\u00e0\u00e1"+
		"\7\5\2\2\u00e1\u00e3\7)\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\7#\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ee\7\n\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\13\2\2\u00f2\23\3\2\2"+
		"\2\u00f3\u00f6\5\6\4\2\u00f4\u00f6\5\20\t\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\25\3\2\2\2\u00f7\u00fa\5\20\t\2\u00f8\u00fa\5\30"+
		"\r\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fc"+
		"\t\4\2\2\u00fc\31\3\2\2\2\u00fd\u00fe\b\16\1\2\u00fe\u010b\7\31\2\2\u00ff"+
		"\u010b\7\32\2\2\u0100\u010b\7\33\2\2\u0101\u010b\7\34\2\2\u0102\u0103"+
		"\7\35\2\2\u0103\u010b\5\32\16\b\u0104\u010b\7\36\2\2\u0105\u010b\7\37"+
		"\2\2\u0106\u0107\7\"\2\2\u0107\u0108\5\32\16\2\u0108\u0109\7#\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u0100\3\2"+
		"\2\2\u010a\u0101\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0104\3\2\2\2\u010a"+
		"\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b\u0114\3\2\2\2\u010c\u010d\f\5"+
		"\2\2\u010d\u010e\7 \2\2\u010e\u0113\5\32\16\6\u010f\u0110\f\4\2\2\u0110"+
		"\u0111\7!\2\2\u0111\u0113\5\32\16\5\u0112\u010c\3\2\2\2\u0112\u010f\3"+
		"\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\33\3\2\2\2\u0116\u0114\3\2\2\2\"\37\'.\64;AGLRW]bj\u0081\u008a\u0091"+
		"\u0099\u00a2\u00ac\u00b9\u00c8\u00d4\u00d8\u00da\u00e4\u00e8\u00ee\u00f5"+
		"\u00f9\u010a\u0112\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}