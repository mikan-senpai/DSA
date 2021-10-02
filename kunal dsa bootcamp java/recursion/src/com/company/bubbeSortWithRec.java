package com.company;

import java.util.Arrays;

public class bubbeSortWithRec {


    public static void main(String[] args) {
        int[] arr={5,1,4,8,2};
        bubbleSort(arr,arr.length);
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr,int n)
    {
        if(n==1)
        {
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }


}
