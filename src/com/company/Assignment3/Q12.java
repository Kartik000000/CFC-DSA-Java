package com.company.Assignment3;

public class Q12 {
    public static void main(String[] args) {
        String s = "acb";
        System.out.println(Asciidiff(s));
    }
    private static String Asciidiff(String s) {
        StringBuilder sb = new StringBuilder(s);
         s = "" + sb.charAt(0);
        for(int i = 1; i<sb.length();i++){
            int val1 = sb.charAt(i);
            int val2 = sb.charAt(i-1);
            int c = val1 - val2;
            s = s + c +sb.charAt(i);
        }
        return s;
    }
}
