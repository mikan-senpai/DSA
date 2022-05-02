package Questions;

import java.util.ArrayList;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
//        System.out.println(findDuplicates(arr));
        findDuplicates(arr);
    }


    public static void findDuplicates(int[] nums) {
        int i= 0;
        ArrayList<Integer> list= new ArrayList<>();
        while (i< nums.length)
        {
            int correctIndex= nums[i]-1;
            if(nums[i] != i+1)
            {
                if(nums[i] != nums[correctIndex])
                {
                    swap(nums,i ,correctIndex);

                }else {
                        i++;
                }
            }
            else{
                i++;
            }
        }

//        searching for the element
        for (int index = 0; index < nums.length ; index++) {
            if(nums[index] != index+1)
            {
                list.add(nums[index]);
            }

        }









//        return list;
        System.out.println(list);

    }

    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }


}
