
//Single Linked List

#include <iostream>
 
using namespace std;

typedef struct ListElement {
  struct ListElement *next;
} ListElement;

typedef struct IntElement {
  struct IntElement *next;
  int data;
} IntElement;

bool insertInFront ( IntElement **head, int data){
  IntElement *newElem = new IntElement;
  if(!newElem) return false;
  
  newElem->data = data;
  newElem->next = *head;
  *head = newElem;
  return true;
}

int main(){

  IntElement *head;



  


  return 0;

}
