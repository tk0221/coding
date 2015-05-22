/*
linked list - singly liked list
 */

#include <iostream>
using namespace std;
typedef struct Node {
  int data;
  Node *next;
} Node;

int main() {
  int n;

  Node head;
  Node * ptr;

  head.next = ptr;


  while(cin>>n && n!=0){

    ptr = new Node;
    ptr->data = n;
    ptr->next = ptr;

  }

  ptr->next = NULL;

  cout <<"print"<<endl;

  cout<<head->next<<" " <<endl;

  return 0;

}
