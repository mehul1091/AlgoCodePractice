package com.m.recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author magarwaal
 *
 *
Given an array of integers, print sums of all subsets in it. 
Output should be printed in increasing order of sums.

Input : arr[] = {2, 3}
Output: 0 2 3 5

Input : arr[] = {2, 4, 5}
Output : 0 2 4 5 6 7 9 11


Input:
2
2
1 2
3
5 2 1

Output:

0 1 2 3 
0 1 2 3 5 6 7 8 



Input:
5
2 5 8 11 13

Its Correct output is:
0 2 5 7 8 10 11 13 13 13 15 15 16 18 18 19 20 21 21 23 24 24 26 26 26 28 29 31 32 34 37 39
0 0 0 0 0  0  0 0  0  0  0  0  0  0  2  5  7  8  10 11 13 13 13 15 16 18 19 21 24 32 37 39 
0 0 0 0 0  0  0 0  0  0  0  2  5  7  8  10 11 13 13 13 15 16 18 19 21 24 26 28 31 34 37 39 
 *
 */
public class SubsetSums {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while (T --> 0) {
			int N = sc.nextInt();
			int []arr = new int[N];
			int []arrSum = new int[(int) Math.pow(2, N)];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			getSubsetSum(arr, 0, arrSum);
			
		}*/
		
		callRun();
		
	}

	private static void callRun() {
		int []arr = {2,5,8,11, 13};//
		int []arrSum = new int[(int) Math.pow(2, arr.length)];
		
//		for (int i = 0; i < arr.length; i++) {
//			arrSum[i]= arr[i];
//		}
		
//		getSubsetSum(arr, 0, arrSum, 0);
//		System.out.println("index is: "+index);
//		arrSum = getSumOfLeftElements(arr, 0, arrSum, index+1);
		
//		System.out.println("sum is\n");
		
		int index = calculateSubSum(arr, arrSum, 0);
		calculateSumofLessThanN(arr, arrSum, 0, index+1);
		Arrays.sort(arrSum);
		
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print(arrSum[i]+" ");
		}
		
	}

	
	
	
	private static void calculateSumofLessThanN(int[] arr, int[] arrSum, int index, int newIndex) {

		if (newIndex >= arrSum.length || index > arr.length) {
			return;
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				sum = sum + arr[i];
			}
		}
		
		arrSum[newIndex] = sum;
		index++;
		newIndex++;
		
		calculateSumofLessThanN(arr, arrSum, index, newIndex);
	}

	private static int calculateSubSum(int[] arr, int[] arrSum, int newIndex) {
		
		if (newIndex >= arrSum.length || arr.length == 1) {
			arrSum[newIndex] = arr[0];
			return newIndex;
		}
		
		arrSum[newIndex] = arr[0];
		newIndex++;
		int sum = 0;
//		int allSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			arrSum[newIndex] = arr[0] + arr[i];
//			allSum = allSum + arr[i];
			newIndex++;
		}
		/*if (arr.length > 2) {
			arrSum[newIndex] = allSum;
			newIndex++;
		}*/
		return calculateSubSum(Arrays.copyOfRange(arr, 1, arr.length), arrSum, newIndex);
	}

	private static int[] getSumOfLeftElements(int[] arr, int index, int[] arrSum, int newIndex) {
		
		int sum = 0;
		if(arr.length == 0 || index > arr.length-1 || newIndex >= arrSum.length) {
			return arrSum;
		}
		
		for (int j = index+1; j < arr.length; j++) {
			
			sum = sum + arr[j];
			arrSum[newIndex] = sum;
			
			System.out.println("sum is:"+sum);
			
			if (arrSum.length > newIndex) {
				newIndex++;
			}
		}
		
		getSumOfLeftElements(arr, index+1, arrSum, newIndex);
		return arrSum;
		
	}

	private static int[] getSubsetSum(int[] arr, int index, int[] arrSum, int newIndex) {
		
		if(arr.length == 0 || index > arr.length-1 || newIndex >= arrSum.length) {
			return arrSum;
		}
		
		int sum = 0;
		arrSum[newIndex] = arr[index];
		for (int i = index+1; i < arr.length; i++) {
			sum = arr[index] + arr[i];
			arrSum[newIndex] = sum;
			
			if (arrSum.length > newIndex) {
				newIndex++;
			}
			else
				return arrSum;
		}
		
		getSubsetSum(arr, index+1, arrSum, newIndex);
		
		return arrSum;
	}
}
