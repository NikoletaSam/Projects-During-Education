package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int first = numbers.size() / 2;
        double firstSum = 0;
        for (int i = 0; i < first; i++) {
            double currentTime = numbers.get(i);
            firstSum += currentTime;
            if (currentTime == 0){
                firstSum = firstSum * 0.8;
            }
        }

        double secondSum = 0;
        for (int i = numbers.size() - 1; i > first; i--) {
            double currentSecondTime = numbers.get(i);
            secondSum += currentSecondTime;
            if (currentSecondTime == 0){
                secondSum = secondSum * 0.8;
            }
        }

        if(firstSum < secondSum){
            System.out.printf("The winner is left with total time: %.1f", firstSum);
        } else if (secondSum < firstSum){
            System.out.printf("The winner is right with total time: %.1f", secondSum);
        }
    }
}
