import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
public class diagonalDiff {
//    public static int diagonalDifference(List<List<Integer>> list) {
//        // Write your code here
//
//        int pd = Integer.MIN_VALUE;
//        int sd = Integer.MIN_VALUE ;
//
//        for(int i = 0 ; i < list.size(); i++){
//            for (int j = 0 ; j < i ; j ++){
//                pd += list.get(list.get());
//            }
//        }
//        for (int i = list.size(); i>0 ; i --){
//            for (int j = list.size();j>i;j--){
//                sd += list[i][j];
//            }
//        }
//        return Math.abs(sd,pd);
//    }


    public static int main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        int leftdiagonal = 0, rightdiagonal = 0;
        for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }
}

