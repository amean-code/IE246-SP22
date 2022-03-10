//Given an array of integers taken with java call, write a code that prints the number
//if the array repeats a number "exactly" twice somewhere, and prints "No numbers are repeated exactly twice" otherwise.
package Preparations;

public class Quiz_1 {

    public static void main(String[] args) {
        int[] integers = { 4, 4, 5, 6, 7, 4, 3, 8, 3, 3, 4, 9, 9 };

        exactlyTwice(integers);
    }

    public static void exactlyTwice(int[] integers) {
        // to count the numbers
        int count = 0;
        // to see if we print something to the console or not
        boolean isPrinted = false;
        // iterating through integers
        for (int i = 0; i < integers.length; i++) {
            // iterating through integers
            for (int j : integers) {
                if (integers[i] == j) {
                    // counting the same numbers
                    count++;
                }
            }
            // checking if count is exactly two
            if (count == 2) {
                // saving the printed number
                System.out.println("There are exactly two " + integers[i] + "'s.");
                // making the number max because I dont want to print them.
                integers[i] = Integer.MAX_VALUE;
                // changing the isPrinted to true
                isPrinted = true;
            }
            // resetting the count before switching to the other number
            count = 0;
        }
        // if nothing is printed to the console print
        if (!isPrinted) {
            System.out.println("No numbers are repeated exactly twice");
        }
    }

}