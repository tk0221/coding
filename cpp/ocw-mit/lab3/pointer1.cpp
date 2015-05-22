#include <iostream>
using namespace std;

int main() {

	int x = 1;
	int *ptr = &x;
	
	cout <<ptr <<endl;
	cout <<*ptr <<endl;
	
	*ptr = 5;

	cout <<ptr <<endl;
	cout <<*ptr <<endl;
	

	return 0;
}
