//
//Geek-onacci Number
//
//        Geek created a random series and given a name geek-onacci series.
//        Given four integers A, B, C, N. A, B, C represents the first three numbers of geek-onacci series.
//        Find the Nth number of the series. The nth number of geek-onacci series is a sum of the last three
//        numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)
//
//        Input:
//        1. The first line of the input contains a single integer T denoting the number of test cases.
//        The description of T test cases follows.
//        2. The first line of each test case contains four space-separated integers A, B, C, and N.
//
//        Output: For each test case, print Nth geek-onacci number
//
//        Constraints:
//        1. 1 <= T <= 3
//        2. 1 <= A, B, C <= 100
//        3. 4 <= N <= 10
//
//        Example:
//        Input:
//        3
//        1 3 2 4
//        1 3 2 5
//        1 3 2 6
//
//        Output:
//        6
//        11
//        19
//





package easy;

import java.util.Arrays;

public class geek_onacci {
    public static void main(String[] args) {

        int ans = geeko(1, 3, 2, 6);
//        System.out.println(ans);
//        geeko_recur(1,3,2,5);

        int ans2=geeko_recur2(5,1,3,2);
        System.out.println(ans2);

    }


    static int geeko(int a, int b, int c, int n) {

        int[] arr = new int[n];


        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n - 1];
    }


    static void geeko_recur( int a, int b ,int c,int n)
    {
        int[] arr=new int[n];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int i=3;
        recursion(arr,n,i);
//        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n-1]);
    }
    static void recursion(int arr[],int n,int i)
    {
        if(i==n)
        {
            return ;
        }
        arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        recursion(arr,n, i+1);
    }



    static int geeko_recur2(int n,int a,int b , int c)
    {
        if (n==1)
        {
            return a;
        }
        if(n==2 )
        {
            return b;
        }
        if(n == 3)
        {
            return c;
        }
        int ans= geeko_recur2(n-1,a,b,c) + geeko_recur2(n-2,a,b,c)+geeko_recur2(n-3,a,b,c);
        return ans;
    }
}
