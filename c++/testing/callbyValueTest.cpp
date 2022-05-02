#include <iostream>
using namespace std;
void display(int arr[])
{
	for(int i=0 ; i < 5 ; i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}
void change(int arr[])
{
	arr[0]=99;
}
int main()
{
	int arr[5]={1,2,3,4,5};
	display(arr);
	change(arr);
	display(arr);


}







    <a href="https://www.google.com/"><img src="/css/2. Blog Page Structure/Blog Page Structure/image/logo_switchtocode.png" alt="hey" /></a>
        <div><a href="https://www.google.com/" target="_blank">lets google it</a></div>
        <div><h4>Coding Ninjas Official Blog</h4></div>
        <div>
            <img src="/css/2. Blog Page Structure/Blog Page Structure/image/coding_ninjas.png" alt="this is the heading banner">
        </div>


        https://www.postman.com/postman/workspace/postman-student-program/collection/9065401-a1abb6df-a8ae-4841-baf4-79d6e67f7934/fork