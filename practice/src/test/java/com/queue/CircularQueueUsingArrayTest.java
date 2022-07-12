package com.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularQueueUsingArrayTest {
    CircularQueueUsingArray queue=new CircularQueueUsingArray(4);

    @Test
    public void test1(){
        Assertions.assertEquals(-1, queue.peek());
        queue.enqueue(3);
        queue.enqueue(78);
        queue.enqueue(13);
        queue.enqueue(90);
        Assertions.assertEquals(3, queue.dequeue());
        queue.enqueue(101);
        Assertions.assertEquals(78, queue.dequeue());
        queue.enqueue(566);
        Assertions.assertEquals(13, queue.peek());
    }
}