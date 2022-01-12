package Questions;

public class missingNumber {
    public  void main(String[] args) {
        int[] arr= {3,0,1};
        int ans= missingNumber(arr);
    }
//    ================kunal code========================





    public int missingNumber(int[] arr)
    {
        int i=0;
        while (i<arr.length  )
        {

            if(arr[i] < arr.length && arr[i] != arr[arr[i]])
            {
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }
//        search for first missing numebr
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] != index)
            {
                return index;
            }

        }
        //case 2
        return arr.length;
    }








//    ===========================================



//
//
//
//    public static int missingNumbermikan(int[] nums) {
//
//        int N=nums.length;
//        int i = 0 ;
//
//        while(i<nums.length)
//        {
//            int correctIndex=nums[i];
//
//            if(nums[i] == N)
//            {
//                i++;
//            }
//            else if(nums[i] != nums[correctIndex]){
//                swap(nums,i,correctIndex);
//            }
//            else{
//                i++;
//            }
//        }
//
//
//        for (int j = 0; j < nums.length; j++) {
//            if(nums[i] != nums[nums[i]])
//            {
//                return i;
//            }
//
//        }
//
//    }
//



    static void swap(int[] arr,int first ,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
