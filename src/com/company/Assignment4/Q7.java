package com.company.Assignment4;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {3,4,9,7,5,8};
        int n = arr.length-1;
        int i = 0;
        bubblesort(arr,i,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr,int i,int n) {
        if(n == 1 || i == n){
            return;
        }
        else if(arr[i]>arr[i+1]){
            swap(arr,i,i+1);
        }
        bubblesort(arr, i+1, n);
        bubblesort(arr,i+1,n);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr [j];
        arr[j] = temp;
    }
}
