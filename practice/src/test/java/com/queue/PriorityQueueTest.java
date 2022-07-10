package com.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PriorityQueueTest {
    PriorityQueue priorityQueue=new PriorityQueue(6);

    @Test
    public void test1(){
        priorityQueue.enqueue(12);
        priorityQueue.display();
        priorityQueue.enqueue(5);
        priorityQueue.display();
        priorityQueue.enqueue(7);
        priorityQueue.display();
        priorityQueue.enqueue(8);
        priorityQueue.display();
        priorityQueue.enqueue(9);
        priorityQueue.display();
        Assertions.assertEquals(12, priorityQueue.peek());
        priorityQueue.enqueue(31);
        Assertions.assertEquals(31, priorityQueue.peek());
        priorityQueue.display();
        priorityQueue.enqueue(1);
        priorityQueue.display();
        Assertions.assertEquals(31, priorityQueue.dequeue());
        priorityQueue.display();
        priorityQueue.enqueue(20);
        priorityQueue.display();
    }

}