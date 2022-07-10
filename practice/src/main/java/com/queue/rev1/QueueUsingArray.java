package com.queue.rev1;

public class QueueUsingArray {
    int front, rear, capacity;
    int[] arr;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.front=-1;
        this.rear=-1;
        arr=new int[capacity];
    }
    public void enqueue(int data){
        //0 elements
        if(isEmpty()){
            front++;
            arr[front]=data;
            rear=front+1;
            return;
        }

        //check space
        if(rear>=capacity){
            System.out.println("no space in queue, cannot insert:"+data);
            return;
        }
        //1 element
        //>1 element
        arr[rear]=data;
        rear++;
    }

    public int dequeue(){
        //0 element
        if(isEmpty()){
            System.out.println("queue is empty, cannot dequeue");
            return -1;
        }
        int temp = arr[front];
        //1 element
        if(front==rear-1){
            front=-1;
            rear=-1;
            return temp;
        }
        //>1 element
        //shift all elements to the front of the queue to make space at rear
        int i=front;
        while(i<rear-1){
            arr[i]=arr[i+1];
            i++;
        }
        rear--;
        return temp;
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1)
            return true;
        return false;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return arr[front];
    }
}
