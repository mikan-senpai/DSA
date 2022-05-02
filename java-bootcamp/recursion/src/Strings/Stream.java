package Strings;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        skip("","baacdat");
        String str=skip2("gaaksfoargaaks");
        System.out.println(str);
        System.out.println(skipApple("heyAppApple"));
    }
    static void skip(String p,String up)    //here p iis the processed string and up is the original string
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch == 'a')
        {
            skip(p,up.substring(1));
        }else {
            skip(p+ch , up.substring(1));
        }
    }
    static String skip2(String s)    //here p is the processed string and up is the original string
    {
        if(s.isEmpty())
        {
            return "";
        }

        char ch=s.charAt(0);
        if(ch == 'a')
        {
            return skip2(s.substring(1));
        }else {
            return ch + skip2(s.substring(1));
        }
    }

    static String skipApple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith("App") && !s.startsWith("Apple")) {
            return skipApple(s.substring(3));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
