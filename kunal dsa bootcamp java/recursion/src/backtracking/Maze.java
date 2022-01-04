package backtracking;

import java.util.ArrayList;

public class Maze {
	public static void main(String[] args) {
		System.out.println(count(3, 3));
		path("", 3, 3);
		System.out.println(pathRet("",3,3));

		boolean board[][]={
				{true,true,true},
				{true,false,true},
				{true,true,true}
		};
		pathResistance(" ",board,0,0);
	}

	static int count(int row, int col) {
		if (row == 1 || col == 1) {
			return 1;
		}
		int left = count(row - 1, col);
		int right = count(row, col - 1);
		return left + right;
	}

//	now printing the path of the maze

	static void path(String p, int row, int col) {
		if (row == 1 && col == 1) {
			System.out.println(p);
			return;
		}
		if (row > 1) {
			path(p + "D", row - 1, col);
		}
		if (col > 1) {
			path(p + "R", row, col - 1);
		}
	}

	//		now adding return type as an arraylist
	static ArrayList<String> pathRet (String p,int row, int col){
		if (row == 1 && col == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		if (row > 1) {
			ans.addAll(pathRet(p + "D", row - 1, col));
		}
		if (col > 1) {
			ans.addAll(pathRet(p + "R", row, col - 1));
		}
		return ans;
	}



//	if we can go diagonally in the maze

    static ArrayList<String> pathDiagonal(String p,int row, int col){
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1 && col > 1){
            
        }
        if (row > 1) {
            ans.addAll(pathDiagonal(p + "V", row - 1, col));
        }
        if (col > 1) {
            ans.addAll(pathDiagonal(p + "H", row, col - 1));
        }
        return ans;
    }


	// MAZE WITH OBSTACLES

	static void pathResistance(String p,boolean maze[][], int row, int col) {
		if (row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!maze[row][col]){
			return;
		}
		if (row < maze.length-1) {
			pathResistance(p + "D", maze,row + 1, col);
		}
		if (col <maze[0].length-1) {
			pathResistance(p + "R", maze,row, col + 1);
		}
	}
		




}

