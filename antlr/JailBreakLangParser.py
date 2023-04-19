# Generated from JailBreakLang.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,44,328,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,4,0,38,8,0,11,0,12,0,
        39,1,0,1,0,1,1,1,1,1,1,1,1,3,1,48,8,1,1,2,1,2,1,2,1,2,1,2,3,2,55,
        8,2,1,2,1,2,1,2,1,2,3,2,61,8,2,1,2,1,2,1,2,1,2,1,2,3,2,68,8,2,1,
        2,1,2,1,2,1,2,3,2,74,8,2,1,2,1,2,1,2,1,2,3,2,80,8,2,1,2,1,2,1,2,
        3,2,85,8,2,1,2,1,2,1,2,1,2,3,2,91,8,2,1,2,1,2,1,2,3,2,96,8,2,1,2,
        1,2,1,2,1,2,3,2,102,8,2,1,2,1,2,1,2,3,2,107,8,2,1,2,1,2,1,2,1,2,
        5,2,113,8,2,10,2,12,2,116,9,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,138,8,2,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,151,8,3,1,4,1,4,1,4,1,
        4,1,5,1,5,1,5,5,5,160,8,5,10,5,12,5,163,9,5,1,6,1,6,1,6,5,6,168,
        8,6,10,6,12,6,171,9,6,1,7,1,7,1,7,1,7,1,7,1,7,3,7,179,8,7,1,8,1,
        8,1,8,1,8,1,8,1,8,5,8,187,8,8,10,8,12,8,190,9,8,1,8,1,8,1,8,1,8,
        5,8,196,8,8,10,8,12,8,199,9,8,1,8,3,8,202,8,8,1,8,1,8,1,8,1,8,1,
        8,1,8,5,8,210,8,8,10,8,12,8,213,9,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,5,8,225,8,8,10,8,12,8,228,9,8,1,8,1,8,1,8,1,8,1,8,1,
        8,1,8,5,8,237,8,8,10,8,12,8,240,9,8,1,8,3,8,243,8,8,3,8,245,8,8,
        1,9,1,9,1,9,1,9,1,9,1,9,5,9,253,8,9,10,9,12,9,256,9,9,1,9,3,9,259,
        8,9,1,9,1,9,5,9,263,8,9,10,9,12,9,266,9,9,1,9,1,9,1,10,1,10,3,10,
        272,8,10,1,11,1,11,3,11,276,8,11,1,12,1,12,1,13,1,13,1,13,1,13,1,
        14,1,14,1,14,1,14,3,14,288,8,14,1,15,1,15,1,16,1,16,1,16,1,16,5,
        16,296,8,16,10,16,12,16,299,9,16,3,16,301,8,16,1,17,1,17,1,17,1,
        17,1,17,1,17,1,17,5,17,310,8,17,10,17,12,17,313,9,17,1,17,1,17,1,
        17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,3,17,326,8,17,1,17,0,
        0,18,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,0,4,1,0,30,
        33,1,0,38,39,1,0,36,37,1,0,21,24,366,0,37,1,0,0,0,2,47,1,0,0,0,4,
        137,1,0,0,0,6,150,1,0,0,0,8,152,1,0,0,0,10,156,1,0,0,0,12,164,1,
        0,0,0,14,178,1,0,0,0,16,244,1,0,0,0,18,246,1,0,0,0,20,271,1,0,0,
        0,22,275,1,0,0,0,24,277,1,0,0,0,26,279,1,0,0,0,28,287,1,0,0,0,30,
        289,1,0,0,0,32,300,1,0,0,0,34,325,1,0,0,0,36,38,3,2,1,0,37,36,1,
        0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,41,1,0,0,0,41,
        42,5,0,0,1,42,1,1,0,0,0,43,48,3,4,2,0,44,48,3,16,8,0,45,48,3,18,
        9,0,46,48,3,6,3,0,47,43,1,0,0,0,47,44,1,0,0,0,47,45,1,0,0,0,47,46,
        1,0,0,0,48,3,1,0,0,0,49,50,5,1,0,0,50,54,5,2,0,0,51,55,3,10,5,0,
        52,55,5,41,0,0,53,55,5,42,0,0,54,51,1,0,0,0,54,52,1,0,0,0,54,53,
        1,0,0,0,55,56,1,0,0,0,56,60,5,3,0,0,57,61,3,10,5,0,58,61,5,41,0,
        0,59,61,5,42,0,0,60,57,1,0,0,0,60,58,1,0,0,0,60,59,1,0,0,0,61,138,
        1,0,0,0,62,63,5,4,0,0,63,67,5,2,0,0,64,68,3,10,5,0,65,68,5,41,0,
        0,66,68,5,42,0,0,67,64,1,0,0,0,67,65,1,0,0,0,67,66,1,0,0,0,68,69,
        1,0,0,0,69,73,5,3,0,0,70,74,3,10,5,0,71,74,5,41,0,0,72,74,5,42,0,
        0,73,70,1,0,0,0,73,71,1,0,0,0,73,72,1,0,0,0,74,138,1,0,0,0,75,76,
        5,5,0,0,76,79,5,2,0,0,77,80,3,10,5,0,78,80,5,41,0,0,79,77,1,0,0,
        0,79,78,1,0,0,0,80,81,1,0,0,0,81,84,5,3,0,0,82,85,3,10,5,0,83,85,
        5,41,0,0,84,82,1,0,0,0,84,83,1,0,0,0,85,138,1,0,0,0,86,87,5,6,0,
        0,87,90,5,2,0,0,88,91,3,10,5,0,89,91,5,41,0,0,90,88,1,0,0,0,90,89,
        1,0,0,0,91,92,1,0,0,0,92,95,5,3,0,0,93,96,3,10,5,0,94,96,5,41,0,
        0,95,93,1,0,0,0,95,94,1,0,0,0,96,138,1,0,0,0,97,98,5,7,0,0,98,101,
        5,2,0,0,99,102,3,10,5,0,100,102,5,41,0,0,101,99,1,0,0,0,101,100,
        1,0,0,0,102,103,1,0,0,0,103,106,5,3,0,0,104,107,3,10,5,0,105,107,
        5,41,0,0,106,104,1,0,0,0,106,105,1,0,0,0,107,108,1,0,0,0,108,109,
        5,3,0,0,109,110,3,10,5,0,110,114,5,8,0,0,111,113,3,22,11,0,112,111,
        1,0,0,0,113,116,1,0,0,0,114,112,1,0,0,0,114,115,1,0,0,0,115,117,
        1,0,0,0,116,114,1,0,0,0,117,118,5,9,0,0,118,138,1,0,0,0,119,120,
        5,10,0,0,120,121,5,2,0,0,121,122,3,10,5,0,122,123,5,3,0,0,123,124,
        3,10,5,0,124,138,1,0,0,0,125,126,5,11,0,0,126,127,5,2,0,0,127,128,
        3,10,5,0,128,129,5,3,0,0,129,130,3,10,5,0,130,138,1,0,0,0,131,132,
        5,12,0,0,132,133,5,2,0,0,133,134,3,10,5,0,134,135,5,3,0,0,135,136,
        3,10,5,0,136,138,1,0,0,0,137,49,1,0,0,0,137,62,1,0,0,0,137,75,1,
        0,0,0,137,86,1,0,0,0,137,97,1,0,0,0,137,119,1,0,0,0,137,125,1,0,
        0,0,137,131,1,0,0,0,138,5,1,0,0,0,139,140,5,13,0,0,140,141,5,41,
        0,0,141,142,5,2,0,0,142,151,3,10,5,0,143,144,5,41,0,0,144,145,5,
        2,0,0,145,151,3,10,5,0,146,147,5,14,0,0,147,148,5,41,0,0,148,149,
        5,2,0,0,149,151,3,32,16,0,150,139,1,0,0,0,150,143,1,0,0,0,150,146,
        1,0,0,0,151,7,1,0,0,0,152,153,3,10,5,0,153,154,7,0,0,0,154,155,3,
        10,5,0,155,9,1,0,0,0,156,161,3,12,6,0,157,158,7,1,0,0,158,160,3,
        12,6,0,159,157,1,0,0,0,160,163,1,0,0,0,161,159,1,0,0,0,161,162,1,
        0,0,0,162,11,1,0,0,0,163,161,1,0,0,0,164,169,3,14,7,0,165,166,7,
        2,0,0,166,168,3,14,7,0,167,165,1,0,0,0,168,171,1,0,0,0,169,167,1,
        0,0,0,169,170,1,0,0,0,170,13,1,0,0,0,171,169,1,0,0,0,172,179,5,41,
        0,0,173,179,5,43,0,0,174,175,5,34,0,0,175,176,3,10,5,0,176,177,5,
        35,0,0,177,179,1,0,0,0,178,172,1,0,0,0,178,173,1,0,0,0,178,174,1,
        0,0,0,179,15,1,0,0,0,180,181,5,15,0,0,181,182,5,34,0,0,182,183,3,
        32,16,0,183,184,5,35,0,0,184,188,5,8,0,0,185,187,3,20,10,0,186,185,
        1,0,0,0,187,190,1,0,0,0,188,186,1,0,0,0,188,189,1,0,0,0,189,191,
        1,0,0,0,190,188,1,0,0,0,191,201,5,9,0,0,192,193,5,16,0,0,193,197,
        5,8,0,0,194,196,3,20,10,0,195,194,1,0,0,0,196,199,1,0,0,0,197,195,
        1,0,0,0,197,198,1,0,0,0,198,200,1,0,0,0,199,197,1,0,0,0,200,202,
        5,9,0,0,201,192,1,0,0,0,201,202,1,0,0,0,202,245,1,0,0,0,203,204,
        5,17,0,0,204,205,5,34,0,0,205,206,3,32,16,0,206,207,5,35,0,0,207,
        211,5,8,0,0,208,210,3,20,10,0,209,208,1,0,0,0,210,213,1,0,0,0,211,
        209,1,0,0,0,211,212,1,0,0,0,212,214,1,0,0,0,213,211,1,0,0,0,214,
        215,5,9,0,0,215,245,1,0,0,0,216,217,5,18,0,0,217,218,5,34,0,0,218,
        219,5,41,0,0,219,220,5,19,0,0,220,221,3,10,5,0,221,222,5,35,0,0,
        222,226,5,8,0,0,223,225,3,20,10,0,224,223,1,0,0,0,225,228,1,0,0,
        0,226,224,1,0,0,0,226,227,1,0,0,0,227,229,1,0,0,0,228,226,1,0,0,
        0,229,230,5,9,0,0,230,245,1,0,0,0,231,242,5,41,0,0,232,233,5,34,
        0,0,233,238,5,41,0,0,234,235,5,3,0,0,235,237,5,41,0,0,236,234,1,
        0,0,0,237,240,1,0,0,0,238,236,1,0,0,0,238,239,1,0,0,0,239,241,1,
        0,0,0,240,238,1,0,0,0,241,243,5,35,0,0,242,232,1,0,0,0,242,243,1,
        0,0,0,243,245,1,0,0,0,244,180,1,0,0,0,244,203,1,0,0,0,244,216,1,
        0,0,0,244,231,1,0,0,0,245,17,1,0,0,0,246,247,5,20,0,0,247,258,5,
        41,0,0,248,249,5,34,0,0,249,254,5,41,0,0,250,251,5,3,0,0,251,253,
        5,41,0,0,252,250,1,0,0,0,253,256,1,0,0,0,254,252,1,0,0,0,254,255,
        1,0,0,0,255,257,1,0,0,0,256,254,1,0,0,0,257,259,5,35,0,0,258,248,
        1,0,0,0,258,259,1,0,0,0,259,260,1,0,0,0,260,264,5,8,0,0,261,263,
        3,20,10,0,262,261,1,0,0,0,263,266,1,0,0,0,264,262,1,0,0,0,264,265,
        1,0,0,0,265,267,1,0,0,0,266,264,1,0,0,0,267,268,5,9,0,0,268,19,1,
        0,0,0,269,272,3,4,2,0,270,272,3,16,8,0,271,269,1,0,0,0,271,270,1,
        0,0,0,272,21,1,0,0,0,273,276,3,16,8,0,274,276,3,24,12,0,275,273,
        1,0,0,0,275,274,1,0,0,0,276,23,1,0,0,0,277,278,7,3,0,0,278,25,1,
        0,0,0,279,280,3,10,5,0,280,281,7,0,0,0,281,282,3,10,5,0,282,27,1,
        0,0,0,283,288,5,25,0,0,284,288,5,26,0,0,285,288,3,26,13,0,286,288,
        3,30,15,0,287,283,1,0,0,0,287,284,1,0,0,0,287,285,1,0,0,0,287,286,
        1,0,0,0,288,29,1,0,0,0,289,290,5,41,0,0,290,31,1,0,0,0,291,301,1,
        0,0,0,292,297,3,34,17,0,293,294,5,27,0,0,294,296,3,32,16,0,295,293,
        1,0,0,0,296,299,1,0,0,0,297,295,1,0,0,0,297,298,1,0,0,0,298,301,
        1,0,0,0,299,297,1,0,0,0,300,291,1,0,0,0,300,292,1,0,0,0,301,33,1,
        0,0,0,302,303,5,34,0,0,303,304,3,32,16,0,304,305,5,35,0,0,305,326,
        1,0,0,0,306,311,3,28,14,0,307,308,5,28,0,0,308,310,3,34,17,0,309,
        307,1,0,0,0,310,313,1,0,0,0,311,309,1,0,0,0,311,312,1,0,0,0,312,
        326,1,0,0,0,313,311,1,0,0,0,314,315,5,29,0,0,315,326,3,28,14,0,316,
        317,5,29,0,0,317,318,5,34,0,0,318,319,3,32,16,0,319,320,5,35,0,0,
        320,326,1,0,0,0,321,322,5,34,0,0,322,323,3,32,16,0,323,324,5,35,
        0,0,324,326,1,0,0,0,325,302,1,0,0,0,325,306,1,0,0,0,325,314,1,0,
        0,0,325,316,1,0,0,0,325,321,1,0,0,0,326,35,1,0,0,0,36,39,47,54,60,
        67,73,79,84,90,95,101,106,114,137,150,161,169,178,188,197,201,211,
        226,238,242,244,254,258,264,271,275,287,297,300,311,325
    ]

