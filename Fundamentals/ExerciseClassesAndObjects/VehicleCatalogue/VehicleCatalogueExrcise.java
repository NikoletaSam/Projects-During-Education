package ExerciseClassesAndObjects.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogueExrcise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<VehicleCatalogue> listOfVehicles = new ArrayList<>();
        int numberOfVehicles = 0;

        while (!input.equals("End")){
            String[] command = input.split("\\s+");
            String typeOfVehicle = command[0];
            String modelOfVehicle = command[1];
            String colourOfVehicle = command[2];
            int horsePower = Integer.parseInt(command[3]);
            VehicleCatalogue vehicle = new VehicleCatalogue(typeOfVehicle, modelOfVehicle, colourOfVehicle, horsePower);

            if(typeOfVehicle.equals("car") || typeOfVehicle.equals("truck")){
                listOfVehicles.add(vehicle);
                numberOfVehicles++;
            }
            if (listOfVehicles.size() > 1){
                for (int i = 0; i < listOfVehicles.size() - 1; i++) {

                    if(vehicle.getModelOfVehicle().equals(listOfVehicles.get(i).getModelOfVehicle()) ){
                        listOfVehicles.remove(vehicle);
                        numberOfVehicles--;
                    }
                }
            }
            if (numberOfVehicles > 50){
                break;
            }
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")){
            for (VehicleCatalogue vehicles : listOfVehicles){
                if (model.equals(vehicles.getModelOfVehicle())){
                    if (vehicles.getTypeOfVehicle().equals("truck")){
                        System.out.println("Type: Truck");
                        System.out.println(vehicles);
                    } else {
                        System.out.println("Type: Car");
                        System.out.println(vehicles);
                    }
                }
            }

            model = scanner.nextLine();
        }

        double numberOfTrucks = 0;
        int sumOfHorsepowerOfTRucks = 0;
        double averageHorsepowerTrucks = 0;
        double numberOfCars = 0;
        int sumOfHorsepowerCars = 0;
        double averageHorsepowerCars = 0;

        for (VehicleCatalogue vehicle : listOfVehicles){
            if(vehicle.getTypeOfVehicle().equals("truck")){
                sumOfHorsepowerOfTRucks += vehicle.getHorsePower();
                numberOfTrucks++;
            } else {
                sumOfHorsepowerCars += vehicle.getHorsePower();
                numberOfCars++;
            }
        }

        averageHorsepowerCars = sumOfHorsepowerCars / numberOfCars;
        averageHorsepowerTrucks = sumOfHorsepowerOfTRucks / numberOfTrucks;
        if (averageHorsepowerCars > 0 && averageHorsepowerTrucks > 0){
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepowerCars);
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsepowerTrucks);
        } else if (averageHorsepowerCars <= 0 && averageHorsepowerTrucks > 0){
            System.out.println("Cars have average horsepower of: 0.");
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsepowerTrucks);
        } else if (averageHorsepowerCars > 0 && averageHorsepowerTrucks <= 0){
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepowerCars);
            System.out.println("Trucks have average horsepower of: 0.");
        } else {
            System.out.println("Cars have average horsepower of: 0.");
            System.out.println("Trucks have average horsepower of: 0.");
        }

    }
}
