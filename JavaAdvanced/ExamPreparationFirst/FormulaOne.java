package ExamPreparationFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FormulaOne {
    public static int carRow;
    public static int carCol;
    public static boolean isFinished = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());
        int numOfCommands = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[numOfRows][numOfRows];
        for (int row = 0; row < numOfRows; row++) {
            field[row]  = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'P'){
                    carRow = row;
                    carCol = col;
                }
            }
        }
        for (int i = 0; i < numOfCommands; i++) {
            String command = scanner.nextLine();
            int newRow;
            int newCol;
            int currentRow = carRow;
            int currentCol = carCol;
            field[carRow][carCol] = '.';
            if (command.equals("up")){
                newRow = carRow - 1;
                newCol = carCol;
            } else if (command.equals("down")){
                newRow = carRow + 1;
                newCol = carCol;
            } else if (command.equals("left")){
                newRow = carRow;
                newCol = carCol - 1;
            } else {
                newRow = carRow;
                newCol = carCol + 1;
            }

            checkRowsAndCols(newRow, newCol, field);
            moveThroughField(field, currentRow, currentCol, command);
            if (isFinished){
                break;
            }
        }

        if (isFinished){
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        printField(field);

    }

    private static void moveThroughField(char[][] field, int oldRow, int oldCol, String direction) {
        if (field[carRow][carCol] == 'T'){
            carRow = oldRow;
            carCol = oldCol;
        } else if (field[carRow][carCol] == 'B'){
            int newRow;
            int newCol;
            if (direction.equals("up")){
                newRow = carRow - 1;
                newCol = carCol;
            } else if (direction.equals("down")){
                newRow = carRow + 1;
                newCol = carCol;
            } else if (direction.equals("left")){
                newRow = carRow;
                newCol = carCol - 1;
            } else{
                newRow = carRow;
                newCol = carCol + 1;
            }
            checkRowsAndCols(newRow, newCol, field);
        } else if (field[carRow][carCol] == 'F'){
            isFinished = true;
        }
        field[carRow][carCol] = 'P';
    }

    private static void checkRowsAndCols(int newRow, int newCol, char[][] field) {
        if (newRow < 0){
            newRow = field.length - 1;
        } else if (newRow >= field.length){
            newRow = 0;
        }

        if (newCol < 0){
            newCol = field[newRow].length - 1;
        } else if (newCol >= field[newRow].length){
            newCol = 0;
        }

        carRow = newRow;
        carCol = newCol;
    }

    public static void printField(char[][] field){
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
