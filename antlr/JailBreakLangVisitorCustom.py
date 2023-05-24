# import warnings

# from antlr4 import *

# import logic.Calculator as Calculator
# import logic.GameLogic as GameLogic
# import logic.GameObjects as GameObjects
# from antlr.JailBreakLangParser import JailBreakLangParser
# from antlr.JailBreakLangVisitor import JailBreakLangVisitor



# class JailBreakLang(JailBreakLangVisitor):
#     # reducer(akcja: string, value: object):
#     #     if akcja === 'a':
#     #         return {
#     #             ...variables,
#     #             ...objekt
#     #         }
    
#     def __init__(self):
#         self.game = GameObjects.GameObjects()
#         # Global variables
#         self.variables = {}
#         self.booleans = {}
#         # Stack of variables (used to handle functions)
#         self.function_vars = []
#         self.function_bools = []
#         # {function_name: {type_arguments: '[INT', 'BOOLEAN', ...], callback: Function}
#         self.functions = {}
#         self.returnEncountered = False
#         self.returnValue = None
        
#     def getVariable(self, variableName: str) -> int:
#         # TODO: check global and scope
#         if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
#             return self.function_vars[-1][variableName]
#         print("variable: ", self.variables[variableName], "type: ",type(self.variables[variableName]))
#         return self.variables[variableName]

#     def getBoolean(self, variableName: str) -> (bool | None):
#         # TODO: check global and scope
#         if len(self.function_bools) > 0 and variableName in self.function_bools[-1].keys():
#             return self.function_bools[-1][variableName]
#         return self.booleans[variableName] if variableName in self.booleans.keys() else None
    
#     def setVariable(self, variableName, value) -> None:
#         if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
#             self.function_vars[-1][variableName] = value
#         elif variableName in self.variables.keys():
#             self.variables[variableName] = value

#      # Declare new variable or redefine an existing one
#     def visitVariables(self, ctx) -> None:
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())
        
#         # mode 0 - declare new variable, mode 1 - redefine existing variable
#         mode = 0 if (codes[0].getText() in ['INT', 'BOOLEAN']) else 1
#         var_name = ""
        
#         # Loop through each code in the list
#         for i, code in enumerate(codes):
#             var_name = code.getText()
#             # Mode 0 - declare new variable
#             if mode == 0:
#                 # If it's the second code block
#                 if i == 1:
#                     # Check if the variable already exists. If yes, raise an error.
#                     if var_name in self.variables or var_name in self.booleans:
#                         raise Exception("Variable already exists")
#                     else:
#                         # If declaring INT - create a new variable in the integers dictionary
#                         # If declaring BOOLEAN - create a new variable in the booleans dictionary
#                         self.variables[var_name] = 0 if codes[0].getText() == "INT" else False
#                 # If it's the fourth code block
#                 elif i == 3:
#                     # If declaring INT - insert the actual value of int to the integers dictionary
#                     # If declaring BOOLEAN - insert the actual value of boolean to the booleans dictionary
#                     if codes[0].getText() == "INT":
#                         self.variables[var_name] = self.visit(code)
#                     else:
#                         self.booleans[var_name] = self.visit(code)
#             # Mode 1 - redefine existing variable   
#             else:
#                 # If it's the first code block
#                 if i == 0:
#                     # Check if the variable exists. If no, raise a warning.
#                     # Otherwise, set the variable name.
#                     if var_name not in self.variables and var_name not in self.booleans:
#                         warnings.warn("Variable doesn't exist")
#                     else:
#                         var_name = var_name
#                 # If it's the third code block
#                 elif i == 2:
#                     # If redeclaring INT - set the new value in the integers dictionary
#                     # If redeclaring BOOLEAN - set the new value in the booleans dictionary
#                     if var_name in self.variables:
#                         self.variables[var_name] = self.visit(code)
#                     else:
#                         self.booleans[var_name] = self.visit(code)



#     # Visit Start
#     def visitStart(self, ctx) -> None:
#         lines = list(ctx.getChildren())
#         returnValue = None
        
        
#         for i in range(len(lines) - 1):
#             if self.returnEncountered:
#                 break
#             returnValue = self.visit(lines[i])
        
#         self.returnEncountered = False
#         GameLogic.Gamelogic(self.game)

#     # Visit Code
#     def visitCode(self, ctx) -> None:
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())

#         for i in range(len(codes)):
#             self.visit(codes[i])

    
    
