package com.company;

public class palindromeString {

    public static void main(String[] args) {
	// write your code here
        String s="aqifhqa";
        System.out.println(ispalindrome(s));

    }

    static boolean ispalindrome(String s)
    {
        if(s==null || s.length() == 0)
        {
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            char a=s.charAt(start);
            char b=s.charAt(end);
            if(a==b)
            {
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }







}
