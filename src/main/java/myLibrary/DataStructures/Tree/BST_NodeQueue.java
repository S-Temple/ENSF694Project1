package myLibrary.DataStructures.Tree;

public class BST_NodeQueue {
    Node[] array;
    int queuePointer;
    int dequeuePointer;
    int size;

    // Define Queue
    BST_NodeQueue(int size) {
        array = new Node[size];
        queuePointer = 0;
        dequeuePointer = 0;
        this.size = 0;
    }

    // Enqueue
    public void enqueue(Node data) {
        if (size == array.length) array = increaseSize();
        if (queuePointer == array.length) queuePointer = 0;
        array[queuePointer] = data;
        queuePointer++;
        size++;
    }

    // Dequeue
    public Node dequeue() {
        if (size == 0) return null;
        if (dequeuePointer == array.length) dequeuePointer = 0;
        Node temp = array[dequeuePointer];
        array[dequeuePointer] = null;
        dequeuePointer++;
        size--;
        return temp;
    }

    public Node[] increaseSize() {
        Node[] bigger = new Node[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }
        return bigger;
    }

}
