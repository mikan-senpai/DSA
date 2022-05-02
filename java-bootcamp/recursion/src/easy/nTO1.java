package easy;

public class nTO1 {

    public static void main(String[] args) {
        funboth(5);
    }

    static void fun(int n ){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);

    }
    static void funrev(int n ){
        if(n==0)
        {
            return;
        }
//        System.out.println(n);
        funrev(n-1);
        System.out.println(n);

    }
    static void funboth(int n ){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);

    }


    static void concept(int n )
    {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        concept(--n);
//        concept(n--);-> this will actually cause stack overflow
        }
    }
