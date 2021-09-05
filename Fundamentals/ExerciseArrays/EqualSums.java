package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayString = input.split(" ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int counter = i;
            while (counter != 0){
                leftSum = leftSum + numbers[counter - 1];
                counter--;
            }

            int secondCounter = i;
            while (secondCounter <= numbers.length - 2){
                rightSum += numbers[secondCounter + 1];
                secondCounter++;
            }

            if (leftSum == rightSum){
                System.out.println(i);
                flag = true;
                break;
            } else {
                flag = false;
            }
            rightSum = 0;
            leftSum = 0;
        }
        if (!flag){
            System.out.println("no");
        }
    }
}
