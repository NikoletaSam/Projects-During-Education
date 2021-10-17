package ExamPreparationFourth.dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    public List<Car> data;
    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.data = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Car car){
        if (this.data.size() < capacity){
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model){
        Car currentCar = null;
        for (Car current : this.data){
            if (current.getManufacturer().equals(manufacturer) && current.getModel().equals(model)){
                currentCar = current;
            }
        }
        if (currentCar != null){
            this.data.remove(currentCar);
            return true;
        }
        return false;
    }

    public Car getLatestCar(){
        if (this.data.isEmpty()){
            return null;
        }
        return this.data.stream().max(Comparator.comparingInt(Car::getYear)).get();
    }

    public Car getCar(String manufacturer, String model){
        Car carToReturn = null;
        for (Car current : this.data){
            if (current.getManufacturer().equals(manufacturer) && current.getModel().equals(model)){
                carToReturn = current;
            }
        }
        return carToReturn;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The cars are in a car ExamPreparationFourth.dealership ").append(this.name).append(":").append(System.lineSeparator());
        this.data.forEach(e -> builder.append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
