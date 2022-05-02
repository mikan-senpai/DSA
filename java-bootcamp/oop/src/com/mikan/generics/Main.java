package com.mikan.generics;

public class Main implements GenericInterface<Integer>{

    @Override
    public void display(Integer value) {
        System.out.println("im in generic interface");
    }
}
