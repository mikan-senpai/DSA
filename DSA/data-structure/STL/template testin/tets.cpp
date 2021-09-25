#include<iostream>
using namespace std;

template<typename T>

class Weight{
    private:
        T kg;
    public:
        void setData(T x)
        {
            kg=x;
        }
        T getData()
        {
            return kg;
        }
};
int  main()
{
    Weight <int>obj1;
    obj1.setData(9);
    obj1.getData();

    return 0;
}