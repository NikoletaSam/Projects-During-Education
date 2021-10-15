package ExamPreparationThird;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(",\\s+");
        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        for (String e : firstArr){
            int current = Integer.parseInt(e);
            tulips.push(current);
        }

        String[] secondArr = scanner.nextLine().split(",\\s+");
        ArrayDeque<Integer> daffodils = new ArrayDeque<>();
        for (String e : secondArr){
            int current = Integer.parseInt(e);
            daffodils.offer(current);
        }

        int bouquetCount = 0;
        int bouquetsNeeded = 5;

        int sumsLeft = 0;

        while (tulips.size() > 0 && daffodils.size() > 0){
            int currentDaffodil = daffodils.poll();
            int currentTulip = tulips.pop();

            int sum = currentTulip + currentDaffodil;

            if (sum == 15){
                bouquetCount++;
                bouquetsNeeded--;
            } else if (sum > 15){
                while (sum > 15){
                    sum -= 2;
                }
                if (sum == 15){
                    bouquetCount++;
                    bouquetsNeeded--;
                } else {
                    sumsLeft += sum;
                }
            } else {
                sumsLeft += sum;
            }
        }

        while (sumsLeft >= 15){
            sumsLeft -= 15;
            bouquetCount++;
            bouquetsNeeded--;
        }

        if (bouquetsNeeded <= 0){
            System.out.println("You made it! You go to the competition with " + bouquetCount + " bouquets!");
        } else {
            System.out.println("You failed... You need more " + bouquetsNeeded + " bouquets.");
        }
    }
}
