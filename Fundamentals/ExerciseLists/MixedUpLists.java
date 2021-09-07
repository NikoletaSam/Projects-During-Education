package ExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        List<Integer> firstLineOfNumbers = Arrays.stream(firstInput.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondLineOfNumbers = Arrays.stream(secondInput.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(secondLineOfNumbers);

        List<Integer> newLineOfNumbers = new ArrayList<>();

        while (firstLineOfNumbers.size() != 0 && secondLineOfNumbers.size() != 0){
            newLineOfNumbers.add(firstLineOfNumbers.get(0));
            newLineOfNumbers.add(secondLineOfNumbers.get(0));
            firstLineOfNumbers.remove(0);
            secondLineOfNumbers.remove(0);
        }

        int firstRange = 0;
        int secondRange = 0;
        if(firstLineOfNumbers.size() > 0 ){
            firstRange = firstLineOfNumbers.get(0);
            secondRange = firstLineOfNumbers.get(1);
        } else if (secondLineOfNumbers.size() > 0){
            firstRange = secondLineOfNumbers.get(0);
            secondRange = secondLineOfNumbers.get(1);
        }

        int smallerRange = 0;
        int biggerRange = 0;
        if(firstRange > secondRange){
            biggerRange = firstRange;
            smallerRange = secondRange;
        } else {
            biggerRange = secondRange;
            smallerRange = firstRange;
        }

        List<Integer> result = new ArrayList<>();
        for (Integer newLineOfNumber : newLineOfNumbers) {
            if (newLineOfNumber > smallerRange && newLineOfNumber < biggerRange) {
                result.add(newLineOfNumber);
            }
        }

        Collections.sort(result);
        for (Integer number : result){
            System.out.print(number + " ");
        }
    }
}
