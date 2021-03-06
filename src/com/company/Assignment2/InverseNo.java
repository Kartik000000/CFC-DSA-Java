package com.company.Assignment2;

public class InverseNo {
    public static void main(String[] args) {
        int  n = 25413;
        System.out.println(inverse(n));

    }
    public static int inverse(int n){
        int res = 0;
        int pos = 1;
        while(n>0){
            int r = n % 10;
            res = res + pos * (int)Math.pow(10,r-1);
            n /= 10;
            pos++;
        }
        return res;
    }
}
