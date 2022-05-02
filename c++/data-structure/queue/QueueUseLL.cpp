#include "QueueUsingLL.h"
#include <iostream>
using namespace std;



int main()
{
    QueueUsingLL<int> q;
    q.enqueue(100);
    q.enqueue(300);
    q.enqueue(400);
    q.enqueue(500);
    q.enqueue(600);
    q.enqueue(700);
    q.enqueue(800);
    q.enqueue(900);

    cout<<q.front() << endl;
    cout<<q.isEmpty() << endl;
    cout<<q.getSize() << endl;



}