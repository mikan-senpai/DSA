package com.mikan.introduction;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10 ;
//  this is wrapper class      Integer num = new Integer(45);
        Integer num = 45; // now it is created as an object
        /* thi is actually object of type integer */
//        using primitivve as an object

        int x=10 ;
        int y=20 ;
        swap(x,y);
        System.out.println(x+" "+ y);

//      final is a keyword which can be used to prevent your content to be modified
//        NOTE=>  final variables have to be initialization
        final int BONUS= 3;
//      BONUS=4;  =====>>>>>>> cant modify it


//    =================================================================

        //working with the class A
        final A kunal =  new A("kunaal Kushwaha");
        kunal.name = "other name";  // i can do this while even using the final keyword
//      when a non-primitive is final ==>  do what you want with the object but you cannot resign it
//        kunal =  new A( "new object ");         //but i cannot do this


        A obj;
        // for less number of load on memory it's not going to call the garbage collector
        for (int i = 0; i < 10000; i++) {
            obj= new A("random name");
        }
//        obj.finalize();  ===>>>we can't really free  the memory manually




    }
    private static void swap(int x, int y) {
        int temp =x;
        x=y;
        y=temp;
    }
}


//what is we have a final inside a class
//lets see
class A{
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
//        System.out.println("object destroyed");

    }


//    finalize method demo
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");

        /**you have the finalize method in "class A"
         * similarly you have different finalize method iin different classes
         * so whenever any object the class A is freed from the memory this method
         * will be called*/

    }
}
