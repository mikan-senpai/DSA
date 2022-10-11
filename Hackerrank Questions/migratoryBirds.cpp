// int migratoryBirds(vector<int> arr)
// {
//     vector<int>ans(6);
//     int m = INT_MIN; //m is maximum value

//     for (int i = 0; i < arr.size(); i++) //gets frequency of all types of birds
//         ans[arr[i]]++;


//     int ind = 0; //ind stores index
//     for (int i = 0; i < ans.size(); i++) //finds the max frequency
//     {
//         if (ans[i] > m)
//         {
//             m = ans[i];
//             ind = i;
//         }
//         return ind;
//     }
// }
// return ind;



// int migratoryBirds(vector<int> arr) {
    
// }

#include <bits/stdc++.h>
using namespace std;



int migratoryBirds(vector<int> arr) 
{
    unordered_map<int, int> m;
    
    for (int i = 0; i < arr.size(); i++)
    {
        m[arr[i]]++;
    }
    
    int max_el = 0;
    int ind = 0;
    
    for (const auto& el : m)
    {
        if (el.second > max_el)
        {
            max_el = el.second;
            ind = el.first;
        }
        else if (el.second == max_el && el.first < ind)
        {
            ind = el.first;
        }
    }
    
    return ind;
}