package com.mikan.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();

        NiceCar myCar = new NiceCar();

        myCar.start();
        myCar.musicStart();
        myCar.stop();
        myCar.upgrade();
        myCar.start();
        myCar.musicStop();
        myCar.stop();



    }
}
