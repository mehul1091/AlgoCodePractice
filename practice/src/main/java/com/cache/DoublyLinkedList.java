package com.cache;

import lombok.Data;

@Data
public class DoublyLinkedList {

    Node head;
    Node tail;

    //insertion
    //1.insertAtBeginning
    //2.InsertAtEnd
    //3.insertAfterNode
    //4.insertBeforeNode
    public Node insertAtBeginning(Node node){
        //list is empty
        if(head==null) {
            head = node;
            tail=node;
            return head;
        }

        //list has elements
        node.next=head;
        head.prev=node;
        head=node;
        return head;
    }

    public Node insertAtEnd(Node node){
        //list is empty
        if(tail==null){
            return insertAtBeginning(node);
        }

        //list has elements
        tail.next=node;
        node.prev=tail;
        tail=node;
        return tail;
    }

    public Node insertAfterNode(Node node, Node newNode) {
        //1.if only 1 node is present in list
        if (node == tail && node == head) {
            return insertAtEnd(newNode);
        }

        //2.if node is tail
        if (node == tail) {
            return insertAtEnd(newNode);
        }

        //3.if given node is head
        Node nxt;
        if (node == head) {
            nxt = head.next;
            head.next = newNode;
            nxt.prev = newNode;
            newNode.next = nxt;
            newNode.prev = head;
            return newNode;
        }

        //4.given node is in between
        nxt = node.next;
        node.next=newNode;
        newNode.prev=node;
        nxt.prev=newNode;
        newNode.next=nxt;
        return newNode;
    }

    public Node insertBeforeNode(Node node, Node newNode){
        //1.given node is head && tail
        //2.given node is head
        if(node==head){
            return insertAtBeginning(newNode);
        }

        //3.given node is tail
        //4.given node is in between
        Node prv = node.prev;
        prv.next=newNode;
        node.prev=newNode;
        newNode.next=node;
        newNode.prev=prv;
        return newNode;
    }

    //deletion
    //1.deleteFromBeginning
    //2.deleteFromEnd
    //3.deleteNode

    public Node deleteFromBeginning() {
        //1.list is empty
        if (head == null)
            return null;

        //list has only 1 element
        Node deletedNode;
        if (head == tail) {
            deletedNode = head;
            head = head.next;
            tail = tail.prev;
            return deletedNode;
        }

        //list has other elements
        deletedNode = head;
        Node nxt = head.next;
        nxt.prev = null;
        head.next = null;
        head = nxt;
        return deletedNode;
    }

    public Node deleteFromEnd(){
        //list is empty
        if(head==null)
            return null;

        //list has 1 element
        if(head==tail){
            return deleteFromBeginning();
        }

        //list has more than 1 element
        Node prv = tail.prev;
        prv.next=null;
        tail.prev=null;
        Node deletedNode = tail;
        tail=prv;
        return deletedNode;
    }

    public Node deleteNode(Node node){
        //list is empty
        if(head==null)
            return null;

        //list has only 1 element
        if(node==head && node==tail){
            return deleteFromBeginning();
        }

        //if node is head
        if(node==head){
            return deleteFromBeginning();
        }

        //if node is tail
        if(node==tail)
            return deleteFromEnd();

        //if node is in between
        Node prv = node.prev;
        Node nxt = node.next;
        prv.next=nxt;
        nxt.prev=prv;
        node.prev=null;
        node.next=null;
        return node;
    }

    //search
    public Node searchNode(int data){
        //1.list is empty
        if(head==null)
            return null;

        //list has elements
        Node curr = head;
        while(curr!=null && curr.data!=data){
            curr=curr.next;
        }
        return curr;
    }
}
