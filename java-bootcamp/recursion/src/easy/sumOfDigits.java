package easy;

public class sumOfDigits {
    public static void main(String[] args) {
        int ans=sumOfDigit(1342);
        int ans1=prod(55);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int sumOfDigit(int n )
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }

    static int prod(int n )
    {
        if((n%10)== n)
        {
            return n;
        }
        return (n%10) * prod(n/10);
    }




}
