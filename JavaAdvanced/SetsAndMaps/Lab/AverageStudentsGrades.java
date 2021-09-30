package SetsAndMaps.Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int counter = 0; counter < numOfInputs; counter++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()){
            int numOfGrades = students.get(entry.getKey()).size();
            double sumOfGrades = 0;
            for (Double grade : students.get(entry.getKey())){
                sumOfGrades += grade;
            }

            double averageGrade = sumOfGrades / numOfGrades;
            System.out.printf("%s -> ", entry.getKey());
            for (Double grade : students.get(entry.getKey())){
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)%n", averageGrade);
        }
    }
}
