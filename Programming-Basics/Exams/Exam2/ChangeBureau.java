package Exams.Exam2;
import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBitcoins = Integer.parseInt(scanner.nextLine());
        double numYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsIntoBGN = numBitcoins * 1168;
        double bitcoinsIntoEuro = bitcoinsIntoBGN / 1.95;
        double yuanToDollars = numYuan * 0.15;
        double yuanToEuro = (yuanToDollars * 1.76) / 1.95;
        double euro = bitcoinsIntoEuro + yuanToEuro;
        double totalEuro = euro - euro * (commission / 100);

        System.out.printf("%.2f", totalEuro);
    }
}
