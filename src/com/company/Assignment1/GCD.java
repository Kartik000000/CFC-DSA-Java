package com.company.Assignment1;

import java.util.Scanner;

public class GCD {
    private static int gcd(int n1,int n2){
        if (n2==0) {
            return n1;
        }
            else{
                return gcd(n2,n1 % n2);
            }
        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1 = s.nextInt();
        System.out.println("Enter Second Number:");
        int n2 = s.nextInt();
        System.out.println("GCD of  " +n1+ " and " +n2+ " is "+ gcd(n1,n2) );
        }
    }


