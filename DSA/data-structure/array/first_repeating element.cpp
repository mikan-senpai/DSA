//  7
//  1 5 3 4 3 5 6

// -1-1-1-1-1-1-1
//  out=2       cuase 5 twice times

#include<iostream>
#include<climits>

    int main()
    {
        int n;
        cout<<"enter the no "<<endl;
        cin>>n;
        int arr[n];
        cout<<"enter the array";
        for(int i = 0 ;  i < n; i ++ )
        {
            cin>>arr[i];
        }
        int N= 1e6;
        int mx=INT_MIN;
        int idx[N]={-1};
        for(int i = 0 ; //  7
//  1 5 3 4 3 5 6

// -1-1-1-1-1-1-1
//  out=2       cuase 5 twice times

#include<iostream>
#include<climits>

    int main()
    {
        int n;
        cout<<"enter the no "<<endl;
        cin>>n;
        int arr[n];
        cout<<"enter the array";
        for(int i = 0 ;  i < n; i ++ )
        {
            cin>>arr[i];
        }
        int N= 1e6;
        int mx=INT_MIN;
        int idx[N]={-1};
        for(int i = 0 ; i < n ; i ++)
        {   
            idx[arr[i]]=+ 1;
            
            if (idx[i]>mx)
            {
                mx=i;

            }
            else
            {
                cout<<"no repeating element\n";
                
            }


        }
    
    cout<<max<<endl;
    }
