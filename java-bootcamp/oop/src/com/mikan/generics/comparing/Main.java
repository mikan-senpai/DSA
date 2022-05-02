package com.mikan.generics.comparing;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student mikan = new Student(131, 44.3f);
        Student kratos = new Student(111, 90.3f);
        Student sasuke = new Student(123, 87.3f);
        Student smita = new Student(122, 88.3f);
        Student bebo = new Student(130, 91.3f);


//        create an array list of students
        Student[] list = {mikan,kratos,sasuke,smita,bebo};
        System.out.println(Arrays.toString(list ) );
        Arrays.sort(list);
        System.out.println(Arrays.toString(list ) );


//        you can also use it with the
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list ) );


//you can write the above code using very simple way using lambda expressions
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(list);




//        if (mikan < kratos){
//            System.out.println("kratos has more marks");
//        }
//
//        if (mikan.compareTo(kratos)){
//
//        }

        if (mikan.compareTo(kratos) < 0 );
        {
            System.out.println("kratos has more marks");
        }

    }
}
