package com.mikan.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a / b;
//        we can pretty print the exception
        try{
            int c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i will always execute");
        }

    }



    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do no divide by zero");
        }

        return  a / b;
    }
}
