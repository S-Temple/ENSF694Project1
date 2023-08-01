package myLibrary.DataStructures.Linear;

public class SLL {

    // Define node
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Create node
    private Node head;

    // Add node to SLL
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search node in SLL
    public int searchNode(int key) {
        int i = 1;
        Node current = head;
        if (current.data == key) return i;

        while (current.next != null) {
            i++;
            if (current.data == key) return i;
            current = current.next;
        }
        return -1;
    }

    // Delete node from SLL
    public void deleteNode(int key) {
        if (head == null) return;
        Node current = head;
        while(current.next != null){
            if(key == current.next.data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        return;
    }

    // Display SLL
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Add any other parts needed

}

