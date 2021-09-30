package SetsAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int num : firstArr){
            firstPlayerCards.add(num);
        }

        Set<Integer> secondPlayerCards = new LinkedHashSet<>();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int num : secondArr){
            secondPlayerCards.add(num);
        }

        int numOfRounds = 0;
        while (numOfRounds < 50){
            int cardFirstPlayer = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(cardFirstPlayer);

            int cardSecondPlayer = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(cardSecondPlayer);

            if (cardFirstPlayer > cardSecondPlayer){
                firstPlayerCards.add(cardFirstPlayer);
                firstPlayerCards.add(cardSecondPlayer);
            } else if (cardSecondPlayer > cardFirstPlayer){
                secondPlayerCards.add(cardFirstPlayer);
                secondPlayerCards.add(cardSecondPlayer);
            }
            if (firstPlayerCards.isEmpty()){
                break;
            } else if (secondPlayerCards.isEmpty()){
                break;
            }

            numOfRounds++;
        }

        if (firstPlayerCards.size() > secondPlayerCards.size()){
            System.out.println("First player win!");
        } else if (secondPlayerCards.size() > firstPlayerCards.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
