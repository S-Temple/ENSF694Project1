package myLibrary.DataStructures.Tree;

public class Node 
{
	// Define BST node
    int data;
    Node left;
    Node right;

    Node(int value){
        this.data = value;
        this.right = null;
        this.left = null;
    }
}
