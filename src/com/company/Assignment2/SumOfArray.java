package com.company.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a target value:");
        int target = s.nextInt();
        int[] arr = {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
        System.out.println(Arrays.toString(arr));
        findtarget(arr, target);
    }

    public static void findtarget(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    System.out.println("The Pair is:");
                    System.out.println(" " + "{" + arr[i] + "," + arr[j] + "}");
                }

            }
        }
    }
}


