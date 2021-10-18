package com.company;

public class orderAgnosticBS {

    public static void main(String[] args) {
        int target =99;
        int[] arr={1,2,3,4,5,5,6,99};

        int[] arr2={99,88,77,66,55,44,33,22}; 


        int ans=orderAgnosticBS(arr2,target);
        System.out.println(ans);
    }



    static int orderAgnosticBS(int[] arr,int target)
    {
        int start=0;
        int end= arr.length-1;
//        int index=-1;

//        find whether the array is ascending or decsending

        boolean isAsc=arr[start]  < arr[end];
//        this is the elaborate process of the above expression
//        if(arr[start]  < arr[end]) {
//            isAsc = true;
//        }else
//        {
//            isAsc=false;
//        }

        while(start<=end)
        {

//      finding the middle element
//      int middle= (start + end )/2;
//      this is the better way to find miidle element
            int middle = start + (end-start) /   2;

            if(arr[middle] == target )
            {
                return middle;
            }

            if(isAsc)
            {
                if(arr[middle]<target)
                {
                    start=middle+1;
                }
                else
                {
                    end=middle-1;
                }
            }
            else
            {
                if(arr[middle]>target)
                {
                    start=middle+1;
                }
                else
                {
                    end=middle-1;
                }
            }




        }

        return -1;
    }


}
