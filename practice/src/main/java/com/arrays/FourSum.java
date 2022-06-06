package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-3; i++) {
            if(i>0 && arr[i] == arr[i-1])
                continue;

            int newTarget = target - arr[i];
            for (int j = i+1; j < n-2; j++) {
                if(j>i+1 && arr[j] == arr[j-1])
                    continue;

                int find = newTarget - arr[j];
                twoSum(arr, j+1, find, result, arr[i], arr[j]);
            }
        }
        return result;
    }

    private void twoSum(int[] arr, int low, int target, List<List<Integer>> result, int first, int second) {
        int high = arr.length - 1;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == target){
                List<Integer> partialResult = new ArrayList<>();
                partialResult.add(first);
                partialResult.add(second);
                partialResult.add(arr[low]);
                partialResult.add(arr[high]);
                result.add(partialResult);
                low = incLow(low, arr, high);
                high = incHigh(low, arr, high);
            }
            else if(sum < target){
                low = incLow(low, arr, high);
            }
            else{
                high = incHigh(low, arr, high);
            }
        }
    }

    public int incLow(int low, int[] arr, int high){
        do{
            low++;
        }while(arr[low-1] == arr[low] && low < high);
        return low;
    }

    public int incHigh(int low, int[] arr, int high){
        do{
            high--;
        }while (arr[high+1] == arr[high] && low < high);
        return high;
    }
}
