package ExamPreparationSeventh;

import java.util.Scanner;

public class Snake {
    public static int snakeRow;
    public static int snakeCol;
    public static int totalFood = 10;
    public static boolean isOnField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[numOfRowsAndCols][numOfRowsAndCols];

        for (int row = 0; row < field.length; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'S') {
                    snakeRow = row;
                    snakeCol = col;
                }
            }
        }

        while (totalFood > 0) {
            String command = scanner.nextLine();
            int newRow;
            int newCol;
            field[snakeRow][snakeCol] = '.';
            if (command.equals("up")) {
                newRow = snakeRow - 1;
                newCol = snakeCol;
            } else if (command.equals("down")) {
                newRow = snakeRow + 1;
                newCol = snakeCol;
            } else if (command.equals("left")) {
                newRow = snakeRow;
                newCol = snakeCol - 1;
            } else {
                newRow = snakeRow;
                newCol = snakeCol + 1;
            }
            checkRowAndCol(newRow, newCol, field);
            if (!isOnField) {
                System.out.println("Game over!");
                break;
            }
            moveThroughField(field);
        }

        if (totalFood <= 0){
            System.out.println("You won! You fed the snake.");
        }
        int foodEaten = 10 - totalFood;
        System.out.println("Food eaten: " + foodEaten);

        printField(field);
    }

    private static void printField(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    private static void checkRowAndCol(int newRow, int newCol, char[][] field) {
        if (newRow < 0 || newRow >= field.length || newCol < 0 || newCol >= field[newRow].length) {
            isOnField = false;
        } else {
            snakeRow = newRow;
            snakeCol = newCol;
        }
    }

    private static void moveThroughField(char[][] field) {
        if (field[snakeRow][snakeCol] == '*') {
            totalFood--;
        } else if (field[snakeRow][snakeCol] == 'B') {
            field[snakeRow][snakeCol] = '.';
            findNextLiar(field);
        }
        field[snakeRow][snakeCol] = 'S';
    }

    private static void findNextLiar(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'B') {
                    snakeRow = row;
                    snakeCol = col;
                }
            }
        }

    }
}
