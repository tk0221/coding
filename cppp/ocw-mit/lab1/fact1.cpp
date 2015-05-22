//Hoon Kim


#include <iostream>

using namespace std;

int main(){

  short number;
  cout <<"Enter a number : " ;
  cin >> number;

  cout <<"The factorial of " <<number << " is " <<endl ;

  int accumulator = 1;

  for (; number > 0 ; accumulator *= number--){
    cout << number << " : " << accumulator <<endl;
}
  cout << accumulator << endl;

  return 0;


}
