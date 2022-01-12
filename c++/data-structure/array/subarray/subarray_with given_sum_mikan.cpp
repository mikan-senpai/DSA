#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the number\n";
    cin>>n;
    cout<<"enter the array\n";
    int arr[n];
    for (int i = 0 ; i < n ; i + +)
    {
        cin>>arr[i];

    }
    int sumIN=0;
    cout<<" enter the sum no\n";
    cin>>sumIN;
    int sum;
    int s=0,e=0;
    int sum=0;
    while(s<n && e < n )
    {
    {    sum = arr[e]+sum;
    }
    if(sum<sumIN)
    {#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the number\n";
    cin>>n;
    cout<<"enter the array\n";
    int arr[n];
    for (int i = 0 ; i < n ; i + +)
    {
        cin>>arr[i];

    }
    int sumIN=0;
    cout<<" enter the sum no\n";
    cin>>sumIN;
    int sum;
    int s=0,e=0;
    int sum=0;
    while(s<n && e < n )
    {
    {    sum = arr[e]+sum;
    }
    if(sum<sumIN)
    {
        e++;
    }
    if (sum>sumIN)
    {
        s++;
        e=s;
    }
    
    }
cout<<"subarray of the given sum is--->"<<s+1<<"  "<<e+1<<endl;
}





}