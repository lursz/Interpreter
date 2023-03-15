# NAZWA
## Ogólne informacje
Język {INSERT_NAME_HERE} pozwala programiście na utworzenie prostych plansz do gier, razem z przeszkodami oraz programowalnymi przeciwnikami. Motywem gry jest ucieczka z więzienia.

Język ma na celu w przyjemny sposób wprowadzić użytkowników w tajniki programowania, jednocześnie pozwalająć bardziej kreatywnym twórcom wykazać się w tworzeniu poziomów.

Gotową planszę można od razu przetestować oraz przejść.


## Składnia

### Mapa
* ``` map ```- wielkość mapy
* ``` player ```- pozycja startowa gracza
* ``` exit ``` - pozycja wyjścia

### Obiekty
* ``` wall ``` - obiekt bramy
* ``` guard ``` - obiekt strażnika
* ``` trap ``` - obiekt pułapki
* ``` key ``` - obiekt klucza do bramy
* ``` gate ``` - obiekt bramy
* ``` shovel ``` - obiekt łopaty


### Instrukcje sterujące
* ```if(warunek){wyrażenia}``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```while(warunek){wyrażenia}``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```for(int){wyrażenia}``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```fun nazwa{ciało}``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funkcji o podanej nazwie

### Sterowanie strażnikiem
* ```DIRECTION``` - 0 oznacza do góry, 1 w prawo, 2 w dół, 3 w lewo, inne wartości są podmieniane na resztę z dzielenia przez 4
* ```TURNLEFT``` - obróć strażnika w lewo (równoważne ze zmniejszeniem DIRECTION o 1)
* ```TURNRIGHT``` - obróć strażnika w prawo (równoważne ze zwiększeniem DIRECTION o 1)
* ```STEP``` - sprawia, że strażnik poruszy się do przodu o jedno pole

### Możliwe warunki
* ```WALL``` - true jeśli przed postacią jest ściana
* ```GUARD``` - true jeśli przed postacią jest wróg
* ```TRAP``` -  true jeśli przed postacią jest pułapka
* ```GATE```- true jeśli brama wymaga klucza
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```(``` i ```)``` - wykorzystywane do nawiasowania warunków


## Mapa
Gotowa do gry mapa jest wynikiem kompilacji kodu. Odpowiednie symbole będą reprezentować poszczególne obiekty.
```
, = ziemia
# = ściana
o = gracz
O = strażnik
! = pułapka
* = klucz
$ = brama
X = wyjście
 ```
Przykładowy plik z mapą:
```
##########
#o,,,,,,,#
#,,,,,,,,#
#,,,!,,,,#
#,,,O,,,,#
#,,,,!,,$X
######,,,#
#,,,,,,,,#
#*,,,,,,,#
##########
```


## Interakcja
* ``` wasd ```- przechodzi o jedno pole

## Przykład kodu
```
# na początku określamy wielkość mapy, podając najpierw współrzędną X, a potem Y
MAP = 10,10

# następnie dodajemy inne obiekty
PLAYER = 1,1

WALL = 1,5
WALL = 2,5
WALL = 3,5
WALL = 4,5
WALL = 5,5
WALL = 6,5

# można ułatwić sobie ustawianie dużej ilości obiektów używając pętli

# kod poniżej zrobi ściany dookoła mapy
for i in (0,9)
{
    WALL = 0,i
    WALL = 9,i
    WALL = i,0
    WALL = i,9
}

KEY = 2,8

# w tym miejscu znajduje się już ściana, ale program nadpisze ten obiekt
EXIT = 9,5
GATE = 8,5

TRAP = 5,5
TRAP = 3,4

# strażnika deklarujemy przez podanie współrzędnej X, potem Y, następnie unikalnego id strażnika
GUARD = 4,4,0

# aby zadeklarować poruszanie się strażnika trzeba najpierw napisać słowo klucz GUARD, następnie id strażnika
GUARD0
{
    # wykonaj dwa kroki do przodu, następnie zrób obrót w prawo
    STEP
    STEP
    TURNRIGHT

    # jeżeli przed strażnikiem nie ma ściany, a brama została otwarta, zrób dodatkowy krok
    if(NO WALL AND NO GATE)
    {
        STEP
    }

    # instrukcje te będą automatycznie zapętlane
}
```
