package com.company.Assignment2;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        Count(a);
    }
    public static int Count(int[]a){
        int count=0;
        for(int i=0;i<a.length;i++) {
            int j=2;
                if (a[i] % j == 0){
                    return 0;
                }
                j++;
            }
            count++;
        return count;
        }
    }


