package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int [] arr2={1,2,2};
        List<List<Integer>> ans = subset(arr);      //[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
//        System.out.println(ans);
//        System.out.println(subsetDuplicate(arr2));      //[[], [1], [2], [1, 2], [2, 2], [1, 2, 2]]
        subsetREC(arr);
    }


//    ========================================================================================================
//    [1,2,3] = > [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]] --iterative approach
//    **********************************************************************************************************
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer= new ArrayList<>();   //outer list created
        outer.add(new ArrayList<>());                  //added the empty arraylist

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
//=====================================================================================================
    //    [1,2,3] = > [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]] --recursive  approach
//    ******************************************************************************************
//    exp
    static  void subsetREC(int[] up)
    {
        int[] p ={};
        helper(Arrays.toString(p),Arrays.toString(up));
    }
    static void helper(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch= up.charAt(0);
        helper(p + ch , up.substring(1));
        helper(p , up.substring(1));
    }


//=======================================================================================================
//    [1,2,2] => [[], [1], [2], [1, 2], [2, 2], [1, 2, 2]]  ----iterative approach
//    **********************************************************************************************************



    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length ; i++ ) {

            start=0;
            // if the current and previous element are same then (start=end+1);
            if(i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end= outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
        }
        return outer;
    }
    

}
