package FundamentalsEx2;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        if (numOfLines >= 1 && numOfLines <= 20){
            int sumLitresInTheTank = 0;
            for (int i = 0; i < numOfLines; i++) {
                int litres = Integer.parseInt(scanner.nextLine());
                sumLitresInTheTank += litres;
                if (sumLitresInTheTank > 250){
                    System.out.println("Insufficient capacity!");
                    sumLitresInTheTank -= litres;
                }
            }
            System.out.println(sumLitresInTheTank);
        }
    }
}
