package com.arrays.sort;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {

        Sort012 sort012 = new Sort012();
        int[] arr = {2,1,0,1,0,0,2,1,2};
        sort012.solveMethod2(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    public void solveMethod1(int[] arr){

        int count0=0, count1=0, count2=0, n=arr.length;
        for (int i = 0; i < n; i++) {
            switch (arr[i]){
                case 0: count0++; break;
                case 1: count1++; break;
                default: count2++;
            }
        }

        //repopulate the array
        int index=0;
        index = repopulateArray(index, count0, 0, arr);
        index = repopulateArray(index, count1, 1, arr);
        index = repopulateArray(index, count2, 2, arr);

    }

    private int repopulateArray(int index, int countLimit, int value, int[] arr) {
        for (int j = 0; j < countLimit && j < arr.length; j++) {
            arr[index++] = value;
        }
        return index;
    }

    public void solveMethod2(int[] arr){
        int low=0, mid=0, high=arr.length-1;
        while(mid <= high){
            switch (arr[mid]){
                case 0: swap(arr, low, mid);
                        low++; break;
                case 1: mid++; break;
                default: swap(arr, mid, high);
                        high--;
            }
        }
    }

    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
