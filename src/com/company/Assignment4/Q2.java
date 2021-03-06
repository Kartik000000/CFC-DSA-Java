package com.company.Assignment4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n = s.nextInt();
        int sum = 0;
        System.out.println(Addrecursion(n,sum));
    }

    public static int Addrecursion(int n,int sum){
        if(n <= 0) {
            return n;
        }
            sum = sum + n;
        return  Addrecursion(n-1,sum);
    }
}

