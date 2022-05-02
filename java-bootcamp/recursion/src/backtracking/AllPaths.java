package backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean board[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath(" ",board,0,0);


        int [][]path= new int[board.length][board[0].length];
        AllPath("",board,0,0,path,1);

    }


    static void allPath(String p,boolean maze[][], int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }

//              (maze[row][col] == false) this  is also equal to (!maze[row][col])
        if(!maze[row][col]){
            return;
        }

//        now if it is not false that means -> i am considering this block in my path
        maze[row][col]=false;


        if (row < maze.length-1) {
            allPath(p + "D", maze,row + 1, col);
        }
        if (col <maze[0].length-1) {
            allPath(p + "R", maze,row, col + 1);
        }
        if (col > 0 ){
            allPath(p+ "L",maze,row,col-1);
        }
        if (row > 0 ){
            allPath(p+ "U",maze,row-1,col);
        }

//          this line is where the function will be over
//            so before this function gets removed , also remove the changes that were made by that function

        maze[row][col]=true;
    }


// all  the path are considered 
    static void AllPath(String p, boolean[][] maze, int row,int col, int[][] path, int step){

        if(row == maze.length-1 && col == maze[0].length-1){
            for (int[] arr : path ) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        path[row][col]=step;
        if (row < maze.length-1) {
            AllPath(p + "D", maze,row + 1, col,path,step+1);
        }
        if (col <maze[0].length-1) {
            AllPath(p + "R", maze,row, col + 1,path,step+1);
        }
        if (col > 0 ){
            AllPath(p+ "L",maze,row,col-1,path,step+1);
        }
        if (row > 0 ){
            AllPath(p+ "U",maze,row-1,col,path,step+1);
        }

        maze[row][col]= true;
        path[row][col]=0;
    }











}
