package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    final static int WINNING_POSITION = 100;
    final static int RESTART = 0;
    final static int ladder = 1;
    final static int snake = 2;
    final static int noPlay = 3;
    static int position = 0;

    static int play(int position) {
        int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The value of the die is " + diceRoll);
        int option = (int) (Math.random() * 10) % 3;
        switch (option) {
            case ladder:
                System.out.println("Ladder \nplayer1 moves ahead " + diceRoll);
                position += diceRoll;
                if (position > 100) {
                    position -= diceRoll;
                    System.out.println("Dice face is invalid stay in the same position");
                }
                break;
            case snake:
                System.out.println("Snake \nplayer1 moves behind " + diceRoll);
                position -= diceRoll;
                if (position < 0) {
                    position = RESTART;
                    System.out.println("You came back to start.");
                }
                break;
            case noPlay:
                System.out.println("No Play \nplayer1 remains in same position");
                position += 0;
                break;
        }
        if (option == 1) {
            System.out.println("Roll the dice again");
            play(diceRoll);
        }
        return position;
    }


    public static void main(String[] args) {
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int count = 0;
        while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION) {
            count++;
            playerOnePosition = SnakeAndLadder.play(playerOnePosition);
            System.out.println("Position of the player one is " + playerOnePosition);
            playerTwoPosition = SnakeAndLadder.play(playerTwoPosition);
            System.out.println("Position of the player two is " + playerTwoPosition);
        }
        if (playerOnePosition > playerTwoPosition) {
            System.out.println("Player one won the game");
        } else {
            System.out.println("Player two won the game");
        }
        System.out.println("Number of the times die rolled " + count);
    }
}