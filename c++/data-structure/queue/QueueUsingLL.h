#include <iostream>
template<typename T>
class Node {
public:
    T data;
    Node<T> *next;

    Node(T userData)
    {
        this->data = userData;
        next=NULL;
    }    
};
#include <iostream>
template<typename T>
class QueueUsingLL{
Node<T> *head;
Node<T> *tail;
int size;

public:
QueueUsingLL()
{
    head=NULL;
    tail=NULL;
    size=0;

}


int getSize()
{
    return size;
}


bool isEmpty()
{
    return size==0;
}
    


void enqueue(T userdata)
{
    // hey thisiismiakn ans santanua daikey da

    Node<T> *newnode =new Node<T>(userdata);

    if(head== NULL) 
    {
        head = newnode;
        tail=newnode;
    }
    else{
        tail->next =newnode;
        tail=newnode;
    }
    size++;
}



T front()
{
    if(isEmpty())
    {
        // cout<<"queue empty!"<<endl;
        return -1;
    }
    return head->data;
}


T dequeue()
{
    if(head==NULL)
    {
        // cout<<"queue empty!"<<endl;
        return 0;
    }   
    else{
        T ans=head->data;
        Node<T> *temp=head;
        head=head->next;
        delete temp;
        size--;
        return ans;
    }
    
}




};
