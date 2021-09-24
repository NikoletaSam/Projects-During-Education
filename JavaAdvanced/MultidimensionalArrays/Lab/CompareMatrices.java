package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsFirst = scanner.nextInt();
        int numOfColsFirst = scanner.nextInt();

        int[][] firstMatrix = new int[numOfRowsFirst][numOfColsFirst];
        for (int row = 0; row < numOfRowsFirst; row++) {
            for (int col = 0; col < numOfColsFirst; col++) {
                firstMatrix[row][col] = scanner.nextInt();
            }
        }

        int numOfRowsSecond = scanner.nextInt();
        int numOfColsSecond = scanner.nextInt();

        int[][] secondMatrix = new int[numOfRowsSecond][numOfColsSecond];
        for (int row = 0; row < numOfRowsSecond; row++) {
            for (int col = 0; col < numOfColsSecond; col++) {
                secondMatrix[row][col] = scanner.nextInt();
            }
        }
        if ((numOfRowsFirst != numOfRowsSecond) || (numOfColsFirst != numOfColsSecond)){
            System.out.println("not equal");
        } else {
            boolean areEqual = areMatricesEqual(firstMatrix, secondMatrix, numOfRowsFirst, numOfColsFirst);
            if (areEqual){
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        }
    }

    private static boolean areMatricesEqual(int[][] firstMatrix, int[][] secondMatrix, int numOfRow, int numOfCol){
        boolean areEqual = true;

        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfCol; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    areEqual = false;
                    break;
                }
            }
        }

        return areEqual;
    }
}
