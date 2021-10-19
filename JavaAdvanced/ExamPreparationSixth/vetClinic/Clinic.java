package ExamPreparationSixth.vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet){
        if (this.data.size() < capacity){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){
        Pet petToRemove = null;
        for (Pet current : this.data){
            if (current.getName().equals(name)){
                petToRemove = current;
            }
        }
        if (petToRemove == null){
            return false;
        }
        this.data.remove(petToRemove);
        return true;
    }

    public Pet getPet(String name, String owner){
        Pet petTuReturn = null;
        for (Pet current : this.data){
            if (current.getName().equals(name) && current.getOwner().equals(owner)){
                petTuReturn = current;
            }
        }
        return petTuReturn;
    }

    public Pet getOldestPet(){
        return this.data.stream().max(Comparator.comparingInt(Pet::getAge)).get();
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The clinic has the following patients:").append(System.lineSeparator());
        this.data.forEach(p -> builder.append(p.getName()).append(" ").append(p.getOwner()).append(System.lineSeparator()));
        return builder.toString();
    }
}
