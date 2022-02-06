package com.company;

public class mikanLL {
    private Node head;
    private Node tail;


    public mikanLL() {

    }

    void insertEnd(int userData){
        Node newNode = new Node(userData);
        if (head.next == null){
            head=newNode;
            tail = newNode  ;
        }
        tail.next = newNode;
        tail =  newNode;
        System.out.println("the data you entered is " + head.next.data);
    }



    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}




class Test{
    public static void main(String[] args) {
        mikanLL hey = new mikanLL();
        hey.insertEnd(12);

        System.out.println();
    }
}