package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        switch (partOfTheDay){
            case "Morning":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if( degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if( degrees <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
                }
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if( degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                outfit = "Shirt";
                shoes = "Moccasins";
                }
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
        }
    }
}
