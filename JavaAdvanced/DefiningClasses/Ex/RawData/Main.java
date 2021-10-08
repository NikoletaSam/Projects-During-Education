package DefiningClasses.Ex.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String carModel = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            Car car = new Car(carModel, engineSpeed, enginePower, cargoWeight, cargoType);

            double firstTirePressure = Double.parseDouble(input[5]);
            int firstTireAge = Integer.parseInt(input[6]);
            Tire firstTire = new Tire(firstTirePressure, firstTireAge);
            car.getTires().add(firstTire);

            double secondTirePressure = Double.parseDouble(input[7]);
            int secondTireAge = Integer.parseInt(input[8]);
            Tire secondTire = new Tire(secondTirePressure, secondTireAge);
            car.getTires().add(secondTire);

            double thirdTirePressure = Double.parseDouble(input[9]);
            int thirdTireAge = Integer.parseInt(input[10]);
            Tire thirdTire = new Tire(thirdTirePressure, thirdTireAge);
            car.getTires().add(thirdTire);

            double fourthTirePressure = Double.parseDouble(input[11]);
            int fourthTireAge = Integer.parseInt(input[12]);
            Tire fourthTire = new Tire(fourthTirePressure, fourthTireAge);
            car.getTires().add(fourthTire);

            cars.add(car);
        }

        String condition = scanner.nextLine();
        if (condition.equals("fragile")){
            for (Car car : cars){
                if (car.isPressureAppropriate()){
                    System.out.println(car.getModel());
                }
            }
        } else if (condition.equals("flamable")){
            for (Car car : cars){
                if (car.isHorsePowerAppropriate()){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
