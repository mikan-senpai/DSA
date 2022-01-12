package easy;

public class countZero {
    public static void main(String[] args) {
        int n=1060202;
        int count=0;
        System.out.println(countZeros1(n,count));

    }

//    static int countZeros(int n ,int count) {
//        if (n == 0) {
//            return 1;
//        }
//        if ((n % 10) == 0) {
//            return countZeros(n / 10, count+1);
//        }
//        return countZeros   (n/10,count);
//    }
    static int countZeros1(int n , int count)
    {

        if(n==0)
        {
            return count;
        }
        if((n%10)==0) {
            return countZeros1(n / 10, count + 1);
        }
        return countZeros1(n/10,count);

    }





}
