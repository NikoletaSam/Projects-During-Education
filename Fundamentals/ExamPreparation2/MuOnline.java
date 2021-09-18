package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        boolean flag = false;

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for (int i = 0; i < rooms.size(); i++) {
            int currentRoom = i + 1;

            String[] currentRoomArray = rooms.get(i).split("\\s+");
            String command = currentRoomArray[0];
            int number = Integer.parseInt(currentRoomArray[1]);
            switch (command){
                case "potion":
                   if((health + number) <= 100){
                       System.out.printf("You healed for %d hp.%n", number);
                       health = health + number;
                       System.out.printf("Current health: %d hp.%n", health);
                   } else {
                       int currentNumber = 100 - health;
                       health = 100;
                       System.out.printf("You healed for %d hp.%n", currentNumber);
                       System.out.printf("Current health: %d hp.%n", health);
                   }
                   break;
                case "chest":
                    bitcoins = bitcoins + number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    health = health - number;
                    if(health > 0){
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", currentRoom);
                        flag = true;
                        break;
                    }
            }
            if(flag){
                break;
            }
        }

        if(health > 0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
