//Hoon Kim
/*
  wirte a function that return the length of a string (char *)

  Do not use STL
 */

#include <iostream>

using namespace std;

int func(const char *);

int main(){

  char * str1 = "";
  char * str2 = "Hello World!";

  cout <<"First str : " << str1 << " : " << func(str1) <<endl;
  cout <<"Second str : " << str2 << " : " << func(str2) <<endl;

}

int func(const char * str){
  int length = 0;
  while(*(str+length)!='\0')
    length++;
  return length;

}
