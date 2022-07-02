package com.stack;

public class StackUsingArray {
    int capacity;
    int top;
    int[] arr;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.top=-1;
        this.arr=new int[capacity];
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(top == capacity-1)
            return true;
        return false;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("stack is full cannot insert value");
            return;
        }
        arr[++top]=val;
        return;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty, cannot pop value");
            return -1;
        }
        return arr[top--];
    }

    public int top(){
        return arr[top];
    }

    public int size(){
        return top+1;
    }
}
