// Search a 2D Matrix
// Medium
//
// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//     Integers in each row are sorted from left to right.
//     The first integer of each row is greater than the last integer of the previous row.
//
//
//
// Example 1:
//
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
//
// Example 2:
//
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

package Questions;

public class searchInMatrix_striver {


    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int  target = 32;


        System.out.println(binarySearchmatrix(matrix,target));
    }

    static boolean binarySearchmatrix(int[][] matrix, int target)
    {

        int n=matrix.length;
        int m=matrix[0].length;

        int start=0;
        int end= (n*m)-1;
        int mid =0;
        while(start<=end)
        {

            mid=start + (end-start)/2;

            if(matrix[mid/m][mid%m]== target )
            {
                return true ;
            }
            else if (matrix[mid/m][mid%m] > target) {
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }



        return false;
    }

}
