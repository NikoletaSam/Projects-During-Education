package ExamPreparationThird;

import java.util.Collections;
import java.util.Scanner;

public class CookingJourney {

    public static  int moneyNeeded = 50;
    public static int moneyCollected = 0;
    public static int chefRow;
    public static int chefCol;
    private static boolean isOnField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[numOfRows][numOfRows];
        for (int row = 0; row < numOfRows; row++) {
            field[row] = scanner.nextLine().replace(" ", "").toCharArray();
            for (int col = 0; col < field[row].length; col++) {
                char current = field[row][col];
                if (current == 'S'){
                    chefRow = row;
                    chefCol = col;
                    field[row][col] = '-';
                }
            }
        }

        while (isOnField && moneyCollected < moneyNeeded){
            String command = scanner.nextLine();
            field[chefRow][chefCol] = '-';
            int newRow = 0;
            int newCol = 0;
            if (command.equals("up")){
                newRow = chefRow - 1;
                newCol = chefCol;
            } else if (command.equals("down")){
                newRow = chefRow + 1;
                newCol = chefCol;
            } else if (command.equals("left")){
                newRow = chefRow;
                newCol = chefCol - 1;
            } else {
                newRow = chefRow;
                newCol = chefCol + 1;
            }
            checkRowAndCol(field, newRow, newCol);
            if (!isOnField){
                break;
            }
            moveThroughField(field);
        }

        if (!isOnField){
            System.out.println("Bad news! You are out of the pastry shop.");
        } else {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.println("Money: " + moneyCollected);
        printField(field);
    }

    private static void moveThroughField(char[][] field) {
        if (field[chefRow][chefCol] == 'P'){
            field[chefRow][chefCol] = '-';
            findAndMoveToPillar(field);
        } else if (Character.isDigit(field[chefRow][chefCol])){
            int moneyToAdd = Integer.parseInt(String.valueOf(field[chefRow][chefCol]));
            moneyCollected += moneyToAdd;
        }
        field[chefRow][chefCol] = 'S';
    }

    private static void findAndMoveToPillar(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'P'){
                    field[row][col] = '-';
                    chefRow = row;
                    chefCol = col;
                }
            }
        }
    }

    private static void checkRowAndCol(char[][] field, int newRow, int newCol) {
        if (newRow < 0 || newRow >= field.length || newCol < 0 || newCol >= field[newRow].length){
            isOnField = false;
        } else {
            chefRow = newRow;
            chefCol = newCol;
        }
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
