package LectureTextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();
        while (input.contains(wordToRemove)){
            input = removeWordFromInput(wordToRemove, input);
        }

        System.out.println(input);
    }

    private static String removeWordFromInput(String wordToRemove, String input) {
        int beginning = input.indexOf(wordToRemove);
        int ending = beginning + wordToRemove.length();

        String first = input.substring(0, beginning);
        String last = input.substring(ending);
        return  first + last;
    }
}
