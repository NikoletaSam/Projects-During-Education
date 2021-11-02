package WorkingWithAbstraction.Ex.CardSiut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank rank = CardRank.valueOf(scanner.nextLine().toUpperCase());
        CardSuits suit = CardSuits.valueOf(scanner.nextLine().toUpperCase());

        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, rank.getPower() + suit.getPower());
    }
}
