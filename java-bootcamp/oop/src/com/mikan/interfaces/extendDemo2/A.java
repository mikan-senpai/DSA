package com.mikan.interfaces.extendDemo2;

public interface A {
//    static interface methods should alwways havee a body
//    call via the interface name

    static void greeting(){
        System.out.println("i am a static method inside an interface");
    }



    default void fun(){
        System.out.println("I am a Default implementation in A");
    };
}
