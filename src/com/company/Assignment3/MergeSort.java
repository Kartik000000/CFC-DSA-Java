package com.company.Assignment3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] first = {0,7,8,10,12};
        int[] second = {9,13,15,20,6};
        int[] third = merge(first,second);
        System.out.println(Arrays.toString(third));
    }
    public static int[] merge(int[] first,int[] second){
        int i=0,j=0,k=0;
        int[] third = new int[first.length+second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                third[k++]=first[i++];
            }
            else{
                third[k++]=second[j++];
            }
            while(i<first.length){
                third[k++]=first[i++];
            }
            while(j<second.length){
                third[k++]=second[j++];
            }
        }
        return third;
    }
}
