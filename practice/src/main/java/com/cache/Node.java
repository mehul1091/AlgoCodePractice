package com.cache;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Node {
    int key;
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev=null;
        next=null;
    }

    public Node(int key, int data) {
        this.key = key;
        this.data = data;
        prev=null;
        next=null;
    }

    public String toString(){
        return this.key + "," + this.data;
    }
}
