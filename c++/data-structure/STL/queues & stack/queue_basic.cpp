#include<iostream>
#include<queue>
using namespace std;

// void display(queue<int> &q)
// {
//     while (q.empty())
//     {
//         cout<<q.front()<<" ";
//         q.pop();
//         /* code */
//     }
    

// }
int main()
{
    queue<int> q;
    int n;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        int data=0;
        cin>>data;
        q.push(data);
    }
    // display(q,n);
    // for (int i = 0; i < n; i++)
    // {
    //     cout<<q.front()<<endl;
    //     q.pop();
    //     /* code */
    // }
    // q.pop();
    // display(q);
    q.pop();
     while (!q.empty())
    {
        cout<<q.front()<<" ";
        q.pop();
        /* code */
    }
    

    return 0;
}