/*
Given an integer linked list of which both first half and second half are sorted independently. Write a function to merge the two parts to create one single sorted linked list in place [do not use any extra space]. 
*/
//http://www.careercup.com/question?id=5724466092965888
//Author : Hoon Kim

public class SortLinkedList {

    class Node {

	//Some helper function
	public void addNode(Node newNode) {
	    Node cur = this;
	    while(cur.next != null) {
		cur = cur.next;
	    }
	    cur.next = newNode;
	}
	public Node(int val){
	    this.val = val;
	}

	int val;
	Node next;


    }
    

    public static void main(String[] args) {

	Node list1;
	

    }
    
    public Node sort(Node head) {
	Node root = head;
	

	return root;
    }




}
