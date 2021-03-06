package com.company.Assignment3;

public class Q10 {
    public static void main(String[] args) {
        String str = "abcg";
        Asciioddeven(str);

    }
    public static void Asciioddeven(String str){
        String str1 = "";
        int val = 0;
        for(int i =0;i<str.length();i++){
            val = str.charAt(i);
            if(i%2==0){
                 str1 += ((char)(val+1));
            }
            else{
                str1 += ((char)(val-1));
            }
        }
        System.out.println("Required String:"+ str1);
    }
}
