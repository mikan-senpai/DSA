#include <iostream>
#include <climits>
using namespace std;
template<typename T>

class stackusingDynamicarray {
	T *data;
	int nextIndex;
	int capacity;

	public :

	stackusingDynamicarray()
	{
		data=new T[4];
		nextIndex=0;
		capacity=4;

	}

	//return the number of elements present in my stack
	T size()
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
	void push(T userdata)
	{

		// if(nextIndex== capacity)
		// {
		// 	cout<<"stack is full"<<endl;
		// }
            // here we dynamically allocate a new array with twice the sixe of the current array
            if(nextIndex == capacity)
            {
                T *newdata= new T[2*capacity];
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
	T pop()
	{
		if(isEmpty())
		{
			cout<<"stack is empty"<<endl;

		}
		nextIndex--;
		return data[nextIndex];
	}
	T top()
	{
		if (isEmpty())
		{
			/* code */
			cout<<"stack is empty"<<endl;
			return 0;
		}
		return data[nextIndex-1];
	}
};