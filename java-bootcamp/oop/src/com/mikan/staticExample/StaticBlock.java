package com.mikan.staticExample;

/**
 * this is a demo to show initialization of static variables
 */
public class StaticBlock {
    static int a =4;
    static int b;

/**
 * will only run once when the first object is created i.e. when the class is loaded for the first time
 -> this only runs for the first obj
 -> this is how a static variable can be initialized.
 */
    static {
        System.out.println("I am in static block");
        b= a * 5;
    }




/**
 * I can put main function anywhere
 */
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b );
//        changing the value of a static variable
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

//        creating another object
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);



    }
}
