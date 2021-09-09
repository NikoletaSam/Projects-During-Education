package FundamentalsEx2;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            char character = scanner.nextLine().charAt(0);
            char newCharacter = (char) ((int)character + key);
            System.out.print(newCharacter);
        }
    }
}
