package myLibrary.GraphAlgo;

public class myQueue {
    int[] array;
    int queuePointer;
    int dequeuePointer;
    int size;

    // Define Queue
    myQueue(int size) {
        array = new int[size];
        queuePointer = 0;
        dequeuePointer = 0;
        this.size = 0;
    }

    // Enqueue circle around to start of array until full then double size if full
    public void enqueue(int data) {
        if(size == array.length) array = increaseSize();
        if(queuePointer == array.length) queuePointer = 0;
        array[queuePointer] = data;
        queuePointer++;
        size++;
    }

    // Dequeue remove value unless empty and loop to start of array if end is reached
    public int dequeue() {
        if(size == 0) return -1;
        if(dequeuePointer == array.length) dequeuePointer = 0;
        int temp = array[dequeuePointer];
        array[dequeuePointer] = 0;
        dequeuePointer++;
        size--;
        return temp;
    }

    /* Display queue set up how provided screenshots worked
    code that makes more sense
        int i = 0;
        int value = 0;
        int pointer = dequeuePointer;
        while(i < this.size) {
            if(pointer == array.length) pointer = 0;
            value = array[pointer];
            System.out.print(value + " ");
            i++;
            pointer++;
        }
        System.out.println();

    */
    public void display() {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Add any other parts needed
    public int[] increaseSize(){
        int[] bigger = new int[array.length * 2];
        for(int i = 0;  i < array.length; i++){
            bigger[i] = array[i];
        }
        return bigger;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
