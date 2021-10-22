package ExamPreparationEighth;

import java.util.Scanner;

public class ReVolt {
    public static int playerRow;
    public static int playerCol;
    public static boolean hasPlayerFinished = false;
    public static int previousRow;
    public static int previousCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());
        int numOfCommands = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[numOfRowsAndCols][numOfRowsAndCols];

        for (int row = 0; row < field.length; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                char current = field[row][col];
                if (current == 'f'){
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

        for (int i = 0; i < numOfCommands; i++) {
            String command = scanner.nextLine();
            field[playerRow][playerCol] = '-';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = playerRow - 1;
                newCol = playerCol;
            } else if (command.equals("down")){
                newRow = playerRow + 1;
                newCol = playerCol;
            } else if (command.equals("left")){
                newRow = playerRow;
                newCol = playerCol - 1;
            } else {
                newRow = playerRow;
                newCol = playerCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            moveThroughField(field, command);

            if (hasPlayerFinished){
                break;
            }
        }

        if (hasPlayerFinished){
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
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
        if (field[playerRow][playerCol] == 'F'){
            hasPlayerFinished = true;
        } else if (field[playerRow][playerCol] == 'B'){
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = playerRow - 1;
                newCol = playerCol;
            } else if (command.equals("down")){
                newRow = playerRow + 1;
                newCol = playerCol;
            } else if (command.equals("left")){
                newRow = playerRow;
                newCol = playerCol - 1;
            } else {
                newRow = playerRow;
                newCol = playerCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            moveThroughField(field, command);
        } else if (field[playerRow][playerCol] == 'T'){
            playerRow = previousRow;
            playerCol = previousCol;
        }
        field[playerRow][playerCol] = 'f';
    }

    private static void checkRowAndCol(char[][] field, int newRow, int newCol) {
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
        previousRow = playerRow;
        previousCol = playerCol;

        playerRow = newRow;
        playerCol = newCol;
    }
}
