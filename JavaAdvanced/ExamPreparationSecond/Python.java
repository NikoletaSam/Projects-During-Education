package ExamPreparationSecond;

import java.util.Arrays;
import java.util.Scanner;

public class Python {
    public static int length = 1;
    public static int pythonRow;
    public static int pythonCol;
    public static int food = 0;
    public static boolean canPythonMove = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());
        String[] directions = scanner.nextLine().split(",\\s+");

        char[][] field = new char[numOfRows][numOfRows];

        for (int row = 0; row < numOfRows; row++) {
            String[] currenCol = scanner.nextLine().split("\\s+");
            for (int col = 0; col < currenCol.length; col++) {
                field[row][col] = currenCol[col].charAt(0);
                char current = field[row][col];
                if (current == 's'){
                    pythonRow = row;
                    pythonCol = col;
                } else if (current == 'f'){
                    food++;
                }
            }
        }

        for (int i = 0; i < directions.length; i++) {
            String direction = directions[i];
            int newRow = 0;
            int newCol = 0;
            if (direction.equals("up")){
                newRow = pythonRow - 1;
                newCol = pythonCol;
            } else if (direction.equals("down")){
                newRow = pythonRow + 1;
                newCol = pythonCol;
            } else if (direction.equals("left")){
                newRow = pythonRow;
                newCol = pythonCol - 1;
            } else if (direction.equals("right")){
                newRow = pythonRow;
                newCol = pythonCol + 1;
            }
            checkRowAndCol(newRow, newCol, field);
            move(field);
            if (!canPythonMove){
                break;
            }
            if (food == 0){
                break;
            }
        }

        if (!canPythonMove){
            System.out.println("You lose! Killed by an enemy!");
        } else if (food == 0){
            System.out.println("You win! Final python length is " + length);
        } else if (food > 0){
            System.out.println("You lose! There is still " + food + " food to be eaten.");
        }
    }

    private static void move(char[][] field) {
        if (field[pythonRow][pythonCol] == 'e'){
            canPythonMove = false;
        } else if (field[pythonRow][pythonCol] == 'f'){
            food--;
            length++;
        }
    }

    private static void checkRowAndCol(int row, int col, char[][] field) {
        if (row < 0){
            row = field.length - 1;
        } else if (row >= field.length){
            row = 0;
        }

        if (col < 0){
            col = field[row].length - 1;
        } else if (col >= field[row].length){
            col = 0;
        }

        pythonRow = row;
        pythonCol = col;
    }
}
