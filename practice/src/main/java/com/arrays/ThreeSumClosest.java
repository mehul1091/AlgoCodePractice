package com.arrays;

import java.util.Arrays;

public class ThreeSumClosest {

    class Pair{
        int minDiff;
        int bestTotalSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
//        int[] input = new int[]{1, 1, 1, 0};
//        int target = -100;
//        System.out.println(obj.threeSumClosest(input, target));//output : 2

        int[] input = new int[]{-3,-2,-5,3,-4};
        int target = -1;
        System.out.println(obj.threeSumClosest(input, target));//output : 2

    }

    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length, bestSum= Integer.MAX_VALUE;
        for (int i = 0; i < n-2; i++) {
            if(i>0 && arr[i] == arr[i-1])
                continue;

            int low = i+1, high = n-1;
            while(low < high){
                int sum = arr[i] + arr[low] + arr[high];
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    do{low++;}while(low < high && arr[low] == arr[low-1]);
                }
                else{
                    do{high--;}while(low < high && arr[high] == arr[high+1]);
                }

                if(Math.abs(target - sum) < Math.abs(target - bestSum)){
                    bestSum = sum;
                }
            }
        }
        return bestSum;
    }

    public int threeSumClosestTry1(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        Pair pair = new Pair();
        pair.bestTotalSum = 0;
        pair.minDiff = Integer.MAX_VALUE;

        for(int i=0; i<n-2; i++){
            if(i>0 && arr[i] == arr[i-1])
                continue;

            int find = target - arr[i];
            pair = searchPair(arr, i+1, find, target, pair);
        }

        return pair.bestTotalSum;
    }

    public Pair searchPair(int[] arr, int low, int find, int target, Pair pair){

        int high = arr.length-1;

        while(low < high)
        {
            int sum = arr[low] + arr[high];
            int totalSum = target - find + sum;

            if(sum == find){
                pair.bestTotalSum = totalSum;
                // return bestTotalSum;
                do{low++;}while(low < high && arr[low] == arr[low-1]);
                do{high--;}while(low < high && arr[high] == arr[high+1]);
            }
            else if(sum < find){

                do{low++;}while(low < high && arr[low] == arr[low-1]);
            }
            else{
                do{high--;}while(low < high && arr[high] == arr[high+1]);
            }

            int val = Math.abs(totalSum - target);
            if(val < pair.minDiff){
                pair.minDiff = val;
                pair.bestTotalSum = totalSum;
            }

        }

        return pair;

    }




}
