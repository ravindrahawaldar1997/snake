package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int position = 0;
        System.out.println("Starting position of the game " + position);
        int dieRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(dieRoll);
    }
}

