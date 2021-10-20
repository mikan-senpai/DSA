package Questions;

public class floorOfNumber {
    public static void main(String[] args) {
        int arr[]={};
        int target=0;
        floor(arr,target);
    }
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle;


        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return arr[middle];
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
//        if(arr[start]!=target)
//        {
//            System.out.println("no ceiling number present");
//            return 0;
//        }
            return arr[start];
        }
    }

