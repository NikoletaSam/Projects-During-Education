package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int row = 0; row < 8; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (matrix[row][col].equals("q")){
                    boolean isForwardAttackPossible = isForwardAtackPossible(matrix, row, col);
                    boolean isAttackBackwardsPossible = isAttackBackwardsPossible(matrix, row, col);
                    boolean isAttackLeftPossible = isAttackLeftPossible(matrix, row, col);
                    boolean isAttackRightPossible = isAttackRightPossible(matrix, row, col);
                    boolean isAttackLeftUpDiagonal = isAttackLeftUpDiagonal(matrix, row, col);
                    boolean isAttackRightUpDiagonal = isAttackRightUpDiagonal(matrix, row, col);
                    boolean isAttackDownLeftDiagonal = isAttackDownLeftDiagonal(matrix, row, col);
                    boolean isAttackDownRightDiagonal = isAttackDownRightDiagonal(matrix, row, col);
                    if (isAttackBackwardsPossible && isAttackRightPossible && isAttackLeftPossible && isForwardAttackPossible
                        && isAttackDownRightDiagonal && isAttackDownLeftDiagonal && isAttackRightUpDiagonal && isAttackLeftUpDiagonal){
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }

    private static boolean isAttackDownRightDiagonal(String[][] matrix, int row, int col) {
        row++;
        col++;
        while (row < 8 && col < 8){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                row++;
                col++;
            }
        }
        return true;
    }

    private static boolean isAttackDownLeftDiagonal(String[][] matrix, int row, int col) {
        row++;
        col--;
        while (row < 8 && col >= 0){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                row++;
                col--;
            }
        }
        return true;
    }

    private static boolean isAttackRightUpDiagonal(String[][] matrix, int row, int col) {
        row--;
        col++;
        while (row >= 0 && col < 8){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                row--;
                col++;
            }
        }
        return true;
    }

    private static boolean isAttackLeftUpDiagonal(String[][] matrix, int row, int col) {
        row--;
        col--;
        while (row >= 0 && col >= 0) {
            if (matrix[row][col].equals("q")) {
                return false;
            } else {
                row--;
                col--;
            }
        }
        return true;
    }

    private static boolean isAttackRightPossible(String[][] matrix, int row, int col) {
        col+=1;
        while (col < matrix[row].length){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                col++;
            }
        }
        return true;
    }

    private static boolean isAttackLeftPossible(String[][] matrix, int row, int col) {
        col-=1;
        while (col >= 0){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                col--;
            }
        }
        return true;
    }

    private static boolean isAttackBackwardsPossible(String[][] matrix, int row, int col) {
        row +=1;
        while (row < matrix.length){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                row++;
            }
        }
        return true;
    }

    private static boolean isForwardAtackPossible(String[][] matrix, int row, int col) {
        row-=1;
        while (row >= 0){
            if (matrix[row][col].equals("q")){
                return false;
            } else {
                row--;
            }
        }
        return true;
    }
}
