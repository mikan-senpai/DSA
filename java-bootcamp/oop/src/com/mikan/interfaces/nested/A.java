package com.mikan.interfaces.nested;

public interface A {
    //NESTED INTERFACE
    public interface nestedInterface{
        boolean isODD(int num);
    }
}


class B implements A.nestedInterface{

    @Override
    public boolean isODD(int num) {
        return (num&1) == 1;
    }
}



class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isODD(13));
        System.out.println(obj.isODD(6));
        System.out.println(obj.isODD(0));
    }
}