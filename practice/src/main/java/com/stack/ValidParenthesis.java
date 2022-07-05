package com.stack;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String str) {
        int i=0;
        Stack<Character> s=new Stack<>();
        while(i<str.length()){
            char curr=str.charAt(i);
            switch(curr){
                case '{':
                case '[':
                case '(':
                    s.push(curr);
                    i++;
                    break;
                case ']':
                    if(!s.isEmpty() && s.peek()=='[')
                        s.pop();
                    else
                        s.push(curr);
                    i++;
                    break;
                case '}':
                    if(!s.isEmpty() && s.peek()=='{')
                        s.pop();
                    else
                        s.push(curr);
                    i++;
                    break;
                case ')':
                    if(!s.isEmpty() && s.peek()=='(')
                        s.pop();
                    else
                        s.push(curr);
                    i++;
                    break;

            }
        }

        if(s.isEmpty())
            return true;
        return false;
    }

}
