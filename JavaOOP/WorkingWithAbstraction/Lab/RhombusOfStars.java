package WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStarsMax = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < numOfStarsMax; i++) {
            printStringSeveralTimes(" ", numOfStarsMax - i);
            printStringSeveralTimes("* ", i);
            System.out.println();
        }

        printStringSeveralTimes("* ", numOfStarsMax);
        System.out.println();

        for (int i = 1; i < numOfStarsMax; i++) {
            printStringSeveralTimes(" ", i);
            printStringSeveralTimes("* ", numOfStarsMax - i);
            System.out.println();
        }
    }

    public static void printStringSeveralTimes(String string, int repetition){
        for (int j = 0; j < repetition; j++) {
            System.out.print(string);
        }
    }
}
