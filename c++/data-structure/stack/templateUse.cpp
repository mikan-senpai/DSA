#include<iostream>
using namespace std;

#include "Pair.cpp"

int main()
{

    // Pair<int> p1;
    
    // // pair<> p2;

    // p1.setx(10);

    // p1.sety(20);

    // cout<<p1.gety()<<" "<<p1.getx()<<endl;

    // Pair<double> p2;


    // p2.setx(10.43);
    // p2.sety(20.194);
    // cout<<p2.getx()<<" "<<p2.gety()<<endl;



    // Pair<char> p3;


    // p3.setx('h'); 
    // p3.sety('e');
    // cout<<p3.getx()<<" "<<p3.gety()<<endl;

    Pair<int,double> p4;
    p4.setx(313);
    p4.sety(123.244);


    cout<<p4.getx()<<" "<<p4.gety()<<endl;
 
}