

// Check for balanced parenthesis without using stack
// Difficulty Level : Medium
// Last Updated : 29 Aug, 2021
// Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, ”}”, ”(“, ”)”, ”[“, ”]” are correct in exp. 
// Examples: 

// Input : exp = “[()]{}{[()()]()}”
// Output : true

// Input : exp = “[(])”
// Output : false




// package questions;

import java.util.Stack;
public class balancedParanthesis {


	public static void main(String[] args) {
	
	String exp = "[()]{}{[()()]()}";
	System.out.println(exp);	

	System.out.println(checkBrackets(exp));

	}

	static boolean checkBrackets(String str)
	{	

		Stack<Character> st= new Stack<>();

		char data;

		for(int i = 0; i < str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i) == '[' || str.charAt(i) == '{' )
			{
				st.push(str.charAt(i));
			}
			else
			{

				if(st.isEmpty())
				{
					return false;
				}
				data = st.pop();

				if(data == '(' && str.charAt(i) == ')' || data == '{' && str.charAt(i) == '}'||data == '[' && str.charAt(i) == ']')
				
					continue;	
				
			}
		}

//		if(st.isEmpty())
			return true;
	
	// return false;
	}


	public boolean ValidBrackets(String s)
	{
		Stack <Character> st Stack();
		for(char ch : s.ChartoArray())
		{
			
		}
	}


}
