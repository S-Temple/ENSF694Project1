package myLibrary.DataStructures.Linear;

public class DLL {

	// Define node
    private static class Node {
        int data;
        DLL.Node next;
        DLL.Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
	// Create node
	Node head;
	// Add node
    public void addNode(int data) 
    {
        if (head == null) {
            head = new Node(data);
        }else{
            Node current = head;
            while( current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
            current.next.previous = current;
        }
    }   
    
    // Search node
    public int searchNode(int key)
    {
        int i = 1;
        DLL.Node current = head;
        if (current.data == key) return i;

        while (current.next != null) {
            i++;
            if (current.data == key) return i;
            current = current.next;
        }
        return -1;
    }
    
    // Delete node
    public void deleteNode(int key) 
    {
        if (head == null) return;
        else if (head.data == key) {
            
        }
    }
    
    // Display the DLL
    public void display() 
    {        
    } 
    
    // Add any other parts needed
}
