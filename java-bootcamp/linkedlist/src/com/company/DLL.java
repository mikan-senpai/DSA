package com.company;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head != null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        if (head == null){insertFirst(val); return;}
        Node node = new Node(val);
        node.next=null;
        Node last= head;
        while(last.next != null){
            last=last.next;
        }
        last.next=node;
        last.next.prev=last;

    }
    public void insert(int after, int userdata){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exists");
            return;
        }
        Node node = new Node(userdata);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next != null){
        node.next.prev=node;
        }
    }

    private Node find(int after) {
        Node node = head;
        while(node != null) {
            if (node.val == after) {
                return node;
            }
            node= node.next;
        }
    return null;
    }

    public void display(){
        System.out.println();
                Node node = head;
                Node last = null;
                while(node != null){
                    System.out.print(node.val+" ->");
                    last=node;
                    node=node.next;
                }
                System.out.println("END");

                while (last != null){
                    System.out.print(last.val+ " ->");
                    last=last.prev;
                }
        System.out.println("START");
    }


    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
