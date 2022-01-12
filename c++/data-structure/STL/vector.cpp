enter size of the array#include<iostream>
#include<vector>
using namespace std;


int display(auto &v)//refernce
{
    cout<<"vector is "<<endl;
    for (int i=0;i<v.size();i++)
    {
        cout<<v[i]<<endl;
    }
    v.push_back(0);
}
int main()
{
    system("cls");

    //syntax
    // vector<datatype> variablename;   
    
    vector<int> v;
    v.push_back(9);
    display(v);
    int times;
    cout<<"how many times do you ewant to push the data to vector"<<endl;
    cin>>times;
    cout<<"enter the data you want ro enter in the vector"<<endl;
    for (int i=0; i<times; i++)
    {
        int a;
        cin>>a;
        v.push_back(a);
    }
    display(v);

}