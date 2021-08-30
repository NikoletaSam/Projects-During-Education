package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsAtHome = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - weekendsAtHome;
        double saturdayPlayInSofia = weekendsInSofia * 3.0/4;
        double gamesDuringHolidays = holidays * 2.0/3;
        double games = weekendsAtHome + saturdayPlayInSofia + gamesDuringHolidays;
        double totalGames = 0.0;

        if (year.equals("leap")){
            totalGames = Math.floor(games + games * 0.15);
        } else {
            totalGames = Math.floor(games);
        }
        System.out.printf("%.0f", totalGames);
    }
}
