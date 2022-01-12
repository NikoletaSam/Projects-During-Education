package Encapsulation.PizzaCalories;

import java.util.Map;

public class Dough {

    private static final Map<String, Double> TYPES_OF_FLOUR = Map.of(
            "White", 1.5,
            "Wholegrain", 1.0);

    private static final Map<String, Double> TYPES_OF_TECHNIQUE = Map.of(
            "Crispy", 0.9,
            "Chewy", 1.1,
            "Homemade", 1.0);

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) throws IllegalAccessException {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public void setWeight(double weight) throws IllegalAccessException {
        if (weight < 1 || weight > 200){
            throw new IllegalAccessException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public void setFlourType(String flourType) throws IllegalAccessException {
        if (!TYPES_OF_FLOUR.containsKey(flourType)){
            throw new IllegalAccessException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) throws IllegalAccessException {
        if (!TYPES_OF_TECHNIQUE.containsKey(bakingTechnique)){
            throw new IllegalAccessException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories(){
        double caloriesFromFlourType = TYPES_OF_FLOUR.get(this.flourType);
        double caloriesFromBakingTechnique = TYPES_OF_TECHNIQUE.get(this.bakingTechnique);

        return (2.0 * this.weight) * caloriesFromBakingTechnique * caloriesFromFlourType;
    }
}
