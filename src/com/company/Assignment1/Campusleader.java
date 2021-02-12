package com.company.Assignment1;

import java.util.Scanner;

public class Campusleader {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Credit");
        int credits = s.nextInt();
        if(credits >=7500){
            System.out.println("Tera Leader");
        }
        else if(credits >=6000 && credits < 7500){
            System.out.println("Gega Leader");
        }
        else if(credits >=4500 && credits < 6000){
            System.out.println("Mega Leader");
        }
        else {
            System.out.println("Rising Star");
        }

    }
}
