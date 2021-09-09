package FundamentalsEx2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        while (number != 0){
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number = number / 10;
        }
        System.out.println(sumOfDigits);
    }
}
