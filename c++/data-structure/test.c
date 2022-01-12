<<"is prime no\n"#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node* link;
};
struct node* start = NULL;

void create()
{
        struct node *temp,*ptr;
        temp=(struct node *)malloc(sizeof(struct node));
        
        printf("Enter node data:");
        scanf("%d",&temp->data);
        temp->link=NULL;
        if(start==NULL)                                                                                                                                                        
        {
                start=temp;
        }
        else
        {
                ptr=start;
                while(ptr->link!=NULL)
                {
                        ptr=ptr->link;
                }
                ptr->link=temp;
        }
}

void display()
{
        struct node *ptr;
        if(start==NULL)
        {
                printf("List is empty:\n");
                return;
        }
        else
        {
                ptr=start;
                printf("The List elements are:");
                while(ptr!=NULL)
                {
                    printf("%d\t",ptr->data );
                    ptr=ptr->link ;
                }
                printf("\n");
        }
}

void insert_begin()
{
	struct 	node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	 if(newnode!=NULL)
	 {
        printf("Enter the data value for the node:" );
        scanf("%d",&newnode->data);
        if(start==NULL)
        {
                start=newnode;
        }
        else
        {
                newnode->link=start;
                start=newnode;
        }
	}
	
}

void insert_end()
{
	    struct node *temp,*ptr;
        temp=(struct node *)malloc(sizeof(struct node));
        
        printf("Enter node data:");
        scanf("%d",&temp->data);
        temp->link=NULL;
        if(start==NULL)
        {
                start=temp;
        }
        else
        {
                ptr=start;
                while(ptr->link!=NULL)
                {
                        ptr=ptr->link;
                }
                ptr->link=temp;
        }
	
}

void insert_pos()
{
    struct node *ptr,*temp;
    int i,pos;
    temp=(struct node *)malloc(sizeof(struct node));
    if(temp!=NULL)
    {
    	
    	printf("Enter the position for the new node to be inserted:");
    	scanf("%d",&pos);
    	printf("\nEnter the data value of the node:");
    	scanf("%d",&temp->data) ;
  
    	temp->link=NULL;
   		if(pos==0)
    	{
    		temp->link=start;
            start=temp;
    	}
    	else
    	{
    		ptr=start;
        	while(i<pos-1)
			{
				ptr=ptr->link;
				i++;
            	if(ptr==NULL)
            	{
                	printf("\nPosition not found:");
                	return;
            	}
        	}
        	temp->link =ptr->link;
        	ptr->link=temp;
		}
	}
}

void delete_begin()
{
        struct node *ptr;
        if(start==NULL)
        {
                printf("List is Empty:\n");
                return;
        }
        else
        {
                ptr=start;
                start=start->link ;
                printf("\nThe deleted element is :%d\t",ptr->data);
                free(ptr);
        }
}

void delete_end()
{
        struct node *temp,*ptr;
        if(start==NULL)
        {
                printf("\nList is Empty:");
                return;
        }
         else
        {
                ptr=start;
                while(ptr->link!=NULL)
                {
                        temp=ptr;
                        ptr=ptr->link;
                }
                temp->link=NULL;
                printf("\nThe deleted element is:%d\n",ptr->data);
                free(ptr);
        }
}

void delete_pos()
{
        int i,pos;
        struct node *temp,*ptr;
        if(start==NULL)
        {
            printf("The List is Empty:\n");
            exit(0);
        }
        else
        {
            printf("Enter the position of the node to be deleted:");
            scanf("%d",&pos);
            if(pos==0)
            {
                ptr=start;
                start=start->link ;
                printf("\nThe deleted element is:%d\n",ptr->data );
                free(ptr);
            }
            else
            {
                ptr=start;
                while(i<pos-1)
				{
					temp=ptr; 
					ptr=ptr->link;
					i++;
                    if(ptr==NULL)
                    {
                        printf("\nPosition not Found:");
                        return;
                    }
                }
                temp->link =ptr->link ;
                printf("\nThe deleted element is:%d\n",ptr->data );
                free(ptr);
            }
        }
}

int main()     
{
        int choice;
        while(1){
               
                printf(" 1.Create\n");
                printf(" 2.Display\n");
                printf(" 3.Insert at the beginning\n");
                printf(" 4.Insert at the end\n");
                printf(" 5.Insert at specified position\n");
                printf(" 6.Delete from beginning\n");
                printf(" 7.Delete from the end\n");
                printf(" 8.Delete from specified position\n");
                printf(" 9.Exit\n");
                printf("Enter your choice:");
                scanf("%d",&choice);
                switch(choice)
                {
                        case 1:
                                        create();
                                        break;
                        case 2:
                                        display();
                                        break;
                        case 3: 
                                        insert_begin();
                                        break;
                        case 4:
                                        insert_end();
                                        break;
                        case 5:
                                        insert_pos();
                                        break;
                        case 6:
                                        delete_begin();
                                        break;
                        case 7:
                                        delete_end();
                                        break;
                        case 8:
                                        delete_pos();
                                        break;
                        
                        case 9:
                                        exit(0);
                                        break;
                             
                        default:
                                        printf("\n Wrong Choice:");
                                        break;
                }
        }
        return 0;
}