package easy;

public class sumOfNaturalNums{
    public static void main(String[] args) {
    int ans=sumNatural(6);
        System.out.println(ans);
    }
    static int sumNatural(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int ans = n + sumNatural(n-1);
        return ans;
    }
}
