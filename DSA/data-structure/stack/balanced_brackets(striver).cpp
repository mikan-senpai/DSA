
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the inpu
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/


#include <iostream>
#include<string>
using namespace std;

bool valid_brackets(string s)
{
	stack <char> st;
	for(int i = 0; i<s.length();i++ )
	{
		if((s[i]=='(') or (s[i]=='{') or (s[i]=='['))
			{	
				st.push(s[i]);
			}
		else
		{
			if(st.empty())
				{
					return false;
				}
			char c=st.top();
			st.pop();
			if ((c == '(' and s[i] == ')') or (c == '[' and s[i] == ']') or (c == '{' and s[i] == '}'))
				continue;
		}
	}
	if (st.empty())
		return true;
}
int main()
{
	string s;
	cout<<"enter the input";
	getline(cin, s);
	valid_brackets(s);
}