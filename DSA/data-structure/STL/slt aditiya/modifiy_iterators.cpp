#include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");
    //  for range loop
    vector<int> v = {4, 6, 7, 8, 75, 4};
    for (int value : v)
    {
        cout << value << endl;
    }

    // reference of range loop

    vector<pair<int, int>> p = {{1, 2}, {3, 4}, {4, 5}};
    for (auto &&value : p)
    {
        cout << value.first << "  " << value.second << endl;
        // cout << value->first << " " << value->second << endl;
    }

    return 0;
}                                                                                                                                                                                                                       #include <bits/stdc++.h>
using namespace std;
int main()
{
    system("cls");
    //  for range loop
    vector<int> v = {4, 6, 7, 8, 75, 4};
    for (int value : v)
    {
        cout << value << endl;
    }

    // reference of range loop

    vector<pair<int, int>> p = {{1, 2}, {3, 4}, {4, 5}};
    for (auto &&value : p)
    {
        cout << value.first << "  " << value.second << endl;
        // cout << value->first << " " << value->second << endl;
    }

    return 0;
}