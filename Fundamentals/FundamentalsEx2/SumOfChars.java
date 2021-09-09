package FundamentalsEx2;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfChars = Integer.parseInt(scanner.nextLine());
        int sumOfSymbols = 0;
        for (int i = 1; i <= numOfChars; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sumOfSymbols += (int) symbol;
        }
        System.out.println("The sum equals: " + sumOfSymbols);
    }
}
