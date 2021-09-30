package SetsAndMaps.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numbersCounter = new LinkedHashMap<>();
        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        for (double number : nums){
            numbersCounter.putIfAbsent(number, 0);
            int counter = numbersCounter.get(number);
            numbersCounter.put(number, counter + 1);
        }

        numbersCounter
                .entrySet()
                .stream()
                .forEach(entry -> System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue()));
    }
}
