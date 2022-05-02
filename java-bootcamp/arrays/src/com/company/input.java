package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0] = 23;
        arr[1] = 23;
        arr[2] = 23;
        arr[3] = 23;
        arr[4] = 23;
//        print one number
//        System.out.println(arr[3]);

        Scanner in=new Scanner(System.in);  //thi is just a class for getting the input from teh console
//        input using for loops
        for (int i=0; i< arr.length;i++)
        {
//            getting input in the array
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));  //best way to print
//        this will proint as a string


//        enhance for loop
// for i in arr priint all elements in i
        for (int i : arr)
        {
            System.out.print(i +" ");
        }
        //    taking a input of an object
        String[] str= new String[5];
        for (int i = 0;i < str.length ; i ++)
        {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));















    }
}
