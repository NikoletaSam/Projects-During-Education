package NestedLoop.ex;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJury = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double averageGrade = 0.0;
        double sumGrades = 0.0;
        double totalGrades = 0.0;
        int totalNumGrades = 0;
        while (!presentationName.equals("Finish")){
            for (int numGrade = 0; numGrade < numJury; numGrade++){
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
                totalGrades += grade;
                totalNumGrades++;
            }
            averageGrade = sumGrades / numJury;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
            sumGrades = 0.0;
            presentationName = scanner.nextLine();
        }
        double totalAverage = totalGrades / totalNumGrades;
        System.out.printf("Student's final assessment is %.2f.", totalAverage);
    }
}
