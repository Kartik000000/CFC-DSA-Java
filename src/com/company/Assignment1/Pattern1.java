package com.company.Assignment1;

public class Pattern1 {
    public static void Rtriangle(int n){
        int i ,j;
        for( i = 1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Rtriangle(5);
    }
}
