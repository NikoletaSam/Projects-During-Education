package ExerciseAssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> numCourses = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] array = input.split(" : ");
            String course = array[0];
            String person = array[1];

            numCourses.putIfAbsent(course, new ArrayList<>());
            numCourses.get(course).add(person);

            input = scanner.nextLine();
        }

        numCourses
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach((entry) -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));});
    }
}
