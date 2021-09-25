package com.company;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int target=90;
        int s=0,e= arr.length;
        search(arr, target,s,e);
    }


    static int search(int[] arr, int target,int s, int e) {

        if(s>e)
        {
            System.out.println("target not present");
            return 0;
        }
        int m = (s + e) / 2;
        if (arr[m] == target)
        {
            System.out.println("key found at ->" + (m+1));
            return 0;
        }
        if (arr[m] < target) {
            return search(arr, target, m + 1, e);
        }
        else
        {
            return search(arr, target, s, m-1);
        }
    }
}
