package NestedLoop.lab;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = 0;
        for (int num1 = 0; num1<= number; num1++){
            for (int num2 = 0; num2 <= number; num2++){
                for (int num3 = 0; num3 <= number; num3++){
                    int sum = num1 + num2 + num3;
                    if (sum == number){
                        times++;
                    }
                }
            }
        }

        System.out.printf("%d", times);
    }
}
