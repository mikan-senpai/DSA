package Questions;

import java.util.Arrays;

public class firstAndLastPosElement {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = new int[2];
        ans = searchRange(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
//        check for the first occurrence of target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1)
        {
            ans[1]=search(nums,target,false);
        }
        return ans;
    }

    //    this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            //here we use the algo of bs
            //finding the middle
            mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
//                potential ans has been found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

