package FirstStepsInCoding.ex;
import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allSheets = Integer.parseInt(scanner.nextLine());
        int sheetsPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime = allSheets / sheetsPerHour;
        int neededHours = totalTime / days;

        System.out.println(neededHours);
    }
}
