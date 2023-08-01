package myLibrary.GraphAlgo;
public class myStack {
	int[] array;
	int pointer;
	// Define Queue
	myStack(int size){
		array = new int[size];
		pointer = 0;
	}
	
	// Enqueue
	public void push(int data)
	{
		array[pointer] = data;
		pointer++;
	}
	
	// Dequeue
	public int pop()
	{
		if( pointer == 0) return -1;
		pointer--;
		int temp = array[pointer];
		array[pointer] = 0;
		return temp;
	}
	
	// Display queue
	public void display()
	{
        for (int value : array) {
            System.out.print(value + " - ");
        }
		System.out.println();
	}

	// Add any other parts needed
	public boolean isEmpty(){
        return pointer == 0;
    }
}
