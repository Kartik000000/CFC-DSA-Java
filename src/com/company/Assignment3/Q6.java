package com.company.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = s.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i < n;i++){
            arr1[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter Size of Array:");
        int m = s.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements:");
        for(int i=0;i<m;i++){
            arr2[i] = s.nextInt();
        }
          int[] arr = sumofarray(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumofarray(int[] arr1,int[] arr2){
        int l = Math.min(arr1.length,arr2.length);
        int[] arr = new int[l+1];
        int sum = 0;
        for (int i = l-1; i >= 0 ; i--) {
            sum = arr1[i] + arr2[i] + sum;
            if(sum > 9){
                sum= sum%10;
                arr[i+1] = sum ;
                sum = 1;
            }else {
                arr[i +1] = sum ;
                sum = 0;

            }
        }
        arr[0] = sum ;
        return arr ;

    }
}

