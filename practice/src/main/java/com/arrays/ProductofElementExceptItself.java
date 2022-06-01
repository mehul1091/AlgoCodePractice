package com.arrays;

public class ProductofElementExceptItself {

    public int[] solve(int[] arr){
        int n=arr.length;
        int[] left = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * arr[i-1];
        }
        int tillNow = 1;
        for (int i = n-2; i >=0 ; i--) {
            tillNow = tillNow * arr[i+1];
            left[i] = left[i] * tillNow;
        }
        return left;
    }
}
