package com.company.Assignment4;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {2,9,7,6,8,3};
        int n = arr.length-1;
        SelectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectionSort(int[] arr, int n) {
        if(n < 0){
            return;
        }
        pass(arr,n,0,0);
        SelectionSort(arr,n-1);
        return;
    }

    private static void pass(int[] arr, int end, int start, int maxIndex) {
        if(start > end){
            int t = arr[maxIndex];
            arr[maxIndex] = arr[end];
            arr[end] = t;
            return;
        }
        if(arr[maxIndex]<arr[start]){
            maxIndex = start;
        }
        pass(arr,end,start+1,maxIndex);
    }

}
