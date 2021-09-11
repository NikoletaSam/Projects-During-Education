package LectureArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");
        int[] firstLineOfNumbers = Arrays.stream(firstArray).mapToInt(elements -> Integer.parseInt(elements)).toArray();
        int[] secondLineOfNumbers = Arrays.stream(secondArray).mapToInt(elements -> Integer.parseInt(elements)).toArray();

        int sum = 0;
        boolean flag = true;
        for (int i = 0; i <= firstLineOfNumbers.length - 1; i++) {
            int firstNum = firstLineOfNumbers[i];
            int secondNum = secondLineOfNumbers[i];
            if (firstNum != secondNum){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                flag = false;
                break;
            } else {
                sum += firstNum;
            }
        }

        if (flag){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
