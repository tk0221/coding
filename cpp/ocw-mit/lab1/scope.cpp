#include <iostream>

using namespace std;

int main()
{
  int arg1;
  arg1= -1;
  int x, y, z;
  char myDouble = '5';
  char arg1 = 'A';
  cout <<arg1<<"\n";
  return 0;
}


// scope.cpp: In function ‘int main()’:
// scope.cpp:11:8: error: conflicting declaration ‘char arg1’
//    char arg1 = 'A';
//         ^
// scope.cpp:7:7: error: ‘arg1’ has a previous declaration as ‘int arg1’
//    int arg1;


//Can not declare same name, compile error
