package com.mikan.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;  // also working as an index value

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
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

        CustomGenArrayList<Integer> list3= new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);




    }
}
