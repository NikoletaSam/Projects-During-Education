package ExeptionsAndErrorHandling;

import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        try {
            checkValidityOfNumbers(startNumber, endNumber);
            for (int i = startNumber; i <= endNumber; i++) {
                System.out.println(i);
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            startNumber = Integer.parseInt(scanner.nextLine());
            endNumber = Integer.parseInt(scanner.nextLine());
        }
    }

    private static void checkValidityOfNumbers(int start, int end){
        if (start <= 1 || start >= end || end >= 100){
            throw new IllegalArgumentException("Your input is on in the format: 1 < start < end < 100. Enter new numbers." );
        }
    }
}
