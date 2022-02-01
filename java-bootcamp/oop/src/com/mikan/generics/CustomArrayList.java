package com.mikan.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;  // also working as an index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num ){
        if(isFull()){
            resize();
        }
        data[size++] = num ; 
    }

    private boolean isFull() {

        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;  // reference variable data will be pointing to the object the temp is pointing to
    }


    public int remove(){
        int removed = data[--size];
        return removed;
    }


    public int get(int index){
        return data[index];
    }

    public int size (){
        return size;
    }

    public void set(int index , int value){
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


        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}
