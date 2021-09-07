package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int firstSum = 0;
        int secondSum = 0;
        while (firstHand.size() != 0 && secondHand.size() != 0){
            firstSum = 0;
            secondSum = 0;
            int length = Math.min(firstHand.size(), secondHand.size());
            for (int i = 0; i < length; i++) {
                if (firstHand.get(i) > secondHand.get(i)){
                    GetNewCards(firstHand, secondHand, i);
                    break;
                } else if (firstHand.get(i) < secondHand.get(i)){
                    GetNewCards(secondHand, firstHand, i);
                    break;
                } else if (firstHand.get(i).equals(secondHand.get(i))){
                    firstHand.remove(i);
                    secondHand.remove(i);
                    break;
                }
            }

            for (int element : firstHand){
                firstSum += element;
            }

            for (int element : secondHand){
                secondSum += element;
            }
        }

        if (firstSum > secondSum){
            System.out.printf("First player wins! Sum: %d%n", firstSum);
        } else if (firstSum < secondSum){
            System.out.printf("Second player wins! Sum: %d%n", secondSum);
        }
    }

    private static void GetNewCards(List<Integer> firstHand, List<Integer> secondHand, int i) {
        int addingCard = secondHand.get(i);
        secondHand.remove(i);
        int currantCard = firstHand.get(0);
        for (int j = 0; j < firstHand.size(); j++) {
            if (j != firstHand.size() - 1){
                firstHand.set(j, firstHand.get(j + 1));
            } else {
                firstHand.set(j, currantCard);
            }
        }
        firstHand.add(addingCard);
    }
}
