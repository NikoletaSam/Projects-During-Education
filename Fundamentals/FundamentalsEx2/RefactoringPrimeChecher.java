package FundamentalsEx2;

import java.util.Scanner;

public class RefactoringPrimeChecher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j <= 9; j++) {
                if ((i % j == 0) && i != j) {
                    flag = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, flag);
        }
    }
}
