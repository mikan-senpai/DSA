#include <iostream>
using namespace std;
template<typename T>
class QueueUsingArray{

    T*data;
    int nextIndex;
    int firstIndex;
    int sizearray;
    int capacity;


    public:

    QueueUsingArray()
    {
        data = new T[5];
        nextIndex = 0;
        firstIndex = -1;
        sizearray=0;
        capacity=5;

    }

    int getSize() 
    {
        return sizearray;
    }

   
    bool isEmpty()
    {
        return sizearray==0;
    }



    T front()
    {
        if(isEmpty())
        {
            cout<<"queue empty!"<<endl;
            return 0;
        }
        return data[firstIndex];
    }
    
    // to insert an element
    void enqueue(T userdata){   


        if( sizearray == capacity )
        {
            int* newdata = new int[capacity*2];
            int j = 0; 
            for(int i = firstIndex ; i < capacity ; i++)
            {
                newdata[j] = data[i];
                j++;
            }   
            for(int i=0 ; i < nextIndex;i++)
            {
                newdata[j] = data[i];
                j++;
            }
            delete[] data;
            data = newdata;

            firstIndex = 0; 
            nextIndex=capacity;
            capacity =capacity*2;
            
        }

        data[nextIndex] = userdata;
        nextIndex=(nextIndex + 1)  % capacity;
        
        if(firstIndex == -1)
        {
            firstIndex = 0;
        }


        sizearray++;
    } 
    







    T dequeue()
    {
        if(isEmpty())
        {
            cout<<"queue empty!"<<endl;
            return 0;
        }
        T ans= data[firstIndex];
        firstIndex=(firstIndex + 1) % capacity;
        sizearray--;

        if(sizearray == 0)
        {
            firstIndex = -1;
            nextIndex = 0;
        }

        return ans;
    }

};