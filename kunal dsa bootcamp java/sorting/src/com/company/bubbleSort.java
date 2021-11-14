package com.company;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
	// write your code here
//        int[] arr={3,4,2,1,5};
        int[] arr={-22,0,99,-70,100};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }




    static void bubblesort(int[] arr)
    {

        boolean swapped;
        for(int i = 0 ; i <=arr.length-1;i++)
        {
            swapped=false;

//            for each step , max item will come att the respective index
            for (int j = 1; j <=arr.length-i-1 ; j++) {
//        swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }

            }

//            if you did not swapped for a particular value of i
//            then it means than the array is sorted hence stop the program
            if(!swapped)  //!false = true
            {
                break;
            }
        }
    }
}
