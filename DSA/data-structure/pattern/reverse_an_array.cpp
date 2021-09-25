//reverse an array usig recursion


#include <iostream>
using namespace std;
/*void Reverse(int i , int arr[], int n)
{
	if(i>(n/2))
		//reverse an array usig recursion


#include <iostream>
using namespace std;
/*void Reverse(int i , int arr[], int n)
{
	if(i>(n/2))
		return ;
	swap(arr[i],arr[(n-1)-i]);
	Reverse(i++,arr,n);
}*/
void rvereseArray(int arr[], int start, int end)
{
    if (start >= end/2)
    return;
     
    swap(arr[start],arr[end-1-start]);
     
    // Recursive Function calling
    rvereseArray(arr, start + 1, end);
}    

void print(int arr[],int n )
{	
	for (int i = 0; i < n; i++)
	{	
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}
int main()
{	
	int i = 0;
	int arr[]={5,2,1,3,6};
	int n=sizeof(arr)/sizeof(arr[0]);
	print(arr,n);
	rvereseArray(arr,0,5);
	cout << "Reversed array is--->";
	print(arr,n);
}