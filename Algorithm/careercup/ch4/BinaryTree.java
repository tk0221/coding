

class BinaryTree {

    public static void main(String[] args) {

	System.out.println("Practice BTree");
	int[] testArr = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7};
	Node tree = generateTree(testArr);

	
    }

    class Node {
	int data;
	Node left = null;
	Node right = null;

	public Node(int d){
	    data = d;
	}

    }

    //input : int[]
    //output : head of Binary Tree



    
}

