package Generics.Lab.Scale;

import java.util.Comparator;

public class Scale<T extends Comparable<T>> {
    T firstElement;
    T secondElement;

    public Scale(T firstElement, T secondElement){
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getHeavier(){
        int comparing = this.firstElement.compareTo(this.secondElement);

        if (comparing > 0){
            return this.firstElement;
        } else if (comparing < 0){
            return this.secondElement;
        } else {
            return null;
        }
    }
}
