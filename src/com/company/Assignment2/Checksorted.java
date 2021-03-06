package com.company.Assignment2;

public class Checksorted {
    public static  int sortedornot(int[] a,int n){
        if(n==1 || n==0)
            return 1;

        if(a[n-1]<a[n-2])
            return 0;
        return sortedornot(a,n-1);
    }

    public static void main(String[] args) {
       int[]a = {23,40,87,88,90};
       int n  = a.length;
       if(sortedornot(a,n) != 0)
            System.out.println("Sorted");
        else
        System.out.println("Not Sorted");
    }
}
