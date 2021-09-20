package FinalExamPreparation1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder destinations = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")){
            String[] array = input.split(":");
            String command = array[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(array[1]);
                    boolean isIndexValid = IsIndexValid(index, destinations);
                    if (isIndexValid){
                        String newDestination = array[2];
                        destinations.insert(index, newDestination);
                        System.out.println(destinations.toString());
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(array[1]);
                    int endIndex = Integer.parseInt(array[2]);
                    if ((startIndex >= 0 && startIndex < destinations.length()) &&
                            (endIndex >= 0 && endIndex < destinations.length())){
                        destinations.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(destinations.toString());
                    break;
                case "Switch":
                    String oldWord = array[1];
                    String newWord = array[2];
                    if (destinations.toString().contains(oldWord)){
                        int currentIndex = Integer.parseInt(String.valueOf(destinations.indexOf(oldWord)));
                        destinations.replace(currentIndex, currentIndex + oldWord.length(), newWord);
                    }
                    System.out.println(destinations.toString());
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + destinations.toString());
    }

    private static boolean IsIndexValid(int index, StringBuilder destinations) {
        return index >= 0 && index < destinations.length();
    }
}
