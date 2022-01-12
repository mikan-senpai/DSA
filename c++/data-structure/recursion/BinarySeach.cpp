#include<iostream>
using namespace std;
int BinarySearch(int arr[#include<iostream>
using namespace std;
int BinarySearch(int arr[],int n,int key)
{
	int s=0,e=n-1,mid=0;
	while(s<=e)
	{	
		mid=(s+e)/2;

		if(key==arr[mid])
		{
			cout<<"key is found-->"<<mid<<endl;
		}
		if(arr[mid]<key)
		{
			s=mid+1;
		}
		else
		{
			e=mid-1;
		}
	}	
	if(arr[mid]!=key)
	{
		cout<<"key is not found ):"<<endl;
	}
}
int main()
{
	int n , key;
	cout<<"enter the no of the array \n";
	cin>>n;
	cout<<"enter the array \n";
    int arr[n];
	for(int i = 0 ; i <n;i++)
	{
		cin>>arr[i];
	}
	
	cout<<"enter the key\n";
	cin>>key;
	cout<<BinarySearch(arr,n,key);

}