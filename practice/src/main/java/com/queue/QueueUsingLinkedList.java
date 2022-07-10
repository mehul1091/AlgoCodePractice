package com.queue;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next=null;
    }
}
public class QueueUsingLinkedList {
    Node front, rear;
    int size;

    public QueueUsingLinkedList() {
        this.front=null;
        this.rear=null;
        size=0;
    }

    public boolean isEmpty(){
        if(front==null && rear==null)
            return true;
        return false;
    }

    public void enqueue(int data){
        Node newnode=new Node(data);
        //queue is empty
        if(isEmpty()){
            front=newnode;
            rear=newnode;
            return;
        }
        //queue has 1 or more elements
        rear.next=newnode;
        rear=newnode;
        return;
    }

    public int dequeue(){
        //queue is empty
        if(isEmpty())
            return -1;

        //queue has only 1 element
        Node temp = front;
        if(front==rear){
            rear=null;
        }

        //queue has more than 1 element
        front=front.next;
        temp.next=null;
        return temp.val;
    }
}
