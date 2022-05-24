package com.arrays.sort;

import java.util.Arrays;

public class BubbleSort {

    //make as a spring project

    // get input at runtime



    public static void main(String[] args) {

        //write bubble sort
        int[] arr = {5,4,3,2,1};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);

        //write junit test cases

    }


    //versions - for sorting - with optimizations
    public void sort(int[] arr){

        int n = arr.length;

        for (int k = 0; k < n; k++){
            boolean swap = false;
            for (int i = 0; i <= n - k - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }

            if(swap == false)   break;
        }

        //time complexity

        //space complexity

        //in-place sort or not

        //make note = in register for approach

        //REVISE
    }















    /*public void sort(int[] arr){

        boolean swap = false;

        for(int pass = 0; pass < arr.length; pass++){

            swap = false;

            for(int  i = 0; i < arr.length -1; i++){
                if(arr[i] > arr[i+1]){

                    swap = true;

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            if(swap == false)
                break;
        }



    }*/
}
