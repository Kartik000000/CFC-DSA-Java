package com.company.Assignment2;

import java.util.Scanner;

public class RevNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;
        int rem;
        while(n!=0){
            rem = n % 10;
            res =  res * 10 + rem;
            n = n/10;
        }
        System.out.println("Reverse of this no. is: "+ res);
    }
}
