package com.company.Assignment4;

public class Q11 {
    public static void main(String[] args) {
        String str = "ab";
        String res = "";
        Subsequence(str,res,0);
    }

    private static void Subsequence(String str,String res, int i) {
        int count = 0;
        if(i == str.length()){
            if(res.length()>0){
                System.out.println(res + " ");
                count++;
            }
            return;
        }
        char ch = str.charAt(i);
        Subsequence(str,res,i+1);
        Subsequence(str,res+ch,i+1);
        Subsequence(str,res+(int)ch ,i+1);
    }
    //public static int count()
}
