package Generics.Ex.GenericSwap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapBox<T> {
    private List<T> elements;

    public SwapBox() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(this.elements, firstIndex, secondIndex);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        this.elements.forEach(e -> builder.append(e.getClass().getName()).append(": ").append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
