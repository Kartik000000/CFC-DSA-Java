package com.company.Lecture12;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={2,7,1,0,8,4,9};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int[]nums,int start,int end){
        if(start >= end){
            return ;
        }
        int pos = pivot (nums,start,end);
        quicksort(nums,start,pos-1);
        quicksort(nums,pos+1,end);
    }
    public static int pivot(int[]nums,int start,int end){
        int ind=start;
        for(int i=start; i<end ;i++){
            if(nums[i]<nums[end]){
                swap(nums,ind,i);
                ind++;
            }
        }
        swap(nums,ind,end);
        return ind;
    }
    public static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;

    }
}
