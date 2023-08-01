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
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Add any other parts needed
}
