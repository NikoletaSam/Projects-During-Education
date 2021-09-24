package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numOfRowsAndCols = Integer.parseInt(input.split(",\\s+")[0]);
        char typeOfMatrix = input.split(",\\s+")[1].charAt(0);

        int[][] matrix = new int[numOfRowsAndCols][numOfRowsAndCols];

        int beginNum = 1;
        if (typeOfMatrix == 'A'){
            for (int col = 0; col < numOfRowsAndCols; col++) {
                for (int row = 0; row < numOfRowsAndCols; row++) {
                    matrix[row][col] = beginNum;
                    beginNum++;
                }
            }
        } else {
            for (int col = 0; col < numOfRowsAndCols; col++) {
                if (col % 2 == 0){
                    for (int row = 0; row < numOfRowsAndCols; row++) {
                        matrix[row][col] = beginNum;
                        beginNum++;
                    }
                } else {
                    for (int row = numOfRowsAndCols - 1; row >= 0; row--) {
                        matrix[row][col] = beginNum;
                        beginNum++;
                    }
                }
            }
        }

        for (int row = 0; row < numOfRowsAndCols; row++) {
            for (int col = 0; col < numOfRowsAndCols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
