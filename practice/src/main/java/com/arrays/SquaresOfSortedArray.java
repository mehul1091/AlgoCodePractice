package com.arrays;

public class SquaresOfSortedArray {

    public int[] solve(int[] arr){
        int n = arr.length, low = 0, high = n - 1, i = n - 1;
        int[] result = new int[n];
        while(low <= high){
            int left = arr[low] * arr[low];
            int right = arr[high] * arr[high];
            if(left > right){
                result[i] = left;
                i--;
                low++;
            }
            else {
                result[i] = right;
                i--;
                high--;
            }
        }
        return result;
    }
}
