package backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
//        queens(board, 0);
        knight(board,0,0, 4);

    }

    static void knight(boolean[][] board, int row,int col,int knights){
//      base condition 1
        if(knights == 0 ){
            display(board);
            System.out.println();
            return;
        }
//      base condition 2
        if (row == board.length-1 && col==board.length){
            return ;
        }
        int count=0;

        // end of the current column
        if (col == board.length){
            knight(board,row+1,0,knights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            if (col < board[0].length){
                knight(board,  row,col+1,knights-1);
            }
            board[row][col]=false;
        }
        //if the any case the current cell is not safe for the knight just move ahead and check again for that cell
        knight(board,row,col+1,knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //for vertical left
        if (isValid(board,row-2,col-1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
//        for vertical right
        if (isValid(board,row-2,col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }
//        for vertical low left
        if (isValid(board,row-1,col-2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
//        for vertical low right
        if (isValid(board,row-1,col+2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        //if none of the above checks are true then teh current cell is safe to place our knight
        return true;
    }

//    out of bound exception check for isSafe condition
    static boolean isValid(boolean[][] board, int row, int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }



    private static void display(boolean[][] board) {
        for(boolean [] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K");
                }else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }


}
