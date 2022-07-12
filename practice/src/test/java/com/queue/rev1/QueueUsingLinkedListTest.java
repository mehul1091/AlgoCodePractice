package com.queue.rev1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingLinkedListTest {
    QueueUsingLinkedList queue=new QueueUsingLinkedList();

    @Test
    public void test1(){
        queue.enqueue(45);
        queue.enqueue(55);
        queue.enqueue(90);
        queue.enqueue(123);
        queue.enqueue(52);
        Assertions.assertEquals(45, queue.dequeue());
    }

}