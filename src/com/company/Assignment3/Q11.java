package com.company.Assignment3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(Toggle(str));
    }

    private static String Toggle(String str) {
        StringBuilder sb = new StringBuilder(str);
        str = "";
        for(int i = 0; i < sb.length();i++) {
            char c = sb.charAt(i);
            int n = c ;
            if(n > 96){
                n = n-32;
                c = (char)n;
                str = str + c;
            }
            else{
                n = n+32;
                c = (char)n;
                str = str + c;
            }
        }
        return str;
    }

}
