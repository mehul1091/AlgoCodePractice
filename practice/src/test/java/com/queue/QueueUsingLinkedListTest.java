package com.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingLinkedListTest {

    QueueUsingLinkedList queue=new QueueUsingLinkedList();

    @Test
    public void test1(){
//        queue.display();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
//        queue.display();
        queue.enqueue(60);
//        queue.display();
        Assertions.assertEquals(20, queue.dequeue());
        Assertions.assertEquals(30, queue.dequeue());
//        queue.display();
    }
}