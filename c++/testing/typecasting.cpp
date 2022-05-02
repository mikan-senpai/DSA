#include<iostream>
using namespace std;
int main()
{
	int a =9;
	double b=static_cast<double>(a);
	b=a;

	cout<<b;
}