package com.company;

public class Main {

    public static void main(String[] args) {
        //actually this is the scoping function
        int a=50;
        int b = 10;
        random(a);
        System.out.println(a);
	// write your code here
    }
    static  void random(int a){
        a=0;
        System.out.println(a);
    }
}
