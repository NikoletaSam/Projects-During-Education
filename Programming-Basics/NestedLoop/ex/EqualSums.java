package NestedLoop.ex;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++){
            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;
            for(int m = 6; m >= 1; m--){
                int digit = currentNumber % 10;
                currentNumber /= 10;
                if (m % 2 == 0){
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }

            if (evenSum == oddSum){
                System.out.printf("%d ", i);
            }
        }
    }
}
