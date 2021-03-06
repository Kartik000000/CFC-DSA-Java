package com.company.Assignment4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Target Value:");
        int target = s.nextInt();
        int[] arr = {3, 2, 1, 8, 2, 1, 6};
        int ind = arr.length-1;
        System.out.println(index(arr, target, ind));
    }

    private static int index(int[] arr, int target, int ind) {
        if (ind == 0) {
            return -1;
        }
        if(arr[ind] == target){
            return ind;
        }
        return index(arr,target,ind-1);
    }

}
