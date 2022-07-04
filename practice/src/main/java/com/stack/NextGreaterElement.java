package com.stack;

import java.util.Stack;

public class NextGreaterElement {
    public int[] solve(int[] arr){
        Stack<Integer> s=new Stack<>();
        int[] newArr=new int[arr.length];
        int i=arr.length-1;
        while(i>=0){
            if(s.isEmpty()){
                newArr[i]=-1;
            }
            else{
                while(!s.isEmpty() && arr[i]>s.peek()){
                    s.pop();
                }
                if(s.isEmpty())
                    continue;

                newArr[i]=s.peek();
            }
            s.push(arr[i]);
            i--;
        }
        return newArr;
    }
}
