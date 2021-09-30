package SetsAndMaps.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")){
            String command = input.split(",\\s+")[0];
            String carNumber = input.split(",\\s+")[1];
            if (command.equals("IN")){
                parking.add(carNumber);
            } else {
                parking.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        if (!parking.isEmpty()){
            for (String car : parking){
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
