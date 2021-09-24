package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        int numOfRows = Integer.parseInt(firstInput[0]);
        int numOfCols = Integer.parseInt(firstInput[1]);

        String[][] matrix = new String[numOfRows][numOfCols];

        for (int row = 0; row < numOfRows; row++) {
            String input = scanner.nextLine();
            String[] arr = input.split("\\s+");
            for (int col = 0; col < numOfCols; col++) {
                matrix[row][col] = arr[col];
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String[] arr = input.split("\\s+");
            String command = arr[0];
            if (!command.equals("swap") || arr.length != 5){
                System.out.println("Invalid input!");
            } else {
                int oldRow = Integer.parseInt(input.split("\\s+")[1]);
                int oldCol = Integer.parseInt(input.split("\\s+")[2]);
                int newRow = Integer.parseInt(input.split("\\s+")[3]);
                int newCol = Integer.parseInt(input.split("\\s+")[4]);
                boolean areIndexedValid = areIndexesValid(numOfRows, numOfCols, oldCol, oldRow, newCol, newRow);
                if (!areIndexedValid){
                    System.out.println("Invalid input!");
                } else {
                    String firstElement = matrix[oldRow][oldCol];
                    String secondElement = matrix[newRow][newCol];
                    matrix[oldRow][oldCol] = secondElement;
                    matrix[newRow][newCol] = firstElement;
                    printMatrix(matrix);
                }
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean areIndexesValid(int numOfRows, int numOfCols, int oldCol, int oldRow, int newCol, int newRow) {
        return oldCol >= 0 && oldCol < numOfCols && oldRow >= 0 && oldRow < numOfRows && newCol >= 0 && newCol < numOfCols
                && newRow >= 0 && newRow < numOfRows;
    }
}
