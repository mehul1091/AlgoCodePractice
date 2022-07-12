package com.queue;

public class CircularQueueUsingArray {
    int front, rear, size, capacity;
    int[] arr;

    public CircularQueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.front=-1;
        this.rear=-1;
        this.size=0;
        this.arr=new int[capacity];
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1)
            return true;
        return false;
    }
    public void enqueue(int data){
        //0 element
        if(isEmpty()){
            front++;
            arr[front]=data;
            rear=front+1;
            size++;
            return;
        }
        //check if space is available
        if(size==capacity){
            System.out.println("no space available to insert");
            return;
        }
        //1 or >1 elements
        arr[rear%capacity]=data;
        rear++;
        size++;
    }
    public int dequeue(){
        //0 element
        if(isEmpty()){
            System.out.println("no element in queue to remove");
            return -1;
        }
        int temp=arr[front%capacity];
        //1 element
        if(front==rear-1){
            front=-1;
            rear=-1;
            size=0;
            return temp;
        }
        //>1 element
        front++;
        size--;
        return temp;
    }
    public int peek(){
        if(isEmpty())
            return -1;
        return arr[front%capacity];
    }
}
