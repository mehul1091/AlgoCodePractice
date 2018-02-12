package com.m.recursion;

import java.util.Scanner;

public class ReverseDigits {

	public static void main (String[] args)
	{
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();
			getDigit(N, 0);
			//           System.out.println(reverse);
		}
	}

	public static void getDigit(int N, int reverseNum){

		if(N == 0) {
			System.out.println(reverseNum);
			return;
		}

		int digit = N % 10;
		reverseNum = reverseNum*10+digit;
		getDigit(N/10, reverseNum);
	}

}
