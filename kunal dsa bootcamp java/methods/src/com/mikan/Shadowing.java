package com.mikan;

public class Shadowing {
    static int x=20;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//20
        int x; //the class variable st line 4 is shadowed by this variable
            x=40;
        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}
                                                                                                     package com.mikan;

public class Shadowing {
    static int x=20;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//20
        int x; //the class variable st line 4 is shadowed by this variable
            x=40;
        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}
