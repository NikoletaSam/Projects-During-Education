package ExamPreparation6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        double maximumHealth = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        boolean flag = false;
        while (!input.equals("Retire")){
            String[] array = input.split("\\s+");
            String command = array[0];
            switch (command){
                case "Fire":
                    int index = Integer.parseInt(array[1]);
                    int damage = Integer.parseInt(array[2]);
                    if (index >= 0 && index < warship.size()){
                        int newNumber = warship.get(index) - damage;
                        warship.set(index, newNumber);
                        if (newNumber <= 0){
                            flag = true;
                            System.out.println("You won! The enemy ship has sunken.");
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startingIndex = Integer.parseInt(array[1]);
                    int endingIndex = Integer.parseInt(array[2]);
                    int damagingPower = Integer.parseInt(array[3]);
                    if (startingIndex >= 0 && startingIndex < pirateShip.size() && endingIndex >= 0 && endingIndex < pirateShip.size()){
                        for (int i = endingIndex; i >= startingIndex ; i--) {
                            int current = pirateShip.get(i) - damagingPower;
                            if (current > 0){
                                pirateShip.set(i, current);
                            } else {
                                flag = true;
                                System.out.println("You lost! The pirate ship has sunken.");
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int currentIndex = Integer.parseInt(array[1]);
                    int health = Integer.parseInt(array[2]);
                    if (currentIndex >= 0 && currentIndex < pirateShip.size()){
                        int currentHealth = pirateShip.get(currentIndex);
                        if (currentHealth + health <= maximumHealth){
                            pirateShip.set(currentIndex, currentHealth + health);
                        } else {
                            pirateShip.set(currentIndex, (int) maximumHealth);
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    double boundery = 0.2 * maximumHealth;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        int current = pirateShip.get(i);
                        if (current < boundery){
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            if (flag){
                break;
            }
            input = scanner.nextLine();
        }

        if (!flag){
            int privateShipSum = 0;
            for (int current : pirateShip) {
                privateShipSum += current;
            }

            int warshipSum = 0;
            for (int element : warship){
                warshipSum += element;
            }

            System.out.printf("Pirate ship status: %d%n", privateShipSum);
            System.out.printf("Warship status: %d%n", warshipSum);
        }
    }
}
