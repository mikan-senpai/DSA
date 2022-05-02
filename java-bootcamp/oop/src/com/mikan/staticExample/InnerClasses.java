package com.mikan.staticExample;

/**
 *  inner classes -> class inside a class
 *  inner class is always static-> because the out
 *
 * /
/*static*/
//
public class InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

//        @Override
        public String toString() {
            return name;
        }
    }

    // main of the outside class
    public static void main(String[] args) {
        Test a = new Test("mikan");
        Test b = new Test("kratos");
        System.out.println(a.name);
        System.out.println(b.name);
        //        this will give output
//                              ->mikan
//                              ->kratos

        System.out.println(a);
        System.out.println(b);
//it will give me like this when we dont have a toString() -> the default toString() was called                  ->com.mikan.staticExample.InnerClasses$Test@5acf9800
//                                                                                                               ->com.mikan.staticExample.InnerClasses$Test@4617c264




    }

}

//  outside class cannot be static

//static class a{
//
//}



//
//
//class Testing{
//    static String name;
//
//    public Testing(String name) {
//        this.name = name;
//    }
//}
//public class InnerClasses {
//    public static void main(String[] args) {
//        Testing obj     = new Testing("mikan");
//        Testing obj1    = new Testing("kratos");
//        Testing obj2    = new Testing("sasuke");
//        System.out.println(obj.name);
//        System.out.println(obj1.name);
//        System.out.println(obj2.name);
//
//
//        output->sasuke
//                sasuke
//                sasuke
//    }
//
//}






