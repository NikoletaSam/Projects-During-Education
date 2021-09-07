package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        String[] twoNumbers = input.split(" ");
        int bombNumber = Integer.parseInt(twoNumbers[0]);
        int detonatePower = Integer.parseInt(twoNumbers[1]);

        while (numbers.contains(bombNumber)){
            int bombIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, bombIndex - detonatePower);
            int right = Math.min(numbers.size() - 1, bombIndex + detonatePower);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int element : numbers){
            sum += element;
        }
        System.out.println(sum);
    }
}
