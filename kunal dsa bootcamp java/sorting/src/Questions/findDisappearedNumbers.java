package Questions;

import java.util.ArrayList;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);

    }

    static ArrayList<Integer> list =new ArrayList<>();
    public static void findDisappearedNumbers(int[] nums) {
        int i= 0;

        while (i < nums.length)
        {
            int correctIndex=nums[i]-1;

            if(nums[i] != nums[correctIndex])
            {
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        //seaching the index from the  array
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1)
            {
                list.add(index+1);
            }

        }
        System.out.println(list);
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }



}