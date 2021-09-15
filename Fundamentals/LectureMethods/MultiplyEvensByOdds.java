package LectureMethods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumEvenDigits = SummingEvenDigits(number);
        int sumOddDigits = SummingOddDigits(number);
        int multipliedResult = MultiplyingSums(sumEvenDigits, sumOddDigits);
        System.out.println(multipliedResult);
    }

    private static int MultiplyingSums(int sumEvenDigits, int sumOddDigits) {
        return sumEvenDigits * sumOddDigits;
    }

    private static int SummingOddDigits(int number) {
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            if (digit % 2 != 0){
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }

    private static int SummingEvenDigits(int number) {
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }
}
