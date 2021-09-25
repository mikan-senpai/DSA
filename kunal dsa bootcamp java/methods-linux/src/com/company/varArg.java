package com.company;

import java.util.Arrays;

public class varArg {
    public static void main(String[] args) {
        fun(2,34,5,5,6,6,77,4,5,5);
        multiple(2,3,"mikan","bebo");
    }
    static void multiple(int a, int b , String ...v){

    }
    static void fun(int ...v )
    {
        System.out.println(Arrays.toString(v));
    }
}
