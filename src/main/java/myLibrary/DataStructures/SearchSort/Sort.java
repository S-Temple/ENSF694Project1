package myLibrary.DataStructures.SearchSort;

public class Sort {
	
	// Apply one of the sorting algorithms
	void X_Sort()
	{

	}
	public static int[] insertionSortIncreasing(int[] array){
		if (array.length <= 1){
			return array;
		}

		// for value in array
		for(int i = 1; i < array.length; i++){
			int toBeInserted = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j] > toBeInserted)) {
				array[j+1] = array[j];
				j = j - 1;
				array[j+1] = toBeInserted;
			}
		}
		return array;
	}

	public static int[] insertionSortDecreasing(int[] array){
		if (array.length <= 1) return array;

		for (int i = 1; i < array.length; i++) {
			int toBeInserted = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < toBeInserted) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = toBeInserted;
		}
		return array;
	}
	// Add any other parts needed
}
