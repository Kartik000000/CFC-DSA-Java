package com.company.lecture6;

public class Pattern {
    public static void main(String[] args) {
        int row =5,col=0;
        Printstar(row,col);
    }
    public static void Printstar(int row,int col) {
        if (row == 0) {
            return;
        }
        if (row == col) {
            System.out.println();
            Printstar(row - 1, 0);
            return;
        }
        System.out.print("*");
        Printstar(row, col + 1);
    }
}
