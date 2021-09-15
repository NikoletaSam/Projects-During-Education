package LectureMethods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type  = scanner.nextLine();
        switch (type){
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                int biggerNumber = FindingBiggerNumber(firstNumber, secondNumber);
                System.out.println(biggerNumber);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char biggerChar = FindingBiggerChar(firstChar, secondChar);
                System.out.println(biggerChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String biggerString = FindingBiggerString(firstString, secondString);
                System.out.println(biggerString);
                break;
        }
    }

    private static String FindingBiggerString(String firstString, String secondString) {
        String biggerString = "";
        if (firstString.compareTo(secondString) >= 0){
            biggerString = firstString;
        } else {
            biggerString = secondString;
        }
        return biggerString;
    }

    private static char FindingBiggerChar(char firstChar, char secondChar) {
        char biggerChar = 'z';
        if (firstChar > secondChar){
            biggerChar = firstChar;
        } else {
            biggerChar = secondChar;
        }
        return biggerChar;
    }

    private static int FindingBiggerNumber(int firstNumber, int secondNumber) {
        int biggerNumber = 0;
        if (firstNumber > secondNumber){
            biggerNumber = firstNumber;
        } else {
            biggerNumber = secondNumber;
        }
        return biggerNumber;
    }
}
