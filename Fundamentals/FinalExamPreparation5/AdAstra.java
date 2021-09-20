package FinalExamPreparation5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> products = new ArrayList<>();

        String regex = "(#|\\|)(?<item>[A-Za-z\\s]+)\\1(?<expirationDate>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        while (matcher.find()){
            String itemName = matcher.group("item");
            String expirationDate = matcher.group("expirationDate");
            String calories = matcher.group("calories");

            int currentCal = Integer.parseInt(calories);
            totalCalories += currentCal;


            String output = "Item: " +itemName + ", Best before: " + expirationDate + ", Nutrition: " + calories;
            products.add(output);
        }

        int days = (int) Math.floor(totalCalories / (2000 * 1.0));
        System.out.printf("You have food to last you for: %d days!%n", days);

        for (String product : products){
            System.out.println(product);
        }
    }
}
