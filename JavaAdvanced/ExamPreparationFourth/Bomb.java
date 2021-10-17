package ExamPreparationFourth;

import java.util.Scanner;

public class Bomb {

    public static int sapperRow;
    public static int sapperCol;
    public static int totalBombs = 0;
    public static boolean canPlayerMove = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] field = new char[numOfRows][numOfRows];
        for (int row = 0; row < numOfRows; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'B'){
                    totalBombs++;
                } else if (field[row][col] == 's'){
                    sapperRow = row;
                    sapperCol = col;
                }
            }
        }

        for (String command : commands){
            int newRow = 0;
            int newCol = 0;

            if (command.equals("up")){
                newRow = sapperRow - 1;
                newCol = sapperCol;
            } else if (command.equals("down")){
                newRow = sapperRow + 1;
                newCol = sapperCol;
            } else if (command.equals("left")){
                newRow = sapperRow;
                newCol = sapperCol - 1;
            } else {
                newRow = sapperRow;
                newCol = sapperCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            moveThroughField(field);
            if (!canPlayerMove){
                break;
            }
            if (totalBombs == 0){
                break;
            }
        }
        if (totalBombs == 0){
            System.out.println("Congratulations! You found all bombs!");
        } else if (!canPlayerMove){
            System.out.println("END! " + totalBombs + " bombs left on the field");
        } else {
            System.out.println(totalBombs + " bombs left on the field. Sapper position: (" + sapperRow + "," + sapperCol + ")");
        }
    }

    private static void moveThroughField(char[][] field) {
        if (field[sapperRow][sapperCol] == 'B'){
            totalBombs--;
            field[sapperRow][sapperCol] = '+';
            System.out.println("You found a bomb!");
        } else if (field[sapperRow][sapperCol] == 'e'){
            canPlayerMove = false;
        }
    }

    private static void checkRowAndCol(char[][] field, int row, int col) {
        int previousRow = sapperRow;
        int previousCol = sapperCol;
        if (row < 0){
            row = previousRow;
        } else if (row >= field.length){
            row = previousRow;
        }

        if (col < 0){
            col = previousCol;
        } else if (col >= field[row].length){
            col = previousCol;
        }

        sapperRow = row;
        sapperCol = col;
    }
}
