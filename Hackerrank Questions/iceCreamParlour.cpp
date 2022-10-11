#include <bits/stdc++.h>

using namespace std;

//naive approach
vector<int> icecreamParlor(int m, vector<int> arr) {
    std::vector<int> ans;
    for (int i = 0 ; i < arr.size(); i++) {
        for (int j = i ; j < arr.size() ; j++) {
            if (i != j && arr[i] + arr[j] == m && i < j)
            {
                ans.push_back(i + 1);
                ans.push_back(j + 1);
                break;
            }
        }
    }
    return ans ;
}


vector<int> icecreamParlor(vector<int> arr, int m) {

    vector<int> res;
    unordered_map<int, int> mp;

    for (int i = 0; i < arr.size(); ++i) {

        if (mp.find(m - arr[i]) != mp.end()) {

            res.emplace_back(i);
            res.emplace_back(mp[m - arr[i]]);
            return res;
        }

        mp[arr[i]] = i;
    }

    return res;
}

int main()
{
    /* code */
    return 0;
}