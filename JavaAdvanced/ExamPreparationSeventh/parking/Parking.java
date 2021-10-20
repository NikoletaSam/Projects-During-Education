package ExamPreparationSeventh.parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.data = new ArrayList<>();
        this.type = type;
        this.capacity = capacity;
    }

    public void add(Car car){
        if (this.data.size() < this.capacity){
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model){
        Car carToRemove = null;
        for (Car current : this.data){
            if (current.getManufacturer().equals(manufacturer) && current.getModel().equals(model)){
                carToRemove = current;
            }
        }

        if (carToRemove == null){
            return false;
        }
        this.data.remove(carToRemove);
        return true;
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
        builder.append("The cars are parked in ").append(this.type).append(":").append(System.lineSeparator());
        this.data.forEach(c -> builder.append(c.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
