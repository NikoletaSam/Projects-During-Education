package ExerciseClassesAndObjects.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] command = input.split("\\s+");
            String name = command[0];
            String ID = command[1];
            int age  = Integer.parseInt(command[2]);
            Person person = new Person(name, ID, age);
            listOfPeople.add(person);

            input = scanner.nextLine();
        }

        listOfPeople.sort(Comparator.comparing(Person::getAge));
        for (Person person : listOfPeople){
            System.out.println(person);
        }
    }
}
