package com.m.recursion;

import java.util.Scanner;

public class GS {

	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();

			for (int i = 1; i <= N; i++) {
				
				System.out.print(gfSeries(i)+" ");
			}
			System.out.println();
		}
	}

	public static long gfSeries(int N){
		if(N == 1){
			return 0;
		}

		if(N == 2){
			gfSeries(1);
			return 1;
		}
		long result = 0;
		if(N > 2){
			long term1 = gfSeries(N-2 )*gfSeries(N-2);
			long term2 = gfSeries(N-1);
			//System.out.print(term1 +" "+term2);
			result = term1 - term2;
		}
		return result;
	}
}
