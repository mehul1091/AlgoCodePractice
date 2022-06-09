
import com.linkedlist.ListNode;
import com.linkedlist.ReverseLinkedList;
import linkedlist.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;
    List<TestCase> testCases;
    Converter converter;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
        converter = new Converter();
        testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{1,2,3,4,5}, new int[]{5,4,3,2,1}));
        testCases.add(new TestCase(new int[]{1,2}, new int[]{2,1}));
        testCases.add(new TestCase(new int[]{}, new int[]{}));
    }

    @Test
    void solve() {
        testCases.forEach(testCase -> {
            ListNode inputHead = converter.convertArraysToLinkedList(testCase.getInput());
            ListNode result = reverseLinkedList.solve(inputHead);
            int[] resultArray = converter.convertLinkedListToArray(result);
            Assertions.assertArrayEquals(testCase.getOutput(), resultArray);
        });
    }
}