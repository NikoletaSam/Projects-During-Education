package Generics.Lab.Utilities;

import java.util.Comparator;
import java.util.List;

public class ListUtils<T>{

    public static <T extends Comparable> T getMax(List<T> elements){
        isListEmpty(elements);
        T maxElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).compareTo(maxElement) > 0){
                maxElement = elements.get(i);
            }
        }
        return maxElement;
    }

    public static <T extends Comparable> T getMin(List<T> elements){
        isListEmpty(elements);
        T minElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).compareTo(minElement) < 0){
                minElement = elements.get(i);
            }
        }
        return minElement;
    }

    private static <T> void isListEmpty(List<T> elements){
        if (elements.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
