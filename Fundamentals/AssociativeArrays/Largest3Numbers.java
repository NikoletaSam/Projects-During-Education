package AssociativeArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if(numbers.size() <= 3){
            for (int digit : numbers){
                System.out.print(digit + " ");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                int current = numbers.get(i);
                System.out.print(current + " ");
            }
        }
    }
}
