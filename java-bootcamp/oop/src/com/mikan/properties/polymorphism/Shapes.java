package com.mikan.properties.polymorphism;

public class Shapes {
    
    void area(){
        System.out.println(" I am in shapes");
    }
}



// final void area(){
//     System.out.println(" I am in shapes");
// }
/**
 * you cannot override a method that has final in it 
 * ->   cause methods like thai that are declared final can somehow 
 *      provide a performace enhacement
 *      becauuse the compiler is free to inline the calls because 
 *      the compiler will know these methods will not be overrriden 
 * 
 * 
 *      so when a small final method is called , java compiler can
 *      copy the byte code directly from complile code from the calling ,method
 *      HENCE eliminating the overhead assosiated with this method called like which one to 
 *      acutally resolve 
 * 
 *      therefore thhat extra step is gone  
 */