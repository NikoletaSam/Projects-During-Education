package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double[] arrayNumbers = Arrays.stream(input.split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbers = new TreeMap<>();
        for (double current : arrayNumbers) {
            if (!numbers.containsKey(current)) {
                numbers.put(current, 1);
            } else {
                int repeats = numbers.get(current);
                repeats++;
                numbers.put(current, repeats);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()){
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
