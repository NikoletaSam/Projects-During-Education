package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            String[] array = input.split("\\s+");
            String command = array[0];

            switch (command){
                case "Replace":
                    String currentChar = array[1];
                    String newChar = array[2];
                    while (text.toString().contains(currentChar)){
                        int begin = text.indexOf(currentChar);
                        int end = begin + currentChar.length();
                        text.replace(begin, end, newChar);
                    }
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(array[1]);
                    int endIndex = (Integer.parseInt(array[2]) + 1);
                    if (startIndex >= 0 && startIndex < endIndex && endIndex <= text.length()){
                        text.delete(startIndex, endIndex);
                        System.out.println(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String typeOfCase = array[1];
                    if (typeOfCase.equals("Upper")){
                        String resultUpper = text.toString().toUpperCase();
                        text.replace(0, text.length(), resultUpper);
                    } else {
                        String resultLower = text.toString().toLowerCase();
                        text.replace(0, text.length(), resultLower);
                    }
                    System.out.println(text);
                    break;
                case "Check":
                    String stringToCheck = array[1];
                    if (text.toString().contains(stringToCheck)){
                        System.out.printf("Message contains %s%n", stringToCheck);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", stringToCheck);
                    }
                    break;
                case "Sum":
                    int startingIndex = Integer.parseInt(array[1]);
                    int endingIndex = (Integer.parseInt(array[2]) + 1);
                    if (startingIndex >= 0 && startingIndex < endingIndex && endingIndex < text.length()){
                        String substring = text.substring(startingIndex, endingIndex);
                        char[] charArray = substring.toCharArray();
                        int totalSum = 0;
                        for (int current : charArray) {
                            totalSum += current;
                        }
                        System.out.println(totalSum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
