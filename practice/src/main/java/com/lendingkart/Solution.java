package com.lendingkart;/*

Consider an array arr of distinct numbers sorted in increasing order. 

Given that this array has been rotated (clockwise) k number of times. Given such an array, find the value of k.

Examples:  

Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0

*/


import java.util.*;

class Solution {
    
    public int solve(int[] arr) {
        int low=0, high=arr.length-1, count=0;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[low] > arr[high]){
                low=mid+1;
                count=low;
            }
            else{
                high=mid-1;
            }
        }
        return count;
    }


    public int solution(int[] arr) {
        int low=0, high=arr.length-1, count=0;
        while(low<high){
            if(arr[low] > arr[high]){
                low=low+1;
                count++;
            }
            else{
                high--;
            }
        }
        return count;
    }
    
}

class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String line = myObj.nextLine();

        int ans = new Solution().solve(new int[]{15, 18, 2, 3, 6, 12});
        System.out.println(ans);

        int ans2 = new Solution().solve(new int[]{7, 9, 11, 12, 5});
        System.out.println(ans2);

        int ans3 = new Solution().solve(new int[]{7, 9, 11, 12, 15});
        System.out.println(ans3);
    }
}