package com.company;

import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr)
    {
        arr[0]=99;
    }
}