#     # Visit Objects
#     def visitObjects(self, ctx):
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())
#         match codes[0].getText():
#             case "MAP":
#                 rows = self.visitExpr(codes[2])
#                 cols = self.visitExpr(codes[4])
#                 self.game.createMap(rows, cols)
#                 #return map_array
#                 return
#             case "PLAYER":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createPlayer(row, col)
#                 return row, col
#             case "EXIT":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createExit(row, col)
#                 return row, col
#             case "WALL":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createWall(row, col)
#                 return row, col
#             case "TRAP":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createTrap(row, col)
#                 return row, col
#             case "KEY":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createKey(row, col)
#                 return row, col
#             case "GATE":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 self.game.createGate(row, col)
#                 return row, col
#             case "GUARD":
#                 row = self.visitExpr(codes[2])-1
#                 col = self.visitExpr(codes[4])-1
#                 guard_id = codes[6].getText()
#                 list_of_commands = codes[8:-1]
#                 list_of_commands = [i.getText() for i in list_of_commands]
                
#                 # Create a guard and append it to the list of guards
#                 self.game.createGuard(row, col, guard_id, list_of_commands)


#                 codes = list(ctx.getChildren())
#                 for i in range(len(codes)):
#                     self.visit(codes[i])
#                 return row, col, guard_id
#             case "PRINT":
#                 # if int go to visitExpr if boolean go to visitBool
#                 try:
#                     expression = self.visitExpr(codes[2])
#                 except:
#                     expression = self.visitCondition(codes[2])
#                 print(expression)
    

#     # Parse int from 'INT'
#     def visitInt(self, ctx) -> int:
#         return int(ctx.INT().getText())


#     # Evaluate an expression
#     def visitExpr(self, ctx) -> int:
#         calc = Calculator.Calculator()
#         math_string = ""
#         for child in ctx.getChildren():
#             var_name = child.getText()
#             if var_name in self.variables or (self.function_vars and var_name in self.function_vars[-1]):
#                 math_string += str(self.getVariable(var_name))
#             else:
#                 math_string += var_name
#         x = calc.evaluate(math_string)
#         if x is None:
#             warnings.warn(f"{math_string} is not a correct expression")
#             exit()
#         return int(x)

    
#     def visitValue_comparison(self, ctx: JailBreakLangParser.Value_comparisonContext):
#         operators = {
#             "<": lambda x, y: x < y,
#             ">": lambda x, y: x > y,
#             "==": lambda x, y: x == y,
#             "!=": lambda x, y: x != y,
#         } 
#         codes = list(ctx.getChildren())
#         return operators[codes[1].getText()](self.visit(codes[0]), self.visit(codes[2]))
        
#     def visitVariable_value(self, ctx):
#         codes = list(ctx.getChildren())
#         if codes[0].getText() not in self.booleans:
#             return self.visit(codes[0])
#         return self.booleans[codes[0].getText()]



#     def visitBooleanValue(self, ctx):
#         codes = list(ctx.getChildren())
#         return self.visit(codes[0]) if codes[0].getText() not in ['TRUE', 'FALSE'] else ctx.getText() == "TRUE"


#     def visitCondition(self, ctx):
#         codes = list(ctx.getChildren())
#         condition_value = self.getBoolean(codes[0].getText())
#         condition_value = self.visit(codes[0]) if condition_value == None else condition_value 
#         for condition_product in codes[2:]:
#             condition_value = condition_value or self.visit(condition_product)
#         return condition_value
    
#     def visitCondition_product(self, ctx):
#         codes = list(ctx.getChildren())
        
#         if codes[0].getText() == '(':
#                 return self.visit(codes[1])
#         if codes[0].getText() == 'NOT':
#             if len(codes) > 2:
#                 return not self.visit(codes[2])
#             return not self.visit(codes[1])
        
#         condition_value = self.visit(codes[0])

#         for condition_product in codes[2::2]:
#             match codes[1].getText():
#                 case "AND":
#                     condition_value = condition_value and self.visit(condition_product)
#                 case "==":
#                     condition_value = condition_value == self.visit(condition_product)
#                 case "!=":
#                     condition_value = condition_value != self.visit(condition_product)
#         return condition_value
        
#     # If statement, 
#     def visitCommands(self, ctx) -> None:
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())
#         if codes[0].getText() == 'IF':
#             result = self.visit(codes[2])
#             # print(result)
#             if result:
#                 for i in range(5, len(codes)):
#                     if self.returnEncountered:
#                         return
#                     if codes[i].getText() == '}':
#                         break
#                     self.visitExpressions(codes[i])
#             else_index = 0
#             for i in range(0, len(codes)):
#                     if codes[i].getText() == '}':
#                         else_index = i
#                         break
#             if len(codes) > (else_index):
#                 for i in range(else_index+3, len(codes)):
#                     if self.returnEncountered:
#                         return
#                     if codes[i].getText() == '}':
#                         break
#                     self.visitExpressions(codes[i]) 
#                 #self.visitExpressions(codes[9])

