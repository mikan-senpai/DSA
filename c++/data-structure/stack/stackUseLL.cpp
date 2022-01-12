#include <iostream>
using namespace std;

#include "stackUsingLL.cpp"

int main()
{
    stackUsingLL<int> s;
    s.push(100);
    s.push(300);
    s.push(400);
    s.push(500);
    s.push(600);
    // s.push(700);

    cout <<s.pop() << endl;
    cout <<s.top() << endl;
    cout <<s.pop() << endl;
    cout <<s.top() << endl;
    cout<<s.getSize()<<endl;
    cout<<s.isEmpty()<<endl;
}
