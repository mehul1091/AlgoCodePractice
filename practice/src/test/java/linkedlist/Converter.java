package linkedlist;

import com.linkedlist.ListNode;

public class Converter {

    public ListNode convertArraysToLinkedList(int[] arr){
        if(arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            curr.setNext(temp);
            curr = temp;
        }
        return head;
    }

    public int[] convertLinkedListToArray(ListNode head){
        //find size of linkedlist
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.getNext();
        }

        int[] arr = new int[count];
        curr = head;
        int i = 0;
        while (curr != null){
            arr[i] = curr.getVal();
            i++;
            curr = curr.getNext();
        }
        return arr;
    }
}
