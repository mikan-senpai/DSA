#include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");

    // vector<int> v = {
    //     2,
    //     3,
    //     4,
    //     4,
    //     5,
    //     5,
    //     6,
    //     6,
    // };
    // vector<int>::iterator it;
    // for (it = v.begin(); it != v.end(); it++)
    // {
    //     cout << *it << '\n';
    // }

    // vector of pair example

    vector<pair<int, int>>
        v_p = {{3, 4},
               {5, 6},
               {7, 8},
               {9, 10}};
    for (vector<pair<int, int>>::iterator it = v_p.begin(); it != v_p.end(); it++)
    {
        cout << (*it).first << " " << (*it).second << endl;
    }
#include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");

    // vector<int> v = {
    //     2,
    //     3,
    //     4,
    //     4,
    //     5,
    //     5,
    //     6,
    //     6,
    // };
    // vector<int>::iterator it;
    // for (it = v.begin(); it != v.end(); it++)
    // {
    //     cout << *it << '\n';
    // }

    // vector of pair example

    vector<pair<int, int>>
        v_p = {{3, 4},
               {5, 6},
               {7, 8},
               {9, 10}};
    for (vector<pair<int, int>>::iterator it = v_p.begin(); it != v_p.end(); it++)
    {
        cout << (*it).first << " " << (*it).second << endl;
    }

    return 0;
}