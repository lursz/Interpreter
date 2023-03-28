grammar JailBreakLang;

start: code+ EOF;

code: objects | commands | function_declaration;

objects:
	'WALL' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
	| 'TRAP' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
	| 'KEY' '=' (INT | ID) ',' (INT | ID)
	| 'GATE' '=' (INT | ID) ',' (INT | ID)
	| 'GUARD' '=' (INT | ID) ',' (INT | ID) ',' INT code* 'GUARD' INT '{' guard_extra_code* '}'
	| 'MAP' '=' INT ',' INT 
    | 'PLAYER' '=' INT ',' INT 
    | 'EXIT' '=' INT ',' INT;

commands:
	'IF' '(' condition ')' '{' expressions* '}'
	| 'WHILE' '(' condition ')' '{' expressions* '}'
	| 'FOR' '(' ID 'IN' INT ')' '{' expressions* '}'
	| ID ('(' ID (',' ID)* ')')?;

function_declaration:
	'FUN' ID ('(' ID (',' ID)* ')')? '{' expressions* '}';

expressions: objects | commands;

guard_extra_code: commands | guard_control;

guard_control:
	'DIRECTION' '=' (INT | ID)
	| 'TURNLEFT'
	| 'TURNRIGHT'
	| 'STEP';

condition:
	'IFWALL'
	| 'IFDIRECTION' '=' (INT | ID)
	| 'IFGUARD'
	| 'IFTRAP'
	| 'IFGATE'
	| 'NO' condition
	| 'TRUE'
	| 'FALSE'
	| condition 'AND' condition
	| condition 'OR' condition
	| '(' condition ')';

COMMENT: '#' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
RAND: 'RANDOM' '(' INT ',' INT ')';
INT: [1-9][0-9]* | '0';
WS: [ \t\n\r]+ -> skip;