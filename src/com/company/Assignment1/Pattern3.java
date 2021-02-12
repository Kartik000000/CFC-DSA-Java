package com.company.Assignment1;

public class Pattern3 {
    public static void main(String[] args) {
        int Space=8;
        int odd =1;
        for (int j = 1; j <= 5; j++) {
            for(int i = 1; i<=Space;i++){
                System.out.print(" ");
            }
              int k=0;
              for (int i = 1; i <= odd; i++) {
                if (i <= j) {
                    k = k + 1;
                } else {
                    k = k - 1;
                }
                System.out.print(k+" ");
            }
            System.out.println();
            odd = odd + 2;
            Space = Space-1;
        }

        }
    }





