package Exam.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> roster;
    private String name;
    private int capacity;

    public Hotel(String name, int capacity) {
        this.roster = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Person person){
        if (this.roster.size() < this.capacity){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        Person personToRemove = null;
        for (Person current : this.roster){
            if (current.getName().equals(name)){
                personToRemove = current;
            }
        }
        if (personToRemove == null){
            return false;
        }
        this.roster.remove(personToRemove);
        return true;
    }

    public Person getPerson(String name, String hometown){
        Person personToReturn = null;
        for (Person current : this.roster){
            if (current.getName().equals(name) && current.getHometown().equals(hometown)){
                personToReturn = current;
            }
        }
        return personToReturn;
    }

    public int getCount(){
        return this.roster.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The people in the Exam.hotel ").append(this.name).append(" are:").append(System.lineSeparator());
        this.roster.forEach(e -> builder.append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
