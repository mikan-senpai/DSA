package com.company;

public class shadowing {
    static int x=90; //this will be shadowed at line 8
    public static void main(String[] args) {
        //higher scope is being printed
        System.out.println(x);//90
        //
        int x;
        x=40;
        //the lower scope is overriding the higher level of scope

        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}