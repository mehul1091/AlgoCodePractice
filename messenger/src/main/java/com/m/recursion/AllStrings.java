package com.m.recursion;

public class AllStrings {

	public static void main(String[] args) {
		printSpaceString("abcde");
	}
	
	public static void printSpaceString(String str) {
		getString(str, 0);
		
	}
	
	public static void getString(String str, int p) {
		if(str.length() == 0)
			return;
		
		if(str.length()-1 <= p) {
			System.out.print(str+"$");
			return;
		}
		
		else {
			String strNew =str.substring(0, p)+ str.charAt(p)+" "+ str.substring(p+1, str.length());

			getString(str, p+1);
			getString(strNew, p+2);
		}
	}

}
