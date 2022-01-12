package easy;
public class powerOfNum {
    public static void main(String[] args) {
        System.out.println(powerofTwo(49));

    }


    static boolean powerofTwo(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n==0 || n%2!=0)
        {
            return false;
        }
        return powerofTwo(n/2);

    }
}
