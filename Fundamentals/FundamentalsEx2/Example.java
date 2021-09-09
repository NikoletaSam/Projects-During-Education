package FundamentalsEx2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] array = input.toCharArray();
        for (int i = 0; i <= array.length - 1; i++) {
            int symbol = array[i];
            System.out.println(symbol);
        }
    }

}
