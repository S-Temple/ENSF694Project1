package myLibrary.DataStructures.Linear;

public class Stack {

	int pointer;
	int[] array;
	// Define stack
	Stack(int size){
		array = new int[size];
		pointer = 0;
	}
	
	// Push 
	public void push(int data)
	{
		array[pointer] = data;
		pointer++;
	}
	
	// Pop
	public int pop()
	{
		pointer--;
		int temp = array[pointer];
		array[pointer] = 0;
		return temp;
	}
	
	// Display stack
	public void display()
	{

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// Add any other parts needed

}
