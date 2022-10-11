package com.company.Questions;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head.next);
        ListNode curr = dummy;
        ListNode prev = dummy;
        while (curr.next != null && curr.next.next != null) {
            ListNode first_node = curr.next;
            ListNode second_node = curr.next.next;
            first_node.next = second_node.next;
            curr.next = second_node;
            curr.next.next=first_node;
            curr=curr.next.next;
        }
    return dummy.next;
    }
}
