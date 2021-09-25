#include<iostream>
#include<vector>
using namespace std;
void display(vector<int> &vs)
{
    for (int i = 0 ; i < vs.size(); i ++)
    {
        cout<<vs[i]<<" ";

    }
    cout<<endl;
}
int main()
{   
    system("clear");
    vector<vector<int>> v;
    int size=0; //no of vectors you want to take(main vector)
    cout<<"how many vectors do you want initially"<<endl;
    cin>>size;
    for(int i=0; i<size;i++)
    {
        int no_of_elements; //(elements of a single vector)
        cout<<"how man elements do you want in vector"<<i<<endl;
        cin>>no_of_elements;
        vector<int> temp;
        cout<<"enter data of vector"<<i<<endl;
        for (int i=0;i<no_of_elements;i++)
        {
            int data;
            cin>>data;
            temp.push_back(data);
        }
        v.push_back(temp);
    }

    cout<<"the vector is ";
    for(int i = 0; i<size;i ++)
    {
        display(v[i]);
    }
}