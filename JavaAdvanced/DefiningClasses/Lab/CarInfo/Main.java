package DefiningClasses.Lab.CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);

            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.horsePower = horsePower;

            System.out.println(car);
        }
    }
}
