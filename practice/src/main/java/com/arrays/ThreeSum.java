package com.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSumTry1(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            while(i>0 && i<n-2 && arr[i-1] == arr[i])
                i++;

            int target = - arr[i];
            int low = i+1, high = arr.length - 1;
            while(low < high){
                int find = arr[low] + arr[high];
                if(find == target){
                    List<Integer> partialResult = new ArrayList<>();
                    partialResult.add(arr[i]);
                    partialResult.add(arr[low]);
                    partialResult.add(arr[high]);
                    result.add(partialResult);

                    low++;
                    while(low>0 && low < n-1 && arr[low] == arr[low-1])
                        low++;
                    high--;
                    while (high > 1 && high < n-1 && arr[high] == arr[high+1])
                        high--;
                }
                else if(find > target) high--;
                else low++;
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum1(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            if(i>0 && arr[i] == arr[i-1])
                continue;
            int target = 0 - arr[i];
            twoSum(arr, i+1, target, result);
        }
        return result;
    }

    private void twoSum(int[] arr, int low, int target, List<List<Integer>> result) {
        int high = arr.length - 1;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == target){
                List<Integer> partialResult = new ArrayList<>();
                partialResult.add(0 - target);
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

    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            if(i>0 && arr[i] == arr[i-1])
                continue;
            List<Integer> pres = new ArrayList<>();
            pres.add(arr[i]);
            result.add(pres);
            twoSum(arr, i+1, 0 - arr[i], result, pres);
            result.remove(pres);
        }
        return result;
    }

    private void twoSum(int[] arr, int low, int target, List<List<Integer>> result, List<Integer> pres) {
        int high = arr.length - 1;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == target){
                List<Integer> partialResult = new ArrayList<>(pres);
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



}
