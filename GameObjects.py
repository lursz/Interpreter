# , = ziemia
# # = sciana
# O = gracz
# 8 = straznik
# ! = pulapka
# * = klucz
# G = brama
# E = wyjscie

# ---------------------------------------------------------------------------- #
#                                  GameObjects                                 #
# ---------------------------------------------------------------------------- #
class GameObjects:
    def __init__(self) -> None:
        self.game_board = []
        self.player_position = {"row": 0, "col": 0}
        self.guards = {}
        self.is_player_defined = False
        self.is_map_defined = False
        self.key_number = 0
        self.is_alive = True

    # ------------------------------ Error detection ----------------------------- #
    def checkIfExists(self):
        if len(self.game_board) == 0:
            return False
        return True
    
    
    def checkCoords(self, row, col):
        if len(self.game_board) < row or len(self.game_board[0]) < col:
            return False
        return True
    
    
    # ------------------------------ Create objects ------------------------------ #
    # Map
    def createMap(self, height, width):
        if height <= 0 or width <= 0:
            return
        try:
            if self.is_map_defined:
                raise NameError("Map is already defined")
        except NameError:
            print("Map is already defined")
            exit()
        
        for _ in range(height):
            self.game_board.append([","] * width)

        self.is_map_defined = True
        return self.game_board

    # Wall
    def createWall(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "#"
        return self.game_board

    # Player
    def createPlayer(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        if self.is_player_defined:
            raise Exception("Player is already defined")

        self.game_board[row][col] = "O"
        self.player_position = {"row": row, "col": col}
        self.is_player_defined = True
        
    # Trap
    def createTrap(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "!"
        
    # Key
    def createKey(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "*"
        
    # Gate
    def createGate(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "G"
        
    # Guard
    def createGuard(self, row, col, guard_id):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        
        self.game_board[row][col] = "8"
        self.guards[guard_id] = {
            "row": row,
            "col": col
        }

    # Exit
    def createExit(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "E"
