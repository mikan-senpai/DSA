package SortingUsingRecursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int middle= arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,middle));
        int[] right= mergeSort(Arrays.copyOfRange(arr,middle,arr.length));

        return merge(right,left);

    }

    static int[] merge(int[] first,int[] second)
    {
        int[] mix= new int[first.length + second.length ];
        int i=0;
        int j=0;
        int k=0;

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]= second[j];
                j++;
            }
            k++;
        }


//        coping the rest of the array
        while(i< first.length)

        {
            mix[k]=first[i];
            i++;k++;
        }
        while(j<second.length)
        {
            mix[k]=second[j];
            j++;k++;
        }
        return mix;
    }

}
