#include <iostream>
using namespace std;

#include "StackUsingArray.cpp"

int main()
{
    StackUsingArray s(5);


    
    s.push(100);
    // s.push(300);
    // s.push(400);
    // s.push(500);
    // s.push(600);
    // s.push(700);
    // s.push(740);
    // s.push(990);
    // s.push(800);
    // s.push(700);

    // cout <<s.pop() << endl;
    cout <<s.top() << endl;
    // cout <<s.pop() << endl;
    // cout <<s.top() << endl;
    // cout<<s.getSize()<<endl;
    // cout<<s.isEmpty()<<endl;
}
