package Encapsulation.PizzaCalories;

import java.util.Map;

public class Topping {

    private static final Map<String, Double> TOPPINGS = Map.of(
            "Meat", 1.2,
            "Veggies", 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9);

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) throws IllegalAccessException {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) throws IllegalAccessException {
        if (!TOPPINGS.containsKey(toppingType)){
            throw new IllegalAccessException("Cannot place " + toppingType +  " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) throws IllegalAccessException {
        if (weight < 1 || weight > 50){
            throw new IllegalAccessException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return (2.0 * this.weight) * TOPPINGS.get(this.toppingType);
    }
}
