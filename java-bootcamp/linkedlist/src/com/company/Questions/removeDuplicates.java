package com.company.Questions;

public class removeDuplicates {

//     * Definition for singly-linked list.
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            node = node.next;
        }



        return head;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}