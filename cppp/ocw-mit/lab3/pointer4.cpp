#include <iostream>
using namespace std;

void Dog(){
  cout<<"DOG"<<endl;
}

void Cat(){
  cout<<"CAT"<<endl;
}

int main()
{
  void (*p)();

  p = &Dog;
  (*p)();

  p = &Cat;
  (*p)();

  return 0;
}
