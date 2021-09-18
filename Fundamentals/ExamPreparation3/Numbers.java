package ExamPreparation3;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        boolean flag = AreNumbersEqual(numbers);
        if (numbers.size() <= 1 || flag){
            System.out.println("No");
        } else {
            int totalSum = GetTotalSum(numbers);
            int numberOfNumbers = numbers.size();
            double average = 1.0 * totalSum / numberOfNumbers;
            for (int i = numbers.size() - 1; i >= 0; i--) {
                if (numbers.get(i) <= average){
                    numbers.remove(i);
                }
            }


            Collections.sort(numbers);
            Collections.reverse(numbers);
            if(numbers.size() > 5){
                numbers.subList(5, numbers.size()).clear();
            }
            for (int element : numbers){
                System.out.print(element + " ");
            }
        }
    }

    private static boolean AreNumbersEqual(List<Integer> numbers) {
        boolean flag = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(!numbers.get(i).equals(numbers.get(i+1))){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static int GetTotalSum(List<Integer> numbers) {
        int totalSum = 0;
        for (int current : numbers) {
            totalSum += current;
        }

        return  totalSum;
    }
}