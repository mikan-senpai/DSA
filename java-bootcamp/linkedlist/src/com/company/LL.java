package com.company;

public class LL {
    private LL head;
    private LL tail;

    private int size;

    public LL() {
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
