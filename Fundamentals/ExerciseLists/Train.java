package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxNumbersOfPassengers = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                int passengersNewWagon = Integer.parseInt(command[1]);
                wagons.add(passengersNewWagon);
            } else {
                int addedPassengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int peopleInCurrentWagon = wagons.get(i);
                    if ((peopleInCurrentWagon + addedPassengers) <= maxNumbersOfPassengers){
                        wagons.set(i, peopleInCurrentWagon + addedPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        String output = "";
        for (int element : wagons){
            output += element + " ";
        }
        System.out.println(output);
    }
}