public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr = {3,5,7,8,9,19,56,78,90,123,145,158,198,200};
        int target = 56;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        int res = 0;

        while(start <= end){
            if(arr[end] > target){
               res = binarySearch(arr, target, start, end);
            }
            else{
                int temp = end + 1;
                end  = end + (end - start + 1) * 2;
                start = temp;
            }
        }
        return res;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr = {3,5,7,8,9,19,56,78,90,123,145,158,198,200};
        int target = 56;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        int res = 0;

        while(start <= end){
            if(arr[end] > target){
               res = binarySearch(arr, target, start, end);
            }
            else{
                int temp = end + 1;
                end  = end + (end - start + 1) * 2;
                start = temp;
            }
        }
        return res;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}