package com.company;

public class evenNOofDigits {
    public static void main(String[] args) {
    int[] nums={12,345,2,6,7869};
        System.out.println(findnumbers(nums));
        System.out.println(digits(-12131));
        System.out.println(digit2(713));
    }

    static int findnumbers(int[] nums)
    {
        int count =0;
        for (int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num)
    {
        int numofdigts= digits(num);
//        if(numofdigts % 2 ==0)
//        {
//            return true;
//        }
//        return false;


        return numofdigts % 2 == 0;

    }

//count number of digits in an number
    static int  digits(int n)
    {
        if(n<0)
        {
            n=n*-1;
        }
        if(n==0)
        {
            return 1;
        }
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

//    optimized aproch of geting the number of digitsdd in a anumebr
    static int digit2(int num)
    {
        if(num<0)
        {
            num*=-1;
        }
        return (int)Math.log10(num)+1; //for any decimal number
//        return (int)Math.log(num)+1;
    }


}

