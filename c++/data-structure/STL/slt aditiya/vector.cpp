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

    vector<int> v;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;

        // display(v); // for  knowing vector is dynamic or not

        v.push_back(x);
    }
    v.pop_back();
    display(v);
}
                                                                                                                                                                                                                      #include <bits/stdc++.h>
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

    vector<int> v;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;

        // display(v); // for  knowing vector is dynamic or not

        v.push_back(x);
    }
    v.pop_back();
    display(v);
}
