package ExamPreparationFirst;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PastryShop {

    public static Map<String, Integer> pastry = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        pastry.put("Biscuit", 0);
        pastry.put("Cake", 0);
        pastry.put("Pie", 0);
        pastry.put("Pastry", 0);

        String[] firstInput = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        for (String element : firstInput){
            int current = Integer.parseInt(element);
            liquids.offer(current);
        }

        String[] secondOutput = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        for (String element : secondOutput){
            int current = Integer.parseInt(element);
            ingredients.push(current);
        }

        while (liquids.size() > 0 && ingredients.size() > 0){
            int currentLiquid = liquids.poll();
            int currentIngredient = ingredients.pop();
            int sum = currentIngredient + currentLiquid;

            switch (sum){
                case 25:
                    addToPastry("Biscuit");
                    break;
                case 50:
                    addToPastry("Cake");
                    break;
                case 75:
                    addToPastry("Pastry");
                    break;
                case 100:
                    addToPastry("Pie");
                    break;
                default:
                    currentIngredient += 3;
                    ingredients.push(currentIngredient);
                    break;
            }
        }

        boolean flag = true;
        for (Map.Entry<String, Integer> entry : pastry.entrySet()){
            int numOfPastry = entry.getValue();
            if (numOfPastry == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        if (liquids.isEmpty()){
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            String output = liquids.toString().replace("[", "").replace("]", "");
            System.out.println(output);
        }

        if (ingredients.isEmpty()){
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            String output = ingredients.toString().replace("[", "").replace("]", "");
            System.out.println(output);
        }

        pastry.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void addToPastry(String typeOfPastry){
        int currentAmount = pastry.get(typeOfPastry);
        pastry.put(typeOfPastry, currentAmount + 1);
    }
}
