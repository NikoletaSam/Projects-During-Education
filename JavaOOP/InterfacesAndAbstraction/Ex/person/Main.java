package InterfacesAndAbstraction.Ex.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Buyer> buyers = new ArrayList<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            String[] currentInput = scanner.nextLine().split("\\s+");

            //Citizen: name, age, id, birthdate -> length: 4
            //Rebel: name, age, group -> length: 3
            if (currentInput.length == 4){
                String citizenName = currentInput[0];
                int citizenAge = Integer.parseInt(currentInput[1]);
                String citizenId = currentInput[2];
                String citizenBirthday = currentInput[3];

                Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthday);
                buyers.add(citizen);
            } else if (currentInput.length == 3){
                String rebelName = currentInput[0];
                int rebelAge = Integer.parseInt(currentInput[1]);
                String group = currentInput[2];

                Rebel rebel = new Rebel(rebelName, rebelAge, group);
                buyers.add(rebel);
            }
        }

        String name = scanner.nextLine();
        while (!name.equals("End")){
            for (Buyer current : buyers){
                if (current.getName().equals(name)){
                    current.buyFood();
                }
            }

            name = scanner.nextLine();
        }

        System.out.println(buyers.stream().mapToInt(Buyer::getFood).sum());
    }
}
