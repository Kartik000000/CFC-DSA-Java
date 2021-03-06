package com.company.Assignment2;

import java.util.Arrays;

public class Sortevenodd{
    public static void main(String[] args) {
        int[] nums = {8, 6, 3, 17, 20, 19, 27};
        nums = sortedarray(nums);
            System.out.println(Arrays.toString(nums));

}
      public static int[] sortedarray(int[]nums){
        int left =0,right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            while(nums[left]%2==0){
                left++;
            }
            while(nums[right]%2==1){
                right--;
            }
            if(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        return nums;
    }

}
