#include<iostream>
using namespace std;
int main()
{
    int n=#include<iostream>
using namespace std;
int main()
{
    int n=0,res=0;
    cout<<"enter the number";
    cin>>n;
    int arr[n];
    for(int i= 0 ; i < n ; i++ )
    {
        cin>>arr[i];
        
    }
    for(int i= 0 ; i < n ; i++ )
    {
   
        res= arr[i]^res;
    }
    if(res  !=0 )
    cout<<"the non repeating number is";
    cout<<res<<endl;
}
