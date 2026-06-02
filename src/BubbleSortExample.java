public class BubbleSortExample {

    // Method to swap two elements inside the array
    static public void swapTowNumbers(int arr[], int num1, int num2) {

        // Temporary variable used to store one value during swapping
        int temp;

        // Store the value at index num1 in temp
        temp = arr[num1];

        // Replace the value at index num1 with the value at index num2
        arr[num1] = arr[num2];

        // Put the original value of arr[num1] into arr[num2]
        arr[num2] = temp;
    }

    // Method that sorts the array using Bubble Sort
    static int[] bubblesSort(int arr[]) {

        // Get the length of the array
        int n = arr.length;

        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - 1; j++) {

                // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {

                    // Swap the two elements if they are in the wrong order
                    swapTowNumbers(arr, j, j + 1);
                }
            }
        }

        // Return the sorted array
        return arr;
    }
}