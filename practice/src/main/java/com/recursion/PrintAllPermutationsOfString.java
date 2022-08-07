package com.recursion;

import java.util.ArrayList;

public class PrintAllPermutationsOfString {
    public static void main(String[] args) {
        PrintAllPermutationsOfString obj=new PrintAllPermutationsOfString();
        ArrayList<String> result = new ArrayList<>();
        obj.printAllPerms("ABC", 0, result);
        System.out.println(result);
    }

    public void printAllPerms(String input, int start, ArrayList<String> result){

        if(start == input.length()-1){
            result.add(input);
            return ;
        }

        char[] arr = input.toCharArray();
        printAllPerms(input, start+1, result);
        for(int i=start+1; i<arr.length; i++){
            char[] newarr = swap(start, i, String.valueOf(arr));
            printAllPerms(String.valueOf(newarr), start+1, result);
        }
    }

    private char[] swap(int start, int i, String input) {
        char[] newarr = input.toCharArray();
        char temp = newarr[start];
        newarr[start] = newarr[i];
        newarr[i]=temp;
        return newarr;
    }
}
