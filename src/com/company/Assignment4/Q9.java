package com.company.Assignment4;

public class Q9 {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(RecurCheck(str));
    }
    private static boolean RecurCheck(String str) {
        if (str.length() == 0){ return true;}
            if(str.charAt(0) != 'a'){
                return false;
            }
            if(str.length()>=3 && "abb".equals(str.substring(0,3))){
                 return RecurCheck(str.substring(3));
            }else{
                 return RecurCheck(str.substring(1));
            }
        }
}




