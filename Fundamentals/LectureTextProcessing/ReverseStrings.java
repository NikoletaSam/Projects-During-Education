package LectureTextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String reversed = reverseWord(input);
            System.out.printf("%s = %s%n", input, reversed);

            input = scanner.nextLine();
        }
    }

    private static String reverseWord(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
