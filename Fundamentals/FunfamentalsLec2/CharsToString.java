package FunfamentalsLec2;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String firstString = Character.toString(first);
        String secondString = Character.toString(second);
        String thirdString = Character.toString(third);

        System.out.printf("%s%s%s", firstString, secondString, thirdString);
    }
}
