package SortingUsingRecursion;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
//    QuickSort(arr,0,arr.length-1);
//    System.out.println(Arrays.toString(arr));

//   internal function to sort the arrays
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));

    }


    static void QuickSort(int [] nums, int low, int high)
    {

        if(low>=high)
        {
            return;
        }
        int start = low;
        int end = high;
        int middle = (start+end)/2;
        int pivot = nums[middle];

        while (start<= end)
        {
            // also a reason why if its already sorted it will not swap

            while(nums[start] < pivot)
            {
                start ++;
            }
            while(nums[end] >pivot)
            {
                end --;
            }
            //violated
            if(start <= end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        //pivot in position now, its time for the rest of the array

        QuickSort(nums,low,end);
        QuickSort(nums,start,high);
    }
}
