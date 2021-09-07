package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("course start")){
            String[] command = input.split(":");
            switch (command[0]){
                case "Add":
                    String newCourse = command[1];
                    AddNewLesson(courses, newCourse);
                    break;
                case "Insert":
                    String lessonTitle = command[1];
                    int index = Integer.parseInt(command[2]);
                    InsertNewLesson(courses, lessonTitle, index);
                    break;
                case "Remove":
                    String lesson = command[1];
                    RemoveCourse(courses, lesson);
                    break;
                case "Swap":
                    String firstLesson = command[1];
                    String secondLesson = command[2];
                    SwapTheTwoCourses(courses, firstLesson, secondLesson);
                    break;
                case "Exercise":
                    String title = command[1];
                    AddExerciseToCourses(courses, title);
                    break;
            }

            input = scanner.nextLine();
        }

        int numberOfCourses = 1;
        for (String element : courses){
            System.out.printf("%d.%s%n", numberOfCourses, element);
            numberOfCourses++;
        }
    }

    private static void AddExerciseToCourses(List<String> courses, String title) {
        String exerciseTitle = title + "-Exercise";
        if(!courses.contains(exerciseTitle)){
            if(courses.contains(title)){
                for (int i = 0; i < courses.size(); i++) {
                    if(courses.get(i).equals(title)){
                        courses.add(i+1, exerciseTitle);
                    }
                }
            } else {
                courses.add(title);
                courses.add(exerciseTitle);
            }
        }
    }

    private static void SwapTheTwoCourses(List<String> courses, String firstLesson, String secondLesson) {
        boolean firstFlag = false;
        boolean secondFlag = false;
        if(courses.contains(firstLesson) && courses.contains(secondLesson)){
            String firstExercise = firstLesson + "-Exercise";
            String secondExercise = secondLesson + "-Exercise";
            boolean doesFirstExerciseExist = DoesExerciseExist(courses, firstExercise);
            boolean doesSecondExerciseExist = DoesExerciseExist(courses, secondExercise);
            String first = firstLesson;
            String second = secondLesson;
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).equals(firstLesson)){
                    courses.set(i, second);
                    if(doesFirstExerciseExist){
                        SwapFirstExercise(courses, firstExercise, first);
                    }
                    firstFlag = true;
                } else if (courses.get(i).equals(secondLesson)){
                    courses.set(i, first);
                    if(doesSecondExerciseExist){
                        SwapFirstExercise(courses, secondExercise, second);
                    }
                    secondFlag = true;
                }
                if(firstFlag && secondFlag){
                    break;
                }
            }
        }
    }

    private static void SwapFirstExercise(List<String> courses, String firstExercise, String second) { ;
        for (int j = 0; j < courses.size(); j++) {
            if(courses.get(j).equals(firstExercise)){
                courses.remove(j);
            }
        }
        for (int j = 0; j < courses.size(); j++) {
            if(courses.get(j).equals(second)){
                courses.add(j + 1, firstExercise);
            }
        }
    }

    private static boolean DoesExerciseExist(List<String> courses, String firstExercise) {
        return courses.contains(firstExercise);
    }

    private static void RemoveCourse(List<String> courses, String lesson) {
        if(courses.contains(lesson)){
            courses.remove(lesson);
            String exercise = lesson + "-Exercise";
            boolean doesExerciseExist = DoesExerciseExist(courses, exercise);
            if(doesExerciseExist){
                courses.remove(exercise);
            }
        }
    }

    private static void InsertNewLesson(List<String> courses, String lessonTitle, int index) {
        if(!courses.contains(lessonTitle)){
            courses.add(index, lessonTitle);
        }
    }

    private static void AddNewLesson(List<String> courses, String newCourse) {
        if(!courses.contains(newCourse)){
            courses.add(newCourse);
        }
    }
}
