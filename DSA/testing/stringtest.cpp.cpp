#include <iostream>
using namespace std;
int main()
{
	string s = "mikan";
	string s1="";
	for(int i = 0; i <5; i ++)
	{
		s1+=s[i];
	}
	for(int i = 0; i <5; i ++)
	{
		cout<<s1[i];
	}
	cout<<endl;
	s1=" ";
	for(int i = 0; i <7; i ++)
	{
		cout<<s1[i];
	}


}