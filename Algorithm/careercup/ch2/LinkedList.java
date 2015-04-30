import java.util.HashSet;


class Node {
    Node next = null;
    int data;

    public Node(int d) {
	data = d;
    }

    void appendToTail(int d) {
	Node end = new Node(d);
	Node n = this;
	while(n.next != null) {
	    n = n.next;
	}
	n.next = end;
    }

    Node deleteNode(Node head, int d) {

	Node n = head;
	if(n.data == d){
	    return head.next;
	}

	while(n.next != null) {
	    if(n.next.data == d){
		n.next=n.next.next;
		return head;
	    }
	    n=n.next;
	}
	return head;
    }

    //using table  running on O(N) time
    public static void deleteDups(Node n) {
	//	Hashtable table = new Hashtable();
	HashSet<Integer> table = new HashSet<Integer>();

	Node prev = null;
	while(n != null) {
	    if(table.contains(n.data)) {
		prev.next = n.next;
	    }else{
		table.add(n.data);
		prev = n;
	    }
	    n = n.next;
	}
    }
    //with out using memory, take O(N^2)
    public static void deleteDups2(Node n){
	if(n == null) return;
	Node current = n;
	while(current != null) {

	    Node runner = current;
	    while(runner.next != null) {
		if(runner.next.data == current.data) {
		    runner.next = runner.next.next;
		}else{
		    runner = runner.next;
		}
	    }
	}


    }
	       

    
}
