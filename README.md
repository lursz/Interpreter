# JailBreakLang
## About
The JailBreakLang language enables a programmer to create simple game boards, complete with obstacles and programmable enemies. The game's theme is centered around escaping from a prison.

The language aims to introduce users to the intricacies of programming in an enjoyable manner, while also allowing more creative developers to showcase their skills in level creation.

Once completed, the game board can be immediately tested and played on.

## Run
Install Python3 (ver >= 3.10.8), then install all dependencies from `requirements.txt`
```
pip install requirements.txt
```
Used libraries:
```
antlr4-python3-runtime
antlr4-tools
install-jdk
numpy
```


__________________________________________
## Syntax

### Map
* ``` MAP = y, x```- size of the map
* ``` PLAYER = y, x```- starting position of the player
* ``` EXIT = y, x``` - position of the exit

### Objects
* ``` WALL = y, x``` - object representing a wall
* ``` GUARD y, x, id {} ``` - object representing a guard
* ``` TRAP = y, x``` - object representing a trap
* ``` KEY = y, x``` - object representing a key to unlock a gate
* ``` GATE = y, x``` - object representing a gate

### Variables
* ``` INT name = value``` - integer variable
* ``` BOOLEAN name = value``` - boolean variable

### Control Instructions
* ```IF (condition) {code}``` - conditional instruction, will execute if the given condition is true
* ```WHILE (condition) {code}``` - loop executes as long as the given condition is true
* ```FOR (int) {code}``` - loop that executes a specified number of times (a natural number greater than 0)
* ```<TYPE> FUN name (args) {code}``` - function with the given name
* ```USE name (args)``` - call a function with the given name

### Guard Controls
* ```GUARD {<Place movement instructions here}``` 
* ```LEFT, RIGHT, UP, DOWN``` - Move the guard in the given direction
* ```AUTO``` - Guard will move in the direction of the player
* ```RAND``` - Guard will move in a random direction

### Possible Conditions
* ```NO``` - negation
* ```TRUE``` - always returns true
* ```FALSE``` - always returns false
* ```==``` - comparison equality
* ```!=``` - comparison inequality
* ```AND``` - logical conjunction
* ```OR``` - logical disjunction
* ```(``` i ```)``` - parentheses

### Movement
* ``` wasd ```- during the game, moves the player around


## Code examples
For code examples visit folder `/input`


## Map
A ready-to-play map is the result of compiling the code. Appropriate symbols will represent individual objects.
```
  = unobstructed path
# = WALL 
O = PLAYER
8 = GUARD
! = TRAP
* = KEY
G = GATE
E = EXIT
 ```

Example map:
```
┌───┬───┬───┬───┬───┬───┐
│ 1 │   │   │   │ * │   │
├───┼───┼───┼───┼───┼───┤
│ 2 │ # │ G │   │   │   │
├───┼───┼───┼───┼───┼───┤
│ 3 │ # │ E │   │   │   │
├───┼───┼───┼───┼───┼───┤
│ 4 │ # │ O │   │   │   │
├───┼───┼───┼───┼───┼───┤
│ 5 │   │   │   │   │   │
└───┴───┴───┴───┴───┴───┘
      1   2   3   4   5 
```



## Grammar
<details>
<summary>ANTLR4</summary>
</br> 

```g4
grammar JailBreakLang;

start: code+ EOF;

code: objects | commands | function_declaration | variables | use_fun;

objects:
	'WALL' '=' (expr | ID | RAND) ',' (expr | ID | RAND)
	| 'TRAP' '=' (expr | ID | RAND) ',' (expr | ID | RAND)
	| 'KEY' '=' (expr | ID) ',' (expr | ID)
	| 'GATE' '=' (expr | ID) ',' (expr | ID)
	| 'GUARD' '=' (expr | ID) ',' (expr | ID) ',' expr '{' guard_extra_code* '}'
	| 'MAP' '=' expr ',' expr 
    | 'PLAYER' '=' expr ',' expr 
    | 'EXIT' '=' expr ',' expr
	| 'PRINT' '(' argument ')';

argument: condition
		  | expr;

// INT DECLARATION
variables: 'INT' ID '=' expr
		   | ID '=' expr
		   | 'BOOLEAN' ID '=' condition;

comparison: expr (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN) expr;

expr: term ((ADD | SUB) term)*;

term: factor ((MUL | DIV) factor)*;

factor: ID | INT | LPAREN expr RPAREN;


// COMMANDS
commands:
	'IF' '(' condition ')' '{' expressions* '}' ('ELSE' '{' expressions* '}')?
	| 'WHILE' '(' condition ')' '{' expressions* '}'
	| 'FOR' '(' ID 'IN' expr ')' '{' expressions* '}';
	
	//FOR (x IN 10) {*code*}

expressions: objects | commands | variables | return | use_fun;

// FUNCTIONS
function_declaration:
	fun_type 'FUN' ID '('( var_type ID (',' var_type ID)* )?')' '{' expressions* '}';


fun_type: 'VOID'
		  | 'INT'
		  | 'BOOLEAN';

var_type: 'INT'
		  | 'BOOLEAN';

fun_expressions: objects | fun_commands | variables | return;

return: RETURN (expr)?;

fun_commands:
	'IF' '(' condition ')' '{' fun_expressions* '}' ('ELSE' '{' fun_expressions* '}')?
	| 'WHILE' '(' condition ')' '{' fun_expressions* '}'
	| 'FOR' '(' ID 'IN' expr ')' '{' fun_expressions* '}'
	| use_fun;

use_fun: 'USE' ID '('( (expr | condition) (',' (expr | condition))* )?')';

// GUARD
guard_extra_code: commands | guard_control;

guard_control:
	'LEFT'
	| 'RIGHT'
	| 'UP'
	| 'DOWN'
	| 'AUTO'
	| 'RAND';


// BOOLEANS
value_comparison: expr (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN) expr;

booleanValue : 'TRUE'
	| 'FALSE'
	| value_comparison
	| variable_value
	;

variable_value: ID;

condition :                
	| condition_product (OR condition)*
	;      

condition_product : '(' condition ')'
	| booleanValue (AND condition_product)*
	| booleanValue (EQUALS condition_product)*
	| booleanValue (NOT_EQUALS condition_product)*
	| NOT booleanValue
	| NOT '(' condition ')'
	;	

RETURN: 'RETURN';
EQUALS : '==' ;
NOT_EQUALS : '!=' ;
LESS_THAN : '<' ;
GREATER_THAN : '>' ;
LPAREN: '(';
RPAREN: ')';
AND: 'AND';
NOT: 'NOT';
OR: 'OR';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
COMMENT: '#' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
RAND: 'RANDOM' '(' INT ',' INT ')';
INT: [1-9][0-9]* | '0';
WS: [ \t\n\r]+ -> skip;
```
</details>

<details>
<summary>Grammar tree with an instance program</summary>
</br> 

## Grammar tree generated from instance program:
![pobrany plik](https://user-images.githubusercontent.com/92331353/226716062-dc7a5c32-20d7-4dde-8b61-28fca4b69470.svg)
</details>

