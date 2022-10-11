package ObjectOrientedJava;

//https://www.educative.io/answers/what-is-a-diamond-problem-in-object-oriented-programming
public class diamondProb {

}

class Car {
    public void display() {
        System.out.println("class Car display() is called");
    }
}

class Electric extends Car {
    public void display() {
        System.out.println("class Electric display() is called");
    }

}

class Gasoline extends Car {
    public void display() {
        System.out.println("class Gasoline display() is called");
    }

}

/*
 this will not work cause java does not support multiple inheritance
 class Hybrid extends Electric,Gasoline{
     public void display(){
         System.out.println("class Hybrid display() is called");
     }
 }
*/


/* SOLUTION : is default methods and interfaces. We can achieve multiple inheritance by using these two things. */


interface GAS {
    public default void display() {
        System.out.println("Interface gas display() is called");
    }
}

interface ELECTRIC {
    public default void display() {
        System.out.println("Interface car display() is called");
    }
}

class CAR implements GAS, ELECTRIC {

    @Override
    public void display() {
        GAS.super.display();
        ELECTRIC.super.display();

    }
}

////------------------------------------------------------------------------------------------------------------
//                 GrandParent
//                   /     \
//                  /       \
//                  Parent1      Parent2
//                  \       /
//                  \     /
//                  Test





interface DemoInterface {
    //default method
    default void display() {
        System.out.println("The dispaly() method invoked");
    }
}

//interface without default method
interface DemoInterface1 extends DemoInterface {

}

//interface without default method
interface DemoInterface2 extends DemoInterface {

}

//implementation class code
class DemoClass implements DemoInterface1, DemoInterface2 {
    public static void main(String args[]) {
        DemoClass obj = new DemoClass();
//calling method
        obj.display();
    }
}





