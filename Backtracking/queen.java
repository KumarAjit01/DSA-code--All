package Backtracking;

public class queen {
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row + 1);// function call
            board[row][j] = 'X';// backtracking
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        System.out.println(board.length);
        nQueens(board, 0);

    }

}
