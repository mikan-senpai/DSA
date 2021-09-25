package com.company;

public class minimum_maximum {
    public static void main(String[] args) {
        int[] arr= {1,4,3,-5,-4,8,6};
        int n= arr.length;
        System.out.println(maxi(arr,n));
        System.out.println(mini(arr,n));

        }
        static int maxi(int[] A,int n)
        {
            if(n==1)
            {
                return A[0];
            }
            return Math.max(A[n-1],maxi(A,n-1));
        }

        static int mini(int[] A,int n )
        {
            if(n==1)
            {
                return A[0];
            }
            return Math.min(A[n-1],mini(A,n-1));
        }





    }