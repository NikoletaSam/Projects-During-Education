package Exam;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cocktails = new TreeMap<>();

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        String[] firstInput = scanner.nextLine().split("\\s+");
        for (String current : firstInput){
            ingredients.offer(Integer.parseInt(current));
        }

        ArrayDeque<Integer> freshness = new ArrayDeque<>();
        String[] secondInput = scanner.nextLine().split("\\s+");
        for (String current : secondInput){
            freshness.push(Integer.parseInt(current));
        }

        while (ingredients.size() > 0 && freshness.size() > 0){
            int currentIngredient = ingredients.peek();
            int currentFreshness = freshness.peek();

            int amountBefore = 0;
            ingredients.poll();
            if (currentIngredient != 0) {
                freshness.pop();
                if ((currentFreshness * currentIngredient) == 150) {
                    cocktails.putIfAbsent("Pear Sour", 0);
                    amountBefore = cocktails.get("Pear Sour");
                    cocktails.put("Pear Sour", amountBefore + 1);
                } else if ((currentFreshness * currentIngredient) == 250) {
                    cocktails.putIfAbsent("The Harvest", 0);
                    amountBefore = cocktails.get("The Harvest");
                    cocktails.put("The Harvest", amountBefore + 1);
                } else if ((currentFreshness * currentIngredient) == 300) {
                    cocktails.putIfAbsent("Apple Hinny", 0);
                    amountBefore = cocktails.get("Apple Hinny");
                    cocktails.put("Apple Hinny", amountBefore + 1);
                } else if ((currentFreshness * currentIngredient) == 400) {
                    cocktails.putIfAbsent("High Fashion", 0);
                    amountBefore = cocktails.get("High Fashion");
                    cocktails.put("High Fashion", amountBefore + 1);
                } else {
                    ingredients.addLast(currentIngredient + 5);
                }
            }

        }

        if (cocktails.size() < 4){
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        } else {
            System.out.println("It's party time! The cocktails are ready!");
        }

        if (ingredients.size() > 0){
            int sumIngredients = 0;
            for (int current : ingredients){
                sumIngredients += current;
            }
            System.out.println("Ingredients left: " + sumIngredients);
        }

        if (cocktails.size() >= 1){
            for (Map.Entry<String, Integer> entry : cocktails.entrySet()){
                System.out.printf(" # %s --> %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
