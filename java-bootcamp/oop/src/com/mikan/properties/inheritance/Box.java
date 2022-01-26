package com.mikan.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;


    //let's create a  static method here too
    static void greeting(){
        System.out.println("Hey,I am in Box class. Greetings!");
    }
    /**though you can access , edit ,etc =>  static stuff via reference variable
     * but the convention is to do it via the class name
     * Q. can you override static methods?
     *
     * */

    Box(){
        this.h= -1;
        this.l= -1;
        this.w= -1;
    }


    //cube
    Box(double side){

//            super();  calls the object class

        this.w = side;
        this.l = side;
        this.h = side;
    }


    Box(double l, double h ,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }


    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;

    }

    public  void information(){
        System.out.println("Running the box");
    }

}
