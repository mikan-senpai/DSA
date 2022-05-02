public class seachin2D {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length - 1;

        for (int row = 0; row <= n; row++) {
            if (search(matrix, row, target)) {
                return true;
            }
        }
        return false;
    }

    static boolean search(int[][] matrix, int row, int target) {
        int s = 0;
        int e = matrix[row].length - 1;
        int mid = s - (e - s) / 2;

        if (target > matrix[row][mid]) {
            s = mid + 1;
        } else if (target < matrix[row][mid]) {
            e = mid - 1;
        } else {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 20, 30, 34, 60 } };
        int target = 20;

        searchMatrix(matrix, target);
    }

}