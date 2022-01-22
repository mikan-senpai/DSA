package com.mikan.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();


//        Experimenting with something
        Square square1 = new Square();
        square1.area();


    }
}
