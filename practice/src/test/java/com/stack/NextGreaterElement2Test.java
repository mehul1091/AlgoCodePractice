package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElement2Test {

    NextGreaterElement2 nge;
    @BeforeEach
    void setUp() {
        nge=new NextGreaterElement2();
    }
    @Test
    public void test1(){
        int[] arr={1,2,1};
        int[] result = nge.solve(arr);
        int[] expected={2,-1,2};
        Assertions.assertArrayEquals(expected, result);
    }
}