class JailBreakLangParser ( Parser ):

    grammarFileName = "JailBreakLang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'WALL'", "'='", "','", "'TRAP'", "'KEY'", 
                     "'GATE'", "'GUARD'", "'{'", "'}'", "'MAP'", "'PLAYER'", 
                     "'EXIT'", "'INT'", "'BOOLEAN'", "'IF'", "'ELSE'", "'WHILE'", 
                     "'FOR'", "'IN'", "'FUN'", "'LEFT'", "'RIGHT'", "'UP'", 
                     "'DOWN'", "'TRUE'", "'FALSE'", "'OR'", "'AND'", "'NOT'", 
                     "'=='", "'!='", "'<'", "'>'", "'('", "')'", "'*'", 
                     "'/'", "'+'", "'-'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "EQUALS", "NOT_EQUALS", 
                      "LESS_THAN", "GREATER_THAN", "LPAREN", "RPAREN", "MUL", 
                      "DIV", "ADD", "SUB", "COMMENT", "ID", "RAND", "INT", 
                      "WS" ]

    RULE_start = 0
    RULE_code = 1
    RULE_objects = 2
    RULE_variables = 3
    RULE_comparison = 4
    RULE_expr = 5
    RULE_term = 6
    RULE_factor = 7
    RULE_commands = 8
    RULE_function_declaration = 9
    RULE_expressions = 10
    RULE_guard_extra_code = 11
    RULE_guard_control = 12
    RULE_value_comparison = 13
    RULE_booleanValue = 14
    RULE_variable_value = 15
    RULE_condition = 16
    RULE_condition_product = 17

    ruleNames =  [ "start", "code", "objects", "variables", "comparison", 
                   "expr", "term", "factor", "commands", "function_declaration", 
                   "expressions", "guard_extra_code", "guard_control", "value_comparison", 
                   "booleanValue", "variable_value", "condition", "condition_product" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    EQUALS=30
    NOT_EQUALS=31
    LESS_THAN=32
    GREATER_THAN=33
    LPAREN=34
    RPAREN=35
    MUL=36
    DIV=37
    ADD=38
    SUB=39
    COMMENT=40
    ID=41
    RAND=42
    INT=43
    WS=44

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(JailBreakLangParser.EOF, 0)

        def code(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.CodeContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.CodeContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = JailBreakLangParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 36
                self.code()
                self.state = 39 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 2199024762098) != 0)):
                    break

            self.state = 41
            self.match(JailBreakLangParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def objects(self):
            return self.getTypedRuleContext(JailBreakLangParser.ObjectsContext,0)


        def commands(self):
            return self.getTypedRuleContext(JailBreakLangParser.CommandsContext,0)


        def function_declaration(self):
            return self.getTypedRuleContext(JailBreakLangParser.Function_declarationContext,0)


        def variables(self):
            return self.getTypedRuleContext(JailBreakLangParser.VariablesContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_code

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCode" ):
                listener.enterCode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCode" ):
                listener.exitCode(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCode" ):
                return visitor.visitCode(self)
            else:
                return visitor.visitChildren(self)




    def code(self):

        localctx = JailBreakLangParser.CodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_code)
        try:
            self.state = 47
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 43
                self.objects()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 44
                self.commands()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 45
                self.function_declaration()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 46
                self.variables()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ObjectsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ExprContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ExprContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def RAND(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.RAND)
            else:
                return self.getToken(JailBreakLangParser.RAND, i)

        def guard_extra_code(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.Guard_extra_codeContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.Guard_extra_codeContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_objects

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObjects" ):
                listener.enterObjects(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObjects" ):
                listener.exitObjects(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitObjects" ):
                return visitor.visitObjects(self)
            else:
                return visitor.visitChildren(self)




    def objects(self):

        localctx = JailBreakLangParser.ObjectsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_objects)
        self._la = 0 # Token type
        try:
            self.state = 137
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 49
                self.match(JailBreakLangParser.T__0)
                self.state = 50
                self.match(JailBreakLangParser.T__1)
                self.state = 54
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 51
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 52
                    self.match(JailBreakLangParser.ID)
                    pass

                elif la_ == 3:
                    self.state = 53
                    self.match(JailBreakLangParser.RAND)
                    pass


                self.state = 56
                self.match(JailBreakLangParser.T__2)
                self.state = 60
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                if la_ == 1:
                    self.state = 57
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 58
                    self.match(JailBreakLangParser.ID)
                    pass

                elif la_ == 3:
                    self.state = 59
                    self.match(JailBreakLangParser.RAND)
                    pass


                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.match(JailBreakLangParser.T__3)
                self.state = 63
                self.match(JailBreakLangParser.T__1)
                self.state = 67
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                if la_ == 1:
                    self.state = 64
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 65
                    self.match(JailBreakLangParser.ID)
                    pass

                elif la_ == 3:
                    self.state = 66
                    self.match(JailBreakLangParser.RAND)
                    pass


                self.state = 69
                self.match(JailBreakLangParser.T__2)
                self.state = 73
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                if la_ == 1:
                    self.state = 70
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 71
                    self.match(JailBreakLangParser.ID)
                    pass

                elif la_ == 3:
                    self.state = 72
                    self.match(JailBreakLangParser.RAND)
                    pass


                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 75
                self.match(JailBreakLangParser.T__4)
                self.state = 76
                self.match(JailBreakLangParser.T__1)
                self.state = 79
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
                if la_ == 1:
                    self.state = 77
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 78
                    self.match(JailBreakLangParser.ID)
                    pass


                self.state = 81
                self.match(JailBreakLangParser.T__2)
                self.state = 84
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                if la_ == 1:
                    self.state = 82
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 83
                    self.match(JailBreakLangParser.ID)
                    pass


                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 86
                self.match(JailBreakLangParser.T__5)
                self.state = 87
                self.match(JailBreakLangParser.T__1)
                self.state = 90
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
                if la_ == 1:
                    self.state = 88
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 89
                    self.match(JailBreakLangParser.ID)
                    pass


                self.state = 92
                self.match(JailBreakLangParser.T__2)
                self.state = 95
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                if la_ == 1:
                    self.state = 93
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 94
                    self.match(JailBreakLangParser.ID)
                    pass


                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 5)
                self.state = 97
                self.match(JailBreakLangParser.T__6)
                self.state = 98
                self.match(JailBreakLangParser.T__1)
                self.state = 101
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
                if la_ == 1:
                    self.state = 99
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 100
                    self.match(JailBreakLangParser.ID)
                    pass


                self.state = 103
                self.match(JailBreakLangParser.T__2)
                self.state = 106
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
                if la_ == 1:
                    self.state = 104
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 105
                    self.match(JailBreakLangParser.ID)
                    pass


                self.state = 108
                self.match(JailBreakLangParser.T__2)
                self.state = 109
                self.expr()
                self.state = 110
                self.match(JailBreakLangParser.T__7)
                self.state = 114
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199055138816) != 0):
                    self.state = 111
                    self.guard_extra_code()
                    self.state = 116
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 117
                self.match(JailBreakLangParser.T__8)
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 6)
                self.state = 119
                self.match(JailBreakLangParser.T__9)
                self.state = 120
                self.match(JailBreakLangParser.T__1)
                self.state = 121
                self.expr()
                self.state = 122
                self.match(JailBreakLangParser.T__2)
                self.state = 123
                self.expr()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 7)
                self.state = 125
                self.match(JailBreakLangParser.T__10)
                self.state = 126
                self.match(JailBreakLangParser.T__1)
                self.state = 127
                self.expr()
                self.state = 128
                self.match(JailBreakLangParser.T__2)
                self.state = 129
                self.expr()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 8)
                self.state = 131
                self.match(JailBreakLangParser.T__11)
                self.state = 132
                self.match(JailBreakLangParser.T__1)
                self.state = 133
                self.expr()
                self.state = 134
                self.match(JailBreakLangParser.T__2)
                self.state = 135
                self.expr()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariablesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

        def expr(self):
            return self.getTypedRuleContext(JailBreakLangParser.ExprContext,0)


        def condition(self):
            return self.getTypedRuleContext(JailBreakLangParser.ConditionContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_variables

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariables" ):
                listener.enterVariables(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariables" ):
                listener.exitVariables(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariables" ):
                return visitor.visitVariables(self)
            else:
                return visitor.visitChildren(self)




    def variables(self):

        localctx = JailBreakLangParser.VariablesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_variables)
        try:
            self.state = 150
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 139
                self.match(JailBreakLangParser.T__12)
                self.state = 140
                self.match(JailBreakLangParser.ID)
                self.state = 141
                self.match(JailBreakLangParser.T__1)
                self.state = 142
                self.expr()
                pass
            elif token in [41]:
                self.enterOuterAlt(localctx, 2)
                self.state = 143
                self.match(JailBreakLangParser.ID)
                self.state = 144
                self.match(JailBreakLangParser.T__1)
                self.state = 145
                self.expr()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 3)
                self.state = 146
                self.match(JailBreakLangParser.T__13)
                self.state = 147
                self.match(JailBreakLangParser.ID)
                self.state = 148
                self.match(JailBreakLangParser.T__1)
                self.state = 149
                self.condition()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComparisonContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ExprContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ExprContext,i)


        def EQUALS(self):
            return self.getToken(JailBreakLangParser.EQUALS, 0)

        def NOT_EQUALS(self):
            return self.getToken(JailBreakLangParser.NOT_EQUALS, 0)

        def LESS_THAN(self):
            return self.getToken(JailBreakLangParser.LESS_THAN, 0)

        def GREATER_THAN(self):
            return self.getToken(JailBreakLangParser.GREATER_THAN, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_comparison

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparison" ):
                listener.enterComparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparison" ):
                listener.exitComparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparison" ):
                return visitor.visitComparison(self)
            else:
                return visitor.visitChildren(self)




    def comparison(self):

        localctx = JailBreakLangParser.ComparisonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_comparison)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 152
            self.expr()
            self.state = 153
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 16106127360) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 154
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.TermContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.TermContext,i)


        def ADD(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ADD)
            else:
                return self.getToken(JailBreakLangParser.ADD, i)

        def SUB(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.SUB)
            else:
                return self.getToken(JailBreakLangParser.SUB, i)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = JailBreakLangParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.term()
            self.state = 161
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==38 or _la==39:
                self.state = 157
                _la = self._input.LA(1)
                if not(_la==38 or _la==39):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 158
                self.term()
                self.state = 163
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.FactorContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.FactorContext,i)


        def MUL(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.MUL)
            else:
                return self.getToken(JailBreakLangParser.MUL, i)

        def DIV(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.DIV)
            else:
                return self.getToken(JailBreakLangParser.DIV, i)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm" ):
                return visitor.visitTerm(self)
            else:
                return visitor.visitChildren(self)




    def term(self):

        localctx = JailBreakLangParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 164
            self.factor()
            self.state = 169
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==36 or _la==37:
                self.state = 165
                _la = self._input.LA(1)
                if not(_la==36 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 166
                self.factor()
                self.state = 171
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def LPAREN(self):
            return self.getToken(JailBreakLangParser.LPAREN, 0)

        def expr(self):
            return self.getTypedRuleContext(JailBreakLangParser.ExprContext,0)


        def RPAREN(self):
            return self.getToken(JailBreakLangParser.RPAREN, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor" ):
                return visitor.visitFactor(self)
            else:
                return visitor.visitChildren(self)




    def factor(self):

        localctx = JailBreakLangParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_factor)
        try:
            self.state = 178
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [41]:
                self.enterOuterAlt(localctx, 1)
                self.state = 172
                self.match(JailBreakLangParser.ID)
                pass
            elif token in [43]:
                self.enterOuterAlt(localctx, 2)
                self.state = 173
                self.match(JailBreakLangParser.INT)
                pass
            elif token in [34]:
                self.enterOuterAlt(localctx, 3)
                self.state = 174
                self.match(JailBreakLangParser.LPAREN)
                self.state = 175
                self.expr()
                self.state = 176
                self.match(JailBreakLangParser.RPAREN)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(JailBreakLangParser.LPAREN, 0)

        def condition(self):
            return self.getTypedRuleContext(JailBreakLangParser.ConditionContext,0)


        def RPAREN(self):
            return self.getToken(JailBreakLangParser.RPAREN, 0)

        def expressions(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ExpressionsContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ExpressionsContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def expr(self):
            return self.getTypedRuleContext(JailBreakLangParser.ExprContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_commands

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommands" ):
                listener.enterCommands(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommands" ):
                listener.exitCommands(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommands" ):
                return visitor.visitCommands(self)
            else:
                return visitor.visitChildren(self)




    def commands(self):

        localctx = JailBreakLangParser.CommandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_commands)
        self._la = 0 # Token type
        try:
            self.state = 244
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                self.enterOuterAlt(localctx, 1)
                self.state = 180
                self.match(JailBreakLangParser.T__14)
                self.state = 181
                self.match(JailBreakLangParser.LPAREN)
                self.state = 182
                self.condition()
                self.state = 183
                self.match(JailBreakLangParser.RPAREN)
                self.state = 184
                self.match(JailBreakLangParser.T__7)
                self.state = 188
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199023688946) != 0):
                    self.state = 185
                    self.expressions()
                    self.state = 190
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 191
                self.match(JailBreakLangParser.T__8)
                self.state = 201
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==16:
                    self.state = 192
                    self.match(JailBreakLangParser.T__15)
                    self.state = 193
                    self.match(JailBreakLangParser.T__7)
                    self.state = 197
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199023688946) != 0):
                        self.state = 194
                        self.expressions()
                        self.state = 199
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 200
                    self.match(JailBreakLangParser.T__8)


                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 203
                self.match(JailBreakLangParser.T__16)
                self.state = 204
                self.match(JailBreakLangParser.LPAREN)
                self.state = 205
                self.condition()
                self.state = 206
                self.match(JailBreakLangParser.RPAREN)
                self.state = 207
                self.match(JailBreakLangParser.T__7)
                self.state = 211
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199023688946) != 0):
                    self.state = 208
                    self.expressions()
                    self.state = 213
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 214
                self.match(JailBreakLangParser.T__8)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 216
                self.match(JailBreakLangParser.T__17)
                self.state = 217
                self.match(JailBreakLangParser.LPAREN)
                self.state = 218
                self.match(JailBreakLangParser.ID)
                self.state = 219
                self.match(JailBreakLangParser.T__18)
                self.state = 220
                self.expr()
                self.state = 221
                self.match(JailBreakLangParser.RPAREN)
                self.state = 222
                self.match(JailBreakLangParser.T__7)
                self.state = 226
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199023688946) != 0):
                    self.state = 223
                    self.expressions()
                    self.state = 228
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 229
                self.match(JailBreakLangParser.T__8)
                pass
            elif token in [41]:
                self.enterOuterAlt(localctx, 4)
                self.state = 231
                self.match(JailBreakLangParser.ID)
                self.state = 242
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==34:
                    self.state = 232
                    self.match(JailBreakLangParser.LPAREN)
                    self.state = 233
                    self.match(JailBreakLangParser.ID)
                    self.state = 238
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==3:
                        self.state = 234
                        self.match(JailBreakLangParser.T__2)
                        self.state = 235
                        self.match(JailBreakLangParser.ID)
                        self.state = 240
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 241
                    self.match(JailBreakLangParser.RPAREN)


                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_declarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def LPAREN(self):
            return self.getToken(JailBreakLangParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(JailBreakLangParser.RPAREN, 0)

        def expressions(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ExpressionsContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ExpressionsContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_function_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_declaration" ):
                listener.enterFunction_declaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_declaration" ):
                listener.exitFunction_declaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_declaration" ):
                return visitor.visitFunction_declaration(self)
            else:
                return visitor.visitChildren(self)




    def function_declaration(self):

        localctx = JailBreakLangParser.Function_declarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_function_declaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 246
            self.match(JailBreakLangParser.T__19)
            self.state = 247
            self.match(JailBreakLangParser.ID)
            self.state = 258
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==34:
                self.state = 248
                self.match(JailBreakLangParser.LPAREN)
                self.state = 249
                self.match(JailBreakLangParser.ID)
                self.state = 254
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 250
                    self.match(JailBreakLangParser.T__2)
                    self.state = 251
                    self.match(JailBreakLangParser.ID)
                    self.state = 256
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 257
                self.match(JailBreakLangParser.RPAREN)


            self.state = 260
            self.match(JailBreakLangParser.T__7)
            self.state = 264
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2199023688946) != 0):
                self.state = 261
                self.expressions()
                self.state = 266
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 267
            self.match(JailBreakLangParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def objects(self):
            return self.getTypedRuleContext(JailBreakLangParser.ObjectsContext,0)


        def commands(self):
            return self.getTypedRuleContext(JailBreakLangParser.CommandsContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_expressions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressions" ):
                listener.enterExpressions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressions" ):
                listener.exitExpressions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressions" ):
                return visitor.visitExpressions(self)
            else:
                return visitor.visitChildren(self)




    def expressions(self):

        localctx = JailBreakLangParser.ExpressionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_expressions)
        try:
            self.state = 271
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 4, 5, 6, 7, 10, 11, 12]:
                self.enterOuterAlt(localctx, 1)
                self.state = 269
                self.objects()
                pass
            elif token in [15, 17, 18, 41]:
                self.enterOuterAlt(localctx, 2)
                self.state = 270
                self.commands()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Guard_extra_codeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def commands(self):
            return self.getTypedRuleContext(JailBreakLangParser.CommandsContext,0)


        def guard_control(self):
            return self.getTypedRuleContext(JailBreakLangParser.Guard_controlContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_guard_extra_code

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGuard_extra_code" ):
                listener.enterGuard_extra_code(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGuard_extra_code" ):
                listener.exitGuard_extra_code(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGuard_extra_code" ):
                return visitor.visitGuard_extra_code(self)
            else:
                return visitor.visitChildren(self)




    def guard_extra_code(self):

        localctx = JailBreakLangParser.Guard_extra_codeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_guard_extra_code)
        try:
            self.state = 275
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15, 17, 18, 41]:
                self.enterOuterAlt(localctx, 1)
                self.state = 273
                self.commands()
                pass
            elif token in [21, 22, 23, 24]:
                self.enterOuterAlt(localctx, 2)
                self.state = 274
                self.guard_control()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Guard_controlContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_guard_control

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGuard_control" ):
                listener.enterGuard_control(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGuard_control" ):
                listener.exitGuard_control(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGuard_control" ):
                return visitor.visitGuard_control(self)
            else:
                return visitor.visitChildren(self)




    def guard_control(self):

        localctx = JailBreakLangParser.Guard_controlContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_guard_control)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 277
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 31457280) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Value_comparisonContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ExprContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ExprContext,i)


        def EQUALS(self):
            return self.getToken(JailBreakLangParser.EQUALS, 0)

        def NOT_EQUALS(self):
            return self.getToken(JailBreakLangParser.NOT_EQUALS, 0)

        def LESS_THAN(self):
            return self.getToken(JailBreakLangParser.LESS_THAN, 0)

        def GREATER_THAN(self):
            return self.getToken(JailBreakLangParser.GREATER_THAN, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_value_comparison

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue_comparison" ):
                listener.enterValue_comparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue_comparison" ):
                listener.exitValue_comparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue_comparison" ):
                return visitor.visitValue_comparison(self)
            else:
                return visitor.visitChildren(self)




    def value_comparison(self):

        localctx = JailBreakLangParser.Value_comparisonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_value_comparison)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 279
            self.expr()
            self.state = 280
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 16106127360) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 281
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BooleanValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value_comparison(self):
            return self.getTypedRuleContext(JailBreakLangParser.Value_comparisonContext,0)


        def variable_value(self):
            return self.getTypedRuleContext(JailBreakLangParser.Variable_valueContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_booleanValue

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBooleanValue" ):
                listener.enterBooleanValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBooleanValue" ):
                listener.exitBooleanValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBooleanValue" ):
                return visitor.visitBooleanValue(self)
            else:
                return visitor.visitChildren(self)




    def booleanValue(self):

        localctx = JailBreakLangParser.BooleanValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_booleanValue)
        try:
            self.state = 287
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,31,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 283
                self.match(JailBreakLangParser.T__24)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 284
                self.match(JailBreakLangParser.T__25)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 285
                self.value_comparison()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 286
                self.variable_value()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_valueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_variable_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable_value" ):
                listener.enterVariable_value(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable_value" ):
                listener.exitVariable_value(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_value" ):
                return visitor.visitVariable_value(self)
            else:
                return visitor.visitChildren(self)




    def variable_value(self):

        localctx = JailBreakLangParser.Variable_valueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_variable_value)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 289
            self.match(JailBreakLangParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition_product(self):
            return self.getTypedRuleContext(JailBreakLangParser.Condition_productContext,0)


        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.ConditionContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.ConditionContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = JailBreakLangParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_condition)
        try:
            self.state = 300
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,33,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)

                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 292
                self.condition_product()
                self.state = 297
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,32,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 293
                        self.match(JailBreakLangParser.T__26)
                        self.state = 294
                        self.condition() 
                    self.state = 299
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,32,self._ctx)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condition_productContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(JailBreakLangParser.LPAREN, 0)

        def condition(self):
            return self.getTypedRuleContext(JailBreakLangParser.ConditionContext,0)


        def RPAREN(self):
            return self.getToken(JailBreakLangParser.RPAREN, 0)

        def booleanValue(self):
            return self.getTypedRuleContext(JailBreakLangParser.BooleanValueContext,0)


        def condition_product(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.Condition_productContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.Condition_productContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_condition_product

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition_product" ):
                listener.enterCondition_product(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition_product" ):
                listener.exitCondition_product(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition_product" ):
                return visitor.visitCondition_product(self)
            else:
                return visitor.visitChildren(self)




    def condition_product(self):

        localctx = JailBreakLangParser.Condition_productContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_condition_product)
        try:
            self.state = 325
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,35,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 302
                self.match(JailBreakLangParser.LPAREN)
                self.state = 303
                self.condition()
                self.state = 304
                self.match(JailBreakLangParser.RPAREN)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 306
                self.booleanValue()
                self.state = 311
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,34,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 307
                        self.match(JailBreakLangParser.T__27)
                        self.state = 308
                        self.condition_product() 
                    self.state = 313
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,34,self._ctx)

                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 314
                self.match(JailBreakLangParser.T__28)
                self.state = 315
                self.booleanValue()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 316
                self.match(JailBreakLangParser.T__28)
                self.state = 317
                self.match(JailBreakLangParser.LPAREN)
                self.state = 318
                self.condition()
                self.state = 319
                self.match(JailBreakLangParser.RPAREN)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 321
                self.match(JailBreakLangParser.LPAREN)
                self.state = 322
                self.condition()
                self.state = 323
                self.match(JailBreakLangParser.RPAREN)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





