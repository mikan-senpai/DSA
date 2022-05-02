package com.mikan.abstractDemo;

public abstract class Parent {
    int age;
    final int VAlUE;



    public Parent(int age) {
        this.age = age;
        VAlUE= 11094701;
    }

    static void hello(){
        System.out.println("hey i am a static method in an abstract class");
    }

    void normal (){
        System.out.println("hey i am a normal method in an abstract class");
    }

    abstract void career();
    abstract void partner();
}
