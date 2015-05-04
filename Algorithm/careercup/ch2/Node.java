
public class Node {
    Node left;
    Node right;
    int value;


    public Node(int data){
	left = null;
	right = null;
	this.value = data;
    }

    public void setLeft(Node node) {	
	this.left = node;
    }
    public void setRight(Node node) {
	this.right = node;
    }
    public void setValue(int data) {
	this.value = data;
    }

    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }
    public int getValue() {
	return value;
    }
	
}
