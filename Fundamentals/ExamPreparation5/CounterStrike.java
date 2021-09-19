package ExamPreparation5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        boolean flag = true;
        int countOfWonBattles = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
            if (initialEnergy - distance >= 0){
                initialEnergy = initialEnergy - distance;
                countOfWonBattles++;
                boolean getMoreEnergy = DoesItGetMoreEnergy(countOfWonBattles, initialEnergy);
                if (getMoreEnergy){
                    initialEnergy += countOfWonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countOfWonBattles, initialEnergy);
                flag = false;
                break;
            }

            input = scanner.nextLine();
        }

        if (flag){
            System.out.printf("Won battles: %d. Energy left: %d%n", countOfWonBattles, initialEnergy);
        }
    }

    private static boolean DoesItGetMoreEnergy(int countOfWonBattles, int initialEnergy) {
        boolean flag = false;
        if (countOfWonBattles % 3 == 0){
            flag = true;
        }
        return flag;
    }
}
