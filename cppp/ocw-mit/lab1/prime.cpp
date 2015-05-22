//Hoon Kim
#include <iostream>

using namespace std;

int main(){
  int n;
  cout << "Input n : " ;
  cin >> n;

  for (int i = 2; n > 0 ; ++i) {
    bool prime = true;
    for (int j = 2; j < i ; ++j) {

      if(i%j == 0) {
	prime = false;
	break;
      }
    }

    if(prime) {

      --n;
      cout << n << " : " << i <<endl;
    }
  }
  return 0;
}
