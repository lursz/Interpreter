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
        4,1,38,339,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,1,0,1,0,1,0,1,0,1,0,1,0,
        1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,5,0,39,8,0,10,0,12,0,42,9,0,
        1,1,1,1,1,1,3,1,47,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,5,2,77,8,2,10,2,12,2,80,9,2,1,2,1,2,1,2,1,2,5,2,86,8,2,10,
        2,12,2,89,9,2,1,2,3,2,92,8,2,1,3,1,3,1,3,1,3,1,3,1,3,5,3,100,8,3,
        10,3,12,3,103,9,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,113,8,3,10,
        3,12,3,116,9,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,128,8,
        3,10,3,12,3,131,9,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,139,8,3,10,3,12,
        3,142,9,3,1,3,5,3,145,8,3,10,3,12,3,148,9,3,3,3,150,8,3,1,4,1,4,
        1,4,1,4,1,4,1,4,5,4,158,8,4,10,4,12,4,161,9,4,1,4,5,4,164,8,4,10,
        4,12,4,167,9,4,1,4,1,4,5,4,171,8,4,10,4,12,4,174,9,4,1,4,1,4,1,5,
        1,5,3,5,180,8,5,1,6,1,6,1,6,1,6,1,6,1,6,5,6,188,8,6,10,6,12,6,191,
        9,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,5,6,201,8,6,10,6,12,6,204,9,
        6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,5,6,216,8,6,10,6,12,6,
        219,9,6,1,6,1,6,1,6,1,6,1,6,1,6,5,6,227,8,6,10,6,12,6,230,9,6,1,
        6,5,6,233,8,6,10,6,12,6,236,9,6,3,6,238,8,6,1,7,1,7,3,7,242,8,7,
        1,8,1,8,1,8,1,8,1,8,1,8,5,8,250,8,8,10,8,12,8,253,9,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,5,8,263,8,8,10,8,12,8,266,9,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,1,8,1,8,5,8,278,8,8,10,8,12,8,281,9,8,1,8,1,
        8,1,8,1,8,1,8,1,8,5,8,289,8,8,10,8,12,8,292,9,8,1,8,5,8,295,8,8,
        10,8,12,8,298,9,8,3,8,300,8,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,308,8,
        9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,
        10,1,10,1,10,1,10,3,10,326,8,10,1,10,1,10,1,10,1,10,1,10,1,10,5,
        10,334,8,10,10,10,12,10,337,9,10,1,10,0,1,20,11,0,2,4,6,8,10,12,
        14,16,18,20,0,2,1,0,35,37,2,0,35,35,37,37,378,0,22,1,0,0,0,2,46,
        1,0,0,0,4,91,1,0,0,0,6,149,1,0,0,0,8,151,1,0,0,0,10,179,1,0,0,0,
        12,237,1,0,0,0,14,241,1,0,0,0,16,299,1,0,0,0,18,307,1,0,0,0,20,325,
        1,0,0,0,22,23,5,1,0,0,23,24,5,2,0,0,24,25,5,37,0,0,25,26,5,3,0,0,
        26,27,5,37,0,0,27,28,5,4,0,0,28,29,5,2,0,0,29,30,5,37,0,0,30,31,
        5,3,0,0,31,32,5,37,0,0,32,33,5,5,0,0,33,34,5,2,0,0,34,35,5,37,0,
        0,35,36,5,3,0,0,36,40,5,37,0,0,37,39,3,2,1,0,38,37,1,0,0,0,39,42,
        1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,1,1,0,0,0,42,40,1,0,0,0,43,
        47,3,4,2,0,44,47,3,6,3,0,45,47,3,8,4,0,46,43,1,0,0,0,46,44,1,0,0,
        0,46,45,1,0,0,0,47,3,1,0,0,0,48,49,5,6,0,0,49,50,5,2,0,0,50,51,7,
        0,0,0,51,52,5,3,0,0,52,92,7,0,0,0,53,54,5,7,0,0,54,55,5,2,0,0,55,
        56,7,0,0,0,56,57,5,3,0,0,57,92,7,0,0,0,58,59,5,8,0,0,59,60,5,2,0,
        0,60,61,7,1,0,0,61,62,5,3,0,0,62,92,7,1,0,0,63,64,5,9,0,0,64,65,
        5,2,0,0,65,66,7,1,0,0,66,67,5,3,0,0,67,92,7,1,0,0,68,69,5,10,0,0,
        69,70,5,2,0,0,70,71,7,1,0,0,71,72,5,3,0,0,72,73,7,1,0,0,73,74,5,
        3,0,0,74,78,5,37,0,0,75,77,3,2,1,0,76,75,1,0,0,0,77,80,1,0,0,0,78,
        76,1,0,0,0,78,79,1,0,0,0,79,81,1,0,0,0,80,78,1,0,0,0,81,82,5,10,
        0,0,82,83,5,37,0,0,83,87,5,11,0,0,84,86,3,14,7,0,85,84,1,0,0,0,86,
        89,1,0,0,0,87,85,1,0,0,0,87,88,1,0,0,0,88,90,1,0,0,0,89,87,1,0,0,
        0,90,92,5,12,0,0,91,48,1,0,0,0,91,53,1,0,0,0,91,58,1,0,0,0,91,63,
        1,0,0,0,91,68,1,0,0,0,92,5,1,0,0,0,93,94,5,13,0,0,94,95,5,14,0,0,
        95,96,3,20,10,0,96,97,5,15,0,0,97,101,5,11,0,0,98,100,3,10,5,0,99,
        98,1,0,0,0,100,103,1,0,0,0,101,99,1,0,0,0,101,102,1,0,0,0,102,104,
        1,0,0,0,103,101,1,0,0,0,104,105,5,12,0,0,105,150,1,0,0,0,106,107,
        5,16,0,0,107,108,5,14,0,0,108,109,3,20,10,0,109,110,5,15,0,0,110,
        114,5,11,0,0,111,113,3,10,5,0,112,111,1,0,0,0,113,116,1,0,0,0,114,
        112,1,0,0,0,114,115,1,0,0,0,115,117,1,0,0,0,116,114,1,0,0,0,117,
        118,5,12,0,0,118,150,1,0,0,0,119,120,5,17,0,0,120,121,5,14,0,0,121,
        122,5,35,0,0,122,123,5,18,0,0,123,124,5,37,0,0,124,125,5,15,0,0,
        125,129,5,11,0,0,126,128,3,10,5,0,127,126,1,0,0,0,128,131,1,0,0,
        0,129,127,1,0,0,0,129,130,1,0,0,0,130,132,1,0,0,0,131,129,1,0,0,
        0,132,150,5,12,0,0,133,146,5,35,0,0,134,135,5,14,0,0,135,140,5,35,
        0,0,136,137,5,3,0,0,137,139,5,35,0,0,138,136,1,0,0,0,139,142,1,0,
        0,0,140,138,1,0,0,0,140,141,1,0,0,0,141,143,1,0,0,0,142,140,1,0,
        0,0,143,145,5,15,0,0,144,134,1,0,0,0,145,148,1,0,0,0,146,144,1,0,
        0,0,146,147,1,0,0,0,147,150,1,0,0,0,148,146,1,0,0,0,149,93,1,0,0,
        0,149,106,1,0,0,0,149,119,1,0,0,0,149,133,1,0,0,0,150,7,1,0,0,0,
        151,152,5,19,0,0,152,165,5,35,0,0,153,154,5,14,0,0,154,159,5,35,
        0,0,155,156,5,3,0,0,156,158,5,35,0,0,157,155,1,0,0,0,158,161,1,0,
        0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,162,1,0,0,0,161,159,1,0,
        0,0,162,164,5,15,0,0,163,153,1,0,0,0,164,167,1,0,0,0,165,163,1,0,
        0,0,165,166,1,0,0,0,166,168,1,0,0,0,167,165,1,0,0,0,168,172,5,11,
        0,0,169,171,3,10,5,0,170,169,1,0,0,0,171,174,1,0,0,0,172,170,1,0,
        0,0,172,173,1,0,0,0,173,175,1,0,0,0,174,172,1,0,0,0,175,176,5,12,
        0,0,176,9,1,0,0,0,177,180,3,4,2,0,178,180,3,12,6,0,179,177,1,0,0,
        0,179,178,1,0,0,0,180,11,1,0,0,0,181,182,5,13,0,0,182,183,5,14,0,
        0,183,184,3,20,10,0,184,185,5,15,0,0,185,189,5,11,0,0,186,188,3,
        10,5,0,187,186,1,0,0,0,188,191,1,0,0,0,189,187,1,0,0,0,189,190,1,
        0,0,0,190,192,1,0,0,0,191,189,1,0,0,0,192,193,5,12,0,0,193,238,1,
        0,0,0,194,195,5,16,0,0,195,196,5,14,0,0,196,197,3,20,10,0,197,198,
        5,15,0,0,198,202,5,11,0,0,199,201,3,10,5,0,200,199,1,0,0,0,201,204,
        1,0,0,0,202,200,1,0,0,0,202,203,1,0,0,0,203,205,1,0,0,0,204,202,
        1,0,0,0,205,206,5,12,0,0,206,238,1,0,0,0,207,208,5,17,0,0,208,209,
        5,14,0,0,209,210,5,35,0,0,210,211,5,18,0,0,211,212,5,37,0,0,212,
        213,5,15,0,0,213,217,5,11,0,0,214,216,3,10,5,0,215,214,1,0,0,0,216,
        219,1,0,0,0,217,215,1,0,0,0,217,218,1,0,0,0,218,220,1,0,0,0,219,
        217,1,0,0,0,220,238,5,12,0,0,221,234,5,35,0,0,222,223,5,14,0,0,223,
        228,5,35,0,0,224,225,5,3,0,0,225,227,5,35,0,0,226,224,1,0,0,0,227,
        230,1,0,0,0,228,226,1,0,0,0,228,229,1,0,0,0,229,231,1,0,0,0,230,
        228,1,0,0,0,231,233,5,15,0,0,232,222,1,0,0,0,233,236,1,0,0,0,234,
        232,1,0,0,0,234,235,1,0,0,0,235,238,1,0,0,0,236,234,1,0,0,0,237,
        181,1,0,0,0,237,194,1,0,0,0,237,207,1,0,0,0,237,221,1,0,0,0,238,
        13,1,0,0,0,239,242,3,16,8,0,240,242,3,18,9,0,241,239,1,0,0,0,241,
        240,1,0,0,0,242,15,1,0,0,0,243,244,5,13,0,0,244,245,5,14,0,0,245,
        246,3,20,10,0,246,247,5,15,0,0,247,251,5,11,0,0,248,250,3,14,7,0,
        249,248,1,0,0,0,250,253,1,0,0,0,251,249,1,0,0,0,251,252,1,0,0,0,
        252,254,1,0,0,0,253,251,1,0,0,0,254,255,5,12,0,0,255,300,1,0,0,0,
        256,257,5,16,0,0,257,258,5,14,0,0,258,259,3,20,10,0,259,260,5,15,
        0,0,260,264,5,11,0,0,261,263,3,14,7,0,262,261,1,0,0,0,263,266,1,
        0,0,0,264,262,1,0,0,0,264,265,1,0,0,0,265,267,1,0,0,0,266,264,1,
        0,0,0,267,268,5,12,0,0,268,300,1,0,0,0,269,270,5,17,0,0,270,271,
        5,14,0,0,271,272,5,35,0,0,272,273,5,18,0,0,273,274,5,37,0,0,274,
        275,5,15,0,0,275,279,5,11,0,0,276,278,3,14,7,0,277,276,1,0,0,0,278,
        281,1,0,0,0,279,277,1,0,0,0,279,280,1,0,0,0,280,282,1,0,0,0,281,
        279,1,0,0,0,282,300,5,12,0,0,283,296,5,35,0,0,284,285,5,14,0,0,285,
        290,5,35,0,0,286,287,5,3,0,0,287,289,5,35,0,0,288,286,1,0,0,0,289,
        292,1,0,0,0,290,288,1,0,0,0,290,291,1,0,0,0,291,293,1,0,0,0,292,
        290,1,0,0,0,293,295,5,15,0,0,294,284,1,0,0,0,295,298,1,0,0,0,296,
        294,1,0,0,0,296,297,1,0,0,0,297,300,1,0,0,0,298,296,1,0,0,0,299,
        243,1,0,0,0,299,256,1,0,0,0,299,269,1,0,0,0,299,283,1,0,0,0,300,
        17,1,0,0,0,301,302,5,20,0,0,302,303,5,2,0,0,303,308,7,1,0,0,304,
        308,5,21,0,0,305,308,5,22,0,0,306,308,5,23,0,0,307,301,1,0,0,0,307,
        304,1,0,0,0,307,305,1,0,0,0,307,306,1,0,0,0,308,19,1,0,0,0,309,310,
        6,10,-1,0,310,326,5,24,0,0,311,312,5,25,0,0,312,313,5,2,0,0,313,
        326,7,1,0,0,314,326,5,26,0,0,315,326,5,27,0,0,316,326,5,28,0,0,317,
        318,5,29,0,0,318,326,3,20,10,6,319,326,5,30,0,0,320,326,5,31,0,0,
        321,322,5,14,0,0,322,323,3,20,10,0,323,324,5,15,0,0,324,326,1,0,
        0,0,325,309,1,0,0,0,325,311,1,0,0,0,325,314,1,0,0,0,325,315,1,0,
        0,0,325,316,1,0,0,0,325,317,1,0,0,0,325,319,1,0,0,0,325,320,1,0,
        0,0,325,321,1,0,0,0,326,335,1,0,0,0,327,328,10,3,0,0,328,329,5,32,
        0,0,329,334,3,20,10,4,330,331,10,2,0,0,331,332,5,33,0,0,332,334,
        3,20,10,3,333,327,1,0,0,0,333,330,1,0,0,0,334,337,1,0,0,0,335,333,
        1,0,0,0,335,336,1,0,0,0,336,21,1,0,0,0,337,335,1,0,0,0,32,40,46,
        78,87,91,101,114,129,140,146,149,159,165,172,179,189,202,217,228,
        234,237,241,251,264,279,290,296,299,307,325,333,335
    ]

