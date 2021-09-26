#include<iostream>
using namespace std;


// void display(int a[],int n)
// {
// 	cout<<"the sorted array is ->";
// 	for (int i = 0; i < n; i++)
// 	{
// 		cout<<a[i]<<" , ";
// 	}
// 	return ;
// }

void merge(int arr[],int l ,int r,int mid)
{
	int i = l;
	int j=mid+1;
	int k=0;

	int temp[r-l+1];
	while(i<=mid && j<=r)
	{
		if(arr[i] <= arr[j])
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		else
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
	}
	while(i<=mid)
	{
			temp[k]=arr[i];
			i++;
			k++;
	}
	while(j<=r)
	{
			temp[k]=arr[j];
			j++;
			k++;
	}
	for (int i = l; i <= r; i++)
	{
		arr[i]=temp[i-l];
	}
}

void mergesort(int arr[],int l,int r)
{
	if(l<r)
	{
		int mid=(l+r)/2;
		mergesort(arr,l,mid);
		mergesort(arr,mid+1,r);
		merge(arr,l,r,mid);
	}
}

int main()
{
	int arr[]={8,3,4,1,7,6,5,0};
	int l=0 ,r =7;
	mergesort(arr,l,r);

	// display(arr,8);

	for (int i = 0; i < 8; ++i)
	{
		/* code */cout<<arr[i]<<" ";
	}
}