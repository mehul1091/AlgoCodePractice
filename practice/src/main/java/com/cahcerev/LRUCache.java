package com.cahcerev;

import java.util.HashMap;

class Node{
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class DoublyLinkedList{
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head=new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.tail=new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
        head.next=tail;
        tail.prev=head;
    }

    public Node deleteFromEnd(){
        if(head.next==tail){
            System.out.println("list is empty");
            return null;
        }
        return deleteNode(tail.prev);
    }

    public Node deleteNode(Node node){
        Node prv = node.prev;
        Node nxt = node.next;

        prv.next=nxt;
        nxt.prev=prv;
        node.next=null;
        node.prev=null;
        return node;
    }

    public Node insertAtBeginning(Node node){
        Node temp = head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
        return node;
    }
}
public class LRUCache {
    int capacity;
    DoublyLinkedList dll;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.dll = new DoublyLinkedList();
        this.map = new HashMap<>();
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        node=dll.deleteNode(node);
        Node newNode=new Node(node.key, node.val);
        dll.insertAtBeginning(newNode);
        map.put(key, newNode);
        return newNode.val;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            dll.deleteNode(node);
            Node newNode=new Node(key, value);
            dll.insertAtBeginning(newNode);
            map.put(key, newNode);
            return;
        }

        if(capacity==map.size()){
            Node node = dll.deleteFromEnd();
            map.remove(node.key);
        }
        Node newNode=new Node(key, value);
        dll.insertAtBeginning(newNode);
        map.put(key, newNode);
        return;

    }
}
