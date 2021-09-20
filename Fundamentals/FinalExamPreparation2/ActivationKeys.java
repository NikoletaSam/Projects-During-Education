package FinalExamPreparation2;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String text = scanner.nextLine();
        while (!text.equals("Generate")){
            String[] array = text.split(">>>");
            String command = array[0];
            switch (command){
                case "Contains":
                    String substring = array[1];
                    if (input.toString().contains(substring)){
                        System.out.printf("%s contains %s%n", input, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String newCase = array[1];
                    int startIndex = Integer.parseInt(array[2]);
                    int endIndex = Integer.parseInt(array[3]);
                    if (newCase.equals("Upper")){
                        String newUpperString = input.substring(startIndex, endIndex).toUpperCase();
                        input.replace(startIndex, endIndex, newUpperString);
                    } else {
                        String newLowerCase = input.substring(startIndex, endIndex).toLowerCase();
                        input.replace(startIndex, endIndex, newLowerCase);
                    }
                    System.out.println(input);
                    break;
                case "Slice":
                    int start = Integer.parseInt(array[1]);
                    int end = Integer.parseInt(array[2]);
                    input.delete(start, end);
                    System.out.println(input);
                    break;
            }

            text = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + input);
    }
}
