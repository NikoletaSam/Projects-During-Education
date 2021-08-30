package ConditionalStatementsAdvanced.lab;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());

        if ( !fuel.equals("Diesel") && !fuel.equals("Gasoline") && !fuel.equals("Gas")){
            System.out.println("Invalid fuel!");
        } else if (fuel.equals("Diesel")){
            if (litres >= 25){
                System.out.println("You have enough diesel.");
            }else {
                System.out.println("Fill your tank with diesel!");
            }
        }else if (fuel.equals("Gasoline")) {
            if (litres >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else {
            if (litres >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        }
    }
}
