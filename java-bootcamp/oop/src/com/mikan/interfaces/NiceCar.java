package com.mikan.interfaces;

public class NiceCar {
    private Engine engine ;
    private CdPlayer music = new CdPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void upgrade(){
        this.engine = new ElectricEngine();
    }

    public void musicStart(){
        music.start();
    }

    public void musicStop(){
        music.stop();
    }

}
