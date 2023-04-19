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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, EQUALS=30, NOT_EQUALS=31, 
		LESS_THAN=32, GREATER_THAN=33, LPAREN=34, RPAREN=35, MUL=36, DIV=37, ADD=38, 
		SUB=39, COMMENT=40, ID=41, RAND=42, INT=43, WS=44;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_objects = 2, RULE_variables = 3, RULE_comparison = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_factor = 7, RULE_commands = 8, RULE_function_declaration = 9, 
		RULE_expressions = 10, RULE_guard_extra_code = 11, RULE_guard_control = 12, 
		RULE_booleanValue = 13, RULE_condition = 14, RULE_condition_product = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "variables", "comparison", "expr", "term", 
			"factor", "commands", "function_declaration", "expressions", "guard_extra_code", 
			"guard_control", "booleanValue", "condition", "condition_product"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WALL'", "'='", "','", "'TRAP'", "'KEY'", "'GATE'", "'GUARD'", 
			"'{'", "'}'", "'MAP'", "'PLAYER'", "'EXIT'", "'INT'", "'BOOLEAN'", "'IF'", 
			"'ELSE'", "'WHILE'", "'FOR'", "'IN'", "'FUN'", "'LEFT'", "'RIGHT'", "'UP'", 
			"'DOWN'", "'TRUE'", "'FALSE'", "'OR'", "'AND'", "'NOT'", "'=='", "'!='", 
			"'<'", "'>'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "EQUALS", "NOT_EQUALS", "LESS_THAN", 
			"GREATER_THAN", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB", "COMMENT", 
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				code();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0) );
			setState(37);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				objects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				commands();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__0);
				setState(46);
				match(T__1);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				setState(52);
				match(T__2);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(53);
					expr();
					}
					break;
				case 2:
					{
					setState(54);
					match(ID);
					}
					break;
				case 3:
					{
					setState(55);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__3);
				setState(59);
				match(T__1);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
				setState(65);
				match(T__2);
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(66);
					expr();
					}
					break;
				case 2:
					{
					setState(67);
					match(ID);
					}
					break;
				case 3:
					{
					setState(68);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__4);
				setState(72);
				match(T__1);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(73);
					expr();
					}
					break;
				case 2:
					{
					setState(74);
					match(ID);
					}
					break;
				}
				setState(77);
				match(T__2);
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(T__5);
				setState(83);
				match(T__1);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(84);
					expr();
					}
					break;
				case 2:
					{
					setState(85);
					match(ID);
					}
					break;
				}
				setState(88);
				match(T__2);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__6);
				setState(94);
				match(T__1);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(95);
					expr();
					}
					break;
				case 2:
					{
					setState(96);
					match(ID);
					}
					break;
				}
				setState(99);
				match(T__2);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(100);
					expr();
					}
					break;
				case 2:
					{
					setState(101);
					match(ID);
					}
					break;
				}
				setState(104);
				match(T__2);
				setState(105);
				expr();
				setState(106);
				match(T__7);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					{
					setState(107);
					guard_extra_code();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__9);
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
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(T__10);
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
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				match(T__11);
				setState(128);
				match(T__1);
				setState(129);
				expr();
				setState(130);
				match(T__2);
				setState(131);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__12);
				setState(136);
				match(ID);
				setState(137);
				match(T__1);
				setState(138);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__1);
				setState(141);
				expr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__13);
				setState(143);
				match(ID);
				setState(144);
				match(T__1);
				setState(145);
				condition();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(JailBreakLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(JailBreakLangParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(JailBreakLangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(JailBreakLangParser.GREATER_THAN, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr();
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << GREATER_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			expr();
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
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			term();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				term();
				}
				}
				setState(159);
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			factor();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				factor();
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
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(LPAREN);
				setState(171);
				expr();
				setState(172);
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
		enterRule(_localctx, 16, RULE_commands);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__14);
				setState(177);
				match(LPAREN);
				setState(178);
				condition();
				setState(179);
				match(RPAREN);
				setState(180);
				match(T__7);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(181);
					expressions();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__8);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(188);
					match(T__15);
					setState(189);
					match(T__7);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
						{
						{
						setState(190);
						expressions();
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(196);
					match(T__8);
					}
				}

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__16);
				setState(200);
				match(LPAREN);
				setState(201);
				condition();
				setState(202);
				match(RPAREN);
				setState(203);
				match(T__7);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(204);
					expressions();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__8);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__17);
				setState(213);
				match(LPAREN);
				setState(214);
				match(ID);
				setState(215);
				match(T__18);
				setState(216);
				expr();
				setState(217);
				match(RPAREN);
				setState(218);
				match(T__7);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(219);
					expressions();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(ID);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(228);
					match(LPAREN);
					setState(229);
					match(ID);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(230);
						match(T__2);
						setState(231);
						match(ID);
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(237);
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
		enterRule(_localctx, 18, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__19);
			setState(243);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(244);
				match(LPAREN);
				setState(245);
				match(ID);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(246);
					match(T__2);
					setState(247);
					match(ID);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(RPAREN);
				}
			}

			setState(256);
			match(T__7);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(257);
				expressions();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		enterRule(_localctx, 20, RULE_expressions);
		try {
			setState(267);
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
				setState(265);
				objects();
				}
				break;
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		enterRule(_localctx, 22, RULE_guard_extra_code);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				commands();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
		enterRule(_localctx, 24, RULE_guard_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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
		public Condition_productContext condition_product() {
			return getRuleContext(Condition_productContext.class,0);
		}
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
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			int _alt;
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__16:
			case T__17:
			case T__19:
			case T__26:
			case RPAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__24:
			case T__25:
			case T__28:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				condition_product();
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						match(T__26);
						setState(280);
						condition();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Condition_productContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public List<Condition_productContext> condition_product() {
			return getRuleContexts(Condition_productContext.class);
		}
		public Condition_productContext condition_product(int i) {
			return getRuleContext(Condition_productContext.class,i);
		}
		public Condition_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_product; }
	}

	public final Condition_productContext condition_product() throws RecognitionException {
		Condition_productContext _localctx = new Condition_productContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_product);
		try {
			int _alt;
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(LPAREN);
				setState(289);
				condition();
				setState(290);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				booleanValue();
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(T__27);
						setState(294);
						condition_product();
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(T__28);
				setState(301);
				booleanValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(T__28);
				setState(303);
				match(LPAREN);
				setState(304);
				condition();
				setState(305);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(LPAREN);
				setState(308);
				condition();
				setState(309);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4"+
		"\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\5\4S\n\4\3\4\3"+
		"\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\4"+
		"\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0088\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0095\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\b\3\b"+
		"\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b1"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b9\n\n\f\n\16\n\u00bc\13\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\n\5\n\u00c8\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee\13\n\3\n\5\n\u00f1\n\n\5\n\u00f3"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe\13"+
		"\13\3\13\5\13\u0101\n\13\3\13\3\13\7\13\u0105\n\13\f\13\16\13\u0108\13"+
		"\13\3\13\3\13\3\f\3\f\5\f\u010e\n\f\3\r\3\r\5\r\u0112\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\7\20\u011c\n\20\f\20\16\20\u011f\13\20\5"+
		"\20\u0121\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u012a\n\21\f\21"+
		"\16\21\u012d\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u013a\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\7\3\2 #\3\2()\3\2&\'\3\2\27\32\3\2\33\34\2\u0161\2#\3\2\2\2\4-\3\2"+
		"\2\2\6\u0087\3\2\2\2\b\u0094\3\2\2\2\n\u0096\3\2\2\2\f\u009a\3\2\2\2\16"+
		"\u00a2\3\2\2\2\20\u00b0\3\2\2\2\22\u00f2\3\2\2\2\24\u00f4\3\2\2\2\26\u010d"+
		"\3\2\2\2\30\u0111\3\2\2\2\32\u0113\3\2\2\2\34\u0115\3\2\2\2\36\u0120\3"+
		"\2\2\2 \u0139\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&\'\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2).\5\6\4\2*.\5\22\n\2+.\5\24\13\2"+
		",.\5\b\5\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7\3"+
		"\2\2\60\64\7\4\2\2\61\65\5\f\7\2\62\65\7+\2\2\63\65\7,\2\2\64\61\3\2\2"+
		"\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66:\7\5\2\2\67;\5\f\7\28"+
		";\7+\2\29;\7,\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\u0088\3\2\2\2<=\7\6"+
		"\2\2=A\7\4\2\2>B\5\f\7\2?B\7+\2\2@B\7,\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CG\7\5\2\2DH\5\f\7\2EH\7+\2\2FH\7,\2\2GD\3\2\2\2GE\3\2\2\2"+
		"GF\3\2\2\2H\u0088\3\2\2\2IJ\7\7\2\2JM\7\4\2\2KN\5\f\7\2LN\7+\2\2MK\3\2"+
		"\2\2ML\3\2\2\2NO\3\2\2\2OR\7\5\2\2PS\5\f\7\2QS\7+\2\2RP\3\2\2\2RQ\3\2"+
		"\2\2S\u0088\3\2\2\2TU\7\b\2\2UX\7\4\2\2VY\5\f\7\2WY\7+\2\2XV\3\2\2\2X"+
		"W\3\2\2\2YZ\3\2\2\2Z]\7\5\2\2[^\5\f\7\2\\^\7+\2\2][\3\2\2\2]\\\3\2\2\2"+
		"^\u0088\3\2\2\2_`\7\t\2\2`c\7\4\2\2ad\5\f\7\2bd\7+\2\2ca\3\2\2\2cb\3\2"+
		"\2\2de\3\2\2\2eh\7\5\2\2fi\5\f\7\2gi\7+\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jk\7\5\2\2kl\5\f\7\2lp\7\n\2\2mo\5\30\r\2nm\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\13\2\2t\u0088\3\2\2\2uv\7\f\2"+
		"\2vw\7\4\2\2wx\5\f\7\2xy\7\5\2\2yz\5\f\7\2z\u0088\3\2\2\2{|\7\r\2\2|}"+
		"\7\4\2\2}~\5\f\7\2~\177\7\5\2\2\177\u0080\5\f\7\2\u0080\u0088\3\2\2\2"+
		"\u0081\u0082\7\16\2\2\u0082\u0083\7\4\2\2\u0083\u0084\5\f\7\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0086\5\f\7\2\u0086\u0088\3\2\2\2\u0087/\3\2\2\2\u0087"+
		"<\3\2\2\2\u0087I\3\2\2\2\u0087T\3\2\2\2\u0087_\3\2\2\2\u0087u\3\2\2\2"+
		"\u0087{\3\2\2\2\u0087\u0081\3\2\2\2\u0088\7\3\2\2\2\u0089\u008a\7\17\2"+
		"\2\u008a\u008b\7+\2\2\u008b\u008c\7\4\2\2\u008c\u0095\5\f\7\2\u008d\u008e"+
		"\7+\2\2\u008e\u008f\7\4\2\2\u008f\u0095\5\f\7\2\u0090\u0091\7\20\2\2\u0091"+
		"\u0092\7+\2\2\u0092\u0093\7\4\2\2\u0093\u0095\5\36\20\2\u0094\u0089\3"+
		"\2\2\2\u0094\u008d\3\2\2\2\u0094\u0090\3\2\2\2\u0095\t\3\2\2\2\u0096\u0097"+
		"\5\f\7\2\u0097\u0098\t\2\2\2\u0098\u0099\5\f\7\2\u0099\13\3\2\2\2\u009a"+
		"\u009f\5\16\b\2\u009b\u009c\t\3\2\2\u009c\u009e\5\16\b\2\u009d\u009b\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7\5\20\t\2\u00a3\u00a4\t\4\2"+
		"\2\u00a4\u00a6\5\20\t\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00b1\7+\2\2\u00ab\u00b1\7-\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae"+
		"\5\f\7\2\u00ae\u00af\7%\2\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0"+
		"\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\7\21\2"+
		"\2\u00b3\u00b4\7$\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6\7%\2\2\u00b6\u00ba"+
		"\7\n\2\2\u00b7\u00b9\5\26\f\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c7\7\13\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c3\7\n\2\2"+
		"\u00c0\u00c2\5\26\f\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\7\13\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00f3\3"+
		"\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\u00d1\7\n\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00f3\3"+
		"\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\7+\2\2\u00d9"+
		"\u00da\7\25\2\2\u00da\u00db\5\f\7\2\u00db\u00dc\7%\2\2\u00dc\u00e0\7\n"+
		"\2\2\u00dd\u00df\5\26\f\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7\13\2\2\u00e4\u00f3\3\2\2\2\u00e5\u00f0\7+\2\2\u00e6"+
		"\u00e7\7$\2\2\u00e7\u00ec\7+\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00eb\7+\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7%\2\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00b2\3\2"+
		"\2\2\u00f2\u00c9\3\2\2\2\u00f2\u00d6\3\2\2\2\u00f2\u00e5\3\2\2\2\u00f3"+
		"\23\3\2\2\2\u00f4\u00f5\7\26\2\2\u00f5\u0100\7+\2\2\u00f6\u00f7\7$\2\2"+
		"\u00f7\u00fc\7+\2\2\u00f8\u00f9\7\5\2\2\u00f9\u00fb\7+\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7%\2\2\u0100\u00f6\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\7\n\2\2\u0103"+
		"\u0105\5\26\f\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\13\2\2\u010a\25\3\2\2\2\u010b\u010e\5\6\4\2\u010c\u010e\5\22"+
		"\n\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\27\3\2\2\2\u010f\u0112"+
		"\5\22\n\2\u0110\u0112\5\32\16\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2"+
		"\2\u0112\31\3\2\2\2\u0113\u0114\t\5\2\2\u0114\33\3\2\2\2\u0115\u0116\t"+
		"\6\2\2\u0116\35\3\2\2\2\u0117\u0121\3\2\2\2\u0118\u011d\5 \21\2\u0119"+
		"\u011a\7\35\2\2\u011a\u011c\5\36\20\2\u011b\u0119\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2\2\2\u0121\37\3\2\2"+
		"\2\u0122\u0123\7$\2\2\u0123\u0124\5\36\20\2\u0124\u0125\7%\2\2\u0125\u013a"+
		"\3\2\2\2\u0126\u012b\5\34\17\2\u0127\u0128\7\36\2\2\u0128\u012a\5 \21"+
		"\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u013a\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\37\2\2"+
		"\u012f\u013a\5\34\17\2\u0130\u0131\7\37\2\2\u0131\u0132\7$\2\2\u0132\u0133"+
		"\5\36\20\2\u0133\u0134\7%\2\2\u0134\u013a\3\2\2\2\u0135\u0136\7$\2\2\u0136"+
		"\u0137\5\36\20\2\u0137\u0138\7%\2\2\u0138\u013a\3\2\2\2\u0139\u0122\3"+
		"\2\2\2\u0139\u0126\3\2\2\2\u0139\u012e\3\2\2\2\u0139\u0130\3\2\2\2\u0139"+
		"\u0135\3\2\2\2\u013a!\3\2\2\2%%-\64:AGMRX]chp\u0087\u0094\u009f\u00a7"+
		"\u00b0\u00ba\u00c3\u00c7\u00d1\u00e0\u00ec\u00f0\u00f2\u00fc\u0100\u0106"+
		"\u010d\u0111\u011d\u0120\u012b\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}