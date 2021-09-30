package SetsAndMaps.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> elementCounter = new TreeMap<>();
        char[] arr = scanner.nextLine().toCharArray();

        for (char symbol : arr){
            elementCounter.putIfAbsent(symbol, 0);
            int repetition = elementCounter.get(symbol);
            elementCounter.put(symbol, repetition + 1);
        }

        elementCounter
                .forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));
    }
}
