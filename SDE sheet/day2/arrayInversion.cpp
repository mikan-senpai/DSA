#include <iostream>
using namespace std;

void arrayInversion(int arr[],int n )\
{
	int count=0;
	for (int i = 0; i < n; i++)
	{
		for (int j = i; j < n; j++)
		{
			if(arr[i]>arr[j] and i<j)
				count++;
		}
	}
	cout<<"no of inversion"<<count<<endl;
}


int main()
{
	int arr[]={8,3,4,7};
	int n=4;
	arrayInversion(arr,n);
}