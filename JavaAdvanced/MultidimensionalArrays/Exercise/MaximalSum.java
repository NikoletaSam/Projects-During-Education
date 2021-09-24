package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numOfRows = Integer.parseInt(input.split("\\s+")[0]);
        int numOfCols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[numOfRows][numOfCols];

        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int maxSum = 0;
        int beginRow = 0;
        int beginCol = 0;
        for (int row = 0; row < numOfRows - 2; row++) {
            for (int col = 0; col < numOfCols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > maxSum){
                    beginRow = row;
                    beginCol = col;
                    maxSum = sum;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        printSubmatrix(matrix, beginCol, beginRow);
    }

    private static void printSubmatrix(int[][] matrix, int beginCol, int beginRow) {
        for (int row = beginRow; row <= beginRow + 2; row++) {
            for (int col = beginCol; col <= beginCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
