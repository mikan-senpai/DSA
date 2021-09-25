package com.mikan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int ans=0;
        while(true)
        {
            System.out.println("enter the operator");
            char op= in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/')
            {
                System.out.println("enter two numbers");
                int num1=ipackage com.mikan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int ans=0;
        while(true)
        {
            System.out.println("enter the operator");
            char op= in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/')
            {
                System.out.println("enter two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op == '+')
                {
                    ans=num1 + num2;
                }
                if(op == '-')
                {
                    ans=num1 -num2;

                }
                if(op == '*')
                {
                    ans=num1*num2;
                }
                if(op == '/')
                {
                    if(num2!=0)
                    {
                        ans=num1/num2;
                    }
                }
                if(op == '%')
                {
                    ans= num1 % num2;
                }
                System.out.println(ans);


            }
            else if(op == 'x' || op == 'X')
            {
                System.out.println("thank you for using the calculator");
                break;
            }
            else {
                System.out.println("invalid operation");
            }
        }

    }
}
