

class Gameclass:

    
    def __init__(self) -> None:
        self.game_board = []
        
    
    def board(self, height, width):
        for i in range(height):
            self.game_board.append([","] * width)
        return self.game_board
