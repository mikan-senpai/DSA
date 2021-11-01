package Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22};
        int target=1;
        int ans1=ans(arr,target);
        System.out.println(ans1);
    }
    static int ans(int[] arr,int target )
    {
        //first find the range
        //first starting with the box of size 2
        int start =0;
        int end=1;

//        condition for target to lie in the range
        while(target > arr[end])
        {
            int newStart= end +1;
//            double teh box value
//            end = previous end + size of box * 2
            end = end + (end - start + 1 ) * 2;

            start=newStart;

        }
        return binarysearch(arr,target , start ,end);


    }
    static int binarysearch(int[] arr,int target,int start ,int end )
    {

        while(start<=end)
        {

//      finding the middle element
//      int middle= (start + end )/2;
//      this is the better way to find miidle element
            int middle = start + (end-start) /   2;

            if(arr[middle] < target)
            {
                start=middle+1;
            }
            else if(arr[middle] > target)
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
