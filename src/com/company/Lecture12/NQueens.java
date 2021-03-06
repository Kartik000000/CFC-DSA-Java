package com.company.Lecture12;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[4][4];
        nQueens(board, 0);
    }
    public static void nQueens(boolean[][] board, int row) {
        if(row == board.length){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board,row,i)) {
                board[row][i] = true;
                nQueens(board, row + 1);
                board[row][i] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int leftdia = Math.min(row, col);
        for (int i = 1; i <= leftdia; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int rightdia = Math.min(row, board.length - col-1);
        for (int i = 1; i <= rightdia; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;

    }
}
