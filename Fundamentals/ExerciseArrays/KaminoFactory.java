package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequence = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] globalLongestSequence = new int[lengthOfSequence];
        int startingIndex = 0;
        int currentStarter = 0;
        int globalStartingIndex = 0;
        int sumOfGlobalBestSequence = 0;
        int numOfBestSequence = 0;
        int numOfCurrentSequence = 0;
        int globalMaxLength = 0;

        while (!input.equals("Clone them!")){
            int currentMaxLength = 0;
            int counter = 1;
            int currentMaxSum = 0;
            String[] arrayString = input.split("!+");
            int[] lineOfNumbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
            if (lineOfNumbers.length == lengthOfSequence){
                for (int i = 1; i <= lineOfNumbers.length - 1; i++) {
                    if (lineOfNumbers[i] == lineOfNumbers[i - 1] && lineOfNumbers[i] == 1){
                        counter++;
                    } else {
                        counter = 1;
                    }
                    if (counter > currentMaxLength){
                        currentMaxLength = counter;
                        startingIndex = i - currentMaxLength + 1;
                    }
                    currentMaxSum += lineOfNumbers[i];
                }
                currentMaxSum = currentMaxSum + lineOfNumbers[0];
                numOfCurrentSequence ++;
                if (currentMaxLength > globalMaxLength){
                    globalMaxLength = currentMaxLength;
                    globalLongestSequence = lineOfNumbers;
                    sumOfGlobalBestSequence = currentMaxSum;
                    globalStartingIndex = startingIndex;
                    numOfBestSequence = numOfCurrentSequence;
                } else if (currentMaxLength == globalMaxLength){
                    if (startingIndex < globalStartingIndex){
                        globalLongestSequence = lineOfNumbers;
                        sumOfGlobalBestSequence = currentMaxSum;
                        globalStartingIndex = startingIndex;
                        numOfBestSequence = numOfCurrentSequence;
                    } else if (startingIndex == globalStartingIndex){
                        if (currentMaxSum > sumOfGlobalBestSequence){
                            globalLongestSequence = lineOfNumbers;
                            sumOfGlobalBestSequence = currentMaxSum;
                            globalStartingIndex = startingIndex;
                            numOfBestSequence = numOfCurrentSequence;
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", numOfBestSequence, sumOfGlobalBestSequence);
        for (int elements: globalLongestSequence){
            System.out.print(elements + " ");
        }
    }
}
