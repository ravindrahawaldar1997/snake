package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    final static int WINNING_POSITION = 100;
    final static int RESTART = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int position = 0;
        while (position <= WINNING_POSITION) {
            int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
            switch (option) {

                case 0:
                    System.out.println("Ladder \nplayer moves ahead " + diceRoll);
                    position += diceRoll;
                    if (position > 100) {
                        position -= diceRoll;
                    }
                    break;
                case 1:
                    System.out.println("Snake \nplayer moves behind " + diceRoll);
                    position -= diceRoll;
                    if (position < 0) {
                        position = RESTART;
                        System.out.println("You came back to start.");
                    }
                    break;
                case 2:
                    System.out.println("No Play \nplayer remains in same position");
                    position += 0;
                    break;
            }
            if (position == 100) {
                System.out.println("You won the game.");
                break;
            } else {
                System.out.println("New Position: " + position);
            }
        }

    }
}