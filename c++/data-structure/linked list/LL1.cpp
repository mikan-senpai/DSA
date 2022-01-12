#include<iostream>
using namespace std;
class Node{
public:
    int data;
    Node* next;
};
Node* head,*temp,*newNode;
// void create_ll()
// {
//    cout<<"enter your choice"<<endl;
//  
void createLinkList()
{   
    bool continuelist=true; 
    while(continuelist)
    {
    newNode= new Node;
    cout<<"enter the data :";
    cin>>newNode->data;
    newNode->next=NULL;
    if(head==NULL)
    {

        head=newNode;
        temp=head;
    }
    else
    {
            
            temp->next=newNode;
            temp=newNode;
        
    }
    cout<<"do you want to continue ?"<<endl;
    cin>>continuelist;
    }
}
void Insert_at_end()
{
    
    newNode=new Node;
    cout<<"enter the data"<<endl;
    cin>>newNode->data;
    newNode->next=NULL;
    if(head==NULL)
    {   
        head=newNode;
    }
    else{
    temp=head;
    while(temp->next != NULL)
    {
        temp=temp->next;
    }
    temp->next=newNode;
    }
}
void Insert_at_begin()
{
    newNode=new Node;
    cout<<"enter the data"<<endl;
    cin>>newNode->data;
    newNode->next=NULL;
    if(head==NULL)
    {
        head=newNode;
    }
    else{
        newNode->next=head;
        head=newNode;
    }
}
void Insert_after_pos()
{
    int pos=0;
    cout<<"enter the position"<<endl;
    cin>>pos;
    newNode=new Node;
    cout<<"enter the data "<<endl;
    cin>>newNode->data;
    newNode->next=NULL;
    int i =1;
    while (i<pos)
    {
        temp=temp->next;
        i++;
    }
    newNode->next=temp->next;
    temp->next=newNode;    
}

void delete_at_end()
{

    if(head != NULL) {
        if(head->next == NULL) {
          head = NULL;
        } else {
          Node* temp = head;
          while(temp->next->next != NULL)
          {
            temp = temp->next;
          }
          Node* lastNode = temp->next;
          temp->next = NULL;
          free(lastNode); 
    // if (head==0)
    // {
    //     cout<<"List is empty"<<endl;
    // }
    // else
    // {
    //     temp=head;
    //     while(temp->next != NULL)
    //     {
    //         temp=temp->next;
    //     }
    //     Node* last=temp->next;
    //     temp->next=NULL;
    //     free(last);
    // }
}
    }
}
void delete_at_front()
{   
    
    if(head== NULL)
    {
        cout <<"the list is empty "<<endl;
    }
    else
    {
        temp=head;    
        head=temp->next;
        delete temp;
        cout<<head;
    }
}










void delete_at_postion()
{   
    //right code
    temp=head;

    int pos,i;
    cout<<"enter the position";
    cin>>pos;
    i=1;
    while(i<pos-1)
    {
        temp=temp->next;
        i++;
    }
    Node* Next_Node;
    Next_Node=temp->next;
    temp->next=Next_Node->next;
    delete (Next_Node);

    
    /* (wrong )mycode
    if (head==NULL)
    {
        cout<<"the list id empty "<<endl;
        
    }
    else
    {
    int pos=0;
    cout<<"enter the postion"<<endl;
    cin>>pos;
    int i =1;
    Node* prev;
    while(i<pos)
    {  
        prev=temp;
        temp=temp->next;
        i++;
    }
    prev->next=temp-> next;
    prev->next=NULL;
    delete temp;
    }*/
}


/*
adtiya(code)->right
void delete_from_pos()
{

    int pos, i;
    i = 1;

    Node *curr, *next;
    curr = head;
    cout << "Enter the position";
    cin >> pos;

    while (i < pos - 1)
    {
        curr = curr->next;
        i++;
    }

    next = curr->next;
    curr->next = next->next;
    delete (next);
}*/



void reverseLL()
{
    if (head==NULL)
    {
        cout<<"the list is empty "<<endl;
    }
    else
    {   
        
        Node*nextptr,*dummy;
        dummy=NULL;
        nextptr=head;
        while (head!=NULL)
        {
            nextptr=head->next;
            head->next=dummy;
            dummy=head;
            head=nextptr;   
        }
        head=dummy;
    }

}

void middle()
{
    if (head==NULL)
    {
      cout<<"the list is empty "<<endl;
    }
    else
    {
        Node* slow, *fast;
        slow=head;
        fast=head;
        while (fast != NULL && fast->next != NULL)
        {
            slow=slow->next;
            fast=fast->next->next;
        }
        cout<<"the middle is "<<slow->data<<endl;
    }
}


void palindrome()
{
    
}

void display()
{   
    if(head==NULL)
    {
        cout<<"the list is empty"<<endl;
    }
    else
    {   
        int count;
        Node* temp=head;
        cout<<"the list is : ";
        while (temp!=NULL)
        {
            count++;
            cout<<temp->data<<"->";
            temp=temp->next;
        }
        cout<<"null"<<endl;
    }

}
int main()
{
    int choice;
    bool menu=true;
    system("clear");
    
    
    while(menu)
    {
    cout<<"enter you choice\n 1 for craeting the link list\t 2 for displaying the linked list\n 3 for insert at end \t 4 for insert at begin \n 5 for insert after position \t6 for delete at the end \n 7 for  delete at the front \t 8 for delete at position \n 9 for reversing the the linked list \n 10 for middle"<<endl;
    
    cin>>choice;
    
    switch(choice)
    {
        case 1: createLinkList();   break;
        case 2: display();          break;
        case 3: Insert_at_end();    break;
        case 4: Insert_at_begin();  break;
        case 5: Insert_after_pos(); break;
        case 6: delete_at_end();    break;
        case 7: delete_at_front();  break;
        case 8: delete_at_postion();break;
        case 9: reverseLL();        break;
        case 10: middle();          break;
        default: cout<<"wrong choice"<<endl;
    }
    choice=0;
    cout<<"press 1 for menu list"<<endl;
    cin>>menu;
    }
}