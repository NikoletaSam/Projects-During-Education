package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[numOfRowsAndCols][];

        for (int row = 0; row < numOfRowsAndCols; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        //print the first diagonal
        int beginRow = 0;
        int beginCol = 0;
        for (int row = 0; row < numOfRowsAndCols; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == beginRow && col == beginCol){
                    System.out.print(matrix[beginRow][beginCol] + " ");
                    beginCol++;
                    beginRow++;
                }
            }
        }
        System.out.println();

        //print second diagonal
        beginRow = matrix.length - 1;
        beginCol = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == beginRow && col == beginCol){
                    System.out.print(matrix[beginRow][beginCol] + " ");
                    beginCol++;
                    beginRow--;
                }
            }
        }
        System.out.println();
    }
}
