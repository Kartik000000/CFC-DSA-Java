package com.company.Assignment3;

import java.util.Scanner;

public class Q9 {
    public static int Sum(int[] arr,int n){
        int sum = 0;
        for(int i = 0;i <= arr.length-n; i++){
            int max = arr[i];
            int min = arr[i];
            for(int j = i+1;j<n+1;j++){
                if(arr[i]>max){
                    max = arr[j];
                }
                if(arr[i]<min){
                    min = arr[j];
                }
            }
            sum = sum + min + max;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int[] arr = new int[k];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Sum(arr,n));
    }
}
