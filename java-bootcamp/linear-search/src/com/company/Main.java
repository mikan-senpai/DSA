package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={12,34,5,3,542,25,52,535,989};
        int target=52;
//        int ans=linearsearch(nums,target);
//        System.out.println(ans);
            linearsearch(nums,target);
    }

    static void linearsearch(int[] arr,int target)
    {
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
//                return i;
                System.out.println("element "+arr[i] +" found at index " + i );
                return;
            }


        }

//        thsi will be execute if target is not present oif teh array
//        return -1;
        System.out.println("target not found");
    }

}
