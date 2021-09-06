package ExerciseClassesAndObjects.Students;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        List<Students> listOfStudents = new ArrayList<>();

        for (int i = 1; i <= numberOfStudents; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");
            String firstName = command[0];
            String lastName = command[1];
            String grade = command[2];
            Students currentStudent = new Students(firstName, lastName, grade);
            listOfStudents.add(currentStudent);
        }

        listOfStudents.sort(Comparator.comparing(Students::getGrade));
        Collections.reverse(listOfStudents);
        for (Students person : listOfStudents){
            System.out.println(person);
        }
    }
}
