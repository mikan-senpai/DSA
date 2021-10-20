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

    QueueUsingArray(int totalsize)
    {
        data = new T[totalsize];
        nextIndex = 0;
        firstIndex = -1;
        sizearray=0;
        capacity=totalsize;

    }

    int getSize() 
    {
        return sizearray;
    }

   
    bool isEmpty()
    {
        return sizearray==0;
    }
    
    // to insert an element
    void enqueue(T userdata){   

        if( sizearray == capacity )
        {
            cout<<"Queue Full !"<<endl; 
            return;
        }

        data[nextIndex] = userdata;
        nextIndex=(nextIndex + 1)  % capacity;
        
        if(firstIndex == -1)
        {
            firstIndex = 0;
        }


        sizearray++;
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