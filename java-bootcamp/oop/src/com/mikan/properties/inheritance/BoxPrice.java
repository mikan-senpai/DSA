package com.mikan.properties.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost= -1;
    }


    BoxPrice(BoxPrice old){
        super(old);
        this.cost = old.cost;
    }


    BoxPrice(double l , double h, double w, double weight , double cost){
        super(l,h,w,weight);
        this.cost= cost;
    }

    BoxPrice(double side, double weight , double cost){
        super(side,weight);
        this.cost = cost;

    }


}
