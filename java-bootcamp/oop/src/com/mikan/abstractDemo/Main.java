package com.mikan.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        System.out.println(son.age);




        Daughter daughter = new Daughter(18);

    }

}


//every constructor calls its super constructor