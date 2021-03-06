package com.company.Assignment2;

import java.util.Scanner;

public class Upandlow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        isCharacterUpperCase(c);

    }
    public static void isCharacterUpperCase(char c){
        if(Character.isUpperCase(c)){
            System.out.println("UPPERCASE");
        }
        else{
            System.out.println("LOWERCASE");
        }
    }
}
