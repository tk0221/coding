//Dynamic memory allocation practice 
#include <iostream>
using namespace std;
int main(){

  int size;
  cout << "Input Size : " ;
  cin >> size;

  int * arr = new int [size];

 
  for(int i = 0 ; i < size ; ++i) {
    cout << i+1 << " is : " ;
    cin>> arr[i];
  }
  cout<<endl;
  for(int i = 0 ; i < size ; i++)
    cout << arr[i]<<endl;

  delete[] arr;

  return 0;
}
