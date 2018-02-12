package com.m.go;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int maxHeight = 0, count = 0;
        
        for(int i = 0; i < n; i++){
        	
            if(ar[i] > maxHeight){
                maxHeight = ar[i];
                count = 1;
            }
            else if(ar[i] == maxHeight){
                count = count + 1;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;//in.nextInt();
        int[] ar = {3,1,2,2,3,3};//new int[n];
        /*for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }*/
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
