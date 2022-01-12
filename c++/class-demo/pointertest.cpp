#include<iostream>
using namespace std;

int main()
{

// int pointer wil behave differ
// here the pointer will print the address
int a[]={1,2,3,4,5,6,7,8}; 
int *p=&a[0];
cout<<a<<endl;


// charector pointer will behave differently
//here the p wil print the full array
char ch[]={'a','a','a','a','a'};
cout<<ch<<endl;


// printing the charector with pointer

char ch1='m';

// pointer will print the m and the address

char * p1=&ch1;
cout<<p1<<endl;

}