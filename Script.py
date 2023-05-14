from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker, ParseTreeListener, Token
from antlr4.error.ErrorListener import ErrorListener
import sys
from antlr.JailBreakLangLexer import JailBreakLangLexer
from antlr.JailBreakLangParser import JailBreakLangParser
# from antlr.JailBreakLangVisitorCustom import JailBreakLang
from antlr.JailBreakLangListenerCustom import JailBreakLangListenerCustom, IDListenerLexer
from antlr.JailBreakLangLexer import JailBreakLangLexer
from antlr.visitors.JailBreakLangCustomVisitor import JailBreakLangCustomVisitor

import warnings

class MyErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise ValueError(f"Syntax error on line {line}, column {column}: {msg}")

class IDVisitor(ParseTreeListener):
    #def __init__(self):
    #    self.ids = set()

    def visitTerminal(self, node):
        if node.symbol.type == JailBreakLangLexer.ID:
            if node.symbol.text not in set_of_vars:
                warnings.warn("Cannot use undeclared variable")
                exit()
                
        #self.ids.add(node.symbol.text)

def find_ids():
    input_stream = FileStream(sys.argv[1])
    lexer = JailBreakLangLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = JailBreakLangParser(token_stream)
    tree = parser.start()

    visitor = IDVisitor()
    walker = ParseTreeWalker()
    walker.walk(visitor, tree)

    #return visitor.ids



input_stream = FileStream(sys.argv[1])
lexer = JailBreakLangLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = JailBreakLangParser(token_stream)



# Add the error listener to the parser
error_listener = MyErrorListener()
parser.addErrorListener(error_listener)
tree = parser.start()

# First walk
listener = JailBreakLangListenerCustom()
walker = ParseTreeWalker()
walker.walk(listener, tree)
set_of_vars = listener.exitProgram()

# Second walk
find_ids()

# Actual compiling
lexer = JailBreakLangLexer(input_stream)
visitor = JailBreakLangCustomVisitor()
# visitor = JailBreakLang()
visitor.visit(tree)