package Generics.Ex.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public T remove(int index){
        return this.elements.remove(index);
    }

    public boolean contains(T element){
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(this.elements, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element){
        int counter = 0;
        for (T current : this.elements) {
            if (current.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
       return (T) Collections.max(this.elements);
    }

    public T getMin(){
        return (T) Collections.min(this.elements);
    }

    public T get(int index){
        if (index >= 0 && index < this.elements.size()){
            return this.elements.get(index);
        }
        return null;
    }

    public void set(int index, T element){
        this.elements.set(index, element);
    }

    public int size(){
        return this.elements.size();
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        this.elements.forEach(e -> builder.append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
