package com.m.recursion;

import java.util.Arrays;
import java.util.Scanner;



/**
 * @author magarwaal
 *
 *Given an array of n elements in the following format 
 *{ a1, a2, a3, a4, ….., an/2, b1, b2, b3, b4, …., bn/2 }. 
 *The task is shuffle the array to {a1, b1, a2, b2, a3, b3, ……, an/2, bn/2 } 
 *without using extra space.
 *
Input:
2
4
1 2 9 15
6
1 2 3 4 5 6

Output:
1 9 2 15 
1 4 2 5 3 6
 *
85
4,52,55,100,33,61,77,69,40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25
 *
 */
public class ShuffleIntegers {

	public static void main(String[] args) {
		/*		int []a = {1,2,3,4,5,6,7};
		int []a = {4,52,55,100,33,61,77,69,40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};

		int size = 85;

		if (size % 2 == 0) {
			int[] arr1 = Arrays.copyOfRange(a, 0, size/2);
			int[] arr2 = Arrays.copyOfRange(a, size/2, size);
			shuffle(arr1, arr2);
		}
		else {
			int[] arr1 = Arrays.copyOfRange(a, 0, size/2);
			int[] arr2 = Arrays.copyOfRange(a, size/2, size-1);
			shuffle(arr1, arr2);
			System.out.print(a[size-1]+" ");
		}*/

		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();
			int[] array = new int[N];
			for (int i = 0; i < N; i++) {

				array[i] = sc.nextInt();
			}

			if (N % 2 == 0) {
				int[] arr1 = Arrays.copyOfRange(array, 0, N/2);
				int[] arr2 = Arrays.copyOfRange(array, N/2, N);
				shuffle(arr1, arr2);
			}
			else {
				int[] arr1 = Arrays.copyOfRange(array, 0, N/2);
				int[] arr2 = Arrays.copyOfRange(array, N/2, N-1);
				shuffle(arr1, arr2);
				System.out.print(array[N-1]+" ");
			}
		}

	}

	public static int shuffle(int[] a, int[] b) {
		
		if (a.length == 0 || b.length == 0) {
			return 0;
		}
		/*if (a.length != b.length) {
			return 0;
		}*/

		System.out.print(a[0] + " " + b[0]+" ");
		if (a.length == 1 && b.length == 1) {
			return 0;
		}

		shuffle(Arrays.copyOfRange(a, 1, a.length), Arrays.copyOfRange(b, 1, b.length));

		return 0;

	}

}
