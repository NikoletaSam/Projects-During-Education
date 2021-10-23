package ExamPreparationNinth;

import java.util.Scanner;

public class BookWorm {
    public static int wormRow;
    public static int wormCol;
    public static StringBuilder initialString = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        initialString.append(input);

        int numOfRowsAndCols = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[numOfRowsAndCols][numOfRowsAndCols];
        for (int row = 0; row < field.length; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'P'){
                    wormRow = row;
                    wormCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")){
            field[wormRow][wormCol] = '-';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = wormRow - 1;
                newCol = wormCol;
            } else if (command.equals("down")){
                newRow = wormRow + 1;
                newCol = wormCol;
            } else if (command.equals("left")){
                newRow = wormRow;
                newCol = wormCol - 1;
            } else {
                newRow = wormRow;
                newCol = wormCol + 1;
            }
            checkRowAndCol(newRow, newCol, field);
            moveThroughField(field);
            command = scanner.nextLine();
        }

        System.out.println(initialString.toString());
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

    private static void moveThroughField(char[][] field) {
        if (Character.isAlphabetic(field[wormRow][wormCol])){
            initialString.append(field[wormRow][wormCol]);
        }
        field[wormRow][wormCol] = 'P';
    }

    private static void checkRowAndCol(int newRow, int newCol, char[][] field) {
        if (newRow < 0 || newRow >= field.length || newCol < 0 || newCol >= field[newRow].length){
            newCol = wormCol;
            newRow = wormRow;
            if (initialString.length() > 0){
                initialString.deleteCharAt(initialString.length() - 1);
            }
        }
        wormRow = newRow;
        wormCol = newCol;
    }
}
