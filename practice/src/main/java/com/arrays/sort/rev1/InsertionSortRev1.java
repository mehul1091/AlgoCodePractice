package com.arrays.sort.rev1;

import java.util.Arrays;

public class InsertionSortRev1 {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int[] res=sort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }
    public static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;

            while(j>-1 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
