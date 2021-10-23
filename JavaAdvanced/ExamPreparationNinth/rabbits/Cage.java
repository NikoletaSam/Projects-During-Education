package ExamPreparationNinth.rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Rabbit rabbit){
        if (this.data.size() < this.capacity){
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name){
        Rabbit rabbitToRemove = null;
        for (Rabbit r : this.data){
            if (r.getName().equals(name)){
                rabbitToRemove = r;
            }
        }
        if (rabbitToRemove == null){
            return false;
        }
        this.data.remove(rabbitToRemove);
        return true;
    }

    public void removeSpecies(String species){
        List<Rabbit> toRemove = new ArrayList<>();
        for (Rabbit rabbit : this.data){
            if (rabbit.getSpecies().equals(species)){
                toRemove.add(rabbit);
            }
        }
        this.data.removeAll(toRemove);
    }

    public Rabbit sellRabbit(String name){
        Rabbit toSell = null;
        for (Rabbit current : this.data){
            if (current.getName().equals(name)){
                toSell = current;
                current.setAvailable(false);
                break;
            }
        }
        return toSell;
    }

    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> toSell = new ArrayList<>();
        for (Rabbit current : this.data){
            if (current.getSpecies().equals(species)){
                current.setAvailable(false);
                toSell.add(current);
            }
        }
        return toSell;
    }

    public int count(){
        return this.data.size();
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append("Rabbits available at ").append(this.name).append(":").append(System.lineSeparator());
        for (Rabbit current : this.data){
            if (current.isAvailable()){
                builder.append(current.toString()).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }
}
