package com.mikan.abstractDemo;

public abstract class Parent {
    int age;

    public Parent() {
        this.age=-1;
    }


    public Parent(int age) {
        this.age = age;
    }

    abstract void career();
    abstract void partner();
}
