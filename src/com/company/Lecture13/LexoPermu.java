package com.company.Lecture13;

public class LexoPermu {
    public static void main(String[] args) {
        //String str = "aaceeeeeeeeeebbcccaa";
        //int[] freq = freqMatrix(str);
       // System.out.println(Arrays.toString(freq));
        String s = "aab";
        lexopermute("",freqMatrix(s),s.length());
    }
    public static void lexopermute(String proc,int[] freqMatrix,int length){
        if(length==0){
            System.out.println(proc);
            return;
        }
        for (int i = 0;i<freqMatrix.length;i++) {
            if (freqMatrix[i] > 0) {
                freqMatrix[i]--;
                lexopermute(proc + (char) (i + 'a'), freqMatrix, length - 1);
                freqMatrix[i]++;
            }
        }

    }
    public static int[] freqMatrix(String str){
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            int ind = str.charAt(i)-'a';
            freq[ind]++;

        }
        return freq;
    }
}
