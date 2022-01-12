#include <bits/stdc++.h>
using namespace std;

void display(vector<int> &v)
{
    // cout << "size of vector" << v.size() << endl;

    for (int i = 0; i < v.size(); i++)
    {

        cout << v[i] << "  ";
    }
    v.push_back(5);
}
int main()
{
    system("cls");

    // vector<int> v(5); // 5 size vector has declared
    vector<int> v(5, 2); // 5 size vector has declared
    display(v);
    v.push_back(6);
    cout << endl;
    display(v);
    v.pop_back();
    cout <#include <bits/stdc++.h>
using namespace std;

void display(vector<int> &v)
{
    // cout << "size of vector" << v.size() << endl;

    for (int i = 0; i < v.size(); i++)
    {

        cout << v[i] << "  ";
    }
    v.push_back(5);
}
int main()
{
    system("cls");

    // vector<int> v(5); // 5 size vector has declared
    vector<int> v(5, 2); // 5 size vector has declared
    display(v);
    v.push_back(6);
    cout << endl;
    display(v);
    v.pop_back();
    cout << endl;
    display(v);

    // copy the vectors

    vector<int> v2 = v;
    v2.push_back(3);
    display(v2);
    cout << endl;
    display(v2);

    return 0;
}