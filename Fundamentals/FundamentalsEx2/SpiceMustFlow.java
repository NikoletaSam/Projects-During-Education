package FundamentalsEx2;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int profit = 0;
        int totalProfit = 0;
        while (firstYield >= 100){
            days ++;
            profit = firstYield - 26;
            totalProfit += profit;
            firstYield -= 10;
        }
        totalProfit -= 26;
        System.out.println(days);
        System.out.println(totalProfit);
    }
}
