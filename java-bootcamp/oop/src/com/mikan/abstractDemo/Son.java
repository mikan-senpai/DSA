package com.mikan.abstractDemo;

public class Son extends Parent{
    int age;

    public Son(){
    super();
    this.age=-11;
    }

    public Son(int age) {
        super(age);
        this.age = age;
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
