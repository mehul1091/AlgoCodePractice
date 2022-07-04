package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    NextGreaterElement nge;
    @BeforeEach
    void setUp() {
        nge=new NextGreaterElement();
    }

    @Test
    public void test1(){
        int[] arr={4,5,2,25};
        int[] result = nge.solve(arr);
        int[] expected={5,25,25,-1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void test2(){
        int[] arr={13,7,6,12};
        int[] result = nge.solve(arr);
        int[] expected={-1,12,12,-1};
        Assertions.assertArrayEquals(expected, result);
    }
}