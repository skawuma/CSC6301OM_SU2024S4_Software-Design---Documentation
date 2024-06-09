package org.skawuma;
/**
 * The BubbleSort method sorts an array of integers using the bubble sort algorithm.
 * @param myArray an integer array to be sorted
 */
public class BubbleSort {
    public static void bubbleSort(int[] myArray) {
        int temp;
        // loop over each element of the array to access them
        for (int i = 0; i < myArray.length - 1; i++) {
            // compare the elements of the array with a loop
            for (int j = 1; j < myArray.length - i; j++) {
                // compare two adjacent elements in the array
                if (myArray[j - 1] > myArray[j]) {
                    // Swap if the elements aren't in the right order
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }
    /**
     * The Main class run the program that performs bubble sort on the input array "myArray".
     * Gives an Output of { 2 21 22 29 31 37 45 50 56 67 88 }
     */
    public static void main(String[] args) {
        int[] myArray = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        bubbleSort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

}
