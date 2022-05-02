package Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceRet("",4));
        diceFace("",4,6);

    }

    static void dice(String p , int target)
    {
        if(target == 0){
            System.out.println(p+" ");
            return;
        }
        for (int index = 1; index <=6 && index<=target ; index++) {
            dice(p+index,target-index);
        }
    }



    static ArrayList<String> diceRet(String p , int target)
    {
        if(target == 0){
            ArrayList list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> ans= new ArrayList<>();
        for (int index = 1; index <=6 && index<=target ; index++) {
            ans.addAll(diceRet(p+index,target-index));
        }
        return ans;
    }

    //with increased number of  faces of a dice
    //for eg : common dice face is 6 => 6 number of faces

    static void diceFace(String p , int target, int face)
    {
        if(target == 0){
            System.out.println(p+" ");
            return;
        }
        for (int index = 1; index <=face && index<=target ; index++) {
            diceFace(p+index,target-index,face);
        }
    }


}
