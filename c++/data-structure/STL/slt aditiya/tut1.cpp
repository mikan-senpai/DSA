#include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");

    pair<int, int> p;

    p = make_pair(1, 2);
    p = {4, 5};

    pair<int, int> p2 = p;
    // cout << p.first << " ";
    // cout << p.second;
    // p2.first = 6;
    #include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");

    pair<int, int> p;

    p = make_pair(1, 2);
    p = {4, 5};

    pair<int, int> p2 = p;
    // cout << p.first << " ";
    // cout << p.second;
    // p2.first = 6;
    // cout << " " << p2.first;
    // cout << " " << p.first;

    // arraya of pair

    pair<int, int> p_arr[4];
    p_arr[0] = {3, 4};
    p_arr[1] = {5, 6};
    p_arr[2] = {56, 57};
    for (int i = 0; i < 3; i++)
    {
        cout << p_arr[i].first << " " << p_arr[i].second << endl;
    }
    swap(p_arr[0], p_arr[2]);

    for (int i = 0; i < 3; i++)
    {
        cout << p_arr[i].first << " " << p_arr[i].second << endl;
    }

    return 0;
}
