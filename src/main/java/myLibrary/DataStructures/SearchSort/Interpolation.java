package myLibrary.DataStructures.SearchSort;

public class Interpolation {

    // Apply interpolation search
    public int interpolationSearchIterative(int[] array, int key) {
        int min = 0;
        int max = array.length - 1;
        // sort the array into ascending values
        Sort sort = new Sort();
        sort.X_Sort(array);

        // while min != max or past and key between values at min and max
        while (min <= max && key >= array[min] && key <= array[max]) {
            int pos = min + ((key - array[min]) * (max - min)) / (array[max] - array[min]);

            // Out of bounds
            if (pos < min || pos > max) {
                return -1;
            }

            if (array[pos] == key) {
                return pos;
            }

            if (array[pos] < key) {
                min = pos + 1;
            } else {
                max = pos - 1;
            }
        }
        return -1;
    }
    // Add any other parts needed
}
