package com.company.Assignment1;

import java.util.Scanner;

public class RevNo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        int n = s.nextInt();
        int revno = 0;
        int digit;
        while(n>0){
            digit = n % 10;
            revno = revno * 10 +digit;
            n = n/10;
        }
        System.out.println("Required Rev No. is :" + revno);
    }
}
