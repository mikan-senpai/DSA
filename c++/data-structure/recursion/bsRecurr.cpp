#include <iostream>
using namespace std;


// void binarysearchrecur(int arr[],int n ,int key ,int s,int e)
// {
// 	int m=(s+e)/2;
// 	if(arr[m]==key)
// 	{
// 		cout<<"key found"<<arr[m]<<endl;
// 		return;
// 	}
// 	if(arr[m]<key)
// 	{
// 		binarysearchrecur(arr,n,key,m+1,e);
// 	}
// 	else
// 		{
// 			binarysearchrecur(arr,n,key,s,m-1);
// 		}
// }




void binarysearchrecur(int arr[],int n ,int key)
{
	if(arr[m]==key)
	{
		cout<<"key found"<<arr[m]<<endl;
		return;
	}
	m=
	binarysearchrecur(arr,n/2,key );

}




int main()
{
	int arr[7]={4,5,6,7,8,10,11};
	
	int s=0;
	int e=7;
	int key=11;
		binarysearchrecur(arr,8,key,s,e);
}