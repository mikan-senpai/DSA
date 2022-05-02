#include <iostream>
#include <algorithm>
using namespace std;

void display(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout<<arr[i]<< " ";  
	}
	cout<<endl;
}

void insert(int arr[], int n )     //insertion sort
{                                 // 4 3 6 9    arr2
	int j=1;
	int data=arr[0];
	while(j<n and data>arr[j])  // 3 4 6 9
	{
		
			std::swap(arr[j],data);
			j++;
		
	}
}
void mergeSorted(int arr1[],int arr2[],int n1,int n2)
{
	for(int i=0;i<n1; i ++)
	{
		if(arr1[i] >= arr2[0])		 			// 4 5 7 10 11
												// 1 3 6 9
			{
				std::swap(arr1[i], arr2[0]);  	// 1 5 7 10 11
				insert(arr2, n2);		      	// 4 3 6 9       return // 3 4 6 9
				// sort(arr2,arr2+n2);
			}
	}
	display(arr1,n1);
	display(arr2,n2);

}

int main()
{
	int arr1[5]={1,4,7,8,10};
	int arr2[3]={2,3,4};
	mergeSorted(arr1,arr2,5,3);
}






