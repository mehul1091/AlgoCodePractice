package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    Queue<Integer> q;
    public StackUsingSingleQueue() {
        q=new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int iterations=q.size()-1;
        for (int i = 0; i < iterations; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        int temp = pop();
        q.add(temp);
        return temp;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
