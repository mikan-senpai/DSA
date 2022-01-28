package com.mikan.abstractDemo;

public class Son extends Parent{


    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("im going to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("i love Petter Potts");
    }
}
