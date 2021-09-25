
#include<bits/stdc++.h>
using namespace std;

int maxSubArraySum(int a[], int size)
{
    int maxsum = INT_MIN, sum = 0,
    start =0, end = 0, s=0;

    for (int i=0; i< size; i++ )
    {
        sum += a[i];

        if (maxsum < sum)
        {
            maxsum = sum;
            start = s;
            end = i;
        }

        if (sum < 0)
        {
            sum = 0;
            s = i + 1;
        }
    }
    cout << "Maximum contiguous sum is "
        << maxsum << endl;
        cout<<"The subarray is :";
    for(int i= start;i<=end;i++){

        cout<<"   "<<a[i];
    }
}


int main()
{
    int a[] = {-2,1,-3,4,-1,2,1,-5,4};
    int n = sizeof(a)/sizeof(a[0]);
    int max_sum = maxSubArraySum(a, n);
    return 0;
}