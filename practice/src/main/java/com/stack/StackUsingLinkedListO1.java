package com.stack;

public class StackUsingLinkedListO1 {
    Node top;

    public StackUsingLinkedListO1() {
        this.top=null;
    }

    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }

    public void push(int val){
        Node newNode=new Node(val);
        //list is empty
        if(isEmpty()){
            top=newNode;
            return;
        }

        //list has elements
        newNode.next=top;
        top=newNode;
        return;
    }

    public int pop(){
        //list is empty
        if(isEmpty()){
            return -1;
        }

        Node temp = top;
        top=top.next;
        return temp.val;
    }

    public int top(){
        if(isEmpty())
            return -1;
        return top.val;
    }
}
