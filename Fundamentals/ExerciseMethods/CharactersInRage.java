package ExerciseMethods;

import java.util.Scanner;

public class CharactersInRage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        int firstCharIntoInt = ConvertingCharToInt(firstSymbol);
        int secondCharIntoInt = ConvertingCharToInt(secondSymbol);

        if (firstCharIntoInt > secondCharIntoInt){
            int permament = firstCharIntoInt;
            firstCharIntoInt = secondCharIntoInt;
            secondCharIntoInt = permament;
        }

        for (int i = firstCharIntoInt + 1; i < secondCharIntoInt; i++) {
            char symbol = (char) i;
            System.out.printf("%c ", symbol);
        }
    }

    private static int ConvertingCharToInt(char firstSymbol) {
        return (int) firstSymbol;
    }
}
