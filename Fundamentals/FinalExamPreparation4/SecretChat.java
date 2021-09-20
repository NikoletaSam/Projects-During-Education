package FinalExamPreparation4;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")){
            String[] array = input.split(":\\|:");
            String command = array[0];
            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(array[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(array[1]);
                    if (!message.toString().contains(substring)){
                        System.out.println("error");
                    } else {
                        int startIndex = message.indexOf(substring.toString());
                        int length = substring.length();
                        String reversedSubstring  = substring.reverse().toString();
                        message.delete(startIndex, startIndex + length);
                        message.append(reversedSubstring);
                        System.out.println(message);
                    }
                    break;
                case "ChangeAll":
                    String substringToChange = array[1];
                    String replacement = array[2];

                    while (message.toString().contains(substringToChange)){
                        int beginning = message.indexOf(substringToChange);
                        int end = beginning + (substringToChange.length());

                        message.replace(beginning, end, replacement);
                    }
                    System.out.println(message);
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + message);
    }
}
