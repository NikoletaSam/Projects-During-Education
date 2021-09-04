package Exams.Preparation;
import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        double entranceTax = Double.parseDouble(scanner.nextLine());
        double bedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalEntranceMoney = numPeople * entranceTax;
        double numUmbrellas = Math.ceil(numPeople * 0.5);
        double moneyUmbrellas = numUmbrellas * umbrellaPrice;
        double numBeds = Math.ceil(numPeople * 0.75);
        double moneyBeds = bedPrice * numBeds;

        double totalMoney = totalEntranceMoney + moneyBeds + moneyUmbrellas;

        System.out.printf("%.2f lv.", totalMoney);
    }
}
