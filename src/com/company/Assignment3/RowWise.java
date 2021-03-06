package com.company.Assignment3;

import java.util.Scanner;

public class RowWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] nums =  {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
    };
        Waveprint2(nums);
    }

    public static void Waveprint2(int[][] nums) {
        System.out.println("Matrix is:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Required Output is:");
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {
                for (int j = 0; j < nums.length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
            }
               else{
                    for(int j=nums.length-1;j>=0;j--){
                        System.out.print(nums[i][j]+" ");
                    }
               }
        }
    }
}





