#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};

Node *newnode, *head, *temp, *tail;
void create_linkedlist()
{
    int choice = 1;
    while (choice)
    {
        newnode = new Node;

        cout << "Enter the data do you want to insert";
        cin >> newnode->data;
        newnode->next = 0;
        if (head == 0)
        {
            head = temp = newnode;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        cout << "do you want to continue";
        cin >> choice;
    }
}

void insertion_at_end()
{
    newnode = new Node;

    cout << "Enter the data do you want to insert";
    cin >> newnode->data;
    newnode->next = 0;
    temp = head;
    while (temp->next != 0)
    {
        temp = temp->next;
    }
    temp->next = newnode;
}
void insertion_at_beg()
{
    newnode = new Node;
    cout << "Enter the data do you want to insert";
    cin >> newnode->data;
    newnode->next = head;
    head = newnode;
}
void display()
{
    temp=head;
    while(temp!=0)
    {   
        cout<<temp->data<<"-> ";
        temp=temp->next;

    }
}
int main()
{   
    system("cls");
    create_linkedlist();
    int count=0;
    display();
    insertion_at_end();
    display();


    return 0;
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               #include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};

Node *newnode, *head, *temp, *tail;
void create_linkedlist()
{
    int choice = 1;
    while (choice)
    {
        newnode = new Node;

        cout << "Enter the data do you want to insert";
        cin >> newnode->data;
        newnode->next = 0;
        if (head == 0)
        {
            head = temp = newnode;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        cout << "do you want to continue";
        cin >> choice;
    }
}

void insertion_at_end()
{
    newnode = new Node;

    cout << "Enter the data do you want to insert";
    cin >> newnode->data;
    newnode->next = 0;
    temp = head;
    while (temp->next != 0)
    {
        temp = temp->next;
    }
    temp->next = newnode;
}
void insertion_at_beg()
{
    newnode = new Node;
    cout << "Enter the data do you want to insert";
    cin >> newnode->data;
    newnode->next = head;
    head = newnode;
}
void display()
{
    temp=head;
    while(temp!=0)
    {   
        cout<<temp->data<<"-> ";
        temp=temp->next;

    }
}
int main()
{   
    system("cls");
    create_linkedlist();
    int count=0;
    display();
    insertion_at_end();
    display();


    return 0;
}