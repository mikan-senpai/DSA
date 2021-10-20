package intro;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int arr[]={9,7,6,5,4,112,44};
        iterativeSort(arr);


    }

    static void iterativeSort(int[] arr)
    {
        int temp;
        int j = 0 ;
        for (int i = 1; i < arr.length; i++) {
            j=i-1;
            temp=arr[i];

            while( j >= 0 && arr[j]>temp )
            {
                    arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=temp;
            }
        System.out.println(Arrays.toString(arr));

    }


    }



