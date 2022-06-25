import com.linkedlist.ListNode;
import com.linkedlist.PalindromeLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    void setUp() {
        palindromeLinkedList=new PalindromeLinkedList();
    }

    @Test
    void isPalindrome() {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        boolean palindrome = palindromeLinkedList.isPalindrome(head);
        assertFalse(palindrome);
    }

    @Test
    void isPalindromeTc2() {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(1));
        head.getNext().setNext(new ListNode(2));
        head.getNext().getNext().setNext(new ListNode(1));
        boolean palindrome = palindromeLinkedList.isPalindrome(head);
        assertFalse(palindrome);
    }
}