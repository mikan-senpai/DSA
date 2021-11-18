package com.algo;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {

        int[] arr={3,5,4,2,1};
//        cyclicsort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //kunal sort code
    static void sort(int[] arr)
    {
        int i=0;
        while (i<arr.length  )
        {
            int correctIndex=arr[i]-1;

            if(arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

    }

    static void cyclicsort(int[] arr)
    {

        int i=0;
        while (i<= arr.length)
        {
            if(arr[i] != (i-1))
            {
                swap(arr,i,arr[arr[i]-1]);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }




}
