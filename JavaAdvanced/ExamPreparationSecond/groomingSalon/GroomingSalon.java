package ExamPreparationSecond.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
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
        for (Pet pet : this.data){
            if (pet.getName().equals(name)){
                petToRemove = pet;
            }
        }
        if (petToRemove != null){
            this.data.remove(petToRemove);
            return true;
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        Pet petToRemove = null;
        for (Pet pet : this.data){
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                petToRemove = pet;
            }
        }
        return petToRemove;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for (Pet pet : this.data){
            builder.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
