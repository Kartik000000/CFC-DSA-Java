package com.company.Assignment4;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ind = 0;
        int i = arr.length-1;
        Reverse(arr,ind,i);
        System.out.println(Arrays.toString(arr));
}

    private static void Reverse(int[] arr, int ind, int i) {
        if(ind>=i){
            return;
        }
        int t;
        t = arr[ind];
        arr[ind]=arr[i];
        arr[i] = t;
        Reverse(arr,ind+1,i-1);
    }
    }
