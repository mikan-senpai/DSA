#include <iostream>

#include "QueueDynamic.h" 

using namespace std;



int main()
{
    QueueUsingArray<int> q;

    q.enqueue(100);
    q.enqueue(300);
    q.enqueue(500);
    q.enqueue(600);
    q.enqueue(700); 
    q.enqueue(800);
    q.enqueue(800);
    q.enqueue(800);
    q.enqueue(800);
    q.enqueue(800);


    
    cout << q.front() << endl;

    // cout << q.front() << endl;
    // cout << q.dequeue()<<endl;
    // cout << q.dequeue()<<endl;
    // cout << q.dequeue()<<endl;

    // cout<< q.getSize()<<endl;
    // cout<< q.isEmpty()<<endl;

}