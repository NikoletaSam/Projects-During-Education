package NestedLoop.more;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int num1 = beginning; num1 <= ending; num1++){
            for (int num2 = beginning; num2 <= ending; num2++){
                int sum = num1 + num2;
                counter++;

                if (sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, num1, num2, sum);
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
