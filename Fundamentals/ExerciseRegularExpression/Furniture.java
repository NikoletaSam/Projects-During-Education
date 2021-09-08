package ExerciseRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")){
            String regex = ">>(?<furniture>[A-Za-z][A-Za-z]+)<<(?<price>[\\d]+\\.?[\\d]+)\\!(?<quantity>[\\d]+)\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.println(matcher.group("furniture"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double currentTotalPrice = price * quantity;
                totalPrice += currentTotalPrice;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f%n", totalPrice);
    }
}
