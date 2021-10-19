package ExamPreparationSixth;

import java.util.Scanner;

public class Bee {
    public static boolean isOnField = true;
    public static int beeRow;
    public static int beeCol;
    public static int flowersDone = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[numOfRowsAndCols][numOfRowsAndCols];

        for (int row = 0; row < field.length; row++) {
            field[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                char current = field[row][col];
                if (current == 'B'){
                    beeRow = row;
                    beeCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            field[beeRow][beeCol] = '.';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = beeRow - 1;
                newCol = beeCol;
            } else if (command.equals("down")){
                newRow = beeRow + 1;
                newCol = beeCol;
            } else if (command.equals("left")){
                newRow = beeRow;
                newCol = beeCol - 1;
            } else {
                newRow = beeRow;
                newCol = beeCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            if (!isOnField){
                System.out.println("The bee got lost!");
                break;
            }
            moveThroughField(field, command);
            command = scanner.nextLine();
        }
        if (flowersDone < 5){
            int neededFlowers = 5 - flowersDone;
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", neededFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowersDone);
        }
        printField(field);
    }

    private static void moveThroughField(char[][] field, String command) {
        if (field[beeRow][beeCol] == 'f'){
            flowersDone++;
        } else if (field[beeRow][beeCol] == 'O'){
            field[beeRow][beeCol] = '.';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = beeRow - 1;
                newCol = beeCol;
            } else if (command.equals("down")){
                newRow = beeRow + 1;
                newCol = beeCol;
            } else if (command.equals("left")){
                newRow = beeRow;
                newCol = beeCol - 1;
            } else {
                newRow = beeRow;
                newCol = beeCol + 1;
            }
            beeRow = newRow;
            beeCol = newCol;
            moveThroughField(field, command);
        }
        field[beeRow][beeCol] = 'B';
    }

    private static void checkRowAndCol(char[][] field, int newRow, int newCol) {
        if (newRow < 0 || newRow >= field.length || newCol < 0 || newCol >= field[newRow].length){
            isOnField = false;
        } else {
            beeRow = newRow;
            beeCol = newCol;
        }
    }

    public static void printField(char[][] field){
        for (char[] chars : field) {
            for (char element : chars) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
