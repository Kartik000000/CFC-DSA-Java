package com.company.Lecture15;

public class MazeBTLeetCode {
    public static void main(String[] args) {
        int[][] grid = { {0,6,0},
                         {5,8,7},
                         {0,9,0}};
        int max = 0;

        for(int r = 0;r < grid.length;r++){
            for(int c = 0;c < grid[0].length;c++){
               int res = gridPath(grid,r, c,0);
               if(res>max){
                   max =  res;
               }

            }
        }
        System.out.println(max);

        int cRow = 0;
        int cCol = 1;
        int Total = 0;
        int out = gridPath(grid,cRow,cCol,0);
    }

    private static int gridPath(int[][] grid, int cRow, int cCol, int total) {
        if(cRow < 0 || cCol < 0 || cRow >= grid.length || cCol >= grid[0].length ){
            return total ;
        }
        if(grid[cRow][cCol] == 0){
            return total;
        }
        int val = grid[cRow][cCol];
        grid[cRow][cCol] = 0;
        int up = gridPath(grid,cRow-1,cCol,total+val);
        int down = gridPath(grid,cRow+1,cCol,total+val);
        int left = gridPath(grid,cRow,cCol-1,total+val);
        int right = gridPath(grid,cRow,cCol+1,total+val);
        grid[cRow][cCol] = val;
         return Math.max(Math.max(up,down),Math.max(left,right));
    }

}
