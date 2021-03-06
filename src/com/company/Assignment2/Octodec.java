package com.company.Assignment2;

public class Octodec {
    public static void octaltodec(int n){
        int rem =0;
        int res=0;
        int place=1;
        while(n!=0){
            rem = n%8;
            res +=place*rem;
            place=place*10;
            n/=8;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int n = 453;
        octaltodec(n);
    }
}
