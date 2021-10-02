package com.company;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {

//        char[] arr= new char[5];
        String[] arr={"h","e","l","l","o"};
        int i =0;
        revarr(arr,arr.length,i);


    }

    static void revarr(String[] arr,int n , int i )
    {
        if(i>=n)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }


        String temp=arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
        revarr(arr,n-1,i+1);
    }






}
