


package com.mikan.abstractDemo;

public class Daughter extends Parent{
    int age;

    public Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("im going to be Coder");
    }

    @Override
    void partner() {
        System.out.println("i love Iron Man");
    }
}
