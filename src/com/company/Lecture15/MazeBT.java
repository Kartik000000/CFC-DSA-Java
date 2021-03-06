package com.company.Lecture15;

public class MazeBT {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] maze = new int[m][n];
        int cRow = 1;
        int cCol = 2;

        int fRow = 2;
        int fCol = 0;
        int[][] bombs = {{0,0},
                {2,2}};
        for (int[] bomb : bombs){
            maze[bomb[0]][bomb[1]] = 1;
        }
        mazepath(maze,cRow,cCol,fRow,fCol,"");
    }

    private static void mazepath(int[][] maze, int cRow, int cCol, int fRow, int fCol, String solution) {
        if(cRow < 0 || cCol < 0 || cRow >= maze.length || cCol >= maze[0].length){
            return;
        }
        if(maze[cRow][cCol] == 1){
            return;
        }
        if(cRow == fRow && cCol == fCol){
            System.out.println(solution);
            return;
        }
        maze[cRow][cCol]= 1;
        mazepath(maze,cRow-1,cCol,fRow,fCol,solution + "N");
        mazepath(maze,cRow+1,cCol,fRow,fCol,solution + "S");
        mazepath(maze,cRow,cCol+1,fRow,fCol,solution + "E");
        mazepath(maze,cRow,cCol-1,fRow,fCol,solution + "W");
        maze[cRow][cCol]= 0;
    }
}
