
// Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

// Example 1:

// Input:
// str = 1abc23
// Output: 24
// Explanation: 1 and 23 are numbers in the
// string which is added to get the sum as
// 24.

#include <iostream>
using namespace std;

// 1aabbc22

int findSum(string str)
    {
        int num=0;
        int sum=0;
    for(int i=0;i<str.length();i++)	
    {
        if(str[i]>='0' && str[i]<='9')
        {
           num=num*10+(str[i]-'0');
           cout<<num<<endl;
        }
        else
        {
            sum+=num;
            num=0;
        }
    }
    return sum+num;
}


int main(){

    int num = findSum("7cad1");
    cout<<num<<endl;
}