package com.arrays.rev1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    FourSum fourSum=new FourSum();

    @Test
    public void test1(){
        List<List<Integer>> result = fourSum.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296);
        List<List<Integer>> expected=new ArrayList<>();
        assertTrue(result.size() == expected.size() &&
                result.containsAll(expected) && expected.containsAll(result));
    }
}