package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[numOfRows][];
        for (int row = 0; row < numOfRows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int sumPrimaryDiagonal = getSumPrimaryDiagonalElements(matrix);
        int sumSecondaryDiagonal = getSumSecondaryDiagonal(matrix);

        int difference = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
        System.out.println(difference);
    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        int totalSum = 0;
        int beginRow = 0;
        int beginCol = matrix[beginRow].length - 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == beginRow && col == beginCol){
                    totalSum += matrix[row][col];
                    beginRow++;
                    beginCol--;
                }
            }
        }
        return totalSum;
    }

    private static int getSumPrimaryDiagonalElements(int[][] matrix) {
        int totalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    totalSum += matrix[row][col];
                }
            }
        }
        return totalSum;
    }
}
