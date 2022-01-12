package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) throws IllegalAccessException {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) throws IllegalAccessException {
        if (name == null || name.trim().length() < 1 || name.trim().length() > 15){
            throw new IllegalAccessException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setToppings(int numberOfToppings) throws IllegalAccessException {
        if (numberOfToppings < 0 || numberOfToppings > 10){
            throw new IllegalAccessException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double totalCalories = 0;

        totalCalories += this.dough.calculateCalories();

        for (Topping current : this.toppings){
            totalCalories += current.calculateCalories();
        }
        return totalCalories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, this.getOverallCalories());
    }
}
