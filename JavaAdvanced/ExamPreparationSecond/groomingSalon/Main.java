package ExamPreparationSecond.groomingSalon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet pet = new Pet("Lili", 15, "Niki");

        GroomingSalon gs = new GroomingSalon(4);
        gs.add(pet);
        gs.add(new Pet("dog", 3, "me"));
        gs.remove("dog");

        System.out.println();
    }
}
