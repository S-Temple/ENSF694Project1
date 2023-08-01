package myLibrary.DataStructures.Tree;

public class BST_NodeQueue {
	Node[] array;
	int pointer;
	// Define Queue
	BST_NodeQueue(int size){
		array = new Node[size];
		pointer = 0;
	}
	
	// Enqueue
	public void enqueue(Node data)
	{
		array[pointer] = data;
		pointer++;
	}
	
	// Dequeue
	public Node dequeue()
	{
		Node temp = array[0];
		for(int i = 0; i < pointer - 1; i++){
			array[i] = array[i + 1];
		}
		array[pointer - 1] = null;
		pointer--;
		return temp;
	}

}
