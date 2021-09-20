package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStrings = Integer.parseInt(scanner.nextLine());
        String regex = "^!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numOfStrings; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()){
                System.out.println("The message is invalid");
            } else {
                System.out.print(matcher.group("command") + ": ");
                String message = matcher.group("message");
                char[] array = message.toCharArray();
                for (int j = 0; j < array.length - 1; j++) {
                    int current = array[j];
                    System.out.print(current + " ");
                }
                int last = array[array.length - 1];
                System.out.print(last);
                System.out.println();
            }
        }
    }
}
