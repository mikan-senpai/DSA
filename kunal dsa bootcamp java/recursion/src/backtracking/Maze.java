package backtracking;

import java.util.ArrayList;

public class Maze {
	public static void main(String[] args) {
		System.out.println(count(3, 3));
		path("", 3, 3);
		System.out.println(pathRet("",3,3));
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
}

