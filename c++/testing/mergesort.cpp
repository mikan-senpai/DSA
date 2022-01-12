// MERGE SORT
#include<iostream>
using namespace std;

void Merge(int arr[], int lb, int ub, int mid)
{
    int i,j,k,b[ub-lb+1];
    i = lb;
    j = mid+1;
    k = 0;
    while(i <= mid && j <= ub)
    {
        if(arr[i] < arr[j])
        {
            b[k] = arr[i];
            i++;
            k++;
        }
        else
        {
            b[k] = arr[j];
            j++;
            k++;
        }
    }
    while(i <= mid)
    {
        b[k] = arr[i];
        i++;
        k++;
    }
    while(j <= ub)
    {
        b[k] = arr[j];
        j++;
        k++;
    }

    for(i=lb;i<=ub;i++)
    {
        arr[i] = b[i-lb];
    }
}
void merge_sort(int arr[],int lb,int ub)
{
    int mid;
    if(lb < ub)
    {
        mid = (lb+ub)/2;
        merge_sort(arr,lb,mid);
        merge_sort(arr,mid+1,ub);
        Merge(arr, lb, ub,mid);
    }
}

int main()
{
    int n,i;
    cout << "enter a number: " ;
    cin >> n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin >> a[i];
    }


    merge_sort(a,0,n-1);
    cout << "\n" << "sorted array";
    for(i=0;i<n;i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}