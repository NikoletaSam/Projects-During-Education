package Generics.Ex.CustomList;

import java.util.Collections;

public class Sorter<T> {

    public static <T extends Comparable> void sort(CustomList<T> elements){
        T current = null;
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size() - 1; j++) {
                if (elements.get(j).compareTo(elements.get(j + 1)) > 0){
                    current = elements.get(j);
                    elements.set(j, elements.get(j + 1));
                    elements.set(j + 1, current);
                }
            }
        }
    }
}
