package com.mikan.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(12);
        son.career();
        System.out.println(son.age);



        Parent.hello();
        Daughter daughter = new Daughter(18);



//        Parent mom = new Parent();  =>  you cannot create objects of an abstract class
        // you have to implement the methods while you are creating like this given below
        //you have to override it
        Parent mom = new Parent(13) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
    }

}


//every constructor calls its super constructor