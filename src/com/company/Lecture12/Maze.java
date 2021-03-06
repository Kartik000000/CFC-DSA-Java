package com.company.Lecture12;

public class Maze {
    public static void main(String[] args) {
        int row=2,col=3;
        int Countways = maze(row,col);
        System.out.println(Countways);

    }
    public static int maze(int row,int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int count = 0;
        count+= maze(row-1,col);
        count+= maze(row,col-1);
        return count;
    }

}
