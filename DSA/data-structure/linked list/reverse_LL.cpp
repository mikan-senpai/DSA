#include<iostream>
using namespace std;
class Node
{
    public:
        int data;
        Node* next;

};
Node* head, *newnode,*dummy;
void createlist()
{
    newnode=new Node;
    cout<<"enter the data of the node\n";
    cin>>newnode->data;
    newnode->next=NULL;
    


    if(head==NULL)
    {
        head=newnode;
        dummy=head;
    }
    else
    {
        dummy=head;
        while(dummy->next!=NULL)
        {
            dummy=dummy->next;
        }
        dummy->next=newnode;
        
    }
}
void display()
{
    int c=0;
    if(head==NULL)
    {
        cout<<"the list is empty ";
    }
    else
    {
        dummy=head;
        while (dummy!=NULL)
        {   
            cout<<dummy->data<<"->";
            c++;
            dummy=dummy->next;
        } 
        cout<<"\nthe count is "<<c;       
    }
}
void reverseLL()
{
    if (head==NULL)
    {
        cout<<"the list is empty "<<endl;
    }
    else
    {
        Node*nextptr;
        dummy=NULL;
        nextptr=head;
        while (head!=NULL)
        {
            nextptr=head->next;
            head->next=dummy;
            dummy=head;
            head=nextptr;   
        }
    }

}
int main()
{
    bool choice=true;
    do
    {
    createlist();
    display();
    cout<<"do you want to contine? ";
    cin>>choice;
    }while(choice);
    reverseLL();
    display();

}