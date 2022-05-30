package com.arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

//        int[] result = obj.twoSum(new int[]{2, 7, 11, 15}, 9);
//        Arrays.stream(result).forEach(System.out::println);
//
//        System.out.println();
//        result = obj.twoSum(new int[]{3,2,4}, 6);
//        Arrays.stream(result).forEach(System.out::println);
//
//        System.out.println();
//        result = obj.twoSum(new int[]{3,3}, 6);
//        Arrays.stream(result).forEach(System.out::println);

    }

    public int[] solveMethod1(int[] nums, int target){

        int n = nums.length;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                Set<Integer> indexes = map.get(nums[i]);
                indexes.add(i);
            }
            else{
                Set<Integer> set = new HashSet<>();
                set.add(i);
                map.put(nums[i], set);
            }
        }

        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int find = target - current;
            if(find != current){
                if(map.containsKey(find)){
                    return new int[]{i, map.get(find).stream().findFirst().get()};
                }
            }
            else{
                if(map.containsKey(find)){
                    int finalI = i;

                    Optional<Integer> integer1 = Optional.ofNullable(map.get(find).stream()
                            .filter(integer -> integer != finalI).findFirst()).get();

                    if (integer1.isEmpty())
                        continue;
                    return new int[]{i, integer1.get()};
                }
            }
        }

        return new int[]{0,0};
    }

    public int[] solveBestMethod(int[] arr, int target){
        Map<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
            if(map.containsKey(find)){
                return new int[]{map.get(find), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{0};
    }
}
