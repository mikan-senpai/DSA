package easy;

public class sortArrayCheck {
    public static void main(String[] args) {
        int[] arr={ 10, 20,30 ,40 ,50, 60, 70, 77 , 90, 100};
        System.out.println(sortCheck(arr,arr.length-1));
        System.out.println(sortCheckKunal(arr,arr.length-1));
    }
    static boolean sortCheck(int[] arr,int n)
    {
        if(n==0)
        {
            return true;
        }
        if(arr[n] < arr[n-1])
        {
            return false;
        }

            return sortCheck(arr,n-1);

    }
    static boolean sortCheckKunal(int[] arr,int index)
    {
        //base condition

        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sortCheckKunal(arr,index+1) ;


    }
}
