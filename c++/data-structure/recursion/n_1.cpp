#include <iostream>
using namespace std;


void rev(int n )
{
if (n==0)
{
	return ;
}
	
	rev(n-1);
	cout<<n<<" ";	
}
int main()
{
	int a=10;
    rev(a);
}