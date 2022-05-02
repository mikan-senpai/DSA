package easy;
//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
public class DuplicatesFromString {

    public static void main(String[] args) {
        String s="aabccd";
        String s1="geeksfoorgeeks";
        System.out.println(removeDuplicate(s));
        System.out.println(removeDuplicate(s1));
    }
     static String removeDuplicate(String s)
     {
         if(s.length()<=1)
         {
             return s;
         }
         if(s.charAt(0)==s.charAt(1))
         {
             return removeDuplicate (s.substring(1));
         }

             return s.charAt(0)+removeDuplicate(s.substring(1));




     }






}