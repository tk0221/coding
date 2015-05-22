//Hoon Kim

#include <iostream>

using namespace std;

int main(){
  while(1){
    int N;
    cin>>N;
    cout<<((N%5 == 0 && N >=0) ? N/5 : -1)<<"\n";
  }
  return 0;

    
}
