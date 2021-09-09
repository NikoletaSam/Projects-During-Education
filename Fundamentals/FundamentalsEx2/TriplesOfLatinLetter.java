package FundamentalsEx2;

import java.util.Scanner;

public class TriplesOfLatinLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int firstDigit = 97; firstDigit < 97 + n; firstDigit++) {
            for (int secondDigit = 97; secondDigit < 97 + n; secondDigit++) {
                for (int thirdDigit = 97; thirdDigit < 97 + n; thirdDigit++) {
                    System.out.print((char) firstDigit);
                    System.out.print((char) secondDigit);
                    System.out.print((char) thirdDigit);
                    System.out.println();
                }
            }
        }
    }
}
