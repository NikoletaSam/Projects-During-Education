package DefiningClasses.Lab.CarConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car = null;

            String brand = input[0];
            if (input.length == 1){
                car = new Car(brand);
            } else {
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);

                car = new Car(brand, model, horsePower);
            }

            System.out.println(car);
        }
    }
}
