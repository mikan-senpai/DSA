package com.mikan.properties.inheritance;

public class BoxColor extends BoxWeight{

    String color ;

    public BoxColor(String color) {
        this.color = color;
    }

    BoxColor(double weight , String color){
        super(weight);
        this.color = color;
    }

    BoxColor(double side, double weight , String color){
        super(side,weight);
        this.color = color;
    }


}
