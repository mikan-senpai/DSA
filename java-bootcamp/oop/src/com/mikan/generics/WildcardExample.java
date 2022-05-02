package com.mikan.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
//here T should be a  number or its sublclasses


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;  // also working as an index value

    public WildcardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //do something
        // here you can only pass the number type
//        public void getList(List<Number> list){
        // but if you want to pass subclasses of the number type here then
        //do this
        //->     public void getList(List<? extends Number> list){
        // now you can use number ,integer ,  float or whatever
        // this is wildcard
    }

    public void add(T num ){
        if(isFull()){
            resize();
        }
        data[size++] = num ; 
    }

    private boolean isFull() {

        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;  // reference variable data will be pointing to the object the temp is pointing to
    }


    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }


    public T get(int index){
        return (T)data[index];
    }

    public int size (){
        return size;
    }

    public void set(int index , T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        functions that arraylist provides
//        list.add(12);
//        list.remove(12);
//        list.get(1);
//        list.set(1,211314);
//        list.size();
//        list.isEmpty();


//        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);

//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);


//    ================================================

        WildcardExample<Integer> list3= new WildcardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);





    }
}
