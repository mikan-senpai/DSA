//Java String substring()
//        The Java String class substring() method returns a part of the string.
//
//        We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive, and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
//
//        There are two types of substring methods in Java string.
//
//
//        public String substring(int startIndex)  // type - 1
//        and
//        public String substring(int startIndex, int endIndex)  // type - 2
//        If we don't specify endIndex, the method will return all the characters from startIndex.
//
//        Parameters
//        startIndex : starting index is inclusive
//        endIndex : ending index is exclusive
//
//        Returns
//        specified string
//


package Test;

public class substringWorks {
    public static void main(String[] args) {
        String str= "mikan";
        System.out.println(str.substring(0,0));  //inclusive
        System.out.println(str.substring(0,1));  //exclusive
    }

}
