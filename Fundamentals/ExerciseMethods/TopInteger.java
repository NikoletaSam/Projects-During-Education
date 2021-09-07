package ExerciseMethods;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            boolean isTheSumOfDigitsDivisibleBy8 = IsTheSumDivisibleBy8(i);
            boolean isOneDigitOdd = DoesNumberHaveAnOddDigit(i);
            if (isTheSumOfDigitsDivisibleBy8 && isOneDigitOdd){
                System.out.println(i);
            }
        }
    }

    private static boolean DoesNumberHaveAnOddDigit(int currentNumber) {
        int sumOfOddDigits = 0;
        while (currentNumber != 0){
            int currentDigit = currentNumber % 10;
            if (currentDigit % 2 != 0){
                sumOfOddDigits++;
            }
            currentNumber = currentNumber / 10;
        }
        if (sumOfOddDigits >= 1){
            return true;
        } else {
            return false;
        }
    }

    private static boolean IsTheSumDivisibleBy8(int currentNumber) {
        int sumOfDigits = 0;
        while (currentNumber != 0){
            int currentDigit = currentNumber % 10;
            sumOfDigits += currentDigit;
            currentNumber = currentNumber / 10;
        }
        if (sumOfDigits % 8 == 0){
            return true;
        } else {
            return false;
        }
    }
}
