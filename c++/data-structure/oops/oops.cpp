#include <iostream>
using namespace std;
class Student
{
	string name;
public:

	int age;
	bool gender;

	Student()
	{
		cout<<"\nthis is the default constructor\n"<<endl;
	}

//default cnstructor
	~Student()
	{
		cout<<"\nDeconstructor called";
	}
	Student(string s,int a,bool g)
	{
		cout<<"this is the parameterised\n";
		name=s;
		age=a;
		gender=g;
	}//my parameterized  constructor

	Student(Student &a)
	{
		cout<<"thsi is a copy constructor";
		name=a.name;
		age=a.age;
		gender=a.gender;
	}
	bool operator == (Student &a)
	{
		if(name==a.name && age==a.age && gender==a.gender)
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	void getName()
	{
		cout<<"name ->"<<name<<endl;
		cout<<"age->"<<age<<endl;
		cout<<"gender->"<<gender;
 	}							
};
int main()
{
	Student a("mikan",21,1);
	
	// a.getName();
	Student b;
	Student c=a;
	if(c==a)
		{
			cout<<"\nsame";
		}
	else
		{
			cout<<"different";
		}
	// c.getName();
	// a.name="mikan";
	// a.age=21;
	// a.gender=1; 
	return 0;
}

/*#include <iostream>
using namespace std;
class Student
{
	string name;
public:

	int age;
	bool gender;

	Student()
	{
		cout<<"\nthis is the default constructor\n"<<endl;
	}

//default cnstructor
	~Student()
	{
		cout<<"\nDeconstructor called";
	}
	Student(string s,int a,bool g)
	{
		cout<<"this is the parameterised\n";
		name=s;
		age=a;
		gender=g;
	}//my parameterized  constructor

	Student(Student &a)
	{
		cout<<"thsi is a copy constructor";
		name=a.name;
		age=a.age;
		gender=a.gender;
	}
	bool operator == (Student &a)
	{
		if(name==a.name && age==a.age && gender==a.gender)
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	void getName()
	{
		cout<<"name ->"<<name<<endl;
		cout<<"age->"<<age<<endl;
		cout<<"gender->"<<gender;
 	}							
};
int main()
{
	Student a("mikan",21,1);
	
	// a.getName();
	Student b;
	Student c=a;
	if(c==a)
		{
			cout<<"\nsame";
		}
	else
		{
			cout<<"different";
		}
	// c.getName();
	// a.name="mikan";
	// a.age=21;
	// a.gender=1; 
	return 0;
}


 */