package Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);


        try {
            String[] firstArr = scanner.nextLine().split("\\s+");
            String pizzaName = firstArr[1];
            int numberOfToppings = Integer.parseInt(firstArr[2]);

            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            String[] secondArr = scanner.nextLine().split("\\s+");
            String flourType = secondArr[1];
            String bakingTechnique = secondArr[2];
            double weightInGrams = Double.parseDouble(secondArr[3]);

            Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
            pizza.setDough(dough);

            String command = scanner.nextLine();
            while (!command.equals("END")){
                String[] arr = command.split("\\s+");
                String toppingType = arr[1];
                double weightInGramsTopping = Double.parseDouble(arr[2]);

                Topping topping = new Topping(toppingType, weightInGramsTopping);

                pizza.addTopping(topping);

                command = scanner.nextLine();
            }

            System.out.println(pizza.toString());
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }

    }
}
