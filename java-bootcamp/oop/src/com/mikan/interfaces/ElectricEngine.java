package com.mikan.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerating");
    }
}
