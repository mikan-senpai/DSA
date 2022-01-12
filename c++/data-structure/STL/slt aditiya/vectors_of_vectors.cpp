#include <bits/stdc++.h>
using namespace std;
void display(vector<int> v)
{
    cout << "size of vector" << v.size() << endl;

    for (int i = 0; i < v.size(); i++)
    {

        cout << v[i] << "  ";
    }
}
int main()
{
    system("cls");
    int size;
    cin >> size;           // this size is representing how many vectors do you want to create
    vector<vector<int>> v; // array of vectors
    for (int i = 0; i < size; i++)
    {
        int size2;
        cin >> size2; // this size2 is telling#include <bits/stdc++.h>
using namespace std;
void display(vector<int> v)
{
    cout << "size of vector" << v.size() << endl;

    for (int i = 0; i < v.size(); i++)
    {

        cout << v[i] << "  ";
    }
}
int main()
{
    system("cls");
    int size;
    cin >> size;           // this size is representing how many vectors do you want to create
    vector<vector<int>> v; // array of vectors
    for (int i = 0; i < size; i++)
    {
        int size2;
        cin >> size2; // this size2 is telling what is the size of the vector you
        vector<int> temp;
        for (int j = 0; j < size2; j++)
        {
            int data;
            cin >> data;
            temp.push_back(data);
        }
        v.push_back(temp);
    }

    for (int i = 0; i < v.size(); i++)
    {
        display(v[i]);
    }

    return 0;
}