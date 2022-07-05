package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class SortStackInAscOrder {
    public int[] solve(int[] arr){
        Stack<Integer> s1=new Stack<>();
        Arrays.stream(arr).forEach(x -> s1.push(x));
        Stack<Integer> s2=new Stack<>();
        while(!s1.isEmpty()){
            Integer temp = s1.pop();
            while(!s2.isEmpty() && temp>s2.peek()){
                s1.push(s2.pop());
            }
            s2.push(temp);
        }

        int[] res=new int[arr.length];
        int i=0;
        while(!s2.isEmpty()){
            res[i]=s2.pop();
            i++;
        }
        return res;
    }
}
