// Main method: the entry point of the program
void main(String[] args) {

    // Linear Search Algorithm ------------------------------------------------------------

    // Create and initialize an array of integers
    int[] numbers = {12, 44, 5, 64, 75, 4, 3};

    // Define the value that we want to search for in the array
    int numberOfSearch = 4;

    // Display a title before printing the array elements
    System.out.println("Original Array:");

    // For-each loop: iterate through every element in the array
    for (int number : numbers)

        // Print the current element followed by a space
        System.out.println(number + " ");

    // Print a blank line for better output formatting
    System.out.println();

    // Call the linearSearch method and store the returned index
    int result = LinearSearchExample.linearSearch(numbers, numberOfSearch);

    // Check if the search method returned -1
    if (result == -1)

        // Display a message if the element was not found
        System.out.println("The element is not found in the Array.");

        // Execute this block if the element was found
    else

        // Display the index where the element was found
        System.out.println("The element found at index: " + result);

    // End of Linear Search Algorithm -----------------------------------------------------
}