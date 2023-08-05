package myLibrary.GraphAlgo;

public class myStack {
    int pointer;
    int[] array;

    // Define stack
    myStack(int size) {
        array = new int[size];
        pointer = 0;
    }

    // Push doubles size of array if out of memory
    public void push(int data) {
        if(pointer >= array.length) array = increaseSize();
        array[pointer] = data;
        pointer++;
    }

    // Pop returns -1 when empty
    // instead could return Int max or min instead
    public int pop() {
        if(pointer <= 0) return -1;
        pointer--;
        int temp = array[pointer];
        array[pointer] = 0;
        return temp;
    }

    /*
    Display stack copied output based on screenshots
    would have used this to only print values in stack rather than entire array
    for(int i = 0; i <= pointer; i++){
        System.out.print(array[i] + " ");
    }
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
        for(int i = 0; i < array.length; i++){
            bigger[i] = array[i];
        }
        return bigger;
    }

    public boolean isEmpty(){
        return this.pointer == 0;
    }
}
