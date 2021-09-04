package Exams.Exam2;
import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = Integer.parseInt(scanner.nextLine());
        double raisedMoney = 0.0;
        int daysWinCounter = 0;
        int daysLoseCounter = 0;
        int winCounter = 0;
        int loseCounter = 0;
        double dailyRaisedMoney = 0.0;

        for (int day = 1; day <= totalDays; day++){
            String sport = scanner.nextLine();

            while (!sport.equals("Finish")){
                String result = scanner.nextLine();

                if(result.equals("win")){
                    dailyRaisedMoney += 20;
                    winCounter++;
                } else {
                    loseCounter++;
                }
                sport = scanner.nextLine();
            }
            if (winCounter > loseCounter) {
                dailyRaisedMoney = dailyRaisedMoney + dailyRaisedMoney * 0.10;
                daysWinCounter++;
            } else {
                daysLoseCounter++;
            }
            raisedMoney += dailyRaisedMoney;
            winCounter = 0;
            loseCounter = 0;
            dailyRaisedMoney = 0;
        }
        if (daysWinCounter > daysLoseCounter){
            raisedMoney = raisedMoney + raisedMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", raisedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", raisedMoney);
        }
    }
}
