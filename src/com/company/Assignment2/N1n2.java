package com.company.Assignment2;

import java.util.Scanner;

public class N1n2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        char ch = s.next().charAt(0);
        switch (ch) {
            case '*':
                System.out.println("Multiplication " + (n1 * n2));
                break;
            case '/':
                System.out.println("Division " + (n1 / n2));
                break;
            case '+':
                System.out.println("Addition " + (n1 + n2));
                break;
            case '-':
                System.out.println("Subtraction " + (n1 - n2));
                break;
        }

    }
}

