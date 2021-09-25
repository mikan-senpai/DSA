package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n =1;
        print1(n);
        recursivePrint(n);
    }
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    // func body here changes
    static void print5(int n) {
        System.out.println(n);
    }

//    same print fuction with recursion
    static void recursivePrint(int n)
    {
        if(n==5)  //base conditon
        {
            System.out.println(n);
            return;
        }
        //each
        System.out.println(n);
        recursivePrint(n+1);  // recursive call
    }
}
