#include <iostream>
#include <cstring>
using namespace std;


void hey(){

  char str[] = "Thisa ias a string";
  cout<<str<<endl;
  char * ch = strrchr(str,'a');
  cout<< ch << endl;
  cout<< str - ch <<endl;
  cout<<  ch - str <<endl ;
  cout << ch - str + 1;



  // c
}
 
int main()
{
  // hey();



  char str[] = "This is a sample string";
  char * pch;
  pch=strrchr(str,'s');

  cout<<pch<<endl;

  cout<<pch-str+1<<endl;
  // return 0;



  //  // Storing it in string array
  //   char string[] = "Geekj for Geeks";
  
  //   // The character we've to search for
  //   char character = 'k';
  
  //   // Storing in a pointer ptr
  //   char* ptr = strrchr(string, character);

  //   cout<<string<<endl;

  //   cout<<ptr<<endl;
    
  //   cout<< ptr - string +1<<endl; 


    // int arr[5]={0};
    // std::sort(arr,arr+5);



    // // ptr-string gives the index location
    // if (ptr)
    //     cout << "Last position of " << character
    //          << " in " << string << " is " << ptr - string;
  
    // // If the character we're searching is not present in the array
    // else
    //     cout << character << " is not present "
    //          << string << endl;
    // return 0;
}
