package Exams.Exam2;
import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double speedMetresPerSecond = Double.parseDouble(scanner.nextLine());

        double time = metres * speedMetresPerSecond;
        double timeSlower = Math.floor(metres / 50);
        double totalTimeSlower = timeSlower * 30;
        double totalTime = time + totalTimeSlower;

        if (totalTime < record){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            double differenceWithRecord = totalTime - record;
            System.out.printf("No! He was %.2f seconds slower.", differenceWithRecord);
        }
    }
}
