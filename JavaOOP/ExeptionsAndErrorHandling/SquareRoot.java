package ExeptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        try {
            double result = calculateSquareRoot(number);
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good bye");
        }

    }

    private static double calculateSquareRoot(int number){
        if (number <= 0){
            throw new IllegalArgumentException("Invalid number");
        }
        return Math.sqrt(number);
    }
}
