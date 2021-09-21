package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> text = new ArrayDeque<>();

        for (int i = 0; i < numOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            switch (command){
                case "1":
                    String textToAdd = input[1];
                    if (text.isEmpty()){
                        text.push(textToAdd);
                    } else {
                        String add = text.peek() + textToAdd;
                        text.push(add);
                    }
                    break;
                case "2":
                    int countToErase = Integer.parseInt(input[1]);
                    if (!text.isEmpty()){
                        String stringToRemove = text.peek().substring(text.peek().length() - countToErase);
                        String newText = text.peek().replace(stringToRemove, "");
                        text.push(newText);
                    }
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    if (!text.isEmpty()){
                        System.out.println(text.peek().charAt(index - 1));
                    }
                    break;
                case "4":
                    if (!text.isEmpty()){
                        text.pop();
                    }
                    break;
            }
        }
    }
}
