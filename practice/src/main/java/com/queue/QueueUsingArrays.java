package com.queue;

public class QueueUsingArrays {
    int capacity, front, rear, size;
    int[] arr;

    public QueueUsingArrays(int capacity) {
        this.capacity = capacity;
        this.front=0;
        this.rear=0;
        this.size=0;
        this.arr=new int[capacity];
    }

    public void display(){
        if(isEmpty())
            return;
        int i=rear;
        System.out.print("end->");
        while(i>=front){
            System.out.print(arr[i%capacity]+"->");
            i--;
        }
        System.out.print("front");
        System.out.println();
    }

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    public void enqueue(int data){
        //check if queue is full
        if(size>=capacity){
            System.out.println("queue is full, cannot add element "+data);
            return;
        }
        //add element to back
        arr[rear%capacity]=data;
        rear++;
        size++;
        return;
    }

    public int dequeue(){
        //check if queue has elements
        if(size==0){
            System.out.println("queue has no elements");
            return -1;
        }
        //remove from front
        int temp = arr[front % capacity];
        front++;
        size--;
        return temp;
    }
}
