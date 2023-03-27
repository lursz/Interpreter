from enum import IntEnum

import pygame
import numpy as np


class Compass(IntEnum):
    NORTH = 0
    EAST = 1
    SOUTH = 2
    WEST = 3


class Map(IntEnum):
    PATH = 0
    HERO = 1
    WALL = 2
    ENEMY = 3
    TRAP = 4
    TREASURE = 5


class Gameclass:

    def __init__(self):

        pygame.init()

        "Size"
        self.display_width = 800
        self.display_height = 600
        self.field_size = 10  # liczba kratek
        self.menu_width = 600 / 20
        self.menuX = min(self.display_width, self.display_height)

        "Windows settings"
        self.display_window = pygame.display.set_mode((self.display_width, self.display_height))
        pygame.display.set_caption("Battleground Simulator")
        clock = pygame.time.Clock()
        self.display_window.fill(pygame.Color("white"))
        self.block_size = min(self.display_height, self.display_width) / self.field_size

        "Data"
        self.direction = Compass.NORTH
        self.field = np.zeros((10, 10))
        self.position = (7, 7)
        self.instructions = []
        self.instructions_counter = 0
        self.readFromFile("..\example.txt")
        print(self.instructions)

    def drawGrid(self):
        """"
        Wygodne rysowanie siatki na ekranie
        :param number: rozmiar siatki
        """

        for x in range(self.field_size):
            for y in range(self.field_size):
                rect = pygame.Rect(x * self.block_size, y * self.block_size,
                                   self.block_size, self.block_size)
                pygame.draw.rect(self.display_window, pygame.Color("black"), rect, 1)

    def drawRect(self, color, x, y):
        pygame.draw.rect(
            self.display_window,
            pygame.Color(color),
            pygame.Rect(x * self.block_size, y * self.block_size, self.block_size, self.block_size),
            0)

    def fillMap(self):
        for x in range(self.field_size):
            for y in range(self.field_size):
                if self.field[x, y] == Map.HERO:
                    self.drawRect("green", x, y)
                elif self.field[x, y] == Map.WALL:
                    self.drawRect("black", x, y)
                elif self.field[x, y] == Map.ENEMY:
                    self.drawRect("red", x, y)
                elif self.field[x, y] == Map.TREASURE:
                    self.drawRect("yellow", x, y)
                elif self.field[x, y] == Map.TRAP:
                    self.drawRect("blue", x, y)
                elif self.field[x, y] == Map.PATH:
                    self.drawRect("white", x, y)

    def readFromFile(self, name):
        with open(name, "r") as fp:
            for i in fp.readlines():
                self.instructions.append(i)

    def makeMap(self):
        self.field[self.position] = Map.HERO
        self.field[1:4, 4] = Map.WALL
        self.field[5, 5] = Map.TRAP
        self.field[6, 9] = Map.TREASURE
        self.field[8, 8] = Map.ENEMY

    def moveForward(self):

        if self.field[self.fieldInFront()] != Map.WALL:

            self.field[self.position] = Map.PATH

            if self.direction == Compass.SOUTH:
                self.position = (self.position[0], min(self.position[1] + 1, 9))
            if self.direction == Compass.NORTH:
                self.position = (self.position[0], max(self.position[1] - 1, 0))
            if self.direction == Compass.EAST:
                self.position = (min(self.position[0] + 1, 9), self.position[1])
            if self.direction == Compass.WEST:
                self.position = (max(self.position[0] - 1, 0), self.position[1])

            self.field[self.position] = Map.HERO

    def lost(self):
        self.field[self.position] = Map.PATH
        self.position = self.start_position
        self.field[self.position] = Map.HERO

    def turn(self, direction):
        if direction == "right":
            self.direction = (self.direction + 1) % 4
        elif direction == "left":
            self.direction = (self.direction - 1) % 4

    def checkCondition(self, condition):
        field_in_front = self.fieldInFront()

        if condition == Map(self.field[field_in_front[0], field_in_front[1]]).name:
            return True
        else:
            return False

    def attack(self):
        field_in_front = self.fieldInFront()

        if self.field[field_in_front[0], field_in_front[1]] == Map.ENEMY:
            self.field[field_in_front[0], field_in_front[1]] = 0

    def disarm(self):
        field_in_front = self.fieldInFront()

        if self.field[field_in_front[0], field_in_front[1]] == Map.TRAP:
            self.field[field_in_front[0], field_in_front[1]] = 0

    def fieldInFront(self):
        field_in_front = self.position

        if self.direction == Compass.NORTH:
            field_in_front = (field_in_front[0], field_in_front[1] - 1)
        if self.direction == Compass.SOUTH:
            field_in_front = (field_in_front[0], field_in_front[1] + 1)
        if self.direction == Compass.EAST:
            field_in_front = (field_in_front[0] + 1, field_in_front[1])
        if self.direction == Compass.WEST:
            field_in_front = (field_in_front[0] - 1, field_in_front[1])

        return field_in_front



    def start(self):
        self.makeMap()
        while 1:
            self.fillMap()
            self.drawGrid()

            for event in pygame.event.get():

                if event.type == pygame.QUIT:
                    pygame.quit()

                if event.type == pygame.MOUSEBUTTONDOWN:
                    self.moveForward()

                if event.type == pygame.KEYDOWN:
                    if event.key == ord("a"):
                        self.turn("left")
                    elif event.key == ord("d"):
                        self.turn("right")

            pygame.display.update()
