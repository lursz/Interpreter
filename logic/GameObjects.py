# , = dirt
# # = wall
# O = player
# 8 = guard
# ! = trap
# * = key
# G = gate
# E = exit

# ---------------------------------------------------------------------------- #
#                                  GameObjects                                 #
# ---------------------------------------------------------------------------- #

import random


class GameObjects:
    def __init__(self) -> None:
        self.game_board = []
        self.player_position = {"row": 0, "col": 0}
        self.guards = []
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
        if len(self.game_board) < row or len(self.game_board[0]) < col or row < 0 or col < 0:
            return False
        return True
    

    def checkIfPositive(self, row, col):
        if row <= 0 or col <= 0:
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
            raise Exception("Object cannot be placed out of bounds")
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
        

    # Exit
    def createExit(self, row, col):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        self.game_board[row][col] = "E"
    
        
    # Guard
    def createGuard(self, row, col, guard_id, list_of_commands):
        if not self.checkIfExists():
            return
        if not self.checkCoords(row, col):
            return
        
        self.game_board[row][col] = "8"
        self.guards.append(Guard(row, col, guard_id, list_of_commands))


    def moveGuards(self, round):
        for i, guard in enumerate(self.guards):
            # Indefinitely loop through the list of commands
            command = guard.list_of_commands[round % len(guard.list_of_commands)]
            
            # Move the guard accordingly
            new_x = guard.guard_position['row']
            new_y = guard.guard_position['col']
            match command: 
                case "LEFT":
                    new_y -= 1
                case "RIGHT":
                    new_y += 1
                case "UP":
                    new_x -= 1
                case "DOWN":
                    new_x += 1
                case "AUTO":
                    distance_x, distance_y = self.playerToGuardDistance(i)
                    if distance_x < distance_y:
                        if self.player_position['row'] < guard.guard_position['row']:
                            new_x -= 1
                        else:
                            new_x += 1
                    else:
                        if self.player_position['col'] < guard.guard_position['col']:
                            new_y -= 1
                        else:
                            new_y += 1
        
                case "RAND":
                    # Randomly choose a direction
                    random_value = random.randint(0, 3)
                    if random_value == 0:
                        new_x -= 1
                    elif random_value == 1:
                        new_x += 1
                    elif random_value == 2:
                        new_y -= 1
                    elif random_value == 3:
                        new_y += 1
                    else:
                        pass

            # Forbid movement into walls and out of map
            if new_x > len(self.game_board) - 1 or new_x < 0:
                continue
            if new_y > len(self.game_board[0]) - 1 or new_y < 0:
                continue

            # Forbid entering the wall
            if self.game_board[new_x][new_y] in ['#', 'E', '*', 'G', '!','8'] :
                continue
            
            self.game_board[new_x][new_y] = '8'
            self.game_board[guard.guard_position['row']][guard.guard_position['col']] = ','
            guard.guard_position['row'] = new_x
            guard.guard_position['col'] = new_y
        
    def playerToGuardDistance(self, i: int):
        # print("Guard cords: X:", self.guards[0].guard_position['row'], " Y:", self.guards[0].guard_position['col'])
        # print("Player cords: X:", self.player_position['row'], " Y:", self.player_position['col'])
        distance_y = abs(self.player_position['row'] - self.guards[i].guard_position['row'])
        distance_x = abs(self.player_position['col'] - self.guards[i].guard_position['col'])
        return (distance_x, distance_y)



class Guard:
    def __init__(self, row, col, guard_id, list_of_commands) -> None:
        self.guard_position = {"row": row, "col": col}
        self.guard_id = guard_id
        self.list_of_commands = list_of_commands

    def updateCoords(self, row, col):
        self.guard_position = {"row": row, "col": col}
