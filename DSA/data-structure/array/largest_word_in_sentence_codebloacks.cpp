/*  input : do or die
    output: 3    */

#include<bits/stdc++.h>
using namespace std;
 int main()
 {
     int n ;
     cout<<"\n enter the number of elements";
     cin>>n;
    cin.ignore();

    char arr[n];
    cout<<"\n enter array";
    cin.getline(arr,n);
    cin.ignore();
    int i = 0 ;
    int max_len= INT_MIN;
    int count=0;
    while(arr[i] ! = '\0')
    {
        if(arr[count] ! = " " || arr[count] ! = '\0')
        {
            max_len=max(max_len,count);
            count=0;
        }
    i++;
        count++;
    }
    cout<<"largest word is  \n"<<max_len;


 }
     /*  input : do or die
    output: 3    */

#include<bits/stdc++.h>
using namespace std;
 int main()
 {
     int n ;
     cout<<"\n enter the number of elements";
     cin>>n;
    cin.ignore();

    char arr[n];
    cout<<"\n enter array";
    cin.getline(arr,n);
    cin.ignore();
    int i = 0 ;
    int max_len= INT_MIN;
    int count=0;
    while(arr[i] ! = '\0')
    {
        if(arr[count] ! = " " || arr[count] ! = '\0')
        {
            max_len=max(max_len,count);
            count=0;
        }
    i++;
        count++;
    }
    cout<<"largest word is  \n"<<max_len;


 }
