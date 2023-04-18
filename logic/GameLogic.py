from logic.GameObjects import GameObjects

# ---------------------------------------------------------------------------- #
#                                   GameLogic                                  #
# ---------------------------------------------------------------------------- #
class Gamelogic:
    def __init__(self, game_objects: GameObjects) -> None:
        self.game = game_objects
        self.round = 0
        self.startGame()
        
        
    def winGame(self):
        print("DAMN, YOU ARE THE GREATEST STUDENT TO HAVE EVER EXISTED!!!!")

    def startGame(self):
        while self.game.is_alive:
            print('runda: ', self.round)
            self.printMap()
            command = input().lower()
            x, y = self.game.player_position['row'], self.game.player_position['col']
            match command:
                case "w":
                    self.updatePlayerCoords(x-1, y)
                case "a":
                    self.updatePlayerCoords(x, y-1)
                case "s":
                    self.updatePlayerCoords(x+1, y)
                case "d":
                    self.updatePlayerCoords(x, y+1)
                case _:
                    print("Wrong command!")

    def printMap(self):
        #return
        num_rows = len(self.game.game_board)
        num_cols = len(self.game.game_board[0])
        # First row
        print('┌' + '───┬'* (num_cols) + '───┐')
        # Interior
        for i in range(num_rows):
            if i != 0:
                print('├───┼' + '───┼'* (num_cols - 1) + '───┤')
            if i+1<10:
                print(f'│ {i+1} │', end='')
            else:
                print(f'│ {i+1}│', end='')
            for j in range(num_cols):
                print(f' {self.game.game_board[i][j]} │', end='')
            print()
        # Last row
        print('└───┴' + '───┴'* (num_cols - 1) + '───┘')
        print('    ', end='')
        for i in range(num_cols):
            if i+1<10:
                print(f'  {i+1} ', end='')
            else:
                print(f'  {i+1}', end='')
        print()
        print("Your keys: ", self.game.key_number)


    # --------------------------------- Movement --------------------------------- #
    def gameTick(self):
        # parse one command from every guard's list_of_commands and move the guards in the correct direction
        self.game.moveGuards(self.round)
        self.round += 1

        
    def updatePlayerCoords(self, x, y):
        self.gameTick()

        # Forbid movement into walls and out of map
        if x > len(self.game.game_board) - 1 or x < 0:
            return
        if y > len(self.game.game_board[0]) - 1 or y < 0:
            return

        # If player enters exit, instantly win the game
        # TODO: Currently also kills the player, maybe make it do something different?
        if self.game.game_board[x][y] == 'E':
            self.winGame()
            self.game.is_alive = False

        
        
        # Forbid entering the wall
        if self.game.game_board[x][y] == '#':
            print("Don't enter the wall")
            return

        # Collect the key if player enters the key field
        if self.game.game_board[x][y] == '*':
            print("You've got a key")
            self.game.key_number += 1
        
        # Check for keys if player tries to enter the gate, if no keys, don't let him move
        if self.game.game_board[x][y] == 'G':
            if self.game.key_number > 0:
                self.game.key_number -= 1
                print("You've opened the gate!")
            else:
                print("Not enough keys!")
                return

        # Fail if player enters the trap
        if self.game.game_board[x][y] == '!':
            self.game.is_alive = False
            print("You fell into the trap, you fool!")
        
        # Fail if player gets caught by a guard
        if self.game.game_board[x][y] == '8':
            self.game.is_alive = False
            print("You've been caught by the guard!")
        
        row, col = self.game.player_position['row'], self.game.player_position['col']
        if self.game.game_board[row][col] != "8":
            # clear player previous position
            self.game.game_board[row][col] = ','
        self.game.player_position = {"row": x, "col": y}
        # updating new player position
        self.game.game_board[x][y] = 'O'

