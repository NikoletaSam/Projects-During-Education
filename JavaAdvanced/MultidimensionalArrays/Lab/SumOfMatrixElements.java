package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class SumOfMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowAndCol = scanner.nextLine().split(",\\s+");
        int numOfRows = Integer.parseInt(rowAndCol[0]);
        int numOfCols = Integer.parseInt(rowAndCol[1]);

        int[][] matrix = new int[numOfRows][numOfCols];
        int sumOfElements = 0;

        for (int row = 0; row < numOfRows; row++) {
            String[] input = scanner.nextLine().split(",\\s+");
            for (int col = 0; col < numOfCols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
                sumOfElements += matrix[row][col];
            }
        }

        System.out.println(numOfRows);
        System.out.println(numOfCols);
        System.out.println(sumOfElements);
    }
}
