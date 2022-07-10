package com.queue;

public class PriorityQueue {
    int front, rear, capacity;
    int[] arr;

    public PriorityQueue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1)
            return true;
        return false;
    }

    public void enqueue(int val){
        //0 element
        if(isEmpty()){
            front++;
            arr[front]=val;
            rear=front+1;
            return;
        }
        //check if space is available
        if(rear>=capacity){
            System.out.println("no space in queue, cannot insert : "+val);
            return;
        }
        int i=rear-1;
        while(i>=0 && arr[i]<val){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=val;
        rear++;
    }

    public int dequeue(){
        //0 element
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int temp=arr[front];
        //1 element
        if(front==rear-1){
            front=-1;
            rear=-1;
        }

        //more than 1 element
        front++;
        return temp;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return arr[front];
    }

    public void display(){
        int i=front;
        while(i<rear){
            System.out.print(arr[i] + "->");
            i++;
        }
        System.out.println();
    }
}
