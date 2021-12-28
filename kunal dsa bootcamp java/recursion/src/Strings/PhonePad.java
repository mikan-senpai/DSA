    //17. Letter Combinations of a Phone Number
//        Medium
//
//        8154
//
//        605
//
//        Add to List
//
//        Share
//        Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//====================================================================================================================================
//        Example 1:
//
//        Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//        Example 2:
//
//        Input: digits = ""
//        Output: []
//        Example 3:
//
//        Input: digits = "2"
//        Output: ["a","b","c"]
//*************************************************************************************************************************************

package Strings;


    import java.util.ArrayList;

    public class PhonePad {
    public static void main(String[] args) {
        String str="12";
//        pad("",str);
//
//        System.out.println(padRet("","12"));
//
//        System.out.println(padCount("","12"));
//
        padreal("",str);
    }

    static void pad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //convert '0' to 0
        for (int index = (digit-1)*3; index < (digit*3); index++) {
                char ch = (char)('a' + index);
            pad(p+ch,up.substring(1));
        }
    }


//==using arraylist as return type
    static ArrayList<String> padRetLIST(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList ans= new ArrayList<>();
        int digit = up.charAt(0) - '0'; //convert '0' to 0

        for (int index = (digit-1)*3; index < (digit*3); index++) {
            char ch = (char)('a' + index);
            ans.addAll(padRetLIST(p+ch,up.substring(1)));
        }
        return ans;
    }

//    returning the count of the number of set

        static int padCount(String p,String up){
            if(up.isEmpty()){
                return 1;
            }

            int count=0;
            int digit=up.charAt(0) - '0';
            for (int index = (digit -1)*3;index < digit*3 ;index++ ) {
                char ch = (char)('a' + index );
                count= count + padCount(p+ch,up.substring(1));
            }
            return count;
        }

//=======================================================================
        static void padreal(String p,String up)
        {

            if(up.isEmpty())
            {
                System.out.println(p);
                return;
            }
            int digit = up.charAt(0) - '0'; //convert '0' to 0

            if(digit==1 && digit ==0){
                return;
            }
            if(digit <= 6 || digit == 8)
            {
            for (int index = (digit-2)*3; index < (digit*3); index++) {

                char ch = (char)('a' + index);
                padreal(p+ch,up.substring(1));
                }
            }
            if( digit == 7 ||digit ==9)
            {
                for (int index = (digit-2)*3; index < (digit+1)*3; index++) {
                    char ch = (char)('a' + index);
                    padreal(p+ch,up.substring(1));
                }
            }
            }



//            ==================================================================================================
//        raju
//
//        static ArrayList<String> padRet(String p, String up) {
//            if (up.isEmpty()) {
//                ArrayList<String> list = new ArrayList<>();
//                list.add(p);
//                return list;
//            }
//            int digit = up.charAt(0) - '0'; // this will convert '2' into 2
//
//            ArrayList<String> ans = new ArrayList<>();
//
//            if(digit<=1 || digit>9){
//                return ans;
//            }
//
//            if(digit<=6){
//                for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
//                    char ch = (char) ('a' + i);
//                    ans.addAll(padRet(p + ch, up.substring(1)));
//                }
//            }
//            else{
//                if(digit == 7){
//                    for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
//                        char ch = (char) ('a' + i);
//                        ans.addAll(padRet(p + ch, up.substring(1)));
//                    }
//                }
//
//                else if(digit == 8){
//                    for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
//                        char ch = (char) ('a' + i);
//                        ans.addAll(padRet(p + ch, up.substring(1)));
//                    }
//                }
//                else{
//                    for(int i=((digit-2)3)+1;i<=((digit-1)3)+1;i++){
//                        char ch = (char)('a'+ i);
//                        ans.addAll(padRet(p + ch,up.substring(1)));
//                    }
//                }
//
//            }
//            return ans;
//        }
//




    }
