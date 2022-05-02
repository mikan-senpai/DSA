package syntax;// package com.company;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        boolean result = stk.empty();

        System.out.println("is stack empty " + result);

        //pushing in stack 
        stk.push(78);
        stk.push(213);
        stk.push(80);
        stk.push(120);

        //print elements of the stack 
        System.out.println("elements in stack" + stk);

        result=stk.empty();
        System.out.println("is stack empty " + result);


        int data = stk.pop();
        System.out.println(data);

        System.out.println("elements in stack" + stk);




    }
}
