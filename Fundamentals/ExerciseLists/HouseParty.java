package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= numOfCommands; i++) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");
            if (command[2].equals("not")){
                if (names.contains(command[0])){
                    names.remove(command[0]);
                } else {
                    String currentName = command[0];
                    System.out.println(currentName + " is not in the list!");
                }
            } else {
                if (!names.contains(command[0])){
                    names.add(command[0]);
                } else {
                    String currentName = command[0];
                    System.out.println(currentName + " is already in the list!");
                }
            }
        }

        for (String element : names){
            System.out.println(element);
        }
    }
}
