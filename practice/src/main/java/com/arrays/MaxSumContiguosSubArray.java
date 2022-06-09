package com.arrays;

public class MaxSumContiguosSubArray {
    public int solve(int[] nums){
        int max = Integer.MIN_VALUE;
        int sumTillNow = 0;
        for(int i=0; i<nums.length; i++){
            sumTillNow = sumTillNow + nums[i];
            max = Math.max(max, sumTillNow);
            sumTillNow = Math.max(0, sumTillNow);
        }
        return max;
    }
}
