from antlr4 import *
from JailBreakLangLexer import JailBreakLangLexer
from JailBreakLangParser import JailBreakLangParser
from JailBreakLangVisitorCustom import JailBreakLang
import sys

input_stream = FileStream(sys.argv[1])
lexer = JailBreakLangLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = JailBreakLangParser(token_stream)
tree = parser.start()

visitor = JailBreakLang()
visitor.visit(tree)