#include<bits/stdc++.h>
using namespace std;

int binary_search(int arr[],int n,int key);


int main()
{
    int n, key;
    cout<<" enter the length of the array  \n";
    cin>>n;
    int arr[n];
    cout<<" enter the array  \n";
    for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<" enter item you to find  \n";
    cin>>key;
    
    cout<<binary_search(arr,n,key)<<endl;

}

int binary_search(int arr[],int n,int key)
{
    int s=0, e= n-1;
    int mid=0;
    while(s<=e)
    {  if(key==arr[mid]);
        { 
        cout<<"key found-->"<<mid<<endl;
        }
        mid= (s+e)/2;
        if (arr[mid]<key)
        {
            s=mid+1;
        }
        if(arr[mid]>key);
        {
            e=mid-1;
        }
    }
    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               #include<bits/stdc++.h>
using namespace std;

int binary_search(int arr[],int n,int key);


int main()
{
    int n, key;
    cout<<" enter the length of the array  \n";
    cin>>n;
    int arr[n];
    cout<<" enter the array  \n";
    for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<" enter item you to find  \n";
    cin>>key;
    
    cout<<binary_search(arr,n,key)<<endl;

}

int binary_search(int arr[],int n,int key)
{
    int s=0, e= n-1;
    int mid=0;
    while(s<=e)
    {  if(key==arr[mid]);
        { 
        cout<<"key found-->"<<mid<<endl;
        }
        mid= (s+e)/2;
        if (arr[mid]<key)
        {
            s=mid+1;
        }
        if(arr[mid]>key);
        {
            e=mid-1;
        }
    }
    
}