package com.company;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size=0;
    }

    public void insertFirst(int userData){
        Node node= new Node(userData);
        node.next = head;
        head =node;

        if(tail == null){
            tail =head;
        }

        size+=1;
    }


    public void insertLast(int userData){
        Node node = new Node(userData);
        if (head == null) {
//            head=tail=node;     => what i did
            insertFirst(userData);
            return;
        }
        tail.next = node;
        tail=tail.next;

        size+=1;
    }


    public void insert(int userData , int index ){
        if (index==0){insertFirst(userData);}
        if(index==size){insertLast(userData);}
        if (index > size){return;}

        Node temp = head;

        for (int pos = 0; pos < index -1; pos++) {
            if (temp.next != null){
                temp=temp.next;
            }
        }

        Node node = new Node(userData,temp.next);
        temp.next=node;
        size+=1;
    }
//=========================================
    //INSERT USING RECURSION
    public void insertRec(int val , int index){
        head= insertRec(val, index, head);
    }
    private Node insertRec(int userData, int index , Node node ){
        if(index == 0 ){
            Node temp = new Node(userData, node);
            size+=1;
            return temp ;
        }
        node.next =insertRec(userData, index -1, node.next);
        return node;
    }
//=========================================


    public int deleteFirst(){
        if(head == null) {
            tail=null;
        }
        int nodeData= head.value ;
        head = head.next;
        size -=1;
        return nodeData;
    }

    public int deleteLast(){
        if (size <= 1){
             return deleteFirst();z
        }
        Node secondLast= get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }


    public int delete (int index){
        if(index == 0){ return  deleteFirst();}
        if(index == size-1){ return deleteLast();}

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next= prev.next.next;
        return val;
    }

    public  Node find(int val){
        Node node =head;
        while(node != null){
            if (node.value == val){
                return node;
            }
            node =node.next;
        }
        return node;
    }


    public  Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void display(){
    if (head == null){
        System.out.println("LL empty");
    }else {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -➜ ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
        }
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
