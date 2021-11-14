package Questions;

import org.w3c.dom.ls.LSOutput;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end = arr.length-1;
        int mid;
        while(start<end)
        {
            mid=start + (end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                //you are in the dec part of the array
                // this maybe the ans but look at the left
                // this is why end != mid-1
                end=mid;
            }
            else
            {
                //you are in the asc part of the array
                start=mid+1;  // because we know that mid+1>mid element
            }
        }
        // in the end, start == end annd pointing to the largest number because of the 2
        return start;

    }
}
