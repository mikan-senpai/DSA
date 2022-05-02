package Test;

public class casting_converting {
    public static void main(String[] args) {

//1st method


        String str="12";
        int p = (int)str.charAt(0);  //typecasting the '1' into 1
        System.out.println(p);

        // Converting ch to it's int value
//        eg: chractor type '3'  ==> Integer type 3

        int ch=  str.charAt(0)-'0';
        System.out.println(ch);




//2nd method
        // Initializing a character(ch)
        char ch3 = '3';
        System.out.println("char value: " + ch);

        // Converting the Character to it's int value
        int a = Character.getNumericValue(ch);
        System.out.println("int value: " + a);



    }


}
