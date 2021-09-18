package ExamPreparation2;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        int maxBonus = 0;
        int maxLectures = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            int currentAttendance = Integer.parseInt(scanner.nextLine());
            int currentTotalBonus = (int) Math.ceil((1.0 * currentAttendance) / (numberOfLectures) * (5 + initialBonus));
            if(currentTotalBonus >= maxBonus){
                maxBonus = currentTotalBonus;
                maxLectures = currentAttendance;
            }
        }
        System.out.printf("Max Bonus: %d.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxLectures);
    }
}
