package TicTacToe;

public class TicTacToe {
    char[][] board;  //to create board
    boolean turn; //turn==true means 'x'

    TicTacToe() { // creating a 3 by 3 empty space for x and o
        board = new char[3][3];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';
        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';
        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';
    }

    public void makeMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (!isGameOver()) { //make move is game is not over
                if (board[row][col] == ' ') { // make move is the board is blank
                    if (turn) {// place X if turn is true.
                        board[row][col] = 'X';
                    } else {
                        board[row][col] = 'O';
                    }
                    turn = !turn; // to change the turn to next player.


                } else {
                    System.out.println("Slot is not empty");
                }
            } else {
                System.out.println("Game OVER!!!");
            }
        } else {
            System.out.println("Invalid position");
        }

        if (isGameOver()) {
            System.out.println("GAME OVER!!!");
        }
    }

    public boolean isGameOver() {
        if (checkRows() != ' ') {
            return true;
        } else if (checkColumn() != ' ') {
            return true;
        } else if (checkDiag() != ' ') {
            return true;
        } else if (isBoardFull()) {
            return true;
        }
        return false;

    }

    public char theWinnerIs() {
        if (checkRows() != ' ') {
            return checkRows();
        } else if (checkColumn() != ' ') {
            return checkColumn();
        } else if (checkDiag() != ' ') {
            return checkDiag();
        }
        return ' ';
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }

            }
        }
        return true;
    }

    public char checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' || board[i][0] == 'O') {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                    return board[i][0];
                }
            }
        }
        return ' ';

    }

    public char checkColumn() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 'X' || board[0][i] == 'O') {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                    return board[0][i];
                }
            }
        }
        return ' ';
    }

    public char checkDiag() {
        if (board[0][0] != ' ') {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return board[0][0];
            }
        }
        if (board[0][2] != ' ') {
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return board[0][2];
            }
        }
        return ' ';
    }

    public void makeBoard() {
        System.out.println(toString());
    }

    public String toString(){
        String s = "Board: \n";
        s += (board[0][0] + "|" + board[0][1] + "|" + board[0][2]+ "\n");
        s += ("------ " + "\n" );
        s +=  (board[1][0] + "|" + board[1][1] + "|" + board[1][2]+ "\n");
        s += ("------" + "\n");
        s +=(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n");

        if (isGameOver()) {
            if (theWinnerIs() == 'x')
                s = s + "X won!\n";
            else if (theWinnerIs() == 'o')
                s += "O won!\n";
            else
                s +="It's a draw!\n";
        }
        s += "\n";
        return s;



    }
}