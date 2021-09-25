// #include <iostream>
// using namespace std;
 
//  class A
//  {
//  privat
#include <iostream>
using namespace std;
 
 class A
 {
 private:
 	int a;
 	void funca()
 	{
 		cout<<"private access"<<endl;
 	}
 public:
 	int b;
 	void funcb()
 	{
 		cout<<"public data"<<endl;
 	}
 protected:
 	int c;
 	void funcc()
 	{
 		cout<<"protected data"<<endl;
 	}
 };
 int main()
 {
 	A obj;
 	obj.funca();
 	// obj.funcc();   ||these two commented function wil not print
 	// obj.funca();
 }  