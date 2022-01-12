package com.algo;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[]  arr={4,5,1,2,3};
//        insertionSort(arr);
        selectionSortKunal(arr);
        System.out.println(Arrays.toString(arr));
    }

//=====================================================================================

    static void selectionSortKunal(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
//      find the max item in the remaining array and swap with its correct index

            int last= arr.length -i - 1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }

    static int getMaxIndex(int[] arr,int start, int end)
    {
        int max=start;
        for (int j = start; j <=end; j++) {
            if(arr[j]>arr[max])
            {
                max=j;
            }
        }
    return max;
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


//    ====================================================================================================================
    static void insertionSort(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int j ;
        for(int i= 0; i < arr.length; i ++)
        {
            for ( j = i ;j < arr.length-i;j++)
            {
                if(min>arr[j])
                {
                    min=Math.min(min,arr[j]);
                }
            }
            int temp = arr[i];
            arr[i]=min;
            arr[j-1]=temp;
        }
    }
}
