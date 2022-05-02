#include<iostream>
#include "Pair.cpp"
using namespace std;

int main()
{

    Pair<Pair<int, int>, int> p2;
    
    p2.sety(10);
    
    Pair<int, int> p3;	
    
    p3.setx(15);
    p3.sety(16);

    p2.setx(p3);




    cout<<p2.getx().getx()<<endl;
    cout<<p2.getx().gety()<<endl;
    cout<<p2.gety()<<endl;


}