class JailBreakLangParser ( Parser ):

    grammarFileName = "JailBreakLang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'MAP'", "'='", "','", "'PLAYER'", "'EXIT'", 
                     "'WALL'", "'TRAP'", "'KEY'", "'GATE'", "'GUARD'", "'{'", 
                     "'}'", "'IF'", "'('", "')'", "'WHILE'", "'FOR'", "'IN'", 
                     "'FUN'", "'DIRECTION'", "'TURNLEFT'", "'TURNRIGHT'", 
                     "'STEP'", "'IFWALL'", "'IFDIRECTION'", "'IFGUARD'", 
                     "'IFTRAP'", "'IFGATE'", "'NO'", "'TRUE'", "'FALSE'", 
                     "'AND'", "'OR'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "COMMENT", "ID", "RAND", 
                      "INT", "WS" ]

    RULE_start = 0
    RULE_kod = 1
    RULE_obiekty = 2
    RULE_instrukcje_warunkowe = 3
    RULE_deklaracja_funkcji = 4
    RULE_wyrazenia = 5
    RULE_instrukcje_warunkowe_2 = 6
    RULE_kod_straznika = 7
    RULE_instrukcje_warunkowe_3 = 8
    RULE_sterowanie_straznikiem = 9
    RULE_warunek = 10

    ruleNames =  [ "start", "kod", "obiekty", "instrukcje_warunkowe", "deklaracja_funkcji", 
                   "wyrazenia", "instrukcje_warunkowe_2", "kod_straznika", 
                   "instrukcje_warunkowe_3", "sterowanie_straznikiem", "warunek" ]

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
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    COMMENT=34
    ID=35
    RAND=36
    INT=37
    WS=38

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

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.INT)
            else:
                return self.getToken(JailBreakLangParser.INT, i)

        def kod(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.KodContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.KodContext,i)


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
            self.state = 22
            self.match(JailBreakLangParser.T__0)
            self.state = 23
            self.match(JailBreakLangParser.T__1)
            self.state = 24
            self.match(JailBreakLangParser.INT)
            self.state = 25
            self.match(JailBreakLangParser.T__2)
            self.state = 26
            self.match(JailBreakLangParser.INT)
            self.state = 27
            self.match(JailBreakLangParser.T__3)
            self.state = 28
            self.match(JailBreakLangParser.T__1)
            self.state = 29
            self.match(JailBreakLangParser.INT)
            self.state = 30
            self.match(JailBreakLangParser.T__2)
            self.state = 31
            self.match(JailBreakLangParser.INT)
            self.state = 32
            self.match(JailBreakLangParser.T__4)
            self.state = 33
            self.match(JailBreakLangParser.T__1)
            self.state = 34
            self.match(JailBreakLangParser.INT)
            self.state = 35
            self.match(JailBreakLangParser.T__2)
            self.state = 36
            self.match(JailBreakLangParser.INT)
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34360469440) != 0):
                self.state = 37
                self.kod()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class KodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def obiekty(self):
            return self.getTypedRuleContext(JailBreakLangParser.ObiektyContext,0)


        def instrukcje_warunkowe(self):
            return self.getTypedRuleContext(JailBreakLangParser.Instrukcje_warunkoweContext,0)


        def deklaracja_funkcji(self):
            return self.getTypedRuleContext(JailBreakLangParser.Deklaracja_funkcjiContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_kod

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKod" ):
                listener.enterKod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKod" ):
                listener.exitKod(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitKod" ):
                return visitor.visitKod(self)
            else:
                return visitor.visitChildren(self)




    def kod(self):

        localctx = JailBreakLangParser.KodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_kod)
        try:
            self.state = 46
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6, 7, 8, 9, 10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 43
                self.obiekty()
                pass
            elif token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 44
                self.instrukcje_warunkowe()
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 3)
                self.state = 45
                self.deklaracja_funkcji()
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


    class ObiektyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.INT)
            else:
                return self.getToken(JailBreakLangParser.INT, i)

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

        def kod(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.KodContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.KodContext,i)


        def kod_straznika(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.Kod_straznikaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.Kod_straznikaContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_obiekty

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObiekty" ):
                listener.enterObiekty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObiekty" ):
                listener.exitObiekty(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitObiekty" ):
                return visitor.visitObiekty(self)
            else:
                return visitor.visitChildren(self)




    def obiekty(self):

        localctx = JailBreakLangParser.ObiektyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_obiekty)
        self._la = 0 # Token type
        try:
            self.state = 91
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.enterOuterAlt(localctx, 1)
                self.state = 48
                self.match(JailBreakLangParser.T__5)
                self.state = 49
                self.match(JailBreakLangParser.T__1)
                self.state = 50
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 51
                self.match(JailBreakLangParser.T__2)
                self.state = 52
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 53
                self.match(JailBreakLangParser.T__6)
                self.state = 54
                self.match(JailBreakLangParser.T__1)
                self.state = 55
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 56
                self.match(JailBreakLangParser.T__2)
                self.state = 57
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 3)
                self.state = 58
                self.match(JailBreakLangParser.T__7)
                self.state = 59
                self.match(JailBreakLangParser.T__1)
                self.state = 60
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 61
                self.match(JailBreakLangParser.T__2)
                self.state = 62
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 4)
                self.state = 63
                self.match(JailBreakLangParser.T__8)
                self.state = 64
                self.match(JailBreakLangParser.T__1)
                self.state = 65
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 66
                self.match(JailBreakLangParser.T__2)
                self.state = 67
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 5)
                self.state = 68
                self.match(JailBreakLangParser.T__9)
                self.state = 69
                self.match(JailBreakLangParser.T__1)
                self.state = 70
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 71
                self.match(JailBreakLangParser.T__2)
                self.state = 72
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 73
                self.match(JailBreakLangParser.T__2)
                self.state = 74
                self.match(JailBreakLangParser.INT)
                self.state = 78
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 75
                        self.kod() 
                    self.state = 80
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

                self.state = 81
                self.match(JailBreakLangParser.T__9)
                self.state = 82
                self.match(JailBreakLangParser.INT)
                self.state = 83
                self.match(JailBreakLangParser.T__10)
                self.state = 87
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34375671808) != 0):
                    self.state = 84
                    self.kod_straznika()
                    self.state = 89
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 90
                self.match(JailBreakLangParser.T__11)
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


    class Instrukcje_warunkoweContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def warunek(self):
            return self.getTypedRuleContext(JailBreakLangParser.WarunekContext,0)


        def wyrazenia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.WyrazeniaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.WyrazeniaContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_instrukcje_warunkowe

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstrukcje_warunkowe" ):
                listener.enterInstrukcje_warunkowe(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstrukcje_warunkowe" ):
                listener.exitInstrukcje_warunkowe(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstrukcje_warunkowe" ):
                return visitor.visitInstrukcje_warunkowe(self)
            else:
                return visitor.visitChildren(self)




    def instrukcje_warunkowe(self):

        localctx = JailBreakLangParser.Instrukcje_warunkoweContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_instrukcje_warunkowe)
        self._la = 0 # Token type
        try:
            self.state = 149
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 93
                self.match(JailBreakLangParser.T__12)
                self.state = 94
                self.match(JailBreakLangParser.T__13)
                self.state = 95
                self.warunek(0)
                self.state = 96
                self.match(JailBreakLangParser.T__14)
                self.state = 97
                self.match(JailBreakLangParser.T__10)
                self.state = 101
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 98
                    self.wyrazenia()
                    self.state = 103
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 104
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 106
                self.match(JailBreakLangParser.T__15)
                self.state = 107
                self.match(JailBreakLangParser.T__13)
                self.state = 108
                self.warunek(0)
                self.state = 109
                self.match(JailBreakLangParser.T__14)
                self.state = 110
                self.match(JailBreakLangParser.T__10)
                self.state = 114
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 111
                    self.wyrazenia()
                    self.state = 116
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 117
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 119
                self.match(JailBreakLangParser.T__16)
                self.state = 120
                self.match(JailBreakLangParser.T__13)
                self.state = 121
                self.match(JailBreakLangParser.ID)
                self.state = 122
                self.match(JailBreakLangParser.T__17)
                self.state = 123
                self.match(JailBreakLangParser.INT)
                self.state = 124
                self.match(JailBreakLangParser.T__14)
                self.state = 125
                self.match(JailBreakLangParser.T__10)
                self.state = 129
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 126
                    self.wyrazenia()
                    self.state = 131
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 132
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 4)
                self.state = 133
                self.match(JailBreakLangParser.ID)
                self.state = 146
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==14:
                    self.state = 134
                    self.match(JailBreakLangParser.T__13)
                    self.state = 135
                    self.match(JailBreakLangParser.ID)
                    self.state = 140
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==3:
                        self.state = 136
                        self.match(JailBreakLangParser.T__2)
                        self.state = 137
                        self.match(JailBreakLangParser.ID)
                        self.state = 142
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 143
                    self.match(JailBreakLangParser.T__14)
                    self.state = 148
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

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


    class Deklaracja_funkcjiContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def wyrazenia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.WyrazeniaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.WyrazeniaContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_deklaracja_funkcji

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeklaracja_funkcji" ):
                listener.enterDeklaracja_funkcji(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeklaracja_funkcji" ):
                listener.exitDeklaracja_funkcji(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeklaracja_funkcji" ):
                return visitor.visitDeklaracja_funkcji(self)
            else:
                return visitor.visitChildren(self)




    def deklaracja_funkcji(self):

        localctx = JailBreakLangParser.Deklaracja_funkcjiContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_deklaracja_funkcji)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            self.match(JailBreakLangParser.T__18)
            self.state = 152
            self.match(JailBreakLangParser.ID)
            self.state = 165
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==14:
                self.state = 153
                self.match(JailBreakLangParser.T__13)
                self.state = 154
                self.match(JailBreakLangParser.ID)
                self.state = 159
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 155
                    self.match(JailBreakLangParser.T__2)
                    self.state = 156
                    self.match(JailBreakLangParser.ID)
                    self.state = 161
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 162
                self.match(JailBreakLangParser.T__14)
                self.state = 167
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 168
            self.match(JailBreakLangParser.T__10)
            self.state = 172
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                self.state = 169
                self.wyrazenia()
                self.state = 174
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 175
            self.match(JailBreakLangParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WyrazeniaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def obiekty(self):
            return self.getTypedRuleContext(JailBreakLangParser.ObiektyContext,0)


        def instrukcje_warunkowe_2(self):
            return self.getTypedRuleContext(JailBreakLangParser.Instrukcje_warunkowe_2Context,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_wyrazenia

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWyrazenia" ):
                listener.enterWyrazenia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWyrazenia" ):
                listener.exitWyrazenia(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWyrazenia" ):
                return visitor.visitWyrazenia(self)
            else:
                return visitor.visitChildren(self)




    def wyrazenia(self):

        localctx = JailBreakLangParser.WyrazeniaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_wyrazenia)
        try:
            self.state = 179
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6, 7, 8, 9, 10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 177
                self.obiekty()
                pass
            elif token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 178
                self.instrukcje_warunkowe_2()
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


    class Instrukcje_warunkowe_2Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def warunek(self):
            return self.getTypedRuleContext(JailBreakLangParser.WarunekContext,0)


        def wyrazenia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.WyrazeniaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.WyrazeniaContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_instrukcje_warunkowe_2

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstrukcje_warunkowe_2" ):
                listener.enterInstrukcje_warunkowe_2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstrukcje_warunkowe_2" ):
                listener.exitInstrukcje_warunkowe_2(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstrukcje_warunkowe_2" ):
                return visitor.visitInstrukcje_warunkowe_2(self)
            else:
                return visitor.visitChildren(self)




    def instrukcje_warunkowe_2(self):

        localctx = JailBreakLangParser.Instrukcje_warunkowe_2Context(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_instrukcje_warunkowe_2)
        self._la = 0 # Token type
        try:
            self.state = 237
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 181
                self.match(JailBreakLangParser.T__12)
                self.state = 182
                self.match(JailBreakLangParser.T__13)
                self.state = 183
                self.warunek(0)
                self.state = 184
                self.match(JailBreakLangParser.T__14)
                self.state = 185
                self.match(JailBreakLangParser.T__10)
                self.state = 189
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 186
                    self.wyrazenia()
                    self.state = 191
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 192
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 194
                self.match(JailBreakLangParser.T__15)
                self.state = 195
                self.match(JailBreakLangParser.T__13)
                self.state = 196
                self.warunek(0)
                self.state = 197
                self.match(JailBreakLangParser.T__14)
                self.state = 198
                self.match(JailBreakLangParser.T__10)
                self.state = 202
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 199
                    self.wyrazenia()
                    self.state = 204
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 205
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 207
                self.match(JailBreakLangParser.T__16)
                self.state = 208
                self.match(JailBreakLangParser.T__13)
                self.state = 209
                self.match(JailBreakLangParser.ID)
                self.state = 210
                self.match(JailBreakLangParser.T__17)
                self.state = 211
                self.match(JailBreakLangParser.INT)
                self.state = 212
                self.match(JailBreakLangParser.T__14)
                self.state = 213
                self.match(JailBreakLangParser.T__10)
                self.state = 217
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 214
                    self.wyrazenia()
                    self.state = 219
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 220
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 4)
                self.state = 221
                self.match(JailBreakLangParser.ID)
                self.state = 234
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==14:
                    self.state = 222
                    self.match(JailBreakLangParser.T__13)
                    self.state = 223
                    self.match(JailBreakLangParser.ID)
                    self.state = 228
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==3:
                        self.state = 224
                        self.match(JailBreakLangParser.T__2)
                        self.state = 225
                        self.match(JailBreakLangParser.ID)
                        self.state = 230
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 231
                    self.match(JailBreakLangParser.T__14)
                    self.state = 236
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

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


    class Kod_straznikaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def instrukcje_warunkowe_3(self):
            return self.getTypedRuleContext(JailBreakLangParser.Instrukcje_warunkowe_3Context,0)


        def sterowanie_straznikiem(self):
            return self.getTypedRuleContext(JailBreakLangParser.Sterowanie_straznikiemContext,0)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_kod_straznika

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKod_straznika" ):
                listener.enterKod_straznika(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKod_straznika" ):
                listener.exitKod_straznika(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitKod_straznika" ):
                return visitor.visitKod_straznika(self)
            else:
                return visitor.visitChildren(self)




    def kod_straznika(self):

        localctx = JailBreakLangParser.Kod_straznikaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_kod_straznika)
        try:
            self.state = 241
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 239
                self.instrukcje_warunkowe_3()
                pass
            elif token in [20, 21, 22, 23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 240
                self.sterowanie_straznikiem()
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


    class Instrukcje_warunkowe_3Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def warunek(self):
            return self.getTypedRuleContext(JailBreakLangParser.WarunekContext,0)


        def kod_straznika(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.Kod_straznikaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.Kod_straznikaContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(JailBreakLangParser.ID)
            else:
                return self.getToken(JailBreakLangParser.ID, i)

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_instrukcje_warunkowe_3

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstrukcje_warunkowe_3" ):
                listener.enterInstrukcje_warunkowe_3(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstrukcje_warunkowe_3" ):
                listener.exitInstrukcje_warunkowe_3(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstrukcje_warunkowe_3" ):
                return visitor.visitInstrukcje_warunkowe_3(self)
            else:
                return visitor.visitChildren(self)




    def instrukcje_warunkowe_3(self):

        localctx = JailBreakLangParser.Instrukcje_warunkowe_3Context(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_instrukcje_warunkowe_3)
        self._la = 0 # Token type
        try:
            self.state = 299
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 243
                self.match(JailBreakLangParser.T__12)
                self.state = 244
                self.match(JailBreakLangParser.T__13)
                self.state = 245
                self.warunek(0)
                self.state = 246
                self.match(JailBreakLangParser.T__14)
                self.state = 247
                self.match(JailBreakLangParser.T__10)
                self.state = 251
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34375671808) != 0):
                    self.state = 248
                    self.kod_straznika()
                    self.state = 253
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 254
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 256
                self.match(JailBreakLangParser.T__15)
                self.state = 257
                self.match(JailBreakLangParser.T__13)
                self.state = 258
                self.warunek(0)
                self.state = 259
                self.match(JailBreakLangParser.T__14)
                self.state = 260
                self.match(JailBreakLangParser.T__10)
                self.state = 264
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34375671808) != 0):
                    self.state = 261
                    self.kod_straznika()
                    self.state = 266
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 267
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 269
                self.match(JailBreakLangParser.T__16)
                self.state = 270
                self.match(JailBreakLangParser.T__13)
                self.state = 271
                self.match(JailBreakLangParser.ID)
                self.state = 272
                self.match(JailBreakLangParser.T__17)
                self.state = 273
                self.match(JailBreakLangParser.INT)
                self.state = 274
                self.match(JailBreakLangParser.T__14)
                self.state = 275
                self.match(JailBreakLangParser.T__10)
                self.state = 279
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34375671808) != 0):
                    self.state = 276
                    self.kod_straznika()
                    self.state = 281
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 282
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 4)
                self.state = 283
                self.match(JailBreakLangParser.ID)
                self.state = 296
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==14:
                    self.state = 284
                    self.match(JailBreakLangParser.T__13)
                    self.state = 285
                    self.match(JailBreakLangParser.ID)
                    self.state = 290
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==3:
                        self.state = 286
                        self.match(JailBreakLangParser.T__2)
                        self.state = 287
                        self.match(JailBreakLangParser.ID)
                        self.state = 292
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 293
                    self.match(JailBreakLangParser.T__14)
                    self.state = 298
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

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


    class Sterowanie_straznikiemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

        def getRuleIndex(self):
            return JailBreakLangParser.RULE_sterowanie_straznikiem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSterowanie_straznikiem" ):
                listener.enterSterowanie_straznikiem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSterowanie_straznikiem" ):
                listener.exitSterowanie_straznikiem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSterowanie_straznikiem" ):
                return visitor.visitSterowanie_straznikiem(self)
            else:
                return visitor.visitChildren(self)




    def sterowanie_straznikiem(self):

        localctx = JailBreakLangParser.Sterowanie_straznikiemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_sterowanie_straznikiem)
        self._la = 0 # Token type
        try:
            self.state = 307
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 301
                self.match(JailBreakLangParser.T__19)
                self.state = 302
                self.match(JailBreakLangParser.T__1)
                self.state = 303
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 2)
                self.state = 304
                self.match(JailBreakLangParser.T__20)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 3)
                self.state = 305
                self.match(JailBreakLangParser.T__21)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 4)
                self.state = 306
                self.match(JailBreakLangParser.T__22)
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


    class WarunekContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

        def warunek(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.WarunekContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.WarunekContext,i)


        def getRuleIndex(self):
            return JailBreakLangParser.RULE_warunek

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWarunek" ):
                listener.enterWarunek(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWarunek" ):
                listener.exitWarunek(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWarunek" ):
                return visitor.visitWarunek(self)
            else:
                return visitor.visitChildren(self)



    def warunek(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = JailBreakLangParser.WarunekContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 20
        self.enterRecursionRule(localctx, 20, self.RULE_warunek, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 325
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [24]:
                self.state = 310
                self.match(JailBreakLangParser.T__23)
                pass
            elif token in [25]:
                self.state = 311
                self.match(JailBreakLangParser.T__24)
                self.state = 312
                self.match(JailBreakLangParser.T__1)
                self.state = 313
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [26]:
                self.state = 314
                self.match(JailBreakLangParser.T__25)
                pass
            elif token in [27]:
                self.state = 315
                self.match(JailBreakLangParser.T__26)
                pass
            elif token in [28]:
                self.state = 316
                self.match(JailBreakLangParser.T__27)
                pass
            elif token in [29]:
                self.state = 317
                self.match(JailBreakLangParser.T__28)
                self.state = 318
                self.warunek(6)
                pass
            elif token in [30]:
                self.state = 319
                self.match(JailBreakLangParser.T__29)
                pass
            elif token in [31]:
                self.state = 320
                self.match(JailBreakLangParser.T__30)
                pass
            elif token in [14]:
                self.state = 321
                self.match(JailBreakLangParser.T__13)
                self.state = 322
                self.warunek(0)
                self.state = 323
                self.match(JailBreakLangParser.T__14)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 335
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,31,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 333
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,30,self._ctx)
                    if la_ == 1:
                        localctx = JailBreakLangParser.WarunekContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_warunek)
                        self.state = 327
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 328
                        self.match(JailBreakLangParser.T__31)
                        self.state = 329
                        self.warunek(4)
                        pass

                    elif la_ == 2:
                        localctx = JailBreakLangParser.WarunekContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_warunek)
                        self.state = 330
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 331
                        self.match(JailBreakLangParser.T__32)
                        self.state = 332
                        self.warunek(3)
                        pass

             
                self.state = 337
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,31,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[10] = self.warunek_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def warunek_sempred(self, localctx:WarunekContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         




