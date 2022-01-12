 package com.mikan;


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

        Student[] students = new Student[5];  // every single item in this array should contain these three data : {roll no,name,marks}

//        conclusion -> you can create your own datatype using classes


     

    //  just declaring
//        Student kunal;
//        System.out.println(Arrays.toString(students ));

        //creating object form student class
        Student kunal = new Student(13,"kunal kushwaha",78 );
//this Student() is a constructor special type of function


//        System.out.println(kunal);


        //accessing the roll number right now
//        kunal.rno=14;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks=88.5f;
//        kunal.greeting();

        //making another object  -> student2
        Student mikan = new Student();
        mikan.greeting();

        kunal.changeName("shoe lover");
        System.out.println(kunal.name);
        kunal.greeting();

        Student random= new Student(kunal);
        System.out.println(random.marks);

        

//      creating a copy of the refernce variable
        Student one = new Student();
        Student two = one;
        // now one and two are pointing to the same object
        // so if i change the object from one ,, two can also see the change  
        
        one.name =" something something"; 
        System.out.println(two.name);
        
    }
}




 //create a class
 class Student{
     int rno;
     String name;
     float marks;
     //creating a method inside the class
     void greeting(){
         System.out.println("Hi!My name is "+ name);
     }
     void changeName(String newName){
         name = newName;
     }
     //we need a way to add the values of the above
     // properties object by object
     // we need one word to access every object
//     Student(){
//         this.rno = 13;
//         this.name="kunal kushawha";
//         this.marks=81.92f;
//     }
//     ====================================================

     Student( ){
//     this is how you call a constructor from another constructor
//     =>   internally: new Student(130,"default person ",100)

        this(130,"default person ",100);
     }

     Student(int rno , String name, float marks){
         this.rno = rno;
         this.name= name;
         this.marks= marks;
     }
//     creating another constructor that takes value from another object
     Student (Student other){
         this.rno= other.rno;
         this.name=other.name;
         this.marks=other.marks;
     }
 }
//    a class is like a logical construct (template)




