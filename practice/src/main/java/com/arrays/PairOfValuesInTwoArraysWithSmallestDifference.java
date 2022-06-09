package com.arrays;

import java.util.Arrays;

public class PairOfValuesInTwoArraysWithSmallestDifference {
    public int solve(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int a = 0, b = 0, min = Integer.MAX_VALUE;
        while(a < A.length && b < B.length){
            int diff = Math.abs(A[a] - B[b]);
            min = Math.min(diff, min);
            if(A[a] > B[b]){
                b++;
            }
            else a++;
        }
        return min;
    }
}