#         if codes[0].getText() == 'FOR':
#             # FOR (x IN 10) { code  }
#             #  0   2  3  4     7
#             var_name = codes[2].getText()
            
#             top_value = int(codes[4].getText())
#             while self.getVariable(var_name) <= top_value:
#                 for code in codes[7:-1]:
#                     if self.returnEncountered:
#                         return
#                     self.visit(code)
#                 #self.variables[var_name] += 1
#                 self.setVariable(var_name, self.getVariable(var_name))
            

#         if codes[0].getText() == 'WHILE':
#             condition = self.visit(codes[2])

#             while condition:
#                 for code in codes[5:-1]:
#                     if self.returnEncountered:
#                         return
#                     self.visit(code)
#                 condition = self.visit(codes[2])


#     def visitFun_commands(self, ctx) -> None:
#         codes = list(ctx.getChildren())
#         for i in codes:
#             if self.returnEncountered:
#                 return
#             self.visit(i)


#     def visitExpressions(self, ctx) -> None:
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())
#         for command in codes:
#             self.visit(command)

#     def visitUse_fun(self, ctx) -> None:
#         if self.returnEncountered:
#             return
#         codes = list(ctx.getChildren())
#         function_name = codes[1].getText()
#         type_arguments = self.functions[function_name]["type_arguments"]
#         callback = self.functions[function_name]["callback"]
#         variable_types = self.functions[function_name]["variable_types"]
#         arguments = [self.visit(argument) for argument in codes[3:-1] if argument.getText() != ',']

#         # Checking if types match
#         if len(arguments) != len(type_arguments):
#             raise Exception("Number of arguments does not match")

#         self.function_vars.append({key: arguments[i] for i, key in enumerate(variable_types.keys()) if isinstance(arguments[i], int)})
#         self.function_bools.append({key: arguments[i] for i, key in enumerate(variable_types.keys()) if isinstance(arguments[i], bool)})

#         callback()

            
#     def visitFunction_declaration(self, ctx) -> None:
#         codes = list(ctx.getChildren())

#         # type fun a(INT a, INT b, INT c)
#         #  0    1  2  4  5   7  8  9   10
#         # -> ['a', 'b', 'c']
        
#         return_type = codes[0].getText()
#         function_name = codes[2].getText()
#         type_arguments = []
#         variable_types = {}

#         fun_var = {}
#         fun_bool = {}

#         start = 0
#         # Extract all the variable names from function declaration
#         for i in range(4, len(codes)):
#             curr_value = codes[i].getText()
#             if curr_value == ')':
#                 start = i+2
#                 break
            
#             # save type argument
#             if curr_value in ['INT', 'BOOLEAN']:
#                 var_name = codes[i+1].getText()
#                 variable_types[var_name] = curr_value
#                 type_arguments.append(curr_value)
#                 continue

#             if curr_value in [',']: 
#                 continue
#             # (value, type)
#             if codes[i-1].getText() == 'BOOLEAN':
#                 fun_bool[curr_value] = False
#             else:
#                 fun_var[curr_value] = 0

#         def callback() -> (int | bool | None):
#             for i in range(start, len(codes)):
#                 curr_value = codes[i].getText()
#                 if curr_value == '}':
#                     break
#                 self.visit(codes[i])
#                 if self.returnEncountered:
#                     # Check if the returned type matches function type
#                     self.returnEncountered = False
#                     if self.returnValue == None and return_type == 'VOID':
#                         return
#                     # if type(x[1]) == type(int)
#                     elif type(self.returnValue) == type(1) and return_type == 'INT':
#                         x = self.returnValue
#                         self.returnValue = None
#                         return x
#                     elif type(self.returnValue) == type(True) and return_type == 'BOOLEAN':
#                         x = self.returnValue
#                         self.returnValue = None
#                         return x
#                     else:
#                         raise Exception("Function return type does not match")
#         #TODO: create self.functions in listener
#         # self.functions[function_name] = callback    
#         self.functions[function_name] = {
#             "type_arguments": type_arguments,
#             "callback": callback,
#             "variable_types": variable_types
            
#         }   

#     def visitReturn(self, ctx) -> None:
#         # It can return integer, boolean or None (for void type)
#         codes = list(ctx.getChildren())
#         # remove from stack
#         self.function_vars.pop()
#         self.function_bools.pop()
        
#         self.returnValue = None if len(codes) == 1 else self.visit(codes[1])
#         self.returnEncountered = True
        
