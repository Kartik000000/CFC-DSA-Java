package com.company.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayrev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
            System.out.println(Arrays.toString(arr));
        arr = reversearray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reversearray(int []arr){
        int start =0,end=arr.length-1;
        while(start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

        }
        return arr;
    }
}
