package myLibrary.DataStructures.Linear;

public class Queue {
	int[] array;
	int pointer;
	// Define Queue
	Queue(int size){
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
		int temp = array[0];
		for(int i = 0; i < pointer; i++){
			array[i] = array[i + 1];
		}
		array[pointer] = 0;
		pointer--;

	}
	
	// Display queue
	public void display()
	{
		for (int i = 0; i < pointer; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Add any other parts needed
}
