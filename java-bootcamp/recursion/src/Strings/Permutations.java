package Strings;

import java.util.ArrayList;
import java.util.List;


public class Permutations {
    public static void main(String[] args) {
//    permutation("","abc");
//        System.out.println(permutationList("","abc"));
        System.out.println(permutationsCount("","abcdefg"));
    }


    static void permutation(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch= up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0 , i);
            String second= p.substring(i , p.length());
            permutation(first + ch + second , up.substring(1));
        }
    }



//    using arraylist
    static List<String> permutationList(String p, String up) {
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
//        local to this call
        List ans=new ArrayList();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0 , i);
            String second= p.substring(i , p.length());
            ans.addAll(permutationList(first + ch + second , up.substring(1)));
        }
        return ans;
    }

    static int count=0;

    //count the number of the permutations
    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count=0;
        for (int i = 0; i <=p.length(); i++) {
            String first = p.substring(0,i);
            String second =p.substring(i,p.length());
            count= count + permutationsCount(first + ch + second,up.substring(1));
        }
        return count;
    }


}
