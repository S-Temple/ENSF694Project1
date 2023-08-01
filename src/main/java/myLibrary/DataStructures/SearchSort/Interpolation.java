package myLibrary.DataStructures.SearchSort;

public class Interpolation {
	
	// Apply interpolation search
	public int interpolationSearchIterative(int[] array, int key)
	{
		int min = 0;
		int max = array.length - 1;

		// while min != max or past and key between values at min and max
		while (min <= max && key >= array[min] && key <= array[max]) {
			if (min == max) {
				if (array[min] == key)
					return min;
				return -1;
			}
			// pos update min index + ((difference >< key and value at min) * size of locations in max-min) / (value at max - value at min)
			int pos = min + ((key - array[min]) * (max - min)) / (array[max] - array[min]);

			if (array[pos] == key)
				return pos;

			if (array[pos] < key)
				min = pos + 1;
			else
				max = pos - 1;
		}
		return -1;
	}
	// Add any other parts needed
}
