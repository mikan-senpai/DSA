package com.mikan.properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c ;
        }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        obj.sum(3,4,5);
//        obj.sum(2,3,4,5);

        }

    }
