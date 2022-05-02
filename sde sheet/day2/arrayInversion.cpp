

// -----------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------
// ---------------------------------------brute force Approach------------------------------------------------
// -----------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------
// #include <iostream>
// using namespace std;

// void arrayInversion(int arr[],int n )\
// {
// 	int count=0;
// 	for (int i = 0; i < n; i++)
// 	{
// 		for (int j = i; j < n; j++)
// 		{
// 			if(arr[i]>arr[j] and i<j)
// 				count++;
// 		}
// 	}
// 	cout<<"no of inversion"<<count<<endl;
// }


// int main()
// {
// 	int arr[]={8,3,4,7};
// 	int n=4;
// 	arrayInversion(arr,n);
// }




// -----------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------
// ---------------------------------------optimized-- Approach------------------------------------------------
// -----------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------





#include<iostream>
using namespace std;

int merge(int a[],int l ,int r,int mid)
{
	int i = l;
	int j=mid+1;
	int k=l;
	int invcount=0;

// taking the temporary  array 
	int b[r-l+1];
//we could also take thsi as --->     int b[100];


	while((i<=mid) && (j<=r))
	{
		if(a[i] <= a[j])
		{
			b[k]=a[i];
			i++;
			k++;

		}
		else
		{
			b[k]=a[j];
			j++;
			k++;

			//calculating the inverse for every section of the aarray			
			invcount=invcount + (mid-i);
		}

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

	//imortant one in the code
	
	for (int k = l; k <= r; k++)
	{
		a[k]=b[k];
	}



	return invcount;
}

int mergesort(int arr[],int l,int r)
{
	int invcount = 0;
	if(l<r)
	{
		int mid=(l+r)/2;

		invcount+=	mergesort(arr,l,mid);
		invcount+=	mergesort(arr,mid+1,r);

		// for the merignf of the two array 
		invcount+=	merge(arr,l,r,mid);
	cout <<invcount <<endl;

	}

	return invcount;
	
}

int main()
{
	int arr[]={ 1, 20, 6, 4, 5};
	int n=sizeof(arr)/ sizeof(arr[0]);
	int ans=mergesort(arr,0,n);

	cout<<"the answer is "<<ans;
	return 0;
}
