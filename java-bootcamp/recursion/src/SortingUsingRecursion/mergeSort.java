package SortingUsingRecursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};
//        System.out.println(Arrays.toString(mergeSort(arr)));
//        int arr1[]={9,8,7,6,5,4,3};
        mergeSortinPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
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

    static void mergeSortinPlace(int[] arr,int s,int e)
    {
        if(e - s == 1) {
            return;
        }
        int mid= (s+e)/2;

        mergeSortinPlace(arr,s,mid);
        mergeSortinPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr,int s,int m,int e)
    {
        int mix[]= new int[e-s];

        int i=s;
        int j=m;
        int k=0;


        while( i < m && j < e )
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //coping the rst of the array

        while( i < m )
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
//      coping the array mix to the original array
        for (int l = 0 ; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
