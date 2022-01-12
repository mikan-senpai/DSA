package com.company;

import jdk.jshell.Snippet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        adding in the list
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        System.out.println(list);

//        input
        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());

        }
                System.out.println(list);


//        for (int i = 0; i <5; i++) {
//            System.out.println(list.get(5));
//
//        }
    }

}
