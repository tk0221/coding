
class NodeDemo {

    public static void main(String[] args) {
	System.out.println("Binary tree demo");

	Node root = new Node(1);
	addNode(root, new Node(2));
	addNode(root, new Node(3));
	addNode(root, new Node(4));
	addNode(root, new Node(5));
	addNode(root, new Node(6));
	addNode(root, new Node(7));
	addNode(root, new Node(8));
	System.out.println(countNode(root));
	System.out.println();

	printBTreeA(root);

    }

    public static void printBTreeA(Node root){
	//print every data in Node without structure.

	if(root == null) return;
	//System.out.printf(" %d ", root.getValue());
	    printBTreeA(root.left);
	    printBTreeA(root.right);
	    System.out.printf(" %d ", root.getValue());
	
	
	    
	
	
    }
    
    public static int countNode(Node root) {
	if(root == null)  return 0;
	else {
	    int count = 1;
	    count+=countNode(root.left);
	    count+=countNode(root.right);
	    return count;
	}
	
    }
    
    public static void addNode(Node root, Node newNode){

	Node current = root;
	if(current.left != null && current.right != null)
	    addNode(root.left, newNode);
	else if(current.left == null)
	    current.setLeft(newNode);
	else
	    current.setRight(newNode);
	
    }
    
}
