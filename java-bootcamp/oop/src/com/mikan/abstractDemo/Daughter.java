


package com.mikan.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
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
