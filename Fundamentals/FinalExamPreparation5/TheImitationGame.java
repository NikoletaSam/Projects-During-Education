package FinalExamPreparation5;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")){
            String[] array = input.split("\\|");
            String command = array[0];

            switch (command){
                case "Move":
                    int numOfLetters = Integer.parseInt(array[1]);
                    String substring = message.substring(0, numOfLetters);
                    message.delete(0, numOfLetters);
                    message.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(array[1]);
                    String value = array[2];
                    message.insert(index, value);
                    break;
                case "ChangeAll":
                    String textToChange = array[1];
                    String newText = array[2];

                    while (message.toString().contains(textToChange)){
                        int beginning = message.indexOf(textToChange);
                        int ending = textToChange.length();
                        message.replace(beginning, beginning + ending, newText);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);
    }
}
