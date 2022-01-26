package com.mikan.access;

public class Main {
    public static void main(String[] args) {
        A obj= new A(10,"mikan");

        //need to do a few things
        //1. access the data members
        //2. modify the data members

//        now you cannot do obj.num -> this is data hiding


        obj.setNum(687);
        obj.getNum();

    }
}
