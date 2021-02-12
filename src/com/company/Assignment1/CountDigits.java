package com.company.Assignment1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. to count the digits:");
        int i = s.nextInt();
        while(i>0){
            i /=10;
            count ++;
        }
        System.out.println("No. of digits are:"+ count);

    }
}
