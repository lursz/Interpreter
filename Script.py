from antlr4 import *
import sys
# sys.path.append('antlr')
from antlr.JailBreakLangLexer import JailBreakLangLexer
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitorCustom import JailBreakLang

class MyErrorListener(error.ErrorListener.ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise ValueError(f"Syntax error on line {line}, column {column}: {msg}")


input_stream = FileStream(sys.argv[1])
lexer = JailBreakLangLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = JailBreakLangParser(token_stream)

# Add the error listener to the parser
error_listener = MyErrorListener()
parser.addErrorListener(error_listener)
tree = parser.start()
visitor = JailBreakLang()
visitor.visit(tree)