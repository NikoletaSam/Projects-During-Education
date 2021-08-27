package ConditioanlStatements.ex;
import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double timeWithoutTraining = days - (days  * 0.10);
        double totalWorkingTime = Math.floor(timeWithoutTraining * 8 + days * 2 * workers);

        if (totalWorkingTime < hoursNeeded){
            double timeMore = hoursNeeded - totalWorkingTime;
            System.out.print("Not enough time!");
            System.out.printf("%.0f", timeMore);
            System.out.println(" hours needed.");
        } else {
            double timeLeft = totalWorkingTime - hoursNeeded;
            System.out.print("Yes!");
            System.out.printf("%.0f", timeLeft);
            System.out.println(" hours left.");
        }
    }
}
