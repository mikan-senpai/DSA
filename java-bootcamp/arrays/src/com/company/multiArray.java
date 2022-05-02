package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
//        1 2 3
//        4 5 6
//        7 8 9

//        declaration of 2d arrays

//        int[][] arr= new int[3][3];

        Scanner in= new Scanner(System.in);
        int[][] arr2d={
                {1,23,34,4},    //1st index
                {4,5},          //1st index
                {1,2,3 }         //2nd index
        };
        System.out.println(Arrays.toString(arr2d));


//        for input of 2d array
        int arr[][]=new int[3][3];
        System.out.println(arr.length);   //this wil actually give me number of rows
        for(int row =0; row < arr.length; row++)   //give me number of the rows
        {
            //for every colnm in every row
            for (int col = 0 ; col < arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row=0;row< arr.length;row++)
        {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


//        actually you can replace the loop with something simple
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//    enhanced for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));

        }







    }




}
