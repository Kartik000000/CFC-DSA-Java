package com.company.Assignment3;

public class Columnwise {
    public static void main(String[] args) {
        int[][] nums = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };
        Waveprint(nums);
    }

    public static void Waveprint(int[][] nums) {
        System.out.println("Matrix is:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");

            }

            System.out.println();

        }
        System.out.println("Column-Wise Output is:");
        for (int i = 0; i < nums.length; i ++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j][i] + " ");
                }
            } else {
                for (int j = nums.length - 1; j >= 0; j--) {
                    System.out.print(nums[j][i] + " ");
                }
            }

        }
    }
}



