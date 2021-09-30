package SetsAndMaps.Exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> people = new LinkedHashMap<>();
        Map<Character, Integer> points = new LinkedHashMap<>();
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        String input = scanner.nextLine();
        while (!input.equals("JOKER")){
            String person = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(",\\s+");

            people.putIfAbsent(person, new LinkedHashSet<>());
            people.get(person).addAll(Arrays.asList(cards));

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> current : people.entrySet()){
            int sumOfPoints = 0;
            for (String card : current.getValue()){
                if (card.startsWith("10")){
                    char type = card.charAt(card.length() - 1);
                    int pointsToMultiply = points.get(type);
                    sumOfPoints += 10 * pointsToMultiply;
                } else {
                    char numOfCard = card.charAt(0);
                    int pointsOfCard = points.get(numOfCard);
                    char type = card.charAt(card.length() - 1);
                    int pointsToMultiply = points.get(type);
                    sumOfPoints += pointsOfCard * pointsToMultiply;
                }
            }

            System.out.println(current.getKey() + ": " + sumOfPoints);
        }
    }
}
