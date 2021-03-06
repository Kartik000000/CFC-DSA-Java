package com.company.Lecture3;


public class Swap {
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
         int x = 10;
         int y = 20;
         swap(10,20);

        System.out.println(x + y);

    }
}
