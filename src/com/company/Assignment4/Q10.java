package com.company.Assignment4;

public class Q10 {
    public static void main(String[] args) {
        String str = "AXAXA";
        int  i = 0;
        int count = 0;
        int n = str.length();
        System.out.println(CountTwins(str,i,n,count));
    }

    private static int CountTwins(String str, int i, int n,int count) {

        while(i < n){
            if(str.charAt(i) == str.charAt(i+2)){
                count++;
            }
            else{
                return count;
            }
            return CountTwins(str,i+1,n-1,count);
        }
        return count;
    }
}
