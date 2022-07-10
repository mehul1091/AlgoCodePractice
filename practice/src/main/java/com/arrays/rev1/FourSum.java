package com.arrays.rev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int k=4;
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        kSum(k, arr, target, result, new ArrayList<>(), 0);
        return result;
    }

    public void kSum(int k, int[] arr, long target, List<List<Integer>> result, List<Integer> pres, int low){
        int n=arr.length;
        if(k==2){
            twoSum(result, pres, low, arr, target);
            return;
        }

        for(int i=low;i<n-k+1;i++){
            if(i>low && arr[i]==arr[i-1])
                continue;
            long find=target-arr[i];
            List<Integer> newres=new ArrayList<>(pres);
            newres.add(arr[i]);
            kSum(k-1, arr, find, result, newres, i+1);
        }
    }

    public void twoSum(List<List<Integer>> result, List<Integer> pres, int low, int[] arr, long target){
        int high=arr.length-1;
        while(low<high){
            long sum=arr[low]+arr[high];
            if(sum==target){
                List<Integer> newres=new ArrayList<>(pres);
                newres.add(arr[low]);
                newres.add(arr[high]);
                result.add(newres);

                do{low++;}while(low<high && arr[low]==arr[low-1]);

                do{high--;}while(low<high && arr[high]==arr[high+1]);
            }
            else if(sum<target){
                do{low++;}while(low<high && arr[low]==arr[low-1]);
            }
            else{
                do{high--;}while(low<high && arr[high]==arr[high+1]);
            }
        }
    }

}
