package Inheritance.Lab.RandomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList<Integer> listRandom = new RandomArrayList<>();

        for (int i = 0; i < 10; i++) {
            listRandom.add(i);
        }

        System.out.println(listRandom.getRandomElement());
    }
}
