grammar JailBreakLang;

start: 'MAP' '=' INT ',' INT
       'PLAYER' '=' INT ',' INT
       'EXIT' '=' INT ',' INT kod*;

kod:  obiekty
    | instrukcje_warunkowe
    | deklaracja_funkcji;

obiekty:  'WALL' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
        | 'TRAP' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
        | 'KEY' '=' (INT | ID) ',' (INT | ID)
        | 'GATE' '=' (INT | ID) ',' (INT | ID)
        | 'GUARD' '=' (INT | ID) ',' (INT | ID) ',' INT kod*
        'GUARD' INT '{' kod_straznika* '}';

instrukcje_warunkowe: 'IF' '(' warunek ')' '{' wyrazenia* '}'
                    | 'WHILE' '(' warunek ')' '{' wyrazenia* '}'
                    | 'FOR' '(' ID 'IN' INT ')' '{' wyrazenia* '}'
                    | ID ('(' ID (',' ID)* ')')*;

deklaracja_funkcji: 'FUN' ID ('(' ID (',' ID)* ')')* '{' wyrazenia* '}';

wyrazenia: obiekty
         | instrukcje_warunkowe_2;

instrukcje_warunkowe_2: 'IF' '(' warunek ')' '{' wyrazenia* '}'
            | 'WHILE' '(' warunek ')' '{' wyrazenia* '}'
            | 'FOR' '(' ID 'IN' INT ')' '{' wyrazenia* '}'
            | ID ('(' ID (',' ID)* ')')*;   

kod_straznika: instrukcje_warunkowe_3
             | sterowanie_straznikiem;

instrukcje_warunkowe_3: 'IF' '(' warunek ')' '{' kod_straznika* '}'
            | 'WHILE' '(' warunek ')' '{' kod_straznika* '}'
            | 'FOR' '(' ID 'IN' INT ')' '{' kod_straznika* '}'
            | ID ('(' ID (',' ID)* ')')*;  

sterowanie_straznikiem: 'DIRECTION' '=' (INT | ID)
                      | 'TURNLEFT'
                      | 'TURNRIGHT'
                      | 'STEP';

warunek: 'IFWALL'
        | 'IFDIRECTION' '=' (INT | ID)
        | 'IFGUARD'
        | 'IFTRAP'
        | 'IFGATE'
        | 'NO' warunek
        | 'TRUE'
        | 'FALSE'
        | warunek 'AND' warunek
        | warunek 'OR' warunek
        | '(' warunek ')';

COMMENT: '#' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
RAND: 'RANDOM' '(' INT ',' INT ')';
INT: [1-9][0-9]* | '0';
WS: [ \t\n\r]+ -> skip;