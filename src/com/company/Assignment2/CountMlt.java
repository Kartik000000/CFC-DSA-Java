package com.company.Assignment2;

import java.util.Scanner;

public class CountMlt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = {5,45,23,63,27,80,15,2,65,30};
        int count = 0;
        for(int i=0;i<n.length;i++){
            if(n[i]%5==0){
                count++;
            }
        } System.out.println("multiples of 5 are: "+ count);
    }

}
