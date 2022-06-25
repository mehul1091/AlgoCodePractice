package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {

    public static void main(String[] args) {
        KSum kSum = new KSum();
        List<List<Integer>> result = kSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        kSum(arr, 3, 0, 0, new ArrayList<>(), result);
        return result;
    }

    public void kSum(int[] arr, int k, int start, int target,
                                    List<Integer> presult,
                                    List<List<Integer>> result){
        int n = arr.length;
        if(k == 2){
            twoSum(target, start, arr, presult, result);
            return ;
        }

        for(int i=start; i<n-k+1; i++){
            if(i>start && arr[i] == arr[i-1])
                continue;

            List<Integer> newresult = new ArrayList<>(presult);
            newresult.add(arr[i]);
            kSum(arr, k-1, i+1, target-arr[i], newresult, result);
            newresult.remove((Integer) arr[i]);
        }
        return ;
    }

    public void twoSum(int target, int low, int[] arr, List<Integer> presult, List<List<Integer>> result){
        int high = arr.length-1;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == target){
                List<Integer> newres = new ArrayList<>(presult);
                newres.add(arr[low]);
                newres.add(arr[high]);
                result.add(newres);

                do{low++;}while(low < high && arr[low] == arr[low-1]);

                do{high--;}while(low < high && arr[high] == arr[high+1]);
            }
            else if(sum < target){
                do{low++;}while(low < high && arr[low] == arr[low-1]);
            }
            else{
                do{high--;}while(low < high && arr[high] == arr[high+1]);
            }
        }
    }
}
