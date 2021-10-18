#include <iostream>
using namespace std;


int main()
{
	int p = 5;
	int const *q =  &p;
	p++;
	cout<<p<<"->"<<q<<endl;
	q++;
	cout<<p<<"->"<<q<<endl;
	
	int x =10;
	
	*q = 6;


	cout<<x<<"->"<<q<<endl;

	


	return 0;
}





// Which statement(s) will give an error for the following code -
// #include <iostream>
// using namespace std;

// int main(){
//     const int p = 5;
//     int const *q = &p;
// }
// Options:
// 0. p++;
// 1. q++
// 2. (*q)++;






fun(int &a)
{
	a++;
}


int int main(int argc, char const *argv[])
{
	int n ;

	fun(n);
	return 0;
}