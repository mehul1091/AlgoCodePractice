package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    Queue<Integer> q1, q2;
    public StackUsingTwoQueues() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if(q1.isEmpty())
            return -1;

        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        Integer temp = q1.remove();
        Queue<Integer> tq = q1;
        q1=q2;
        q2=tq;
        return temp;
    }

    public int top() {
        int temp = pop();
        q1.add(temp);
        return temp;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
