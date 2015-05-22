//HoonKim

#include <iostream>

using namespace std;

int main(){

  int n,m;
  cout<<"Insert N : ";
  cin>>n;
  m=n;
  int acc;
  cin >> acc;
  n--;
  int min = acc;
  int max = acc;

  for (;n-->0;){
    int tmp;
    cin>>tmp;
    acc+=tmp;
    if(tmp < min)
      min = tmp;
    if(tmp > max)
      max = tmp;
  }
  double mean = acc/(m*1.0);
  cout << "Mean : " << mean << endl;
  cout << "Max  : " << max << endl;
  cout << "Min  : " << min << endl;
  cout << "Range: " << max-min << endl;

  return 0;


}
