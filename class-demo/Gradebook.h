#include<iostream>
using namespace std;

class Gradebook {
public:
    Gradebook(string name){
        setCourseName(name);
    }
    
    void setCourseName(string name)
    {
        courseName=name;
    }   
    string getCourseName(){
        return courseName;
    }
    void displayMessage(){
        cout<<"welcome to the course "<<getCourseName()<<" !"<<endl;
    }


    private :
     string courseName;

};

