package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
         String str="abc";
//         subseq("",str);
         subseq2("",str);
        System.out.println();
    }

    static void subseq(String p,String up){ //p => processed string    up=> unprocessed string
        if(up.isEmpty())
        {
            System.out.println("["+p+"]");
            return;
        }
        char ch = up.charAt(0);                     //first character
        subseq(p + ch,up.substring(1));         //take the character
        subseq(p,up.substring(1));                 //ignore the character

    }

//    putting inside an array list
    static ArrayList<String> subseq2(String p,String up){ //p => processed string    up=> unprocessed string
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);                     //first character
        ArrayList<String> left=subseq2(p + ch,up.substring(1));           //take the character
        ArrayList<String> right=subseq2(p,up.substring(1));                 //ignore the character

        left.addAll(right);
        return left;
    }
}
