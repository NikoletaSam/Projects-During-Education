package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new LinkedHashMap<>();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (students.containsKey(name)){
                grade = (students.get(name) + grade) / 2;
                students.put(name, grade);
            }
            students.putIfAbsent(name, grade);
        }

        students.entrySet().stream()
                .filter(e -> e.getValue() >= 4.50)
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
