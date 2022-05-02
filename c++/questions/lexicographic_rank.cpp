#include<iostream>
using namespace std;


int fun(string str){
	int n = str.length();

	 long fact[26];
	 int arr[500]={};
	 fact[0]=1;
	 fact[1]=1;
	 // for factorial array 
	 for (int i = 2; i < 26 ; ++i)
	 {
	 	fact[i]=i * fact[i-1];
	 }

	 // sasta hashing
	 for (int i = 0; i < n; i++)
	 {
	 	arr[str[i]]++;
	 }

	 // starting operation 
	 int numberOfletterSmaller;
	 int rank=0;
	 for (int i = 0; i < n; ++i)
	 {
	 	int numberOfletterSmaller=0;
	 	for (int j = 0; j < 256; j++)
	 	{
	 		if (j==str[i])
	 		{
	 			break;
	 		}
	 		if (arr[j])
	 		{
	 			numberOfletterSmaller++;
	 		}
	 	}
	 	arr[str[i]]=0;
	 	rank+=numberOfletterSmaller*fact[n-1-i];
	 }
	 return rank+1;
}
int main()
{

	cout<<fun("BAC");
}


