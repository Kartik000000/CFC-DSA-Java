package com.company.Assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float p,r,t,sintrest;
        System.out.println("Enter Principal Amount");
         p = s.nextFloat();
        System.out.println("Enter Time");
         t = s.nextFloat();
        System.out.println("Enter Rate");
         r = s.nextFloat();
        sintrest = (p*r*t)/100;
        System.out.println("Simple Interest is: " + sintrest);
    }
}
