package DefiningClasses.Ex.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> peopleInformation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] information = input.split("\\s+");
            String nameOfPerson = information[0];

            peopleInformation.putIfAbsent(nameOfPerson, new Person(nameOfPerson));
            String typeOfCurrentInput = information[1];
            switch (typeOfCurrentInput){
                case "company":
                    String companyName = information[2];
                    String department = information[3];
                    double salary = Double.parseDouble(information[4]);
                    Company company = new Company(companyName, department, salary);
                    peopleInformation.get(nameOfPerson).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = information[2];
                    String pokemonType = information[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    peopleInformation.get(nameOfPerson).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = information[2];
                    String parentBirthday = information[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    peopleInformation.get(nameOfPerson).getParents().add(parent);
                    break;
                case "children":
                    String childName = information[2];
                    String childBirthday = information[3];
                    Child child = new Child(childName, childBirthday);
                    peopleInformation.get(nameOfPerson).getChildren().add(child);
                    break;
                case "car":
                    String carModel = information[2];
                    int carSpeed = Integer.parseInt(information[3]);
                    Car car = new Car(carModel, carSpeed);
                    peopleInformation.get(nameOfPerson).setCar(car);
                    break;
            }

            input = scanner.nextLine();
        }

        String personToOutput = scanner.nextLine();
        Person person = peopleInformation.get(personToOutput);
        System.out.print(person.toString());
    }
}
