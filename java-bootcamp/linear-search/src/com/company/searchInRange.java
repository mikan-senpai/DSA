package com.company;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,23};
        int target =3;
        searchInRange(arr,target,1,4);
    }

    static void searchInRange(int[] arr, int target, int start, int end) {

        for (int i = start; i <=end; i++) {
            if (arr[i] == target) {
//                return i;
                System.out.println("element " + arr[i] + " found at index " + i);
//                return ;
            }


        }            return;



    }

}
