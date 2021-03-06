package com.company.Assignment4;

public class Q12 {
    public static void main(String[] args) {
        String s = "hello";
        String str = "";
        sep(s,0,str);
        System.out.println(str);
    }

    private static String sep(String s, int start, String str){
        if(start == s.length()-1){
            return s;
        }
        if(s.charAt(start)== s.charAt(start+1)){
            str = s.substring(0,start+1) + "-" + s.substring(start+1);
        }
         return sep(s,start+1,str);

    }
}
