package TicTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;// for user input

        TicTacToe game = new TicTacToe(); //create a TicTacToe object name game

        Scanner input = new Scanner(System.in);

        game.makeBoard(); //make board

        while(!game.isGameOver()){ // repeat until game is not over
            System.out.println("enter your position " + (game.turn?"p2":"p1"));
            a = input.nextInt();
            b= input.nextInt();
            game.makeMove(a,b); //make user input move
            game.makeBoard(); //print board after the user input
        }

       game.makeBoard();

    }
}
