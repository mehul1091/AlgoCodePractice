package com.arrays.sort;

import java.util.Arrays;

public class MergeSortArrays {

    public static void main(String[] args) {
        MergeSortArrays obj = new MergeSortArrays();
//        int[] input = {15,5,7,10,8,9,2};

        int[] input = {15, 5};

        int[] result = obj.sort(input, 0, input.length - 1);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] sort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            int[] left = sort(arr, low, mid);
            int[] right = sort(arr, mid + 1, high);
            return merge(left, right);
        }
        return new int[]{arr[low]};
    }

    private int[] merge(int[] left, int[] right) {
        int[] newarr = new int[left.length + right.length];
        int i = 0, l = 0, r = 0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                newarr[i++] = left[l++];
            }
            else{
                newarr[i++] = right[r++];
            }
        }
        while(l < left.length){
            newarr[i++] = left[l++];
        }
        while(r < right.length){
            newarr[i++] = right[r++];
        }
        return newarr;
    }

}
