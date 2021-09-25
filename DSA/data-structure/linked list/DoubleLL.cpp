#include<iostream>
using namespace std;


class Node{
    public:
    int data;
    Node *next;
    Node *prev;
};

Node* newNode,*head,*temp;
void insert()
{
    newNode= new Node;
    cout<<"enter the data "<<endl;
    cin>>newNode->data;
    newNode->next=NULL;
    newNode->prev=NULL;
    if (head==NULL)
    {
        head=newNode;
        temp=head;

    }   
    else
    {   
        temp->next=newNode;
        temp->next->prev=temp;
        temp=temp->next;
    } 
}
void display()
{
    Node *dummy;
    if(head==NULL)
    {
        cout<<"list is empty "<<endl;
    }
    else
    {
        dummy=head;
        while (dummy!=NULL)
        {
            cout<<dummy->prev<<"-"<<dummy->data<<"-"<<dummy->next<<" -> ";
            dummy=dummy->next;
        }
    }
}



void delete_end()
{
    if(head==NULL)
    {
        cout<<"the list is empty"<<endl;
    }
    else
    {
        temp==head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->prev->next=NULL;
        delete (temp);
    }
}


int main()
{
    system("clear");
    bool choice=true;
    int menu;
    while (choice)
   
    {
        cout<<"1 fro insert \n 2 for display \n 3 for delete"<<endl;
        cin>>menu;
        switch(menu)
        {
            case 1 : insert();  break;
            case 2 : display(); break;
            case 3 : delete_end();  break;
            default :cout<<"wrong choice"<<endl;
        }
       
    // insert();
    // display();
    choice=0;
    cout<<"do you want to continue"<<endl;
    cin>>choice;
    }
}

