import com.linkedlist.ListNode;
import com.linkedlist.RemoveDuplicatesSortedLinkedList;
import linkedlist.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedLinkedListTest {

    RemoveDuplicatesSortedLinkedList obj;
    List<TestCase> testCases;
    Converter converter;

    @BeforeEach
    void setUp() {
        obj = new RemoveDuplicatesSortedLinkedList();
        converter = new Converter();
        testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{1,1,2}, new int[]{1,2}));
        testCases.add(new TestCase(new int[]{1,1,2,3,3}, new int[]{1,2,3}));
    }

    @Test
    void deleteDuplicates() {
        testCases.forEach(testCase -> {
            ListNode head = converter.convertArraysToLinkedList(testCase.getInput());
            ListNode result = obj.deleteDuplicates(head);
            int[] resultArray = converter.convertLinkedListToArray(result);
            Assertions.assertArrayEquals(testCase.getOutput(), resultArray);
        });
    }
}