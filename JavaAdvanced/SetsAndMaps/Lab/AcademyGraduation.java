package SetsAndMaps.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new TreeMap<>();

        DecimalFormat formatter = new DecimalFormat("#.###############");
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        for (int counter = 0; counter < numOfStudents; counter++) {
            String student = scanner.nextLine();
            String[] gradesString = scanner.nextLine().split("\\s+");
            double[] grades = new double[gradesString.length];
            double sumOFGrades = 0;
            for (int i = 0; i < gradesString.length; i++) {
                grades[i] = Double.parseDouble(gradesString[i]);
                sumOFGrades += Double.parseDouble(gradesString[i]);
            }

            double averageGrade = sumOFGrades / grades.length;
            students.put(student, averageGrade);
        }

        for (Map.Entry<String, Double> entry : students.entrySet()){
            System.out.println(entry.getKey() + " is graduated with " + formatter.format(entry.getValue()));
        }
    }
}
