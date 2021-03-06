package Questions;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,11,22,33};
        int target=34 ;

        int ans=ceiling(arr, target);
        System.out.println(ans);
    }



    static int ceiling(int[] arr, int target)
    {
        int start= 0 ;
        int end=arr.length-1;
        int middle;

        if(target > arr[arr.length-1])
        {
            return -1;
        }

        while(start<=end)
        {
            middle=start+(end-start)/2;
            if(arr[middle]==target)
            {
                return arr[middle];
            }
            else if(arr[middle]>target)
            {
                end=middle-1;
            }
            else {
                start = middle + 1;
            }
        }
//        if(arr[start]!=target)
//        {
//            System.out.println("no ceiling number present");
//            return 0;
//        }
        return arr[start];
    }

}
