package Exam;

import java.util.Scanner;

public class MouseAndCheese {
    public static int mouseRow;
    public static int mouseCol;
    public static int foodEaten = 0;
    public static boolean isOnField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[numOfRowsAndCols][numOfRowsAndCols];

        for (int row = 0; row < field.length; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'M'){
                    mouseRow = row;
                    mouseCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")){
            field[mouseRow][mouseCol] = '-';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = mouseRow - 1;
                newCol = mouseCol;
            } else if (command.equals("down")){
                newRow = mouseRow + 1;
                newCol = mouseCol;
            } else if (command.equals("left")){
                newRow = mouseRow;
                newCol = mouseCol - 1;
            } else {
                newRow = mouseRow;
                newCol = mouseCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            if (!isOnField){
                System.out.println("Where is the mouse?");
                break;
            }
            moveThroughField(field, command);

            command = scanner.nextLine();
        }

        if (foodEaten >= 5){
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", foodEaten);
        } else {
            int foodNeeded = 5 - foodEaten;
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", foodNeeded);
        }

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

    private static void moveThroughField(char[][] field, String command) {
        if (field[mouseRow][mouseCol] == 'c'){
            foodEaten++;
        } else if (field[mouseRow][mouseCol] == 'B'){
            field[mouseRow][mouseCol] = '-';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = mouseRow - 1;
                newCol = mouseCol;
            } else if (command.equals("down")){
                newRow = mouseRow + 1;
                newCol = mouseCol;
            } else if (command.equals("left")){
                newRow = mouseRow;
                newCol = mouseCol - 1;
            } else {
                newRow = mouseRow;
                newCol = mouseCol + 1;
            }
            mouseRow = newRow;
            mouseCol = newCol;
            moveThroughField(field, command);
        }
        field[mouseRow][mouseCol] = 'M';
    }

    private static void checkRowAndCol(char[][] field, int newRow, int newCol) {
        if (newRow < 0 || newRow >= field.length || newCol < 0 || newCol >= field[newRow].length){
            isOnField = false;
        } else {
            mouseRow = newRow;
            mouseCol = newCol;
        }
    }
}
