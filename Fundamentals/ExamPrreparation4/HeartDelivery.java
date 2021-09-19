package ExamPrreparation4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int index = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")){
            String[] command = input.split("\\s+");
            int jumps = Integer.parseInt(command[1]);

            index = index + jumps;
            if (index >= houses.size()) {
                index = 0;
            }

            int currentHouse = houses.get(index);
            if (currentHouse > 0){
                int newCurrent = currentHouse - 2;
                houses.set(index, newCurrent);
                if (newCurrent == 0){
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            } else if (currentHouse == 0){
                System.out.printf("Place %d already had Valentine's day.%n", index);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", index);
        boolean isMissionSuccessful = DoesEachHouseHaveValentinesDay(houses);
        if (isMissionSuccessful){
            System.out.println("Mission was successful.");
        } else {
            int failedHouses = GetFailedHpuses(houses);
            System.out.printf("Cupid has failed %d places.%n", failedHouses);
        }
    }

    private static int GetFailedHpuses(List<Integer> houses) {
        int counter = 0;
        for (int house : houses){
            if (house != 0){
                counter++;
            }
        }
        return counter;
    }

    private static boolean DoesEachHouseHaveValentinesDay(List<Integer> houses) {
        boolean flag = true;
        for (int house : houses){
            if (house != 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
