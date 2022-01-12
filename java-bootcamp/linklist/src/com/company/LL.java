package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    
    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val){
        Node newnode = new Node(val);
        // head.next = newnode;

        // newnode -> |val | add|
        head.value = newnode.value;
        newnode.next = head;
        head = newnode;
        int temp= head.value;

        // newnode = head;
        if(tail == null){
            tail = head;
        }

        size += 1;
    }


    public void display(){
        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.value + "->");
        //     temp = temp.next;
        // }
        // System.out.print("END");

        System.out.println(head.value);
    }


    private class Node{
        private int value;
        private Node next;

        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
