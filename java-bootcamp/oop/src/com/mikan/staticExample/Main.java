package com.mikan.staticExample;

public class Main {
    public static void main(String[] args) {

        Human mikan    = new Human(22,"Mikan",10000);
        Human Kratos   = new Human(21,"Kratos",12000);
        Human Sasuke   = new Human(27,"Sasuke",13000);

        System.out.println(mikan.population);
        System.out.println(Kratos.population);
        System.out.println(Sasuke.population);


//|@|
//    Main funn = new Main();  //implicit
//        funn.fun2();
//    funn.ceiling();


    }

//    this is not  dependent on objects ,does not belong to an object, instance
    static void fun(){
//        greeting();  // you cant use this because it requires an instance
//        but the function you are using it in, it does not depend on instances
//        Main.greeting();


        // you cannot access non-static stuff without referencing their instances in
        // a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();

    }



    void fun2(){
//        here it is alright cause ,
//        we know that on the end , this fun3() will be called
//        somewhere in main() -> directly or indirectly
//        why? because every thing starts from   main
// for example like this (go to this symbol above-> )      |@|
        greeting();
    }


//    this below method is dependent oon objects
// we know that greeting which is not static, belongs to an object, instance
    void greeting(){
        System.out.println("hey this is a non-static method");

//        can you have a static method inside a non-static method
//        fun();    //-> that you can do
    }


    void ceiling(){
        System.out.println("hey ");
    }

}
