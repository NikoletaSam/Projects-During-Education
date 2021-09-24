package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class MaximumSumOfSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] rowAndCol = scanner.nextLine().split(",\\s+");
        int numOfRows = Integer.parseInt(rowAndCol[0]);
        int numOfCols = Integer.parseInt(rowAndCol[1]);

        int[][] matrix = new int[numOfRows][numOfCols];
        
        for (int row = 0; row < numOfRows; row++) {
            String[] currentInput = scanner.nextLine().split(",\\s+");
            for (int col = 0; col < numOfCols; col++) {
                matrix[row][col] = Integer.parseInt(currentInput[col]);
            }
        }
        
        int maxSum = 0;
        int rowToBegin = 0;
        int colToBegin = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum){
                    rowToBegin = row;
                    colToBegin = col;
                    maxSum = sum;
                }
            }
        }

        for (int row = rowToBegin; row < rowToBegin + 2; row++) {
            for (int col = colToBegin; col < colToBegin + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
