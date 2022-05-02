package com.mikan.generics;


import java.util.ArrayList;
import java.util.function.Consumer;

/**what are lambda functions?
 *-> lambda functions are inline functions like one line functions
 *
 * you can actually store lambda expressions in variables as well
 *
 *
 *
*/
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

//        arr.forEach((item) -> System.out.println( item * 2));

        Consumer<Integer> fun = (item)-> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b)-> (a + b);
        Operation diff = (a, b)-> (a - b);
        Operation multi = (a, b)-> (a * b);
        Operation divide = (a, b)-> (a / b);
//you can assign lambda expressions to variables that are of
//type interface




        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,3,sum));;
        System.out.println(myCalculator.operate(5,3,diff));;
        System.out.println(myCalculator.operate(5,3,multi));;
        System.out.println(myCalculator.operate(5,3,divide));;
    }


    int sum(int a , int b ){
        return a + b;
    }




    private int operate (int a , int b , Operation op){
        return op.operation(a,b);
    }

}




interface Operation {
    int operation (int a , int b );
}