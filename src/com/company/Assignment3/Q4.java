package com.company.Assignment3;

public class Q4 {
    public static void main(String[] args) {
        int[][] nums = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };

        AntiClockprint(nums,4,4);
    }

    public static void AntiClockprint(int[][] nums,int n,int m) {
        int minr = 0, minc = 0;
        int maxr = nums.length-1;
        int maxc = nums[0].length-1;
        int count = 0;
        int total = m * n;
        while (count < total) {
            for(int i = minr; i <= maxr; i++){
                System.out.println(nums[i][minc]);
                count++;
            }minc++;
            for (int j = minc;j <= maxc;j++){
                System.out.println(nums[maxr][j]);
                count++;
            }maxr--;
            for(int i = maxr;i >= minr;i--){
                System.out.println(nums[i][maxc]);
                count++;
            }maxc--;
            for(int j = maxc;j >=minc;j--){
                System.out.println(nums[minr][j]);
                count++;
            }minr++;

        }
    }
}



