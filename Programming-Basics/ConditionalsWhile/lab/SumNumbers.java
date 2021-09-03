package ConditionalsWhile.lab;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int nextNumber = Integer.parseInt(scanner.nextLine());
        sum = sum + nextNumber;
        while (sum < num){
            nextNumber = Integer.parseInt(scanner.nextLine());
            sum += nextNumber;
        }

        System.out.println(sum);
    }
}
