// Main method: the entry point of the program
public static void main(String[] args) {

    System.out.println("\n============================================================");
    System.out.println("                 SEARCH & SORT ALGORITHMS                  ");
    System.out.println("============================================================\n");


    // Algorithm 1 =========================================================================================
    System.out.println("********************** LINEAR SEARCH **********************\n");


    // Linear Search Algorithm ------------------------------------------------------------
    // Create and initialize an array of integers
    int[] numbers01 = {3, 8, 12, 19, 27, 34, 41, 46, 52, 58,
            63, 71, 79, 84, 91, 97, 105, 112, 118, 125,
            133, 141, 149, 156, 164, 171, 179, 187, 194, 202,
            215, 223, 237, 245, 258, 267, 279, 291, 305, 318,
            329, 341, 356, 372, 389, 401, 418, 435, 452, 478};

    int numberOfSearch = 223;

    System.out.println("Original Array:");
    for (int number : numbers01)
        System.out.print(number + " ");
    System.out.println();

    int result = LinearSearchExample.linearSearch(numbers01, numberOfSearch);

    System.out.println("\nSearch Result:");
    if (result == -1)
        System.out.println("❌ Element NOT found in array");
    else
        System.out.println("✅ Element found at index: " + result);

    System.out.println("\n============================================================\n");


    // Algorithm 2 =========================================================================================
    System.out.println("********************** BINARY SEARCH **********************\n");


    // Binary Search Algorithm ------------------------------------------------------------
    int[] numbers02 = {3, 8, 12, 19, 27, 34, 41, 46, 52, 58,
            63, 71, 79, 84, 91, 97, 105, 112, 118, 125,
            133, 141, 149, 156, 164, 171, 179, 187, 194, 202,
            215, 223, 237, 245, 258, 267, 279, 291, 305, 318,
            329, 341, 356, 372, 389, 401, 418, 435, 452, 478};

    int numberOfSearch1 = 223;

    System.out.println("Original Array:");
    for (int number : numbers02)
        System.out.print(number + " ");
    System.out.println();

    int result2 = BinarySearchExample.binarySearch(numbers02, numberOfSearch1);

    System.out.println("\nSearch Result:");
    if (result2 == -1)
        System.out.println("❌ Element NOT found in array");
    else
        System.out.println("✅ Element found at index: " + result2);

    System.out.println("\n============================================================\n");


    // Algorithm 3 =========================================================================================
    System.out.println("********************** BUBBLE SORT **********************\n");


    // Bubble Sort Algorithm ------------------------------------------------------------
    int[] numbers03 = {
            9, 12, 1, 19, 11, 34, 41, 46, 52, 58,
            63, 21, 79, 84, 44, 97, 15, 112, 235, 125,
            13, 141, 111, 122, 19, 25,
    };

    System.out.println("Original Array:");
    for (int number : numbers03)
        System.out.print(number + " ");
    System.out.println();

    int sortedArray[] = BubbleSortExample.bubblesSort(numbers03);

    System.out.println("\nSorted Array:");
    for (int number : sortedArray)
        System.out.print(number + " ");
    System.out.println();

    System.out.println("\n============================================================\n");


    // Algorithm 4 =========================================================================================
    System.out.println("********************** SELECTION SORT **********************\n");


    // Selection Sort Algorithm ------------------------------------------------------------
    int[] numbers04 = {
            9, 12, 1, 19, 11, 34, 41, 46, 52, 58,
            63, 21, 79, 84, 44, 97, 15, 112, 235, 125,
            13, 141, 111, 122, 19, 25,
    };

    System.out.println("Original Array:");
    for (int number : numbers04)
        System.out.print(number + " ");
    System.out.println();

    SelectionSortExample.SelectionSortAsc(numbers04);

    System.out.println("\nSorted Array (Ascending):");
    for (int number : numbers04)
        System.out.print(number + " ");
    System.out.println();

    SelectionSortExample.SelectionSortDesc(numbers04);

    System.out.println("\nSorted Array (Descending):");
    for (int number : numbers04)
        System.out.print(number + " ");
    System.out.println();

    System.out.println("\n============================================================");

}