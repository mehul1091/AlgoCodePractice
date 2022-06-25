package com.linkedlist;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode list1=head;

        //find middle of LL, using slow and fast ptrs
        ListNode mid=findMiddle(head);

        //reverse LL after mid
        ListNode list2=reverse(mid);

        //compare both lists
        return compare(list1, list2);
    }

    public boolean compare(ListNode list1, ListNode list2){
        while(list1!=null && list2!=null){
            if(list1.val!=list2.val)
                return false;
            list1=list1.next;
            list2=list2.next;
        }
        return true;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head, prev=null, nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}
