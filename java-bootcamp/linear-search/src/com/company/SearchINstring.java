package com.company;

public class SearchINstring {
    public static void main(String[] args) {
        String name=" a peacefull soul";
        char target  ='u';
        System.out.println(search(name,target));
        System.out.println(name.toCharArray());


    }
    static boolean search(String str,char target)
    {
        for (int i = 0 ; i < str.length();i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }



        if(str.length()==0)
            return false;


        return false;
    }
}
