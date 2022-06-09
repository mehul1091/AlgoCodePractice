package com.linkedlist;

public class ReverseLinkedList {
    public ListNode solve(ListNode head){
        ListNode prev = null, curr = head, nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
