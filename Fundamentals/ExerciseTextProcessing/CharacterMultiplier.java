package ExerciseTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read input
        String input = scanner.nextLine();
        String[] array = input.split("\\s+");

        //Multiply the numbers and add to a total sum
        //if one of them is longer -> add without multiplication
        String first = array[0];
        String second = array[1];
        int totalSum = 0;
        if (first.length() > second.length()){
            totalSum = getTotalSum(first, second);
        } else if (second.length() > first.length()){
            totalSum = getTotalSum(second, first);
        } else {
            for (int i = 0; i < second.length(); i++) {
                int firstNum = first.charAt(i);
                int secondNum = second.charAt(i);
                totalSum += firstNum * secondNum;
            }
        }

        //Print the total sum
        System.out.println(totalSum);
    }

    private static int getTotalSum(String longer, String shorter) {
        int totalSum = 0;
        for (int i = 0; i < shorter.length(); i++) {
            int firstIntoNumber = longer.charAt(i);
            int secondIntoNumber = shorter.charAt(i);
            totalSum += firstIntoNumber * secondIntoNumber;
        }

        for (int i = shorter.length(); i < longer.length(); i++) {
            int num = longer.charAt(i);
            totalSum += num;
        }

        return totalSum;
    }
}
