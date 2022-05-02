package com.mikan.generics.comparing;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
        //if diff == 0: means both equal
        //if diff < 0:  means o is bigger else o is smaller

    }
}
