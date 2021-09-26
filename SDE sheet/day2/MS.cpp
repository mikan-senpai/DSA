#include<iostream>
using namespace std;

void merge(int a[],int l ,int r,int mid)
{
	int i = l;
	int j=mid+1;
	int k=l;

// taking the temporay array 
	int b[r-l+1];

	while(i<=mid && j<=r)
	{
		if(a[i] <= a[j])
		{
			b[k]=a[i];
			i++;
		}
		else
		{
			b[k]=a[j];
			j++;
		}

        k++;
	}
    if(i>mid)
    {   
        while(j<=r)
	    {
			b[k]=a[j];
			j++;
			k++;
	    }
    }
    else
    {
        while(i<=mid)
	    {
			b[k]=a[i];
			i++;
			k++;
	    }
    }

	
	
	for (int m = l; m <= r; m++)
	{
		a[m]=b[k];
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