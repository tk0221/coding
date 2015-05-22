#include <iostream>
using namespace std;

int main() {

	long arr[] = {6,0,9,6};
	long *ptr = arr;
	ptr++;
	cout << *arr<<" "<< *(arr+1)<<" "<< *(arr+2)<<" "<< *(arr+3)<<endl;
	cout << *ptr<< endl;
	
	long *ptr2 = arr + 3;
	cout << *ptr2<< endl;
	
	return 0;
}
