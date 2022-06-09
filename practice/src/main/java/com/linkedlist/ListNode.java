package com.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {
    int val;
     ListNode next;
     public ListNode(int val) { this.val = val; }
}
