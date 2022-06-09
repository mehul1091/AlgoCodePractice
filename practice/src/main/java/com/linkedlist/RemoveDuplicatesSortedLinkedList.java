package com.linkedlist;

public class RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            while(temp != null && curr.val == temp.val){
                curr.next = temp.next;
                temp.next = null;
                temp = curr.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
