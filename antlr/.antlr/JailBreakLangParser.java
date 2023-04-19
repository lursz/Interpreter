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
		RULE_value_comparison = 13, RULE_booleanValue = 14, RULE_variable_value = 15, 
		RULE_condition = 16, RULE_condition_product = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "variables", "comparison", "expr", "term", 
			"factor", "commands", "function_declaration", "expressions", "guard_extra_code", 
			"guard_control", "value_comparison", "booleanValue", "variable_value", 
			"condition", "condition_product"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				code();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0) );
			setState(41);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				objects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				commands();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(T__1);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(51);
					expr();
					}
					break;
				case 2:
					{
					setState(52);
					match(ID);
					}
					break;
				case 3:
					{
					setState(53);
					match(RAND);
					}
					break;
				}
				setState(56);
				match(T__2);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					expr();
					}
					break;
				case 2:
					{
					setState(58);
					match(ID);
					}
					break;
				case 3:
					{
					setState(59);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__3);
				setState(63);
				match(T__1);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					expr();
					}
					break;
				case 2:
					{
					setState(65);
					match(ID);
					}
					break;
				case 3:
					{
					setState(66);
					match(RAND);
					}
					break;
				}
				setState(69);
				match(T__2);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70);
					expr();
					}
					break;
				case 2:
					{
					setState(71);
					match(ID);
					}
					break;
				case 3:
					{
					setState(72);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__4);
				setState(76);
				match(T__1);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(77);
					expr();
					}
					break;
				case 2:
					{
					setState(78);
					match(ID);
					}
					break;
				}
				setState(81);
				match(T__2);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(82);
					expr();
					}
					break;
				case 2:
					{
					setState(83);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__5);
				setState(87);
				match(T__1);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(88);
					expr();
					}
					break;
				case 2:
					{
					setState(89);
					match(ID);
					}
					break;
				}
				setState(92);
				match(T__2);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(93);
					expr();
					}
					break;
				case 2:
					{
					setState(94);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(T__1);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(99);
					expr();
					}
					break;
				case 2:
					{
					setState(100);
					match(ID);
					}
					break;
				}
				setState(103);
				match(T__2);
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(104);
					expr();
					}
					break;
				case 2:
					{
					setState(105);
					match(ID);
					}
					break;
				}
				setState(108);
				match(T__2);
				setState(109);
				expr();
				setState(110);
				match(T__7);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					{
					setState(111);
					guard_extra_code();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(T__9);
				setState(120);
				match(T__1);
				setState(121);
				expr();
				setState(122);
				match(T__2);
				setState(123);
				expr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(T__10);
				setState(126);
				match(T__1);
				setState(127);
				expr();
				setState(128);
				match(T__2);
				setState(129);
				expr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(T__11);
				setState(132);
				match(T__1);
				setState(133);
				expr();
				setState(134);
				match(T__2);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__12);
				setState(140);
				match(ID);
				setState(141);
				match(T__1);
				setState(142);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__1);
				setState(145);
				expr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__13);
				setState(147);
				match(ID);
				setState(148);
				match(T__1);
				setState(149);
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
			setState(152);
			expr();
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << GREATER_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
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
			setState(156);
			term();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				term();
				}
				}
				setState(163);
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
			setState(164);
			factor();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				factor();
				}
				}
				setState(171);
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(LPAREN);
				setState(175);
				expr();
				setState(176);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__14);
				setState(181);
				match(LPAREN);
				setState(182);
				condition();
				setState(183);
				match(RPAREN);
				setState(184);
				match(T__7);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(185);
					expressions();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__8);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(192);
					match(T__15);
					setState(193);
					match(T__7);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
						{
						{
						setState(194);
						expressions();
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(200);
					match(T__8);
					}
				}

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__16);
				setState(204);
				match(LPAREN);
				setState(205);
				condition();
				setState(206);
				match(RPAREN);
				setState(207);
				match(T__7);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(208);
					expressions();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__8);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__17);
				setState(217);
				match(LPAREN);
				setState(218);
				match(ID);
				setState(219);
				match(T__18);
				setState(220);
				expr();
				setState(221);
				match(RPAREN);
				setState(222);
				match(T__7);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(223);
					expressions();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(ID);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(232);
					match(LPAREN);
					setState(233);
					match(ID);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(234);
						match(T__2);
						setState(235);
						match(ID);
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(241);
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
			setState(246);
			match(T__19);
			setState(247);
			match(ID);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(248);
				match(LPAREN);
				setState(249);
				match(ID);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(250);
					match(T__2);
					setState(251);
					match(ID);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(RPAREN);
				}
			}

			setState(260);
			match(T__7);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(261);
				expressions();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
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
			setState(271);
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
				setState(269);
				objects();
				}
				break;
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				commands();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
			setState(277);
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

	public static class Value_comparisonContext extends ParserRuleContext {
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
		public Value_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_comparison; }
	}

	public final Value_comparisonContext value_comparison() throws RecognitionException {
		Value_comparisonContext _localctx = new Value_comparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expr();
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << GREATER_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public Value_comparisonContext value_comparison() {
			return getRuleContext(Value_comparisonContext.class,0);
		}
		public Variable_valueContext variable_value() {
			return getRuleContext(Variable_valueContext.class,0);
		}
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanValue);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				value_comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				variable_value();
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

	public static class Variable_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public Variable_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_value; }
	}

	public final Variable_valueContext variable_value() throws RecognitionException {
		Variable_valueContext _localctx = new Variable_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
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
		enterRule(_localctx, 32, RULE_condition);
		try {
			int _alt;
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				condition_product();
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(T__26);
						setState(294);
						condition();
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 34, RULE_condition_product);
		try {
			int _alt;
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(LPAREN);
				setState(303);
				condition();
				setState(304);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				booleanValue();
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(T__27);
						setState(308);
						condition_product();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(T__28);
				setState(315);
				booleanValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(T__28);
				setState(317);
				match(LPAREN);
				setState(318);
				condition();
				setState(319);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(LPAREN);
				setState(322);
				condition();
				setState(323);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4F\n\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4\3\4"+
		"\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\4\5\4b\n\4\3\4\3\4\3"+
		"\4\3\4\5\4h\n\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\7\4s\n\4\f\4\16\4"+
		"v\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0099\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00a2\n\7\f\7\16\7"+
		"\u00a5\13\7\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16"+
		"\n\u00c0\13\n\3\n\3\n\3\n\3\n\7\n\u00c6\n\n\f\n\16\n\u00c9\13\n\3\n\5"+
		"\n\u00cc\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ef\n\n\f\n\16\n\u00f2\13\n\3"+
		"\n\5\n\u00f5\n\n\5\n\u00f7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ff"+
		"\n\13\f\13\16\13\u0102\13\13\3\13\5\13\u0105\n\13\3\13\3\13\7\13\u0109"+
		"\n\13\f\13\16\13\u010c\13\13\3\13\3\13\3\f\3\f\5\f\u0112\n\f\3\r\3\r\5"+
		"\r\u0116\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0122"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u012a\n\22\f\22\16\22\u012d\13"+
		"\22\5\22\u012f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0138\n\23"+
		"\f\23\16\23\u013b\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0148\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\6\3\2 #\3\2()\3\2&\'\3\2\27\32\2\u0170\2\'\3\2\2\2\4\61\3"+
		"\2\2\2\6\u008b\3\2\2\2\b\u0098\3\2\2\2\n\u009a\3\2\2\2\f\u009e\3\2\2\2"+
		"\16\u00a6\3\2\2\2\20\u00b4\3\2\2\2\22\u00f6\3\2\2\2\24\u00f8\3\2\2\2\26"+
		"\u0111\3\2\2\2\30\u0115\3\2\2\2\32\u0117\3\2\2\2\34\u0119\3\2\2\2\36\u0121"+
		"\3\2\2\2 \u0123\3\2\2\2\"\u012e\3\2\2\2$\u0147\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-"+
		"\62\5\6\4\2.\62\5\22\n\2/\62\5\24\13\2\60\62\5\b\5\2\61-\3\2\2\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\648\7\4\2"+
		"\2\659\5\f\7\2\669\7+\2\2\679\7,\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2"+
		"\29:\3\2\2\2:>\7\5\2\2;?\5\f\7\2<?\7+\2\2=?\7,\2\2>;\3\2\2\2><\3\2\2\2"+
		">=\3\2\2\2?\u008c\3\2\2\2@A\7\6\2\2AE\7\4\2\2BF\5\f\7\2CF\7+\2\2DF\7,"+
		"\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GK\7\5\2\2HL\5\f\7\2IL\7+"+
		"\2\2JL\7,\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\u008c\3\2\2\2MN\7\7\2\2N"+
		"Q\7\4\2\2OR\5\f\7\2PR\7+\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2SV\7\5\2\2T"+
		"W\5\f\7\2UW\7+\2\2VT\3\2\2\2VU\3\2\2\2W\u008c\3\2\2\2XY\7\b\2\2Y\\\7\4"+
		"\2\2Z]\5\f\7\2[]\7+\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^a\7\5\2\2_b\5"+
		"\f\7\2`b\7+\2\2a_\3\2\2\2a`\3\2\2\2b\u008c\3\2\2\2cd\7\t\2\2dg\7\4\2\2"+
		"eh\5\f\7\2fh\7+\2\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2il\7\5\2\2jm\5\f\7\2"+
		"km\7+\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7\5\2\2op\5\f\7\2pt\7\n\2\2"+
		"qs\5\30\r\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2"+
		"\2wx\7\13\2\2x\u008c\3\2\2\2yz\7\f\2\2z{\7\4\2\2{|\5\f\7\2|}\7\5\2\2}"+
		"~\5\f\7\2~\u008c\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\5\f\7\2\u0082\u0083\7\5\2\2\u0083\u0084\5\f\7\2\u0084\u008c\3\2\2\2\u0085"+
		"\u0086\7\16\2\2\u0086\u0087\7\4\2\2\u0087\u0088\5\f\7\2\u0088\u0089\7"+
		"\5\2\2\u0089\u008a\5\f\7\2\u008a\u008c\3\2\2\2\u008b\63\3\2\2\2\u008b"+
		"@\3\2\2\2\u008bM\3\2\2\2\u008bX\3\2\2\2\u008bc\3\2\2\2\u008by\3\2\2\2"+
		"\u008b\177\3\2\2\2\u008b\u0085\3\2\2\2\u008c\7\3\2\2\2\u008d\u008e\7\17"+
		"\2\2\u008e\u008f\7+\2\2\u008f\u0090\7\4\2\2\u0090\u0099\5\f\7\2\u0091"+
		"\u0092\7+\2\2\u0092\u0093\7\4\2\2\u0093\u0099\5\f\7\2\u0094\u0095\7\20"+
		"\2\2\u0095\u0096\7+\2\2\u0096\u0097\7\4\2\2\u0097\u0099\5\"\22\2\u0098"+
		"\u008d\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0094\3\2\2\2\u0099\t\3\2\2\2"+
		"\u009a\u009b\5\f\7\2\u009b\u009c\t\2\2\2\u009c\u009d\5\f\7\2\u009d\13"+
		"\3\2\2\2\u009e\u00a3\5\16\b\2\u009f\u00a0\t\3\2\2\u00a0\u00a2\5\16\b\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\20\t\2\u00a7"+
		"\u00a8\t\4\2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b5\7+\2\2\u00af\u00b5\7-\2\2\u00b0\u00b1\7$\2"+
		"\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7%\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\21\3\2\2\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7"+
		"%\2\2\u00ba\u00be\7\n\2\2\u00bb\u00bd\5\26\f\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00cb\7\13\2\2\u00c2\u00c3\7\22\2\2\u00c3"+
		"\u00c7\7\n\2\2\u00c4\u00c6\5\26\f\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cc\7\13\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00f7\3\2\2\2\u00cd\u00ce\7\23\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d1\7%\2\2\u00d1\u00d5\7\n\2\2\u00d2\u00d4\5\26"+
		"\f\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\13"+
		"\2\2\u00d9\u00f7\3\2\2\2\u00da\u00db\7\24\2\2\u00db\u00dc\7$\2\2\u00dc"+
		"\u00dd\7+\2\2\u00dd\u00de\7\25\2\2\u00de\u00df\5\f\7\2\u00df\u00e0\7%"+
		"\2\2\u00e0\u00e4\7\n\2\2\u00e1\u00e3\5\26\f\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00f7\3\2\2\2\u00e9"+
		"\u00f4\7+\2\2\u00ea\u00eb\7$\2\2\u00eb\u00f0\7+\2\2\u00ec\u00ed\7\5\2"+
		"\2\u00ed\u00ef\7+\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f5\7%\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00b6\3\2\2\2\u00f6\u00cd\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6"+
		"\u00e9\3\2\2\2\u00f7\23\3\2\2\2\u00f8\u00f9\7\26\2\2\u00f9\u0104\7+\2"+
		"\2\u00fa\u00fb\7$\2\2\u00fb\u0100\7+\2\2\u00fc\u00fd\7\5\2\2\u00fd\u00ff"+
		"\7+\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7%"+
		"\2\2\u0104\u00fa\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u010a\7\n\2\2\u0107\u0109\5\26\f\2\u0108\u0107\3\2\2\2\u0109\u010c\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7\13\2\2\u010e\25\3\2\2\2\u010f\u0112\5\6\4"+
		"\2\u0110\u0112\5\22\n\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\27\3\2\2\2\u0113\u0116\5\22\n\2\u0114\u0116\5\32\16\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116\31\3\2\2\2\u0117\u0118\t\5\2\2\u0118\33"+
		"\3\2\2\2\u0119\u011a\5\f\7\2\u011a\u011b\t\2\2\2\u011b\u011c\5\f\7\2\u011c"+
		"\35\3\2\2\2\u011d\u0122\7\33\2\2\u011e\u0122\7\34\2\2\u011f\u0122\5\34"+
		"\17\2\u0120\u0122\5 \21\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\37\3\2\2\2\u0123\u0124\7+\2\2"+
		"\u0124!\3\2\2\2\u0125\u012f\3\2\2\2\u0126\u012b\5$\23\2\u0127\u0128\7"+
		"\35\2\2\u0128\u012a\5\"\22\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u0125\3\2\2\2\u012e\u0126\3\2\2\2\u012f#\3\2\2\2\u0130\u0131"+
		"\7$\2\2\u0131\u0132\5\"\22\2\u0132\u0133\7%\2\2\u0133\u0148\3\2\2\2\u0134"+
		"\u0139\5\36\20\2\u0135\u0136\7\36\2\2\u0136\u0138\5$\23\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0148\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\37\2\2\u013d\u0148\5"+
		"\36\20\2\u013e\u013f\7\37\2\2\u013f\u0140\7$\2\2\u0140\u0141\5\"\22\2"+
		"\u0141\u0142\7%\2\2\u0142\u0148\3\2\2\2\u0143\u0144\7$\2\2\u0144\u0145"+
		"\5\"\22\2\u0145\u0146\7%\2\2\u0146\u0148\3\2\2\2\u0147\u0130\3\2\2\2\u0147"+
		"\u0134\3\2\2\2\u0147\u013c\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0143\3\2"+
		"\2\2\u0148%\3\2\2\2&)\618>EKQV\\aglt\u008b\u0098\u00a3\u00ab\u00b4\u00be"+
		"\u00c7\u00cb\u00d5\u00e4\u00f0\u00f4\u00f6\u0100\u0104\u010a\u0111\u0115"+
		"\u0121\u012b\u012e\u0139\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}