package com.company.Assignment4;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int n = arr.length-1;
        arr = InverseArray(arr,n,0);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] InverseArray(int[] arr, int n, int pos) {
        while(n>0) {
            int res = 0;
            int r = arr[n];
            res = res + pos * (int) Math.pow(10, r - 1);
             InverseArray(arr,n-1,pos+1);
        }
        return arr ;

    }

}
