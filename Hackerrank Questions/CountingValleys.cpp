#include <bits/stdc++.h>
using namespace std;
int countingValleys(int steps, string path) {
    int point=0;
    int ans=0;
    for(int i=0; i<steps; i++){
        if(path[i]=='U'){
            point++;
            if(point==0) ans++;
        }
        else{
            point--;
        }
    }
    return ans;
}


int main()
{   
    int steps = 0 ;
    cin >> steps ; 
    string path;
    // getline(cin,path);
    cin>>path;
    cout<<countingValleys(steps,path);
    return 0;
}