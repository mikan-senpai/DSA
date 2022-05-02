package backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };



        if(solve(board)){
            display(board);
        }else{
            System.out.println("cannot solve");
        }
        System.out.println(solve(board));
    }



    static boolean solve(int [][] board ){
        int n = board.length;
        int row =-1;
        int col =-1;
//      this is how we are replacing r,c from the arguments

        boolean emptyLeft = true;
//        finding the empty space in the row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( board[i][j] == 0) {// this means I have found an empty item
                    row = i;
                    col = j;
                    emptyLeft = false;  // means no empty places are left
                    break;
                }
            }
//            when you have traversed the entire row
//                    if you find some empty element in the row then break
            if (emptyLeft == false){
                break;
            }
        }

        if (emptyLeft == true){
            return true;
            //sudoku is solved => { reason : if we did not find any item that is empty , that means the sudoku is solved }
        }


        //now we put the answer using backtracking

        for (int number = 1; number <=9 ; number++) {
            if (isSafe(board,row,col,number)){
                board[row][col] = number;
                if (solve(board)){
                    return true;
                    //found the answer
                }else {
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
        //sudoku cannot be solved
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row ){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    //isSafe is checking is the current cell has any collision or not
    static boolean isSafe(int[][] board,int row,int col , int num){
        //checking the row
        for(int i = 0 ; i < board.length;i++) {
            //check the number is already in the row or not
            if (board[row][col] == num) {
                return false;
            }
        }
        //checking the column
        for (int[] element : board) {
            //check the number is already in the row or not
            //same column but different rows
            if (element[col] == num){
                return false;
            }
        }
        //checking the box
        int sqrt = (int)(Math.sqrt(board.length));
        int RowStart = row - (row % sqrt);
        int ColStart = col - (col % sqrt);
        for (int r = RowStart; r < RowStart+sqrt ; r++) {
            for (int c = ColStart; c < ColStart+sqrt ; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
       return true;
    }
}
