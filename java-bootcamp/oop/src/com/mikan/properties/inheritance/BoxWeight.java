package com.mikan.properties.inheritance;
public class BoxWeight extends Box  {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

//    @Override
    static void greeting(){
        System.out.println("Hey,I am in BoxWeight  class. Greetings!");
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l , double h, double w){
        super(l,h,w);
    }

    public BoxWeight(double l, double h ,double w,double weight){
        super(l,h,w); // what is this? --> calls the parent class constructor
//        parent class does not care about what the child class contains
//        used to initialised values present in the present class
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
       weight = other.weight;
    }

    public BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }
}
