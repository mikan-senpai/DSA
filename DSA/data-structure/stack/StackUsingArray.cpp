#include <iostream>
#include <climits>
using namespace std;

class StackUsingArray {
	int *data;
	int nextIndex;
	int capacity;

	public :

	StackUsingArray(int totalsize){
		data=new int[totalsize];
		nextIndex=0;
		capacity=totalsize;

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

		if(nextIndex== capacity)
		{
			cout<<"stack is full"<<endl;
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