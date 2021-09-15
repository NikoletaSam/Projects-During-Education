package LectureMethods;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberOfRepeats = Integer.parseInt(scanner.nextLine());
        String newString = CreatingRepetativeString(input, numberOfRepeats);
        System.out.println(newString);
    }

    private static String CreatingRepetativeString(String input, int numberOfRepeats) {
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < numberOfRepeats; i++) {
            newLine.append(input);
        }
        return newLine.toString();
    }
}
