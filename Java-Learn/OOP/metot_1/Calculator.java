package metot_1;

import java.util.Arrays;
import java.util.Random;

public class Calculator {

    public static void main(String[] args) {

        int numRows = 4;
        int numCols = 4;

        // Step 1: Generate random matrix
        int[][] matrix = new int[numRows][numCols];
        Random rand = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = rand.nextInt(100); // Generate a random number between 0 and 99
            }
        }

        // Print unsorted matrix
        System.out.println("Unsorted matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 2: Flatten matrix into one-dimensional array
        int[] flattened = new int[numRows * numCols];
        int k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                flattened[k++] = matrix[i][j];
            }
        }

        // Step 3: Sort array in descending order
        Arrays.sort(flattened);
        int[] sorted = new int[flattened.length];
        for (int i = 0; i < flattened.length; i++) {
            sorted[i] = flattened[flattened.length - i - 1];
        }

        // Step 4: Reshape sorted array back into matrix
        k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = sorted[k++];
            }
        }

        // Print sorted matrix
        System.out.println("Sorted matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
