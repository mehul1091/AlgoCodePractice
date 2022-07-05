package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortStackInAscOrderTest {

    SortStackInAscOrder sortStackInAscOrder=new SortStackInAscOrder();

    @Test
    public void test1(){
        int[] arr={34, 3, 31, 98, 92, 23};
        int[] res={3, 23, 31, 34, 92, 98};
        int[] solve = sortStackInAscOrder.solve(arr);
        Assertions.assertArrayEquals(res, solve);
    }
    @Test
    public void test2(){
        int[] arr={3, 5, 1, 4, 2, 8};
        int[] res={1, 2, 3, 4, 5, 8};
        int[] solve = sortStackInAscOrder.solve(arr);
        Assertions.assertArrayEquals(res, solve);
    }
}