package NestedLoop.lab;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num1 = 1; num1 <= 10; num1++){
            for (int num2 = 1; num2 <= 10; num2++){
                int result = num1 * num2;
                System.out.printf("%d * %d = %d%n", num1, num2, result);
            }
        }
    }
}
