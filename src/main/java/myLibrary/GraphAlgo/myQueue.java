package myLibrary.GraphAlgo;

public class myQueue {
	int[] array;
	int pointer;
	// Define Queue
	myQueue(int size){
		array = new int[size];
		pointer = 0;
	}
	
	// Enqueue
	public void enqueue(int data)
	{
		array[pointer] = data;
		pointer++;
	}
	
	// Dequeue
	public int dequeue()
	{
		if( pointer == 0) return -1;
		int temp = array[0];
		for(int i = 0; i < pointer - 1; i++){
			array[i] = array[i + 1];
		}
		array[pointer - 1] = 0;

		pointer--;
		return temp;
	}
	
	// Display queue
	public void display()
	{
		for (int value: array){
			System.out.print(value + " - ");
		}
		System.out.println();
	}

	// Add any other parts needed
	public boolean isEmpty(){
        return pointer == 0;
    }
}
