package Generics.Ex.GenericCount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter<T extends Comparable> {
    private List<T> elements;

    public Counter() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public int getBigger(T element){
        this.elements = this.elements.stream().filter(e -> e.compareTo(element) > 0).collect(Collectors.toList());
        return this.elements.size();
    }
}
