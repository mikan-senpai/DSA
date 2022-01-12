package easy;

import java.util.ArrayList;

public class findElement {
    public static void main(String[] args) {
        int[] arr={3,99,2,144,43,2,99,99};
        int ans=find(arr,99,0);
        int ans1=findlast(arr,99,arr.length-1);
        ArrayList<Integer> ans2= findAllElements(arr,99,0, new ArrayList<>());
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);

    }

    static int find(int[] arr,int target ,int index)
    {
        if(index == arr.length)
        {
            return -1;
        }

        if(arr[index] == target)
        {
            return index;
        }
        return find(arr,target,index+1);
    }
    static int findlast(int[] arr,int target ,int index)
    {
        if(index == -1)
        {
            return -1;
        }

        if(arr[index] == target)
        {
            return index;
        }
        return find(arr,target,index-1);
    }
    static ArrayList findAllElements(int[] arr, int target , int index,ArrayList<Integer> list)
    {
        if(index == arr.length)
        {
            return list;
        }

        if(arr[index] == target)
        {
            list.add(index);
        }
        return findAllElements(arr,target,index+1,list);
    }



}
