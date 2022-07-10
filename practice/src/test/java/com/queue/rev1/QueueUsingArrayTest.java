package com.queue.rev1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueUsingArrayTest {

    QueueUsingArray queue=new QueueUsingArray(5);

    @Test
    public void test1(){
        queue.enqueue(10);
        queue.enqueue(130);
        queue.enqueue(29);
        queue.enqueue(44);
        queue.enqueue(42);
        queue.enqueue(12);
        queue.enqueue(133);
        Assertions.assertEquals(10, queue.dequeue());
        Assertions.assertEquals(130, queue.dequeue());
        Assertions.assertEquals(29, queue.dequeue());
        Assertions.assertEquals(44, queue.dequeue());
        queue.enqueue(133);
        Assertions.assertEquals(42, queue.dequeue());
        Assertions.assertEquals(133, queue.dequeue());
        Assertions.assertEquals(-1, queue.peek());
    }
}