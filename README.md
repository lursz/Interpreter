# NAZWA
## Ogólne informacje
Język {INSERT_NAME_HERE} pozwala programiście na utworzenie prostych plansz do gier, razem z przeszkodami oraz programowalnymi przeciwnikami. Motywem gry jest ucieczka z więzienia.

Język ma na celu w przyjemny sposób wprowadzić użytkowników w tajniki programowania, jednocześnie pozwalająć bardziej kreatywnym twórcom wykazać się w tworzeniu poziomów.

Gotową planszę można od razu przetestować oraz przejść.


## Składnia

### Mapa
* ``` map ```- wielkość mapy
* ``` player ```- pozycja startowa gracza

### Obiekty
* ``` wall ```- obiekt bramy
* ``` guard ```- obiekt strażnika
* ``` trap ```- obiekt pułapki
* ``` key ```- obiekt klucza do bramy
* ``` gate ```- obeiekt bramy
* ``` shovel ```- obiekt łopaty


### Instrukcje sterujące
* ```if(warunek)<wyrażenia>``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```while(warunek)<wyrażenia>``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```for(int)<wyrażenia>``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```fun nazwa<ciało>``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funckji o podanej nazwie

### Możliwe warunki
* ```WALL``` - true jeśli przed postacią jest ściana
* ```GUARD``` - true jeśli przed postacią jest wróg
* ```TRAP``` -  true jeśli przed postacią jest pułapka
* ``` GATE ```- true jeśli brama wymaga klucza
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```[``` i ```]``` - wykorzystywane do nawiasowania warunków


## Plik z mapą
Plik z mapą powinien zawierać x linii tesktu. W kazdej linii powinno być <size> liczb odzielonych przecinkiem. Liczby przedstawiają odpwiednie pola mapy, według następującej listy (TODO):
```
ziemia = 0
- = 1
- = 2
- = 3
- = 4
- = 5
 ```
Przykładowy plik z mapą:
```
2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
2, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 4, 2, 2, 2, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
```


## Interakcja
* ``` wasd ```- przechodzi o jedno pole
