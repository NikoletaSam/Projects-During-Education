package LectureMethods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        IsGradeFailed(grade);
        IsGradePoor(grade);
        IsGradeGood(grade);
        IsGradeVeryGood(grade);
        IsGradeExcellent(grade);
    }

    private static void IsGradeExcellent(double grade) {
        if (grade >= 5.50 && grade <= 6){
            System.out.println("Excellent");
        }
    }

    private static void IsGradeVeryGood(double grade) {
        if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }
    }

    private static void IsGradeGood(double grade) {
        if (grade >= 3.50 && grade <= 4.49){
            System.out.println("Good");
        }
    }

    private static void IsGradePoor(double grade) {
        if (grade >= 3 && grade <= 3.49){
            System.out.println("Poor");
        }
    }

    private static void IsGradeFailed(double num) {
        if (num >= 2 && num <= 2.99){
            System.out.println("Fail");
        }
    }
}
