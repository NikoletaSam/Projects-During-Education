package DefiningClasses.Ex.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> cars = new LinkedHashMap<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelPerKilometer = Double.parseDouble(input[2]);

            Car car = new Car(carModel, fuelAmount, fuelPerKilometer);
            cars.put(carModel, car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String carToDrive = input.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(input.split("\\s+")[2]);

            cars.get(carToDrive).drive(kmToDrive);

            input = scanner.nextLine();
        }

        cars.forEach((key, value) -> System.out.printf("%s %.2f %.0f%n", value.getModel(), value.getFuelAmount(), value.getDistanceTravelled()));
    }
}
