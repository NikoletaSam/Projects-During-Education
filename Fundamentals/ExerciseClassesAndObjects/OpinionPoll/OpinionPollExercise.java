package ExerciseClassesAndObjects.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OpinionPollExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> people = new ArrayList<>();

        for (int i = 1; i <= numberOfPeople; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");
            String name = command[0];
            int age = Integer.parseInt(command[1]);
            OpinionPoll opinionPoll = new OpinionPoll(name, age);
            people.add(opinionPoll);
        }

        people.removeIf(person -> person.getAge() <= 30);
        people.sort(Comparator.comparing(OpinionPoll::getName));
        for (OpinionPoll person : people){
            System.out.println(person.toString());
        }
    }
}
