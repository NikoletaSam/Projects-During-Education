package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberRange = scanner.nextLine().split("\\s+");
        String typeOfNums = scanner.nextLine();

        Predicate<Integer> odd = num -> num % 2 != 0;
        Predicate<Integer> even = num -> num % 2 == 0;

        List<Integer> numbers = new ArrayList<>();

        for (int currentNum = Integer.parseInt(numberRange[0]); currentNum <= Integer.parseInt(numberRange[1]); currentNum++) {
            if (typeOfNums.equals("odd")){
                if (odd.test(currentNum)){
                    numbers.add(currentNum);
                }
            } else {
                if (even.test(currentNum)){
                    numbers.add(currentNum);
                }
            }
        }

        System.out.println(numbers
                .toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
