package com.mikan.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(12,2,2);
//        Box box2 = new Box(box);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//
//        System.out.println(box3.l + " " + box3.weight);
//        System.out.println(box4.l + " " + box4.weight);



//        Box box6 = new BoxWeight(10,20,30,40);
//        System.out.println(box6.l + " " + ((BoxWeight) box6).weight);



// there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box5 = new Box(2,3,4);

//        System.out.println(box5.l + " " + box5.weight);

//        System.out.println(super.h);


//        BoxWeight box6 = new BoxWeight(box4);
//        System.out.println(box6.l + " " + box6.weight);




        // experimenting with hierarchical inheritance
        BoxColor red =  new BoxColor(12,"Color is red");
        System.out.println(red.weight + " " + red.color);

        BoxColor green =  new BoxColor(12,56,"Color is green");
        System.out.println(green.w + " " + green.weight + " " + green.color);



        Box box10 = new Box();
        box10.greeting();


        Box box= new BoxWeight();
        box.greeting();

    }
}