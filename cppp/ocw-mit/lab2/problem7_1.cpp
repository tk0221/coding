//Hoon Kim
/* 
   swap function call by ref and call by pointer
*/

#include <iostream>
using namespace std;
void swap_ref(int &a, int &b){
  int tmp = a;
  a = b;
  b = tmp;

}

void swap_pnt(int *a, int *b){
  int tmp =*a;
  *a = *b;
  *b = tmp;
}

int main(){
   int a = 9, b = 7;

   cout << a << " " << b <<endl;
   swap_ref(a, b);
   cout << a << " " << b <<endl;
   swap_pnt(&a, &b);

   cout << a << " " << b <<endl;

  return 0;
}
