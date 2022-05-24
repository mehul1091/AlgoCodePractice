package com.arrays.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {12, 45, 23, 51, 19, 8};

        sort(arr);

        Arrays.stream(arr).forEach(System.out::println);

    }

    public static void sort(int arr[]){

        int n = arr.length;

        for(int i = 1; i < n; i++){

            int pos = i;

            for(int j = i -1; j >= 0; j--){

                if(arr[j] > arr[pos]){

                    int temp = arr[j];
                    arr[j] = arr[pos];
                    arr[pos] = temp;

                    pos = j;
                }

            }

        }

    }


    /*public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int pos = i;

            for (int j = i - 1; j >= 0 ; j--) {

                if(arr[j] > arr[pos]){
                    int temp = arr[j];
                    arr[j] = arr[pos];
                    arr[pos] = temp;

                    pos = j;
                }
            }
        }

    }*/


}
