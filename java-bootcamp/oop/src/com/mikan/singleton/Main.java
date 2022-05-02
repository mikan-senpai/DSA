package com.mikan.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.instance.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();


        /**here only one object is created */
    }
}
