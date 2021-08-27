package ConditioanlStatements.ex;
import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sqMetres = Integer.parseInt(scanner.nextLine());
        double grapesPerSqMetre = Double.parseDouble(scanner.nextLine());
        int neededLitresWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = sqMetres * grapesPerSqMetre;
        double kgGrapesForWine = 0.40 * totalGrapes;
        double litresWineMade = kgGrapesForWine / 2.5;

        if(litresWineMade < neededLitresWine) {
            double litresMore = Math.floor(neededLitresWine - litresWineMade);
            System.out.print("It will be a tough winter! More ");
            System.out.printf("%.0f", litresMore);
            System.out.println(" liters wine needed.");
        } else {
            double litresLeft = litresWineMade - neededLitresWine;
            double litresPerPerson = Math.floor(litresLeft / workers);
            System.out.print("Good harvest this year! Total wine: ");
            System.out.printf("%.0f", litresWineMade);
            System.out.println(" litres.");
            System.out.printf("%.0f", litresLeft );
            System.out.print(" liters left -> ");
            System.out.printf("%.0f", litresPerPerson);
            System.out.println(" liters per person.");
        }
    }
}
