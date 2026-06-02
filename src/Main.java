// Main method: the entry point of the program
void main(String[] args) {

    // Algorithm 1 =========================================================================================


    // Linear Search Algorithm ------------------------------------------------------------
    // Create and initialize an array of integers
    int[] numbers01 = {     3,  8, 12, 19, 27, 34, 41, 46, 52, 58,
            63, 71, 79, 84, 91, 97, 105, 112, 118, 125,
            133, 141, 149, 156, 164, 171, 179, 187, 194, 202,
            215, 223, 237, 245, 258, 267, 279, 291, 305, 318,
            329, 341, 356, 372, 389, 401, 418, 435, 452, 478};
    // Define the value that we want to search for in the array
    int numberOfSearch = 223;
    // Display a title before printing the array elements
    System.out.println("Original Array:");
    // For-each loop: iterate through every element in the array
    for (int number : numbers01)
        // Print the current element followed by a space
        System.out.print(number + " ");
    // Print a blank line for better output formatting
    System.out.println();
    // Call the linearSearch method and store the returned index
    int result = LinearSearchExample.linearSearch(numbers01, numberOfSearch);
    // Check if the search method returned -1
    if (result == -1)
        // Display a message if the element was not found
        System.out.println("The element is not found in the Array.");
        // Execute this block if the element was found
    else
        // Display the index where the element was found
        System.out.println("The element found at index: " + result);
    // End of Linear Search Algorithm -----------------------------------------------------



    // Algorithm 2 =========================================================================================


    // Binary Search Algorithm ------------------------------------------------------------
    // Create and initialize an array of integers
    int[] numbers02 = {     3,  8, 12, 19, 27, 34, 41, 46, 52, 58,
            63, 71, 79, 84, 91, 97, 105, 112, 118, 125,
            133, 141, 149, 156, 164, 171, 179, 187, 194, 202,
            215, 223, 237, 245, 258, 267, 279, 291, 305, 318,
            329, 341, 356, 372, 389, 401, 418, 435, 452, 478};
    // Define the value that we want to search for in the array
    int numberOfSearch1 = 223;
    // Display a title before printing the array elements
    System.out.println("Original Array:");
    // For-each loop: iterate through every element in the array
    for (int number : numbers02)
        // Print the current element followed by a space
        System.out.print(number + " ");
    // Print a blank line for better output formatting
    System.out.println();
    // Call the Binary search method and store the returned index
    int result2 = BinarySearchExample.binarySearch(numbers02, numberOfSearch1);
    // Check if the search method returned -1
    if (result2 == -1)
        // Display a message if the element was not found
        System.out.println("The element is not found in the Array.");
        // Execute this block if the element was found
    else
        // Display the index where the element was found
        System.out.println("The element found at index: " + result2);
    // End of Binary Search Algorithm -----------------------------------------------------



    // Algorithm 3 =========================================================================================

// Bubble Sort Algorithm ------------------------------------------------------------

// Create an integer array with unsorted numbers
    int[] numbers03 = {
            9, 12, 1, 19, 11, 34, 41, 46, 52, 58,
            63, 21, 79, 84, 44, 97, 15, 112, 235, 125,
            13, 141, 111, 122, 19, 25,
    };

// Print a title before displaying the original array
    System.out.println("Original Array:");

// For-each loop: iterate through every element in the array
    for (int number : numbers03)

        // Print each number followed by a space
        System.out.print(number + " ");

// Move to the next line after printing the array
    System.out.println();


// Call the bubble sort method and store the sorted array
    int sortedArray[] = BubbleSortExample.bubblesSort(numbers03);


// Print a title before displaying the sorted array
    System.out.println("Sorted Array:");


// For-each loop: iterate through every element in the sorted array
    for (int number : sortedArray)

        // Print each sorted number followed by a space
        System.out.print(number + " ");

// Move to the next line after printing the sorted array
    System.out.println();


// End of Bubble Sort Algorithm -----------------------------------------------------



}