package com.arrays.sort;

import java.util.Arrays;

public class MergeSortStrings {

    public static void main(String[] args) {
        MergeSortStrings obj = new MergeSortStrings();

        String input = "Hello zzz, Welcome to Greytip, ME";
        String[] splits = input.split(" ");
        splits = obj.sort(splits, 0, splits.length-1);

        Arrays.stream(splits).forEach(System.out::println);
    }

    public String[] sort(String[] input, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            String[] left = sort(input, low, mid);
            String[] right = sort(input, mid + 1, high);
            return merge(left, right);
        }
        return new String[]{input[low]};
    }

    private String[] merge(String[] left, String[] right) {
        String[] newarr = new String[left.length + right.length];
        int i = 0, l = 0, r = 0;
        while(l < left.length && r < right.length){
            if(left[l].compareTo(right[r]) < 0){
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
