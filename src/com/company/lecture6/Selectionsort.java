package com.company.lecture6;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] nums = {10, 7, 5, 9, 8, 6, 3};
        SelecSort(nums);
        System.out.println(Arrays.toString(nums));
    }
        public static void SelecSort (int [] nums){
            for(int i=0;i<nums.length;i++){
                int max = maxIndex(nums,0,nums.length-i);
                swap(nums,max,nums.length-1-i);
            }
        }

    public static void swap (int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;

    }

        public static int maxIndex(int[] nums,int ind1,int ind2){
            int max = ind1;
        for(int i = ind1;i<ind2;i++){
            if(nums[i]>nums[max]){
                max = ind1;
            }
        }
        return max;
    }
}
