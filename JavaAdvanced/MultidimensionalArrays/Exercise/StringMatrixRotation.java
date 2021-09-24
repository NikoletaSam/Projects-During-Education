package MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\(|\\)");
        int degreesToRotate = Integer.parseInt(firstArray[1]);

        String input = scanner.nextLine();
        int numOfRows = 0;
        int numOfCols = 0;
        List<String> list = new ArrayList<>();
        while (!input.equals("END")){
            if (input.length() > numOfCols){
                numOfCols = input.length();
            }
            list.add(input);
            numOfRows++;
            input = scanner.nextLine();
        }

        char[][] matrix = new char[numOfRows][numOfCols];
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                if (col < list.get(row).length()){
                    matrix[row][col] = list.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        double division = 1.0 * degreesToRotate / 360;
        if (degreesToRotate % 360 == 0 || degreesToRotate == 0){
            printMatrix(matrix);
        } else if (division % 1 == 0.25){
            int cols = numOfRows;
            int rows = numOfCols;
            int oldMatrixRowCounter = numOfRows - 1;
            char[][] newMatrix = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    newMatrix[row][col] = matrix[oldMatrixRowCounter][row];
                    oldMatrixRowCounter--;
                }
                oldMatrixRowCounter = numOfRows - 1;
            }
            printMatrix(newMatrix);
        } else if (division % 1 == 0.5){
            char[][] newMatrix = new char[matrix.length][matrix[0].length];
            int beginRow = matrix.length - 1;
            int beginCol = matrix[0].length - 1;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    newMatrix[row][col] = matrix[beginRow][beginCol];
                    beginCol--;
                }
                beginRow--;
                beginCol = matrix[0].length - 1;
            }
            printMatrix(newMatrix);
        } else if (division % 1 == 0.75){
            char[][] newMatrix = new char[matrix[0].length][matrix.length];
            int beginRow = 0;
            int beginCol = matrix[beginRow].length - 1;
            for (int row = 0; row < matrix[0].length; row++) {
                for (int col = 0; col < matrix.length; col++) {
                    newMatrix[row][col] = matrix[beginRow][beginCol];
                    beginRow++;
                }
                beginCol--;
                beginRow = 0;
            }
            printMatrix(newMatrix);
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
