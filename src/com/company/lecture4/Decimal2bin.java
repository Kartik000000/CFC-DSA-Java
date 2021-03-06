package com.company.lecture4;

import java.util.Scanner;

public class Decimal2bin {

    public static void main(String[] args) {
        System.out.println("Enter the Deimal Number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int res = 0;
        int place = 1;
        while(num>0 ){
        int rem = num % 2;
        num = num/2;
        res = res+ place *rem;
        place = place * 10;

    }
        System.out.print(res);


    }
}
