package NestedLoop.lab;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endingNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        int combinationNumber = 0;
        boolean flag = false;

        for (int num1 = startingNumber; num1 <= endingNumber; num1++) {
            for (int num2 = startingNumber; num2 <= endingNumber; num2++) {
                sum = num1 + num2;
                counter++;
                if (sum == magicNumber) {
                    combinationNumber = counter;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationNumber, num1, num2, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
