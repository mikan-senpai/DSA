#include<iostream>
// using namespace std;




#include "stackusingDynamicarray.cpp"


int main()
{
    stackusingDynamicarray<int> stack;
    stack.push(129);
    stack.push(12);
    stack.push(1223);
    stack.push(1223324);
    stack.push(76);
    stack.push(45);
    stack.push(898);

    cout<<stack.top()<<endl;
    cout<<stack.isEmpty()<<endl;


}