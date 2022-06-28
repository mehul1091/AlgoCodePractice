package com.cache;

import java.util.HashMap;

public class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    DoublyLinkedList dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map=new HashMap<>();
        dll=new DoublyLinkedList();
    }

    public void put(int key, int value){
        Node newNode = new Node(key, value);
        //1.key exists
        if(map.containsKey(key)){
            Node node = map.get(key);
            node = dll.deleteNode(node);

            dll.insertAtBeginning(newNode);
            map.put(key, newNode);
            return;
        }

        //2. key not present
        //capacity is full
        if(capacity==map.size()){
            Node node = dll.deleteFromEnd();
            map.remove(node.key);
        }

        newNode = dll.insertAtBeginning(newNode);
        map.put(key, newNode);
        return;
    }

    public int get(int key){
        //1.key does not exist
        if(!map.containsKey(key)){
            return -1;
        }

        //2.key exists
        Node node = map.get(key);
        node= dll.deleteNode(node);
        dll.insertAtBeginning(node);
        map.put(key, node);
        return node.data;
    }

}
