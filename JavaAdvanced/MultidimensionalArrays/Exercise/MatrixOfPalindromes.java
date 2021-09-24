package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = scanner.nextInt();
        int numOfColumns = scanner.nextInt();

        String[][] matrix = new String[numOfRows][numOfColumns];

        String element = "";
        char firstElement = 97;
        for (int row = 0; row < numOfRows; row++) {
            char secondElement = firstElement;
            for (int col = 0; col < numOfColumns; col++) {
                element += firstElement;
                element += secondElement;
                element += firstElement;
                matrix[row][col] = element;
                secondElement = (char) ((int) secondElement + 1);
                element = "";
            }
            firstElement = (char) ((int) firstElement + 1);
        }

        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfColumns; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
