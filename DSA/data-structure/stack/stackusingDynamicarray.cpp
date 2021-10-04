#include <iostream>
#include <climits>
using namespace std;

class stackusingDynamicarray {
	int *data;
	int nextIndex;
	int capacity;

	public :

	stackusingDynamicarray(){
		data=new int[4];
		nextIndex=0;
		capacity=4;

	}

	//return the number of elements present in my stack
	int size()
	{
		return nextIndex;
	}

	bool isEmpty()
	{
	// 	if (nextIndex == 0)
	// 	{
	// 		return true
	// 	}
	// 	else
	// 	{
	// 		return false;
	// 	}
		return nextIndex == 0;
	}

	//insert an element in the stack
	void push(int userdata)
	{

		// if(nextIndex== capacity)
		// {
		// 	cout<<"stack is full"<<endl;
		// }
            // here we dynamically allocate a new array with twice the sixe of the current array
            if(nextIndex == capacity)
            {
                int *newdata= new int[2*capacity];
                for(int i=0;i<capacity;i++)
                {
                    newdata[i]=data[i];
                }
                capacity *=2;
                delete [] data;
                data = newdata;

            }


			data[nextIndex]=userdata;
			nextIndex++;
	}

	// deleting the last elem
	int pop()
	{
		if(isEmpty())
		{
			cout<<"stack is empty"<<endl;
			return INT_MIN;
		}
		nextIndex--;
		return data[nextIndex];
	}
	int top()
	{
		if (isEmpty())
		{
			/* code */
			cout<<"stack is empty"<<endl;
		}
		return data[nextIndex-1];
	}
};