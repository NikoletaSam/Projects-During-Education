package LectureMethods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        IsNumberPositive(number);
        IsNumberNegative(number);
        IsNumberZero(number);
    }

    private static void IsNumberZero(int num) {
        if (num == 0){
            System.out.printf("The number %d is zero.", num);
        }
    }

    private static void IsNumberNegative(int num) {
        if (num < 0 ){
            System.out.printf("The number %d is negative.", num);
        }
    }

    private static void IsNumberPositive(int number) {
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }
    }
}
