package ExamPreparation6;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        int permanent = dailyPlunder;
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        for (int i = 1; i <= days; i++) {
            totalPlunder += dailyPlunder;
            if (i % 3 == 0){
                totalPlunder += 0.5 * dailyPlunder;
            }
            if (i % 5 == 0){
                totalPlunder = 0.7 * totalPlunder;
            }
            dailyPlunder = permanent;
        }

        if (totalPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentageLeft = (totalPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f", percentageLeft);
            System.out.println("% of the plunder.");
        }
    }
}
