package com.mikan.cloning;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mikan = new Human(12,"mikan");
//        Human twin = new Human(mikan);
        Human twin = (Human) mikan.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
