package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());
        int numOfCols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[numOfRows][numOfCols];

        for (int row = 0; row < numOfRows; row++) {
            String[] current = scanner.nextLine().split("\\s+");
            for (int col = 0; col < numOfCols; col++) {
                firstMatrix[row][col] = current[col];
            }
        }

        String[][] secondMatrix = new String[numOfRows][numOfCols];
        for (int row = 0; row < numOfRows; row++) {
            String[] current = scanner.nextLine().split("\\s+");
            for (int col = 0; col < numOfCols; col++) {
                secondMatrix[row][col] = current[col];
            }
        }

        getThirdMatrix(firstMatrix, secondMatrix, numOfRows, numOfCols);
    }

    private static void getThirdMatrix(String[][] firstMatrix, String[][] secondMatrix, int numOfRow, int numOfCol){
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfCol; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])){
                    System.out.print(firstMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
