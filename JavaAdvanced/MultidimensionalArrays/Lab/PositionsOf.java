package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = scanner.nextInt();
        int numOfCols = scanner.nextInt();

        int[][] numbers = new int[numOfRows][numOfCols];
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                numbers[row][col] = scanner.nextInt();
            }
        }

        int numberToFind = scanner.nextInt();
        boolean isFound = false;
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                int currentNum = numbers[row][col];
                if (currentNum == numberToFind){
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }
    }
}
