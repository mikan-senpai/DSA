package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(134);

        LL list1 = new LL();
//        list1.insertFirst(3);
//        list1.insertFirst(4);
//        list1.insertFirst(6);
//        list1.insertFirst(18);
        list1.insertLast(12);
        list1.insertLast(100);

        list1.display();

        list1.insertFirst(6);
        list1.display();


        list1.insert(11,2);
        list1.display();

    }
}
