package DefiningClasses.Ex.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        Map<String, Engine> engines = new LinkedHashMap<>();

        int numOfEngines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfEngines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Engine engine = null;

            String model = input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length == 2){
                engine = new Engine(model, power);
            } else if (input.length == 4){
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException exception){
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }

            engines.put(model, engine);
        }

        int numOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfCars; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            String engineModel = input[1];
            Engine currentEngine = engines.get(engineModel);

            Car car = null;

            if (input.length == 2){
                car = new Car(model, currentEngine);
            } else if (input.length == 4){
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(model, currentEngine, weight, color);
            } else {
                try {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, currentEngine, weight);
                } catch (NumberFormatException exception){
                    String color = input[2];
                    car = new Car(model, currentEngine, color);
                }
            }

            cars.add(car);
        }

        cars.forEach(car -> System.out.print(car.toString()));
    }
}
