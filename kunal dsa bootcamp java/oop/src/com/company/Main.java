 package com.company;


public class Main {

    public static void main(String[] args) {

    //teacher asks you to create a datatype which stores 5 roll numbers

    int[] numbers = new int [5];

    //teacher asks yo to create a datatype which store 5 names of the students
    String[] names = new String[5];


    //teacher asks yo to create a datatype which stores data of 5 students : {roll no,name,marks}

//  you created->
    int[] rno = new int [5];
    String[] name = new String[5];
    float[] marks = new float[5];
//  in above the data is separate but we wanted every single element should hold     these three data : {roll no,name,marks}. this is where classes comes in

//  what is a class? ==> A class is a named grouped of properties and function by       convention a name of a class starts with a capital letter


//      create you own datatype

        Student[] student = new Student[5];  // every single item in this array should contain these three data : {roll no,name,marks}

//        conclusion -> you can create your own datatype using classes


//          create one student first

        Student kunal;




    }


    //create a class
    class Student{
        int[] rno = new int [5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
//    a class is like a logical construct (template)





}
