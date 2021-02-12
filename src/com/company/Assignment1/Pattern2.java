package com.company.Assignment1;

public class Pattern2 {
    public static void Printnums(int n) {
        int i ,j;
        for(i=0;i<n;i++) {
            int num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Printnums(5);

    }
}

