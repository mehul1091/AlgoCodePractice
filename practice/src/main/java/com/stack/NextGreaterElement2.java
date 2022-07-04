package com.stack;

import java.util.Stack;

public class NextGreaterElement2 {
    public int[] solve(int[] arr) {
        int[] newarr=new int[arr.length*2];
        int[] res=new int[newarr.length];
        int i=0;
        while(i<arr.length){
            newarr[i]=arr[i];
            i++;
        }
        int j=0;
        while(j<arr.length){
            newarr[i]=arr[j];
            i++;
            j++;
        }

        Stack<Integer> s= new Stack<>();
        i=newarr.length-1;
        while(i>=0){
            if(s.isEmpty()){
                res[i]=-1;

            }
            else{
                while(!s.isEmpty() && newarr[i] >= s.peek()){
                    s.pop();
                }
                if(s.isEmpty())
                    continue;
                res[i]=s.peek();
            }
            s.push(newarr[i]);
            i--;
        }

        int[] newres=new int[arr.length];
        i=0;
        while(i<newres.length){
            newres[i]=res[i];
            i++;
        }
        return newres;
    }
}
