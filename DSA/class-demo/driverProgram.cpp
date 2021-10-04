#include<iostream>
#include"Gradebook.h"
using namespace std;
int main()
{
    Gradebook gb1("ops with c++");
    Gradebook gb2("Cybersecurity");


    cout<<"Gradebook 1 "<<gb1.getCourseName()<<endl;
    cout<<"Gradebook 2 "<<gb2.getCourseName()<<endl;
}