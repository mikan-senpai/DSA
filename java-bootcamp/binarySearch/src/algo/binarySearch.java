package algo;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr={-18,-14,-12,0,2,3,4,12,18,19,45,89};
        int target=113;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    static int binarysearch(int[] arr,int target )
    {
        int start=0;
        int end= arr.length-1;
//        int index=-1;

        while(start<=end)
        {

//      finding the middle element
//      int middle= (start + end )/2;
//      this is the better way to find miidle element
            int middle = start + (end-start) /   2;

            if(arr[middle]<target)
            {
                start=middle+1;
            }
            else if(arr[middle]>target)
            {
                end=middle-1;
            }
            else
            {
                return middle;
            }
        }

        return -1;


    }



}
