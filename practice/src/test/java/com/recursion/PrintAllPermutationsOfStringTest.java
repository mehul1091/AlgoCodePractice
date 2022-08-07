package com.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintAllPermutationsOfStringTest {

    @Test
    void printAllPerms() {
        PrintAllPermutationsOfString obj=new PrintAllPermutationsOfString();
        ArrayList<String> result = new ArrayList<>();
        obj.printAllPerms("ABC", 0, result);
        List<String> expected = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CBA", "CAB");
        Assertions.assertLinesMatch(expected, result);
    }
}