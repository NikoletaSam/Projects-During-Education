package ConditioanlStatements.ex;
import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMinute = Double.parseDouble(scanner.nextLine());

        double timeNeeded = distance * timePerMinute;
        double delay = (distance - distance % 15) / 15;
        double totalTime = timeNeeded + delay * 12.5;

        if (totalTime < record){
            System.out.print("Yes, he succeeded! The new world record is ");
            System.out.printf("%.2f", totalTime);
            System.out.println(" seconds.");
        }else {
            double secondsLess = totalTime - record;
            System.out.print("No, he failed! He was ");
            System.out.printf("%.2f", secondsLess);
            System.out.println(" seconds slower.");
        }

    }
}
