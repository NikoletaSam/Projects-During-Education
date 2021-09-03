package ConditionalsWhile.lab;
import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int fail = 0;
        int year = 0;
        double sum = 0.0;
        while (year < 12){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                fail++;
            }
            if (fail >= 2){
                break;
            }
            sum += grade;
            year++;
        }
        double average = sum / year;
        if (fail >= 2){
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
