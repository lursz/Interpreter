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
        4,1,38,219,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
        0,1,0,1,0,1,0,1,0,5,0,35,8,0,10,0,12,0,38,9,0,1,1,1,1,1,1,3,1,43,
        8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,73,8,2,10,
        2,12,2,76,9,2,1,2,1,2,1,2,1,2,5,2,82,8,2,10,2,12,2,85,9,2,1,2,3,
        2,88,8,2,1,3,1,3,1,3,1,3,1,3,1,3,5,3,96,8,3,10,3,12,3,99,9,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,109,8,3,10,3,12,3,112,9,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,124,8,3,10,3,12,3,127,9,3,
        1,3,1,3,1,3,1,3,1,3,1,3,5,3,135,8,3,10,3,12,3,138,9,3,1,3,5,3,141,
        8,3,10,3,12,3,144,9,3,3,3,146,8,3,1,4,1,4,1,4,1,4,1,4,1,4,5,4,154,
        8,4,10,4,12,4,157,9,4,1,4,5,4,160,8,4,10,4,12,4,163,9,4,1,4,1,4,
        5,4,167,8,4,10,4,12,4,170,9,4,1,4,1,4,1,5,1,5,3,5,176,8,5,1,6,1,
        6,3,6,180,8,6,1,7,1,7,1,7,1,7,1,7,1,7,3,7,188,8,7,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,206,8,8,1,
        8,1,8,1,8,1,8,1,8,1,8,5,8,214,8,8,10,8,12,8,217,9,8,1,8,0,1,16,9,
        0,2,4,6,8,10,12,14,16,0,2,1,0,35,37,2,0,35,35,37,37,244,0,18,1,0,
        0,0,2,42,1,0,0,0,4,87,1,0,0,0,6,145,1,0,0,0,8,147,1,0,0,0,10,175,
        1,0,0,0,12,179,1,0,0,0,14,187,1,0,0,0,16,205,1,0,0,0,18,19,5,1,0,
        0,19,20,5,2,0,0,20,21,5,37,0,0,21,22,5,3,0,0,22,23,5,37,0,0,23,24,
        5,4,0,0,24,25,5,2,0,0,25,26,5,37,0,0,26,27,5,3,0,0,27,28,5,37,0,
        0,28,29,5,5,0,0,29,30,5,2,0,0,30,31,5,37,0,0,31,32,5,3,0,0,32,36,
        5,37,0,0,33,35,3,2,1,0,34,33,1,0,0,0,35,38,1,0,0,0,36,34,1,0,0,0,
        36,37,1,0,0,0,37,1,1,0,0,0,38,36,1,0,0,0,39,43,3,4,2,0,40,43,3,6,
        3,0,41,43,3,8,4,0,42,39,1,0,0,0,42,40,1,0,0,0,42,41,1,0,0,0,43,3,
        1,0,0,0,44,45,5,6,0,0,45,46,5,2,0,0,46,47,7,0,0,0,47,48,5,3,0,0,
        48,88,7,0,0,0,49,50,5,7,0,0,50,51,5,2,0,0,51,52,7,0,0,0,52,53,5,
        3,0,0,53,88,7,0,0,0,54,55,5,8,0,0,55,56,5,2,0,0,56,57,7,1,0,0,57,
        58,5,3,0,0,58,88,7,1,0,0,59,60,5,9,0,0,60,61,5,2,0,0,61,62,7,1,0,
        0,62,63,5,3,0,0,63,88,7,1,0,0,64,65,5,10,0,0,65,66,5,2,0,0,66,67,
        7,1,0,0,67,68,5,3,0,0,68,69,7,1,0,0,69,70,5,3,0,0,70,74,5,37,0,0,
        71,73,3,2,1,0,72,71,1,0,0,0,73,76,1,0,0,0,74,72,1,0,0,0,74,75,1,
        0,0,0,75,77,1,0,0,0,76,74,1,0,0,0,77,78,5,10,0,0,78,79,5,37,0,0,
        79,83,5,11,0,0,80,82,3,12,6,0,81,80,1,0,0,0,82,85,1,0,0,0,83,81,
        1,0,0,0,83,84,1,0,0,0,84,86,1,0,0,0,85,83,1,0,0,0,86,88,5,12,0,0,
        87,44,1,0,0,0,87,49,1,0,0,0,87,54,1,0,0,0,87,59,1,0,0,0,87,64,1,
        0,0,0,88,5,1,0,0,0,89,90,5,13,0,0,90,91,5,14,0,0,91,92,3,16,8,0,
        92,93,5,15,0,0,93,97,5,11,0,0,94,96,3,10,5,0,95,94,1,0,0,0,96,99,
        1,0,0,0,97,95,1,0,0,0,97,98,1,0,0,0,98,100,1,0,0,0,99,97,1,0,0,0,
        100,101,5,12,0,0,101,146,1,0,0,0,102,103,5,16,0,0,103,104,5,14,0,
        0,104,105,3,16,8,0,105,106,5,15,0,0,106,110,5,11,0,0,107,109,3,10,
        5,0,108,107,1,0,0,0,109,112,1,0,0,0,110,108,1,0,0,0,110,111,1,0,
        0,0,111,113,1,0,0,0,112,110,1,0,0,0,113,114,5,12,0,0,114,146,1,0,
        0,0,115,116,5,17,0,0,116,117,5,14,0,0,117,118,5,35,0,0,118,119,5,
        18,0,0,119,120,5,37,0,0,120,121,5,15,0,0,121,125,5,11,0,0,122,124,
        3,10,5,0,123,122,1,0,0,0,124,127,1,0,0,0,125,123,1,0,0,0,125,126,
        1,0,0,0,126,128,1,0,0,0,127,125,1,0,0,0,128,146,5,12,0,0,129,142,
        5,35,0,0,130,131,5,14,0,0,131,136,5,35,0,0,132,133,5,3,0,0,133,135,
        5,35,0,0,134,132,1,0,0,0,135,138,1,0,0,0,136,134,1,0,0,0,136,137,
        1,0,0,0,137,139,1,0,0,0,138,136,1,0,0,0,139,141,5,15,0,0,140,130,
        1,0,0,0,141,144,1,0,0,0,142,140,1,0,0,0,142,143,1,0,0,0,143,146,
        1,0,0,0,144,142,1,0,0,0,145,89,1,0,0,0,145,102,1,0,0,0,145,115,1,
        0,0,0,145,129,1,0,0,0,146,7,1,0,0,0,147,148,5,19,0,0,148,161,5,35,
        0,0,149,150,5,14,0,0,150,155,5,35,0,0,151,152,5,3,0,0,152,154,5,
        35,0,0,153,151,1,0,0,0,154,157,1,0,0,0,155,153,1,0,0,0,155,156,1,
        0,0,0,156,158,1,0,0,0,157,155,1,0,0,0,158,160,5,15,0,0,159,149,1,
        0,0,0,160,163,1,0,0,0,161,159,1,0,0,0,161,162,1,0,0,0,162,164,1,
        0,0,0,163,161,1,0,0,0,164,168,5,11,0,0,165,167,3,10,5,0,166,165,
        1,0,0,0,167,170,1,0,0,0,168,166,1,0,0,0,168,169,1,0,0,0,169,171,
        1,0,0,0,170,168,1,0,0,0,171,172,5,12,0,0,172,9,1,0,0,0,173,176,3,
        4,2,0,174,176,3,6,3,0,175,173,1,0,0,0,175,174,1,0,0,0,176,11,1,0,
        0,0,177,180,3,6,3,0,178,180,3,14,7,0,179,177,1,0,0,0,179,178,1,0,
        0,0,180,13,1,0,0,0,181,182,5,20,0,0,182,183,5,2,0,0,183,188,7,1,
        0,0,184,188,5,21,0,0,185,188,5,22,0,0,186,188,5,23,0,0,187,181,1,
        0,0,0,187,184,1,0,0,0,187,185,1,0,0,0,187,186,1,0,0,0,188,15,1,0,
        0,0,189,190,6,8,-1,0,190,206,5,24,0,0,191,192,5,25,0,0,192,193,5,
        2,0,0,193,206,7,1,0,0,194,206,5,26,0,0,195,206,5,27,0,0,196,206,
        5,28,0,0,197,198,5,29,0,0,198,206,3,16,8,6,199,206,5,30,0,0,200,
        206,5,31,0,0,201,202,5,14,0,0,202,203,3,16,8,0,203,204,5,15,0,0,
        204,206,1,0,0,0,205,189,1,0,0,0,205,191,1,0,0,0,205,194,1,0,0,0,
        205,195,1,0,0,0,205,196,1,0,0,0,205,197,1,0,0,0,205,199,1,0,0,0,
        205,200,1,0,0,0,205,201,1,0,0,0,206,215,1,0,0,0,207,208,10,3,0,0,
        208,209,5,32,0,0,209,214,3,16,8,4,210,211,10,2,0,0,211,212,5,33,
        0,0,212,214,3,16,8,3,213,207,1,0,0,0,213,210,1,0,0,0,214,217,1,0,
        0,0,215,213,1,0,0,0,215,216,1,0,0,0,216,17,1,0,0,0,217,215,1,0,0,
        0,20,36,42,74,83,87,97,110,125,136,142,145,155,161,168,175,179,187,
        205,213,215
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
    RULE_code = 1
    RULE_objects = 2
    RULE_commands = 3
    RULE_function_declaration = 4
    RULE_wyrazenia = 5
    RULE_guard_extra_code = 6
    RULE_guard_control = 7
    RULE_condition = 8

    ruleNames =  [ "start", "code", "objects", "commands", "function_declaration", 
                   "wyrazenia", "guard_extra_code", "guard_control", "condition" ]

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
            self.state = 18
            self.match(JailBreakLangParser.T__0)
            self.state = 19
            self.match(JailBreakLangParser.T__1)
            self.state = 20
            self.match(JailBreakLangParser.INT)
            self.state = 21
            self.match(JailBreakLangParser.T__2)
            self.state = 22
            self.match(JailBreakLangParser.INT)
            self.state = 23
            self.match(JailBreakLangParser.T__3)
            self.state = 24
            self.match(JailBreakLangParser.T__1)
            self.state = 25
            self.match(JailBreakLangParser.INT)
            self.state = 26
            self.match(JailBreakLangParser.T__2)
            self.state = 27
            self.match(JailBreakLangParser.INT)
            self.state = 28
            self.match(JailBreakLangParser.T__4)
            self.state = 29
            self.match(JailBreakLangParser.T__1)
            self.state = 30
            self.match(JailBreakLangParser.INT)
            self.state = 31
            self.match(JailBreakLangParser.T__2)
            self.state = 32
            self.match(JailBreakLangParser.INT)
            self.state = 36
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34360469440) != 0):
                self.state = 33
                self.code()
                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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
            self.state = 42
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6, 7, 8, 9, 10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 39
                self.objects()
                pass
            elif token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 40
                self.commands()
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 3)
                self.state = 41
                self.function_declaration()
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


    class ObjectsContext(ParserRuleContext):
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

        def code(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.CodeContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.CodeContext,i)


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
            self.state = 87
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.enterOuterAlt(localctx, 1)
                self.state = 44
                self.match(JailBreakLangParser.T__5)
                self.state = 45
                self.match(JailBreakLangParser.T__1)
                self.state = 46
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 47
                self.match(JailBreakLangParser.T__2)
                self.state = 48
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 49
                self.match(JailBreakLangParser.T__6)
                self.state = 50
                self.match(JailBreakLangParser.T__1)
                self.state = 51
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 52
                self.match(JailBreakLangParser.T__2)
                self.state = 53
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 240518168576) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 3)
                self.state = 54
                self.match(JailBreakLangParser.T__7)
                self.state = 55
                self.match(JailBreakLangParser.T__1)
                self.state = 56
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 57
                self.match(JailBreakLangParser.T__2)
                self.state = 58
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 4)
                self.state = 59
                self.match(JailBreakLangParser.T__8)
                self.state = 60
                self.match(JailBreakLangParser.T__1)
                self.state = 61
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 62
                self.match(JailBreakLangParser.T__2)
                self.state = 63
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 5)
                self.state = 64
                self.match(JailBreakLangParser.T__9)
                self.state = 65
                self.match(JailBreakLangParser.T__1)
                self.state = 66
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 67
                self.match(JailBreakLangParser.T__2)
                self.state = 68
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 69
                self.match(JailBreakLangParser.T__2)
                self.state = 70
                self.match(JailBreakLangParser.INT)
                self.state = 74
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 71
                        self.code() 
                    self.state = 76
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

                self.state = 77
                self.match(JailBreakLangParser.T__9)
                self.state = 78
                self.match(JailBreakLangParser.INT)
                self.state = 79
                self.match(JailBreakLangParser.T__10)
                self.state = 83
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34375671808) != 0):
                    self.state = 80
                    self.guard_extra_code()
                    self.state = 85
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 86
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


    class CommandsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition(self):
            return self.getTypedRuleContext(JailBreakLangParser.ConditionContext,0)


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
        self.enterRule(localctx, 6, self.RULE_commands)
        self._la = 0 # Token type
        try:
            self.state = 145
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 89
                self.match(JailBreakLangParser.T__12)
                self.state = 90
                self.match(JailBreakLangParser.T__13)
                self.state = 91
                self.condition(0)
                self.state = 92
                self.match(JailBreakLangParser.T__14)
                self.state = 93
                self.match(JailBreakLangParser.T__10)
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 94
                    self.wyrazenia()
                    self.state = 99
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 100
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 102
                self.match(JailBreakLangParser.T__15)
                self.state = 103
                self.match(JailBreakLangParser.T__13)
                self.state = 104
                self.condition(0)
                self.state = 105
                self.match(JailBreakLangParser.T__14)
                self.state = 106
                self.match(JailBreakLangParser.T__10)
                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 107
                    self.wyrazenia()
                    self.state = 112
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 113
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 115
                self.match(JailBreakLangParser.T__16)
                self.state = 116
                self.match(JailBreakLangParser.T__13)
                self.state = 117
                self.match(JailBreakLangParser.ID)
                self.state = 118
                self.match(JailBreakLangParser.T__17)
                self.state = 119
                self.match(JailBreakLangParser.INT)
                self.state = 120
                self.match(JailBreakLangParser.T__14)
                self.state = 121
                self.match(JailBreakLangParser.T__10)
                self.state = 125
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                    self.state = 122
                    self.wyrazenia()
                    self.state = 127
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 128
                self.match(JailBreakLangParser.T__11)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 4)
                self.state = 129
                self.match(JailBreakLangParser.ID)
                self.state = 142
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==14:
                    self.state = 130
                    self.match(JailBreakLangParser.T__13)
                    self.state = 131
                    self.match(JailBreakLangParser.ID)
                    self.state = 136
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==3:
                        self.state = 132
                        self.match(JailBreakLangParser.T__2)
                        self.state = 133
                        self.match(JailBreakLangParser.ID)
                        self.state = 138
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)

                    self.state = 139
                    self.match(JailBreakLangParser.T__14)
                    self.state = 144
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

        def wyrazenia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JailBreakLangParser.WyrazeniaContext)
            else:
                return self.getTypedRuleContext(JailBreakLangParser.WyrazeniaContext,i)


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
        self.enterRule(localctx, 8, self.RULE_function_declaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            self.match(JailBreakLangParser.T__18)
            self.state = 148
            self.match(JailBreakLangParser.ID)
            self.state = 161
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==14:
                self.state = 149
                self.match(JailBreakLangParser.T__13)
                self.state = 150
                self.match(JailBreakLangParser.ID)
                self.state = 155
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 151
                    self.match(JailBreakLangParser.T__2)
                    self.state = 152
                    self.match(JailBreakLangParser.ID)
                    self.state = 157
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 158
                self.match(JailBreakLangParser.T__14)
                self.state = 163
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 164
            self.match(JailBreakLangParser.T__10)
            self.state = 168
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34359945152) != 0):
                self.state = 165
                self.wyrazenia()
                self.state = 170
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 171
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

        def objects(self):
            return self.getTypedRuleContext(JailBreakLangParser.ObjectsContext,0)


        def commands(self):
            return self.getTypedRuleContext(JailBreakLangParser.CommandsContext,0)


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
            self.state = 175
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6, 7, 8, 9, 10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 173
                self.objects()
                pass
            elif token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 174
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
        self.enterRule(localctx, 12, self.RULE_guard_extra_code)
        try:
            self.state = 179
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 16, 17, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 177
                self.commands()
                pass
            elif token in [20, 21, 22, 23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 178
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

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

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
        self.enterRule(localctx, 14, self.RULE_guard_control)
        self._la = 0 # Token type
        try:
            self.state = 187
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 181
                self.match(JailBreakLangParser.T__19)
                self.state = 182
                self.match(JailBreakLangParser.T__1)
                self.state = 183
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 2)
                self.state = 184
                self.match(JailBreakLangParser.T__20)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 3)
                self.state = 185
                self.match(JailBreakLangParser.T__21)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 4)
                self.state = 186
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


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(JailBreakLangParser.INT, 0)

        def ID(self):
            return self.getToken(JailBreakLangParser.ID, 0)

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



    def condition(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = JailBreakLangParser.ConditionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 16
        self.enterRecursionRule(localctx, 16, self.RULE_condition, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [24]:
                self.state = 190
                self.match(JailBreakLangParser.T__23)
                pass
            elif token in [25]:
                self.state = 191
                self.match(JailBreakLangParser.T__24)
                self.state = 192
                self.match(JailBreakLangParser.T__1)
                self.state = 193
                _la = self._input.LA(1)
                if not(_la==35 or _la==37):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [26]:
                self.state = 194
                self.match(JailBreakLangParser.T__25)
                pass
            elif token in [27]:
                self.state = 195
                self.match(JailBreakLangParser.T__26)
                pass
            elif token in [28]:
                self.state = 196
                self.match(JailBreakLangParser.T__27)
                pass
            elif token in [29]:
                self.state = 197
                self.match(JailBreakLangParser.T__28)
                self.state = 198
                self.condition(6)
                pass
            elif token in [30]:
                self.state = 199
                self.match(JailBreakLangParser.T__29)
                pass
            elif token in [31]:
                self.state = 200
                self.match(JailBreakLangParser.T__30)
                pass
            elif token in [14]:
                self.state = 201
                self.match(JailBreakLangParser.T__13)
                self.state = 202
                self.condition(0)
                self.state = 203
                self.match(JailBreakLangParser.T__14)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 215
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 213
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                    if la_ == 1:
                        localctx = JailBreakLangParser.ConditionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_condition)
                        self.state = 207
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 208
                        self.match(JailBreakLangParser.T__31)
                        self.state = 209
                        self.condition(4)
                        pass

                    elif la_ == 2:
                        localctx = JailBreakLangParser.ConditionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_condition)
                        self.state = 210
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 211
                        self.match(JailBreakLangParser.T__32)
                        self.state = 212
                        self.condition(3)
                        pass

             
                self.state = 217
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

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
        self._predicates[8] = self.condition_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def condition_sempred(self, localctx:ConditionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         




