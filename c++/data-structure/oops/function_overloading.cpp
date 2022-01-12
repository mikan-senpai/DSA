
#include <iostream>
using namespace std;
class Overloadng{
public:
	int n;
	void func()
	{	
		cin>>n;
		cout<<"hey mikan"<<endl;
		cout<<"your number is "<<n<<endl;

	}
	void func(int a,int b)
	{
		int sum=a+b;
		cout<<"the sum is "<<sum;
		
	}
	void func(string s,double d)
	{
		cout<<s<<" is your name"<<endl;
		cout<<d<<endl;
	}
	
};
int main()
{
	Overloadng obj;
	obj.func();
	obj.func(12,8);
	obj.func("mikan",89.2);

}
// #include <iostream>
// using namespace std;
// class Overloadng{
// public:
// 	int n;
// 	void func()
// 	{	
// 		cin>>n;
// 		cout<<"hey mikan"<<endl;
// 		cout<<"your number is "<<n<<endl;

// 	}
// 	void func(int a,int b)
// 	{
// 		int sum=a+b;
// 		cout<<"the sum is "<<sum;
		
// 	}
// 	void func(string s,double d)
// 	{
// 		cout<<s<<" is your name"<<endl;
// 		cout<<d<<endl;
// 	}
	
// };
// int main()
// {
// 	Overloadng obj;
// 	obj.func();
// 	obj.func(12,8);
// 	obj.func("mikan",89.2);

// }