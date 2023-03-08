# NAZWA
## Ogólne informacje
Język {INSERT_NAME_HERE} pozwala programiście na utworzenie prostych plansz do gier, razem z przeszkodami oraz programowalnymi przeciwnikami.

Język ma na celu w przyjemny sposób wprowadzić użytkowników w tajniki programowania, jednocześnie pozwalająć bardziej kreatywnym twórcom wykazać się w tworzeniu poziomów.

Gotową planszę można od razu przetestować oraz przejść.


## Składnia

### Mapa
* ``` map ```- wielkość mapy
* ``` player ```- pozycja startowa gracza

### Obiekty
* ``` wall ```- pozycja bramy
* ``` enemy ```- pozycja początkowa strażnika
* ``` trap ```- pozycja pułapki
* ``` key ```- pozycja klucza do bramy
* ``` gate ```- pozycja bramy
* ``` shovel ```- pozycja łopaty


### Interakcja
* ``` wasd ```- przechodzi o jedno pole

### Instrukcje sterujące
* ```if<warunek>(wyrażenia)``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```while<warunek>(wyrażenia)``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```for<liczba>(wyrażenia)``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```fun nazwa(ciało)``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funckji o podanej nazwie

### Możliwe warunki
* ```WALL``` - true jeśli przed postacią jest ściana
* ```ENEMY``` - true jeśli przed postacią jest wróg
* ```TRAP``` -  true jeśli przed postacią jest pułapka
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```[``` i ```]``` - wykorzystywane do nawiasowania warunków


## Plik z mapą
Plik z mapą powinien zawierać 15 linii tesktu. W kazdej linii powinno być <size> liczb odzielonych przecinkiem. Liczby przedstawiają odpwiednie pola mapy, według następującej listy:
```
- = 0
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
