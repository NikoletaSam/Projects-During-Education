package FundamentalsEx2;

import java.util.Scanner;

public class PrintPartOdASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());
        for (int symbol = firstSymbol; symbol <= lastSymbol; symbol++) {
            System.out.print((char)symbol + " ");
        }
    }
}
