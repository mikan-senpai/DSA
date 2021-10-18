#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void display(vector<vector<int>> &v)

{
    for (int i = 0; i < v.size(); i++)
    {
            
            for (int j = 0 ;j < v[i].size(); j++)
            {
                cout << v[i][j];/* code */
            }
                    /* code */
    }
    
}


void rotateMatrix(vector<vector<int>> &v)
{
    for(int r=0;r<v.size();r++)
    {
        for(int c=0;c<r;c++)
        {
            swap(v[r][c],v[c][r]);
        }
    }


    // now reversing every rows of teh matrix

    for (int r = 0; r < v.size(); r++)
    {
        reverse(v[r].begin(),v[r].end());
        
    }
    


    display(v);

}
int main()
{
    vector<vector<int>> v;

    v={{1,2,3},{4,5,6},{7,8,9}};
    rotateMatrix(v);
}