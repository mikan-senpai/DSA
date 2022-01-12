#include<bits/stdc++.h>
using namespace std;

class Node{

public:
    int data;
    Node*next;

};

Node*newnode,*heads,*temp;




void createlist()
{
newnode = new Node;   // new is just allocating a chunk of memory for creating a new node and returning me a void pointer which contains the starting address 
cout<<"enter data\n";
cin>>newnode->data;
newnode->next=NULL;
if(heads==NULL)         //for 1st node
    {
        heads=newnode;
    }
else
    {
        temp=heads;

        while(temp->next!=NULL) //traverseing the temp
        {
            temp=temp->next;
        }
        temp->next=newnode;    //updating the add
    }
}

void display()
{
    if(heads==NULL)
    {
        cout<<"the list is empty"<<endl;
    }
    else
    {
        temp=heads;
        while(temp!=NULL)
    {
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    }
}
int main()
{
    bool ch=false;
    do{
    createlist();
    display();
    cout<<"do you want to contine:";
    cin>>ch;
    }while(ch);
}