package com.stack.revision1;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next=null;
    }
}
public class StackUsingLinkedListRev1 {
    Node top;

    public StackUsingLinkedListRev1() {
        this.top=null;
    }

    public void push(int data){
        Node newNode=new Node(data);
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
        if(isEmpty())
            return -1;

        //list has elements
        //remove from beginning
        Node deleteNode=top;
        top=top.next;
        deleteNode.next=null;
        return deleteNode.val;
    }

    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return top.val;
    }
}
