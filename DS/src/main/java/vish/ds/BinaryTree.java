package vish.ds;

public class BinaryTree {

	static Node root;
	
	BinaryTree() {
		
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insert(50, "Producer");
		bt.insert(25, "Director");
		bt.insert(15, "Assistant director");
		bt.insert(80, "Executive Producer");
		bt.insert(75, "Executive producer 1");
		
		bt.inorderTraverse(BinaryTree.root);
	}
	
	
	public void insert(int key, String data) {
		
		// Create the node
		Node newNode = new Node(key, data);
		
		// If root doesnt exist, create one
		if(root == null) {
			root =  newNode;
			return;
		}
		else { // Insert the node into appropriate position in the B-Tree
			
			Node currNode = root;

			while(true) {
				Node parent = currNode;
				if(key < currNode.key) {
					
					currNode = currNode.leftChild;
					
					if(currNode == null) {
						// insert the node
						parent.leftChild = newNode;
						break;
					} 
					
				} else {
					currNode = currNode.rightChild;
					
					if(currNode == null) {
						// insert the node
						parent.rightChild = newNode;
						break;
					} 
				}
			}
		}
	}
	
	public void inorderTraverse(Node node) {
		if(node != null) {
			inorderTraverse(node.leftChild);
			System.out.println(node.key + ":" + node.data);
			inorderTraverse(node.rightChild);
		}
	}
	
	public void preorderTraverse(Node node) {
		if(node != null) {
			System.out.println(node.key + ":" + node.data);
			preorderTraverse(node.leftChild);
			preorderTraverse(node.rightChild);
		}
	}
	
	public void postorderTraverse(Node node) {
		if(node != null) {
			postorderTraverse(node.leftChild);
			postorderTraverse(node.rightChild);
			System.out.println(node.key + ":" + node.data);
		}
	}
	
}

class Node {

	int key;
	String data;
	Node leftChild;
	Node rightChild;
	
	Node(int p_key, String p_data) {
		key = p_key;
		data = p_data;
	}
	
}
