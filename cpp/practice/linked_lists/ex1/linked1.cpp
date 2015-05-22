#include <iostream>

using namespace std;

struct Node {
  Node * prev;
  Node * next;
  void * data;
};

struct List{
  Node* head;
};

List* CreateList();
Node CreateNode();
void InseartNode(List list, Node node);
int main(){

  List * list = CreateList();

  //hong hong hong




  return 0;

}

void InseartNode(List list, Node node){

}
Node CreateNode(int data){
  Node* newNode = new Node;
  //not done
}
List* CreateList(){
  Node* head = new Node;
  head->prev = head;
  head->next = head;
  head->data = 0;

  List* list = new List;
  list->head = head;

  return 0;
}
