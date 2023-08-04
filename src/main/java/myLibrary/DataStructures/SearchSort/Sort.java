package myLibrary.DataStructures.SearchSort;

public class Sort {

    // insertion sort applied in X_Sort, produces increasing value array.
    public void X_Sort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        // for value in array
        for (int i = 1; i < array.length; i++) {
            int toBeInserted = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > toBeInserted)) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = toBeInserted;
        }
    }

}
