#include<iostream>
using namespace std;
int reverse(int n )
{
	int rev;
	if (n==0)
	{
		return 0;
	}
	int rem= n%10;
	rev=rev * 10+ rem;
	reverse(n/10);
	return rev;

}
int main()
{
	int n=123;
	cout<<reverse(n);

}