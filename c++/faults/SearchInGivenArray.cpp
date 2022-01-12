#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int n=5;
	// cin >>n>>x;
	// int arr[n];
	// for (int i = 0; i < n; i++)
	// {
	// 	cin>>arr[i];
	// }

	int arr[n]={1,2,4,60,55};
	int x=55;

	std::sort(arr,arr+n);

	int mid=0,s=0,e=n-1;
	int ans=0;
 

	while(s<=e)
	{
		mid=(s+e)/2;

		if(arr[mid]== x)
		{
			ans=mid-1;
		 	// cout<<"hey" ;
			break;
		}
		else if(arr[mid] < x)
		{
			s=mid+1;
		}
		else
		{
			e=mid-1;
		}
	}

	cout<<ans<<endl;
	// cout<<hey" 
}