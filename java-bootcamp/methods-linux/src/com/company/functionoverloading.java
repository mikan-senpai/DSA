package com.company;

public class functionoverloading {
    public static void main(String[] args) {
    fun(9);
    fun("mikan");

    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name );
    }

}

