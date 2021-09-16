package LectureTextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split("\\s+");
        for (String element : array){
            int length = element.length();
            System.out.print(element.repeat(length));
        }
    }
}
