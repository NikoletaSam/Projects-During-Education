package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lineOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int numberOfMoves = 1;
        while (!input.equals("end") && lineOfNumbers.size() > 0){
            String[] indexesOfTwoElements = input.split("\\s+");
            int firstIndex = Integer.parseInt(indexesOfTwoElements[0]);
            int secondIndex = Integer.parseInt(indexesOfTwoElements[1]);
            if((firstIndex == secondIndex) || (firstIndex < 0) || (firstIndex >= lineOfNumbers.size()) ||
                    (secondIndex < 0) || (secondIndex >= lineOfNumbers.size())){
                System.out.println("Invalid input! Adding additional elements to the board");
                int middleElement = (lineOfNumbers.size() / 2);
                String elementToAdd = "-" + numberOfMoves + "a";
                lineOfNumbers.add(middleElement, elementToAdd);
                lineOfNumbers.add(middleElement, elementToAdd);
            } else if (lineOfNumbers.get(firstIndex).equals(lineOfNumbers.get(secondIndex))){
                String currentElement = lineOfNumbers.get(firstIndex);
                System.out.printf("Congrats! You have found matching elements - %s!%n", currentElement);
                if(firstIndex > secondIndex){
                    lineOfNumbers.remove(firstIndex);
                    lineOfNumbers.remove(secondIndex);
                } else {
                    for (int i = lineOfNumbers.size() - 1; i >= 0 ; i--) {
                        if(i == secondIndex){
                            lineOfNumbers.remove(i);
                        } else if (i == firstIndex){
                            lineOfNumbers.remove(i);
                        }
                    }
                }
            } else if (!lineOfNumbers.get(firstIndex).equals(lineOfNumbers.get(secondIndex))){
                System.out.println("Try again!");
            }

            if(lineOfNumbers.size() == 0){
                System.out.printf("You have won in %d turns!%n", numberOfMoves);
                break;
            }

            numberOfMoves++;
            input = scanner.nextLine();
        }
        if(lineOfNumbers.size() > 0){
            System.out.println("Sorry you lose :(");
            for (String element : lineOfNumbers){
                System.out.print(element + " ");
            }
        }
    }
}
