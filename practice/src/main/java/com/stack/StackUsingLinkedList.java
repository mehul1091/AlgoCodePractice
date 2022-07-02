package com.stack;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next=null;
    }
}

public class StackUsingLinkedList {
    Node top;
    Node head;

    public StackUsingLinkedList() {
        this.top=null;
        this.head=null;
    }

    public boolean isEmpty(){
        if(top==null && head==null)
            return true;
        return false;
    }

    public void push(int val){
        Node newNode=new Node(val);
        //list is empty
        if(isEmpty()){
            top=newNode;
            head=newNode;
            return;
        }

        //list has elements
        top.next=newNode;
        top=newNode;
        return;
    }

    public int pop(){
        //list is empty
        if(isEmpty()){
            return -1;
        }

        Node temp = top;
        //list has only 1 element
        if(top==head){
            temp=top;
            top=null;
            head=null;
            return temp.val;
        }

        //list has more than 1 element
        Node curr = head;
        while(curr.next!=top){
            curr=curr.next;
        }
        curr.next=null;
        top=curr;
        return temp.val;
    }

    public int top(){
        if(isEmpty())
            return -1;
        return top.val;
    }
}
