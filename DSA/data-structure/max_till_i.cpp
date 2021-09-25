
#include<iostream>
#include<climits>
using namespace std;

int max_till_i(int arr[],int n){

    int i=0;
    int max=-19999;
    
    while (i<n)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
        
    i++;
    }
    cout<<"max till i is-->"<<max;
    cout<<endl;
    
    
    
    
}


#include<iostream>
#include<climits>
using namespace std;

int max_till_i(int arr[],int n){

    int i=0;
    int max=-19999;
    
    while (i<n)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
        
    i++;
    }
    cout<<"max till i is-->"<<max;
    cout<<endl;
    
    
    
    
}



int main()
{
    int n;
    cout<<" enter the length of the array  \n";
    cin>>n;
    int arr[n];
    cout<<" enter the array  \n";
    for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
   
    cout<<max_till_i(arr,n);

}