package Inheritance.Lab.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement(){
        int end = super.size();

        Random random = new Random();
        int randomIndex = random.nextInt(end);

        return super.remove(randomIndex);
    }
}
