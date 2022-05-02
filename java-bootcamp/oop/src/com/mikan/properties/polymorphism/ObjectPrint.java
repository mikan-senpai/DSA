package com.mikan.properties.polymorphism;


/**
 * by default in java
 * every class extends the object class
 * @override is an annotation
 *
 *
 *
 * during method overriding at run time it is deciding which function to override
 *
 * */

public class ObjectPrint extends Object {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
//        I haven't told java that when ever you print this object I want you to print this num
        System.out.println(obj);
    }

}
