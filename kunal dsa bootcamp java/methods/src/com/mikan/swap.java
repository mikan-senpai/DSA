package com.mikan;

public class swap{
    public static void main(String[] args) {
        int x=10;
        int y =20;

        //swaping two numbers
//        int temp=x;
//        x=y;
//        y=temp;
        swap(x,y);
        System.out.println(x+" " +y);
        String name="mikan";
        changename(name);
        System.out.println(name);
    }

    private static void changenampackage com.mikan;

public class swap{
    public static void main(String[] args) {
        int x=10;
        int y =20;

        //swaping two numbers
//        int temp=x;
//        x=y;
//        y=temp;
        swap(x,y);
        System.out.println(x+" " +y);
        String name="mikan";
        changename(name);
        System.out.println(name);
    }

    private static void changename(String name) {
        name="rahul";
    }

    static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;

    }
}
