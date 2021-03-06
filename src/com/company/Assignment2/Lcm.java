package com.company.Assignment2;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int  b = s.nextInt();
        System.out.println("LCM of a and b is: " + lcm(a,b));
    }
    public static int lcm(int a,int b){
        int l = (a>b)? a:b;
        while(true){
            if(l%a==0 && l%b==0){
                break;
            }
            ++l;
        }
        return l;
    }
}
