package com.queue.rev1;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class QueueUsingLinkedList {
    Node front, rear;

    public QueueUsingLinkedList() {
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int data){
        Node newnode=new Node(data);
        //0 element
        if(isEmpty()){
            front=newnode;
            rear=newnode;
            return;
        }
        //1 or >1 element
        rear.next=newnode;
        rear=newnode;
    }
    public int dequeue(){
        //0 element
        if(isEmpty()){
            return -1;
        }
        Node temp=front;
        //1 element
        if(front==rear){
            front=null;
            rear=null;
            return temp.data;
        }
        //>1 element
        front=front.next;
        temp.next=null;
        return temp.data;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return front.data;
    }

    public boolean isEmpty(){
        if(front==null && rear==null)
            return true;
        return false;
    }
}
