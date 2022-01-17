package Polymorphism.Ex.vehicles;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        String[] carInfo = scanner.nextLine().split("\\s+");
        Vehicle car = createVehicle(carInfo);
        vehicles.put("Car", car);

        String[] truckInfo = scanner.nextLine().split("\\s+");
        Vehicle truck = createVehicle(truckInfo);
        vehicles.put("Truck", truck);

        String[] busInfo = scanner.nextLine().split("\\s+");
        Vehicle bus = createVehicle(busInfo);
        vehicles.put("Bus", bus);

        int numOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfCommands; i++) {
            String[] info = scanner.nextLine().split("\\s+");

            String command = info[0];
            String classType = info[1];

            try {
                switch (command){
                    case "Drive":
                        double distance = Double.parseDouble(info[2]);
                        if (classType.equals("Bus")){
                            ((Bus) vehicles.get(classType)) .setEmpty(false);
                        }
                        System.out.println(vehicles.get(classType).drive(distance));
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(info[2]);
                        vehicles.get(classType).refuel(liters);
                        break;
                    case "DriveEmpty":
                        double distanceToDriveEmpty = Double.parseDouble(info[2]);
                        if (classType.equals("Bus")){
                            ((Bus) vehicles.get(classType)) .setEmpty(true);
                        }
                        System.out.println(vehicles.get(classType).drive(distanceToDriveEmpty));
                }
            } catch (IllegalAccessException e){
                System.out.println(e.getMessage());
            }

        }

        vehicles.forEach((key, value) -> System.out.println(value));
    }

    public static Vehicle createVehicle(String[] information) throws IllegalAccessException {
        String classType = information[0];
        double fuelQuantity = Double.parseDouble(information[1]);
        double fuelConsumption = Double.parseDouble(information[2]);
        double tankCapacity = Double.parseDouble(information[3]);

        if (classType.equals("Car")){
            return new Car(fuelQuantity, fuelConsumption, tankCapacity);
        } else if (classType.equals("Truck")){
            return new Truck(fuelQuantity, fuelConsumption, tankCapacity);
        } else if (classType.equals("Bus")){
            return new Bus(fuelQuantity, fuelConsumption, tankCapacity);
        }
        return null;
    }
}
