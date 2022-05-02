package com.mikan.singleton;

/** it is just a class which you only can create one object of
 *  -> if you have one object , you should not allow anyone to call the constructor of this class
 *  cause whenever you call a constructor a new object is created and when you stop people from creating new object
 *  hence you show not allow them to use the constructor [solution -> make constructor private]
 * */

public class Singleton {

    private Singleton(){
        System.out.println("hey i am singleton class");

    }
    public static Singleton instance;

    static public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
