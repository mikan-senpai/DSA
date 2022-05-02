package com.mikan.access;

public class A {
    private int num;
    public String name;
    int[] arr;

//    note -->    you cannot access the private varibles directly
//                you have to use the getter and setters to modify and access data

//this is a getter
    public int getNum() {
        return num;
    }
//this is a setter
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num , String name ) {
        this.num = num;
        this.name=name;
        this.arr= new int[num];
    }
}
