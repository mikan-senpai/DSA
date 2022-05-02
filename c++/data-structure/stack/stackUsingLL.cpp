#include <iostream>
using namespace std;



template<typename T>
class Node{

    public:
    T data;
    Node<T> *next;

    Node(T data){
        this->data = data;
        next = NULL;
    }
};



template<typename T>
class stackUsingLL {
    Node<T> *head;
    int size;  //number oif elements present i stackUsingLL;

    public:

    stackUsingLL(){
        head=NULL;
        size=0;
    }



    int getSize(){
        return size;
    }


    bool isEmpty(){
        return size==0;
    }


    void push(T element){
        Node<T> *newNode=new Node<T>(element);

        if (head == NULL)
        {
            head = newNode;
        }

        else{
            newNode->next = head;
            head= newNode;
        }
        

        size++;
        
    }

    int pop()
    {
        if(isEmpty())
        {
            cout<<"stack is empty"<<endl;
            return 0;
        }
        else
        {

            T ans = head->data;
        
            Node<T> *temp = head;
            head = head->next;
            delete (temp); 
            size--;
            return ans;
        }
    }

    int top(){
        if(isEmpty())
        {
            cout<<"stack is empty "<<endl;
            return 0;
        }
        return head->data;

    }

};